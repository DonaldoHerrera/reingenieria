package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected static final char[] HEX_CHARS = CharTypes.copyHexChars();
    protected char[] _charBuffer;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar = '\"';
    protected final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i, objectCodec);
        this._writer = writer;
        this._outputBuffer = iOContext.allocConcatBuffer();
        this._outputEnd = this._outputBuffer.length;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c, int i) throws IOException, JsonGenerationException {
        String str;
        int i2;
        if (i >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            cArr[i3] = '\\';
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            cArr[i4] = (char) i;
        } else if (i != -2) {
            if (this._outputTail + 5 >= this._outputEnd) {
                _flushBuffer();
            }
            int i5 = this._outputTail;
            char[] cArr2 = this._outputBuffer;
            int i6 = i5 + 1;
            cArr2[i5] = '\\';
            int i7 = i6 + 1;
            cArr2[i6] = 'u';
            if (c > 255) {
                int i8 = 255 & (c >> 8);
                int i9 = i7 + 1;
                char[] cArr3 = HEX_CHARS;
                cArr2[i7] = cArr3[i8 >> 4];
                i2 = i9 + 1;
                cArr2[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i7 + 1;
                cArr2[i7] = '0';
                i2 = i10 + 1;
                cArr2[i10] = '0';
            }
            int i11 = i2 + 1;
            char[] cArr4 = HEX_CHARS;
            cArr2[i2] = cArr4[c >> 4];
            int i12 = i11 + 1;
            cArr2[i11] = cArr4[c & 15];
            this._outputTail = i12;
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(str);
                    return;
                }
            }
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    private void _prependOrWriteCharacterEscape(char c, int i) throws IOException, JsonGenerationException {
        String str;
        int i2;
        if (i >= 0) {
            int i3 = this._outputTail;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this._outputHead = i4;
                char[] cArr = this._outputBuffer;
                int i5 = i4 + 1;
                cArr[i4] = '\\';
                cArr[i5] = (char) i;
                return;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr2[1] = (char) i;
            this._writer.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i6 = this._outputTail;
            if (i6 >= 6) {
                char[] cArr3 = this._outputBuffer;
                int i7 = i6 - 6;
                this._outputHead = i7;
                cArr3[i7] = '\\';
                int i8 = i7 + 1;
                cArr3[i8] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr4 = HEX_CHARS;
                    cArr3[i10] = cArr4[i9 >> 4];
                    i2 = i10 + 1;
                    cArr3[i2] = cArr4[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr3[i11] = '0';
                    i2 = i11 + 1;
                    cArr3[i2] = '0';
                }
                int i12 = i2 + 1;
                char[] cArr5 = HEX_CHARS;
                cArr3[i12] = cArr5[c >> 4];
                cArr3[i12 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this._entityBuffer;
            if (cArr6 == null) {
                cArr6 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c > 255) {
                int i13 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = HEX_CHARS;
                cArr6[10] = cArr7[i13 >> 4];
                cArr6[11] = cArr7[i13 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this._writer.write(cArr6, 8, 6);
            } else {
                char[] cArr8 = HEX_CHARS;
                cArr6[6] = cArr8[c >> 4];
                cArr6[7] = cArr8[c & 15];
                this._writer.write(cArr6, 2, 6);
            }
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            int i14 = this._outputTail;
            if (i14 >= length) {
                int i15 = i14 - length;
                this._outputHead = i15;
                str.getChars(0, length, this._outputBuffer, i15);
                return;
            }
            this._outputHead = i14;
            this._writer.write(str);
        }
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr[i4] = bArr[i];
            i4 = i5;
            i = i6;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i7 = min - i4;
            if (i7 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i7);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this._outputEnd;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i2);
            } else {
                int i4 = this._maximumNonEscapedChar;
                if (i4 != 0) {
                    _writeSegmentASCII(i2, i4);
                } else {
                    _writeSegment(i2);
                }
            }
            if (i3 < length) {
                i = i3;
            } else {
                return;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this._outputTail = i4 + 1;
    }

    private void _writeQuotedInt(int i) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        this._outputTail = NumberOutput.outputInt(i, cArr, this._outputTail);
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    private void _writeQuotedLong(long j) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        this._outputTail = NumberOutput.outputLong(j, cArr, this._outputTail);
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    private void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        this._outputTail = NumberOutput.outputInt(s, cArr, this._outputTail);
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    private void _writeSegment(int i) throws IOException {
        char c;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                c = this._outputBuffer[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2++;
            } while (i2 < i);
            int i4 = i2 - i3;
            if (i4 > 0) {
                this._writer.write(this._outputBuffer, i3, i4);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = _prependOrWriteCharacterEscape(this._outputBuffer, i2, i, c, iArr[c]);
        }
    }

    private void _writeSegmentASCII(int i, int i2) throws IOException, JsonGenerationException {
        char c;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this._outputBuffer[i3];
                if (c >= min) {
                    if (c > i2) {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this._writer.write(this._outputBuffer, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = _prependOrWriteCharacterEscape(this._outputBuffer, i3, i, c, i5);
        }
    }

    private void _writeSegmentCustom(int i) throws IOException, JsonGenerationException {
        char c;
        int[] iArr = this._outputEscapes;
        int i2 = this._maximumNonEscapedChar;
        if (i2 < 1) {
            i2 = 65535;
        }
        int min = Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this._outputBuffer[i3];
                if (c >= min) {
                    if (c <= i2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i5 = -2;
                            break;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this._writer.write(this._outputBuffer, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = _prependOrWriteCharacterEscape(this._outputBuffer, i3, i, c, i5);
        }
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i = this._outputEnd;
        if (length > i) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
        } else {
            int i2 = this._maximumNonEscapedChar;
            if (i2 != 0) {
                _writeStringASCII(length, i2);
            } else {
                _writeString2(length);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6._outputBuffer;
        r3 = r6._outputTail;
        r6._outputTail = r3 + 1;
        r2 = r2[r3];
        _prependOrWriteCharacterEscape(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6._outputHead;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6._writer.write(r2, r4, r3);
     */
    private void _writeString2(int i) throws IOException {
        int i2 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i2) {
            while (true) {
                char[] cArr = this._outputBuffer;
                int i3 = this._outputTail;
                char c = cArr[i3];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                int i4 = this._outputTail + 1;
                this._outputTail = i4;
                if (i4 >= i2) {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    private void _writeStringASCII(int i, int i2) throws IOException, JsonGenerationException {
        char c;
        int i3;
        int i4;
        int i5 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i2 + 1);
        while (this._outputTail < i5) {
            while (true) {
                c = this._outputBuffer[this._outputTail];
                if (c < min) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    }
                    i3 = this._outputTail + 1;
                    this._outputTail = i3;
                    if (i3 >= i5) {
                        return;
                    }
                } else {
                    if (c > i2) {
                        i4 = -1;
                        break;
                    }
                    i3 = this._outputTail + 1;
                    this._outputTail = i3;
                    if (i3 >= i5) {
                    }
                }
            }
            int i6 = this._outputTail;
            int i7 = this._outputHead;
            int i8 = i6 - i7;
            if (i8 > 0) {
                this._writer.write(this._outputBuffer, i7, i8);
            }
            this._outputTail++;
            _prependOrWriteCharacterEscape(c, i4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    private void _writeStringCustom(int i) throws IOException, JsonGenerationException {
        char c;
        int i2;
        int i3;
        int i4 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        if (i5 < 1) {
            i5 = 65535;
        }
        int min = Math.min(iArr.length, i5 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (this._outputTail < i4) {
            while (true) {
                c = this._outputBuffer[this._outputTail];
                if (c < min) {
                    i3 = iArr[c];
                    if (i3 != 0) {
                        break;
                    }
                    i2 = this._outputTail + 1;
                    this._outputTail = i2;
                    if (i2 >= i4) {
                        return;
                    }
                } else if (c > i5) {
                    i3 = -1;
                    break;
                } else {
                    SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                    this._currentEscape = escapeSequence;
                    if (escapeSequence != null) {
                        i3 = -2;
                        break;
                    }
                    i2 = this._outputTail + 1;
                    this._outputTail = i2;
                    if (i2 >= i4) {
                    }
                }
            }
            int i6 = this._outputTail;
            int i7 = this._outputHead;
            int i8 = i6 - i7;
            if (i8 > 0) {
                this._writer.write(this._outputBuffer, i7, i8);
            }
            this._outputTail++;
            _prependOrWriteCharacterEscape(c, i3);
        }
    }

    private void writeRawLong(String str) throws IOException {
        int i = this._outputEnd;
        int i2 = this._outputTail;
        int i3 = i - i2;
        str.getChars(0, i3, this._outputBuffer, i2);
        this._outputTail += i3;
        _flushBuffer();
        int length = str.length() - i3;
        while (true) {
            int i4 = this._outputEnd;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i4;
                _flushBuffer();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _flushBuffer() throws IOException {
        int i = this._outputTail;
        int i2 = this._outputHead;
        int i3 = i - i2;
        if (i3 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._charBuffer;
        if (cArr2 != null) {
            this._charBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyValueWrite(String str) throws IOException {
        char c;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            c = ',';
        } else if (writeValue == 2) {
            c = ':';
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                writeRaw(serializableString.getValue());
            }
            return;
        } else if (writeValue == 5) {
            _reportCantWriteValueExpectName(str);
            throw null;
        } else {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = c;
    }

    /* access modifiers changed from: protected */
    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 - 3;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i8 = this._outputTail;
                this._outputTail = i8 + 1;
                cArr[i8] = '\\';
                int i9 = this._outputTail;
                this._outputTail = i9 + 1;
                cArr[i9] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i7;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << Ascii.DLE;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i12, i10, this._outputBuffer, this._outputTail);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writeFieldName(String str, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr3[i3] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(String str, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer != null && isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
            this._writer.flush();
        }
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i, i2 + i);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
    }

    public void writeBoolean(boolean z) throws IOException {
        int i;
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this._outputTail = i + 1;
    }

    public void writeEndArray() throws IOException {
        if (this._writeContext.inArray()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                char[] cArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                cArr[i] = ']';
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context not Array but ");
        sb.append(this._writeContext.typeDesc());
        _reportError(sb.toString());
        throw null;
    }

    public void writeEndObject() throws IOException {
        if (this._writeContext.inObject()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                char[] cArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                cArr[i] = '}';
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context not Object but ");
        sb.append(this._writeContext.typeDesc());
        _reportError(sb.toString());
        throw null;
    }

    public void writeFieldName(String str) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName != 4) {
            boolean z = true;
            if (writeFieldName != 1) {
                z = false;
            }
            _writeFieldName(str, z);
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i = this._outputEnd - this._outputTail;
        if (i == 0) {
            _flushBuffer();
            i = this._outputEnd - this._outputTail;
        }
        if (i >= length) {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        writeRawLong(str);
    }

    public void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '[';
    }

    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '{';
    }

    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName != 4) {
            boolean z = true;
            if (writeFieldName != 1) {
                z = false;
            }
            _writeFieldName(serializableString, z);
            return;
        }
        _reportError("Can not write a field name, expecting a value");
        throw null;
    }

    public void writeNumber(int i) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
    }

    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i < 0) {
            try {
                i = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                throw th;
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i);
            if (_writeBinary > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too few bytes available: missing ");
                sb.append(_writeBinary);
                sb.append(" bytes (out of ");
                sb.append(i);
                sb.append(")");
                _reportError(sb.toString());
                throw null;
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
        return i;
    }

    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 32) {
            if (i2 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i2);
            this._outputTail += i2;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i, i2);
    }

    public void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '{';
    }

    public void writeString(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
        _writeString(cArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr3[i4] = this._quoteChar;
    }

    private void _writeString(char[] cArr, int i, int i2) throws IOException {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i, i2);
            return;
        }
        int i3 = this._maximumNonEscapedChar;
        if (i3 != 0) {
            _writeStringASCII(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i5++;
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this._outputTail + i6 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i6);
                    this._outputTail += i6;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                break;
            }
            i = i5 + 1;
            char c2 = cArr[i5];
            _appendCharacterEscape(c2, iArr[c2]);
        }
    }

    private void _writeStringASCII(char[] cArr, int i, int i2, int i3) throws IOException, JsonGenerationException {
        char c;
        int i4 = i2 + i;
        int[] iArr = this._outputEscapes;
        int min = Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i5;
            int i7 = i;
            while (true) {
                c = cArr[i7];
                if (c >= min) {
                    if (c > i3) {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i7++;
                if (i7 >= i4) {
                    break;
                }
            }
            int i8 = i7 - i;
            if (i8 < 32) {
                if (this._outputTail + i8 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i8);
                    this._outputTail += i8;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i8);
            }
            if (i7 < i4) {
                i = i7 + 1;
                _appendCharacterEscape(c, i6);
                i5 = i6;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public final void _writeFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ',';
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
        int length = asQuotedChars.length;
        int i3 = this._outputTail;
        if (i3 + length + 1 >= this._outputEnd) {
            writeRaw(asQuotedChars, 0, length);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr3 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            cArr3[i4] = this._quoteChar;
        } else {
            System.arraycopy(asQuotedChars, 0, cArr2, i3, length);
            this._outputTail += length;
            char[] cArr4 = this._outputBuffer;
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            cArr4[i5] = this._quoteChar;
        }
    }

    public void writeNumber(long j) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    private void _writeStringCustom(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        char c;
        int i3 = i2 + i;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        if (i4 < 1) {
            i4 = 65535;
        }
        int min = Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i5 = 0;
        while (i < i3) {
            int i6 = i5;
            int i7 = i;
            while (true) {
                c = cArr[i7];
                if (c >= min) {
                    if (c <= i4) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i6 = -2;
                            break;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                } else {
                    i6 = iArr[c];
                    if (i6 != 0) {
                        break;
                    }
                }
                i7++;
                if (i7 >= i3) {
                    break;
                }
            }
            int i8 = i7 - i;
            if (i8 < 32) {
                if (this._outputTail + i8 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i8 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i8);
                    this._outputTail += i8;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i8);
            }
            if (i7 < i3) {
                i = i7 + 1;
                _appendCharacterEscape(c, i6);
                i5 = i6;
            } else {
                return;
            }
        }
    }

    public void writeRaw(char c) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = c;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int i2 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i4 > i3) {
                int _readMore = _readMore(inputStream, bArr, i4, i5, i);
                if (_readMore < 3) {
                    i5 = _readMore;
                    i4 = 0;
                    break;
                }
                i5 = _readMore;
                i3 = _readMore - 3;
                i4 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i -= 3;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i9 = this._outputTail;
                this._outputTail = i9 + 1;
                cArr[i9] = '\\';
                int i10 = this._outputTail;
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0) {
            return i;
        }
        int _readMore2 = _readMore(inputStream, bArr, i4, i5, i);
        if (_readMore2 <= 0) {
            return i;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i11 = bArr[0] << Ascii.DLE;
        int i12 = 1;
        if (1 < _readMore2) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i11, i12, this._outputBuffer, this._outputTail);
        return i - i12;
    }

    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = this._quoteChar;
        char[] asQuotedChars = serializableString.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(asQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(asQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr2[i2] = this._quoteChar;
    }

    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public void writeNumber(double d) throws IOException {
        if (this._cfgNumbersAsStrings || (isEnabled(Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d) || Double.isInfinite(d)))) {
            writeString(String.valueOf(d));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d));
    }

    public void writeNumber(float f) throws IOException {
        if (this._cfgNumbersAsStrings || (isEnabled(Feature.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f) || Float.isInfinite(f)))) {
            writeString(String.valueOf(f));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f));
    }

    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int _readMore;
        int i = this._outputEnd - 6;
        int i2 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                _readMore = _readMore(inputStream, bArr, i4, i5, bArr.length);
                if (_readMore < 3) {
                    break;
                }
                i5 = _readMore;
                i2 = _readMore - 3;
                i4 = 0;
            }
            if (this._outputTail > i) {
                _flushBuffer();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i3 += 3;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i9 = this._outputTail;
                this._outputTail = i9 + 1;
                cArr[i9] = '\\';
                int i10 = this._outputTail;
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (_readMore <= 0) {
            return i3;
        }
        if (this._outputTail > i) {
            _flushBuffer();
        }
        int i11 = bArr[0] << Ascii.DLE;
        int i12 = 1;
        if (1 < _readMore) {
            i11 |= (bArr[1] & 255) << 8;
            i12 = 2;
        }
        int i13 = i3 + i12;
        this._outputTail = base64Variant.encodeBase64Partial(i11, i12, this._outputBuffer, this._outputTail);
        return i13;
    }

    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i, int i2, char c, int i3) throws IOException, JsonGenerationException {
        String str;
        int i4;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this._entityBuffer;
                if (cArr2 == null) {
                    cArr2 = _allocateEntityBuffer();
                }
                cArr2[1] = (char) i3;
                this._writer.write(cArr2, 0, 2);
            } else {
                i -= 2;
                cArr[i] = '\\';
                cArr[i + 1] = (char) i3;
            }
            return i;
        } else if (i3 != -2) {
            if (i <= 5 || i >= i2) {
                char[] cArr3 = this._entityBuffer;
                if (cArr3 == null) {
                    cArr3 = _allocateEntityBuffer();
                }
                this._outputHead = this._outputTail;
                if (c > 255) {
                    int i5 = (c >> 8) & 255;
                    char c2 = c & 255;
                    char[] cArr4 = HEX_CHARS;
                    cArr3[10] = cArr4[i5 >> 4];
                    cArr3[11] = cArr4[i5 & 15];
                    cArr3[12] = cArr4[c2 >> 4];
                    cArr3[13] = cArr4[c2 & 15];
                    this._writer.write(cArr3, 8, 6);
                } else {
                    char[] cArr5 = HEX_CHARS;
                    cArr3[6] = cArr5[c >> 4];
                    cArr3[7] = cArr5[c & 15];
                    this._writer.write(cArr3, 2, 6);
                }
            } else {
                int i6 = i - 6;
                int i7 = i6 + 1;
                cArr[i6] = '\\';
                int i8 = i7 + 1;
                cArr[i7] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr6 = HEX_CHARS;
                    cArr[i8] = cArr6[i9 >> 4];
                    i4 = i10 + 1;
                    cArr[i10] = cArr6[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr[i8] = '0';
                    i4 = i11 + 1;
                    cArr[i11] = '0';
                }
                int i12 = i4 + 1;
                char[] cArr7 = HEX_CHARS;
                cArr[i4] = cArr7[c >> 4];
                cArr[i12] = cArr7[c & 15];
                i = i12 - 5;
            }
            return i;
        } else {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                str = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                str = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = str.length();
            if (i < length || i >= i2) {
                this._writer.write(str);
            } else {
                i -= length;
                str.getChars(0, length, cArr, i);
            }
            return i;
        }
    }
}
