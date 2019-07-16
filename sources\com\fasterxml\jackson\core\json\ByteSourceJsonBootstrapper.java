package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class ByteSourceJsonBootstrapper {
    private boolean _bigEndian = true;
    private final boolean _bufferRecyclable;
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    private boolean checkUTF16(int i) {
        if ((65280 & i) == 0) {
            this._bigEndian = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i) throws IOException {
        if ((i >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i) == 0) {
            this._bigEndian = false;
        } else if ((-16711681 & i) == 0) {
            reportWeirdUCS4("3412");
            throw null;
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            reportWeirdUCS4("2143");
            throw null;
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i) throws IOException {
        if (i == -16842752) {
            reportWeirdUCS4("3412");
            throw null;
        } else if (i == -131072) {
            this._inputPtr += 4;
            this._bytesPerChar = 4;
            this._bigEndian = false;
            return true;
        } else if (i == 65279) {
            this._bigEndian = true;
            this._inputPtr += 4;
            this._bytesPerChar = 4;
            return true;
        } else if (i != 65534) {
            int i2 = i >>> 16;
            if (i2 == 65279) {
                this._inputPtr += 2;
                this._bytesPerChar = 2;
                this._bigEndian = true;
                return true;
            } else if (i2 == 65534) {
                this._inputPtr += 2;
                this._bytesPerChar = 2;
                this._bigEndian = false;
                return true;
            } else if ((i >>> 8) != 15711167) {
                return false;
            } else {
                this._inputPtr += 3;
                this._bytesPerChar = 1;
                this._bigEndian = true;
                return true;
            }
        } else {
            reportWeirdUCS4("2143");
            throw null;
        }
    }

    private void reportWeirdUCS4(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported UCS-4 endianness (");
        sb.append(str);
        sb.append(") detected");
        throw new CharConversionException(sb.toString());
    }

    public JsonParser constructParser(int i, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i2) throws IOException {
        int i3 = i2;
        if (detectEncoding() != JsonEncoding.UTF8 || !Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            ReaderBasedJsonParser readerBasedJsonParser = new ReaderBasedJsonParser(this._context, i, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i2));
            return readerBasedJsonParser;
        }
        int i4 = i;
        ObjectCodec objectCodec2 = objectCodec;
        UTF8StreamJsonParser uTF8StreamJsonParser = new UTF8StreamJsonParser(this._context, i4, this._in, objectCodec2, byteQuadsCanonicalizer.makeChild(i3), this._inputBuffer, this._inputPtr, this._inputEnd, this._bufferRecyclable);
        return uTF8StreamJsonParser;
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int bits = encoding.bits();
        if (bits == 8 || bits == 16) {
            InputStream inputStream = this._in;
            if (inputStream == 0) {
                inputStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
            } else {
                int i = this._inputPtr;
                int i2 = this._inputEnd;
                if (i < i2) {
                    MergedStream mergedStream = new MergedStream(this._context, inputStream, this._inputBuffer, i, i2);
                    inputStream = mergedStream;
                }
            }
            return new InputStreamReader(inputStream, encoding.getJavaName());
        } else if (bits == 32) {
            IOContext iOContext = this._context;
            UTF32Reader uTF32Reader = new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
            return uTF32Reader;
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (checkUTF16((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (checkUTF16(r1 >>> com.google.common.base.Ascii.DLE) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    public JsonEncoding detectEncoding() throws IOException {
        JsonEncoding jsonEncoding;
        boolean z = false;
        if (ensureLoaded(4)) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            byte b = (bArr[i + 3] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
            if (!handleBOM(b)) {
                if (!checkUTF32(b)) {
                }
            }
        } else {
            if (ensureLoaded(2)) {
                byte[] bArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
            }
            if (z) {
                jsonEncoding = JsonEncoding.UTF8;
            } else {
                int i3 = this._bytesPerChar;
                if (i3 == 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i3 == 2) {
                    jsonEncoding = this._bigEndian ? JsonEncoding.UTF16_BE : JsonEncoding.UTF16_LE;
                } else if (i3 == 4) {
                    jsonEncoding = this._bigEndian ? JsonEncoding.UTF32_BE : JsonEncoding.UTF32_LE;
                } else {
                    throw new RuntimeException("Internal error");
                }
            }
            this._context.setEncoding(jsonEncoding);
            return jsonEncoding;
        }
        z = true;
        if (z) {
        }
        this._context.setEncoding(jsonEncoding);
        return jsonEncoding;
    }

    /* access modifiers changed from: protected */
    public boolean ensureLoaded(int i) throws IOException {
        int i2;
        int i3 = this._inputEnd - this._inputPtr;
        while (i3 < i) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i4 = this._inputEnd;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this._inputEnd += i2;
            i3 += i2;
        }
        return true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i + i2;
        this._bufferRecyclable = false;
    }
}
