package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UTF8StreamJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2;
        this._currInputProcessed = (long) (-i2);
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
            throw null;
        }
    }

    private final void _closeArrayScope() throws JsonParseException {
        _updateLocation();
        if (this._parsingContext.inArray()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
        } else {
            _reportMismatchedEndMarker(93, '}');
            throw null;
        }
    }

    private final void _closeObjectScope() throws JsonParseException {
        _updateLocation();
        if (this._parsingContext.inObject()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
        } else {
            _reportMismatchedEndMarker(125, ']');
            throw null;
        }
    }

    private final JsonToken _closeScope(int i) throws JsonParseException {
        if (i == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        _reportInvalidOther(b & 255, this._inputPtr);
        throw null;
    }

    private final int _decodeUtf8_3(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b3 = bArr2[i4];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            _reportInvalidOther(b3 & 255, this._inputPtr);
            throw null;
        }
        _reportInvalidOther(b & 255, this._inputPtr);
        throw null;
    }

    private final int _decodeUtf8_3fast(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b3 = bArr[i4];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            _reportInvalidOther(b3 & 255, this._inputPtr);
            throw null;
        }
        _reportInvalidOther(b & 255, this._inputPtr);
        throw null;
    }

    private final int _decodeUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            byte b2 = ((i & 7) << 6) | (b & 63);
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            byte b3 = bArr2[i3];
            if ((b3 & 192) == 128) {
                byte b4 = (b2 << 6) | (b3 & 63);
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                byte b5 = bArr3[i4];
                if ((b5 & 192) == 128) {
                    return ((b4 << 6) | (b5 & 63)) - Ascii.NUL;
                }
                _reportInvalidOther(b5 & 255, this._inputPtr);
                throw null;
            }
            _reportInvalidOther(b3 & 255, this._inputPtr);
            throw null;
        }
        _reportInvalidOther(b & 255, this._inputPtr);
        throw null;
    }

    private final void _finishString2(char[] cArr, int i) throws IOException {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this._inputPtr = i2;
                    break;
                }
                int i3 = i2 + 1;
                int i4 = bArr[i2] & 255;
                if (iArr[i4] != 0) {
                    this._inputPtr = i3;
                    if (i4 == 34) {
                        this._textBuffer.setCurrentLength(i);
                        return;
                    }
                    int i5 = iArr[i4];
                    if (i5 == 1) {
                        i4 = _decodeEscaped();
                    } else if (i5 == 2) {
                        i4 = _decodeUtf8_2(i4);
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            int _decodeUtf8_4 = _decodeUtf8_4(i4);
                            int i6 = i + 1;
                            cArr[i] = (char) (55296 | (_decodeUtf8_4 >> 10));
                            if (i6 >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                                i6 = 0;
                            }
                            i4 = (_decodeUtf8_4 & 1023) | 56320;
                            i = i6;
                        } else if (i4 < 32) {
                            _throwUnquotedSpace(i4, "string value");
                        } else {
                            _reportInvalidChar(i4);
                            throw null;
                        }
                    } else if (this._inputEnd - this._inputPtr >= 2) {
                        i4 = _decodeUtf8_3fast(i4);
                    } else {
                        i4 = _decodeUtf8_3(i4);
                    }
                    if (i >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i = 0;
                    }
                    int i7 = i + 1;
                    cArr[i] = (char) i4;
                    i = i7;
                } else {
                    int i8 = i + 1;
                    cArr[i] = (char) i4;
                    i2 = i3;
                    i = i8;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i) throws IOException {
        int length = str.length();
        do {
            if ((this._inputPtr < this._inputEnd || _loadMore()) && this._inputBuffer[this._inputPtr] == str.charAt(i)) {
                this._inputPtr++;
                i++;
            } else {
                _reportInvalidToken(str.substring(0, i));
                throw null;
            }
        } while (i < length);
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte b = this._inputBuffer[this._inputPtr] & 255;
            if (!(b < 48 || b == 93 || b == 125)) {
                _checkMatchEnd(str, i, b);
            }
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) throws IOException {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (i == 45) {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        } else if (i == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else if (i != 123) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken _parsePosNumber = _parsePosNumber(i);
                    this._currToken = _parsePosNumber;
                    return _parsePosNumber;
                default:
                    JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i);
                    this._currToken = _handleUnexpectedValue;
                    return _handleUnexpectedValue;
            }
        } else {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
    }

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        boolean z2;
        int i4;
        int i5;
        char[] cArr2;
        byte b;
        int i6;
        int i7 = i2;
        int i8 = 0;
        if (i7 == 46) {
            cArr2 = cArr;
            int i9 = i;
            if (i9 >= cArr2.length) {
                cArr2 = this._textBuffer.finishCurrentSegment();
                i9 = 0;
            }
            i5 = i9 + 1;
            cArr2[i9] = (char) i7;
            byte b2 = i7;
            int i10 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                b2 = bArr[i11] & 255;
                if (b2 < 48 || b2 > 57) {
                    z2 = false;
                } else {
                    i10++;
                    if (i5 >= cArr2.length) {
                        cArr2 = this._textBuffer.finishCurrentSegment();
                        i5 = 0;
                    }
                    int i12 = i5 + 1;
                    cArr2[i5] = (char) b2;
                    i5 = i12;
                }
            }
            z2 = false;
            if (i10 != 0) {
                int i13 = b2;
                i4 = i10;
                i7 = i13;
            } else {
                reportUnexpectedNumberChar(b2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            cArr2 = cArr;
            i5 = i;
            i4 = 0;
            z2 = false;
        }
        if (b == 101 || b == 69) {
            if (i5 >= cArr2.length) {
                cArr2 = this._textBuffer.finishCurrentSegment();
                i5 = 0;
            }
            int i14 = i5 + 1;
            cArr2[i5] = (char) b;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i15 = this._inputPtr;
            this._inputPtr = i15 + 1;
            b = bArr2[i15] & 255;
            if (b == 45 || b == 43) {
                if (i14 >= cArr2.length) {
                    cArr2 = this._textBuffer.finishCurrentSegment();
                    i14 = 0;
                }
                int i16 = i14 + 1;
                cArr2[i14] = (char) b;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i17 = this._inputPtr;
                this._inputPtr = i17 + 1;
                b = bArr3[i17] & 255;
                i14 = i16;
            }
            char[] cArr3 = cArr2;
            int i18 = 0;
            while (true) {
                if (b >= 48 && b <= 57) {
                    i18++;
                    if (i14 >= cArr3.length) {
                        cArr3 = this._textBuffer.finishCurrentSegment();
                        i14 = 0;
                    }
                    int i19 = i14 + 1;
                    cArr3[i14] = (char) b;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i8 = i18;
                        i6 = i19;
                        z2 = true;
                        break;
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i20 = this._inputPtr;
                    this._inputPtr = i20 + 1;
                    b = bArr4[i20] & 255;
                    i14 = i19;
                } else {
                    i8 = i18;
                    i6 = i14;
                }
            }
            i8 = i18;
            i6 = i14;
            if (i8 == 0) {
                reportUnexpectedNumberChar(b, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(b);
            }
        }
        this._textBuffer.setCurrentLength(i5);
        return resetFloat(z, i3, i4, i8);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) throws IOException {
        byte b;
        char[] cArr2 = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                b = bArr[i5] & 255;
                if (b <= 57 && b >= 48) {
                    if (i3 >= cArr2.length) {
                        i3 = 0;
                        cArr2 = this._textBuffer.finishCurrentSegment();
                    }
                    int i6 = i3 + 1;
                    cArr2[i3] = (char) b;
                    i4++;
                    i3 = i6;
                }
            } else {
                this._textBuffer.setCurrentLength(i3);
                return resetInt(z, i4);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(cArr2, i3, b, z, i4);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i3);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i4);
    }

    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            int i2 = inputCodeComment[b];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4(b);
                } else if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 == 42) {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i3 = this._inputPtr;
                    if (bArr2[i3] == 47) {
                        this._inputPtr = i3 + 1;
                        return;
                    }
                } else {
                    _reportInvalidChar(b);
                    throw null;
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
        throw null;
    }

    private final int _skipColon() throws IOException {
        int i = this._inputPtr;
        if (i + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this._inputPtr = i2;
            byte b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    byte[] bArr2 = this._inputBuffer;
                    int i3 = this._inputPtr + 1;
                    this._inputPtr = i3;
                    byte b3 = bArr2[i3];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return b3;
                    }
                }
                return _skipColon2(true);
            } else if (b2 == 47 || b2 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return b2;
            }
        } else {
            if (b == 32 || b == 9) {
                byte[] bArr3 = this._inputBuffer;
                int i4 = this._inputPtr + 1;
                this._inputPtr = i4;
                b = bArr3[i4];
            }
            if (b != 58) {
                return _skipColon2(false);
            }
            byte[] bArr4 = this._inputBuffer;
            int i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            byte b4 = bArr4[i5];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    byte[] bArr5 = this._inputBuffer;
                    int i6 = this._inputPtr + 1;
                    this._inputPtr = i6;
                    byte b5 = bArr5[i6];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return b5;
                    }
                }
                return _skipColon2(true);
            } else if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return b4;
            }
        }
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        _skipComment();
                    } else if (b != 35 || !_skipYAMLComment()) {
                        if (z) {
                            return b;
                        }
                        if (b == 58) {
                            z = true;
                        } else {
                            _reportUnexpectedChar(b, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" within/between ");
                sb.append(this._parsingContext.typeDesc());
                sb.append(" entries");
                _reportInvalidEOF(sb.toString(), null);
                throw null;
            }
        }
    }

    private final void _skipComment() throws IOException {
        if (!isEnabled(Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            if (b == 47) {
                _skipLine();
            } else if (b == 42) {
                _skipCComment();
            } else {
                _reportUnexpectedChar(b, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            _reportInvalidEOF(" in a comment", null);
            throw null;
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                byte b = bArr[i] & 255;
                int i2 = inputCodeComment[b];
                if (i2 != 0) {
                    if (i2 == 2) {
                        _skipUtf8_2();
                    } else if (i2 == 3) {
                        _skipUtf8_3();
                    } else if (i2 == 4) {
                        _skipUtf8_4(b);
                    } else if (i2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                        return;
                    } else if (i2 == 13) {
                        _skipCR();
                        return;
                    } else if (i2 != 42 && i2 < 0) {
                        _reportInvalidChar(b);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
            throw null;
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            byte b2 = bArr2[i2];
            if ((b2 & 192) != 128) {
                _reportInvalidOther(b2 & 255, this._inputPtr);
                throw null;
            }
            return;
        }
        _reportInvalidOther(b & 255, this._inputPtr);
        throw null;
    }

    private final void _skipUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            byte b2 = bArr2[i3];
            if ((b2 & 192) == 128) {
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                byte b3 = bArr3[i4];
                if ((b3 & 192) != 128) {
                    _reportInvalidOther(b3 & 255, this._inputPtr);
                    throw null;
                }
                return;
            }
            _reportInvalidOther(b2 & 255, this._inputPtr);
            throw null;
        }
        _reportInvalidOther(b & 255, this._inputPtr);
        throw null;
    }

    private final int _skipWS() throws IOException {
        while (true) {
            int i = this._inputPtr;
            if (i >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                if (b != 47 && b != 35) {
                    return b;
                }
                this._inputPtr--;
                return _skipWS2();
            } else if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            }
        }
    }

    private final int _skipWS2() throws IOException {
        byte b;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        _skipComment();
                    } else if (b != 35 || !_skipYAMLComment()) {
                        return b;
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end-of-input within/between ");
                sb.append(this._parsingContext.typeDesc());
                sb.append(" entries");
                throw _constructError(sb.toString());
            }
        }
        return b;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i] & 255;
        if (b <= 32) {
            if (b != 32) {
                if (b == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (b == 13) {
                    _skipCR();
                } else if (b != 9) {
                    _throwInvalidSpace(b);
                    throw null;
                }
            }
            while (true) {
                int i2 = this._inputPtr;
                if (i2 >= this._inputEnd) {
                    return _skipWSOrEnd2();
                }
                byte[] bArr2 = this._inputBuffer;
                this._inputPtr = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                if (b2 > 32) {
                    if (b2 != 47 && b2 != 35) {
                        return b2;
                    }
                    this._inputPtr--;
                    return _skipWSOrEnd2();
                } else if (b2 != 32) {
                    if (b2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (b2 == 13) {
                        _skipCR();
                    } else if (b2 != 9) {
                        _throwInvalidSpace(b2);
                        throw null;
                    }
                }
            }
        } else if (b != 47 && b != 35) {
            return b;
        } else {
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
    }

    private final int _skipWSOrEnd2() throws IOException {
        byte b;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            b = bArr[i] & 255;
            if (b > 32) {
                if (b == 47) {
                    _skipComment();
                } else if (b != 35 || !_skipYAMLComment()) {
                    return b;
                }
            } else if (b == 32) {
                continue;
            } else if (b == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (b == 13) {
                _skipCR();
            } else if (b != 9) {
                _throwInvalidSpace(b);
                throw null;
            }
        }
        return b;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if (!isEnabled(Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return 48;
        }
        byte b = this._inputBuffer[this._inputPtr] & 255;
        if (b < 48 || b > 57) {
            return 48;
        }
        if (isEnabled(Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            this._inputPtr++;
            if (b == 48) {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr = this._inputBuffer;
                    int i = this._inputPtr;
                    b = bArr[i] & 255;
                    if (b < 48 || b > 57) {
                        return 48;
                    }
                    this._inputPtr = i + 1;
                } while (b == 48);
            }
            return b;
        }
        reportInvalidNumber("Leading zeroes not allowed");
        throw null;
    }

    private final void _verifyRootSpace(int i) throws IOException {
        this._inputPtr++;
        if (i != 9) {
            if (i == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (i == 13) {
                _skipCR();
            } else if (i != 32) {
                _reportMissingRootWS(i);
                throw null;
            }
        }
    }

    private final String addName(int[] iArr, int i, int i2) throws JsonParseException {
        int i3;
        int i4;
        int i5;
        int[] iArr2 = iArr;
        int i6 = i;
        int i7 = i2;
        int i8 = ((i6 << 2) - 4) + i7;
        if (i7 < 4) {
            int i9 = i6 - 1;
            i3 = iArr2[i9];
            iArr2[i9] = i3 << ((4 - i7) << 3);
        } else {
            i3 = 0;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = (iArr2[i10 >> 2] >> ((3 - (i10 & 3)) << 3)) & 255;
            i10++;
            if (i12 > 127) {
                if ((i12 & 224) == 192) {
                    i4 = i12 & 31;
                    i5 = 1;
                } else if ((i12 & 240) == 224) {
                    i4 = i12 & 15;
                    i5 = 2;
                } else if ((i12 & 248) == 240) {
                    i4 = i12 & 7;
                    i5 = 3;
                } else {
                    _reportInvalidInitial(i12);
                    throw null;
                }
                if (i10 + i5 <= i8) {
                    int i13 = iArr2[i10 >> 2] >> ((3 - (i10 & 3)) << 3);
                    i10++;
                    if ((i13 & 192) == 128) {
                        int i14 = (i4 << 6) | (i13 & 63);
                        if (i5 > 1) {
                            int i15 = iArr2[i10 >> 2] >> ((3 - (i10 & 3)) << 3);
                            i10++;
                            if ((i15 & 192) == 128) {
                                int i16 = (i15 & 63) | (i14 << 6);
                                if (i5 > 2) {
                                    int i17 = iArr2[i10 >> 2] >> ((3 - (i10 & 3)) << 3);
                                    i10++;
                                    if ((i17 & 192) == 128) {
                                        i14 = (i16 << 6) | (i17 & 63);
                                    } else {
                                        _reportInvalidOther(i17 & 255);
                                        throw null;
                                    }
                                } else {
                                    i14 = i16;
                                }
                            } else {
                                _reportInvalidOther(i15);
                                throw null;
                            }
                        }
                        if (i5 > 2) {
                            int i18 = i14 - 65536;
                            if (i11 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                            }
                            int i19 = i11 + 1;
                            emptyAndGetCurrentSegment[i11] = (char) ((i18 >> 10) + 55296);
                            i12 = (i18 & 1023) | 56320;
                            i11 = i19;
                        } else {
                            i12 = i14;
                        }
                    } else {
                        _reportInvalidOther(i13);
                        throw null;
                    }
                } else {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    throw null;
                }
            }
            if (i11 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            int i20 = i11 + 1;
            emptyAndGetCurrentSegment[i11] = (char) i12;
            i11 = i20;
        }
        String str = new String(emptyAndGetCurrentSegment, 0, i11);
        if (i7 < 4) {
            iArr2[i6 - 1] = i3;
        }
        return this._symbols.addName(str, iArr2, i6);
    }

    private final String findName(int i, int i2) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i, i2);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i2);
    }

    private int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    private final String parseName(int i, int i2, int i3) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char((int) b);
                if (decodeBase64Char < 0) {
                    if (b == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, (int) b, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char((int) b2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, (int) b2, 1);
                }
                int i3 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                byte b3 = bArr3[i4] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char((int) b3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b3 == 34) {
                            _getByteArrayBuilder.append(i3 >> 4);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, (int) b3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        byte b4 = bArr4[i5] & 255;
                        if (base64Variant.usesPaddingChar((int) b4) || _decodeBase64Escape(base64Variant, (int) b4, 3) == -2) {
                            _getByteArrayBuilder.append(i3 >> 4);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant, b4, 3, sb.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                byte b5 = bArr5[i7] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char((int) b5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b5 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, (int) b5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i6 << 6) | decodeBase64Char4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int _decodeCharForError(int i) throws IOException {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i3 & 224) == 192) {
            i2 = i3 & 31;
            c = 1;
        } else if ((i3 & 240) == 224) {
            i2 = i3 & 15;
            c = 2;
        } else if ((i3 & 248) == 240) {
            i2 = i3 & 7;
            c = 3;
        } else {
            _reportInvalidInitial(i3 & 255);
            throw null;
        }
        int nextByte = nextByte();
        if ((nextByte & 192) == 128) {
            int i4 = (i2 << 6) | (nextByte & 63);
            if (c <= 1) {
                return i4;
            }
            int nextByte2 = nextByte();
            if ((nextByte2 & 192) == 128) {
                int i5 = (i4 << 6) | (nextByte2 & 63);
                if (c <= 2) {
                    return i5;
                }
                int nextByte3 = nextByte();
                if ((nextByte3 & 192) == 128) {
                    return (i5 << 6) | (nextByte3 & 63);
                }
                _reportInvalidOther(nextByte3 & 255);
                throw null;
            }
            _reportInvalidOther(nextByte2 & 255);
            throw null;
        }
        _reportInvalidOther(nextByte & 255);
        throw null;
    }

    /* access modifiers changed from: protected */
    public char _decodeEscaped() throws IOException {
        String str = " in character escape sequence";
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char _decodeCharForError = (char) _decodeCharForError(b);
                _handleUnrecognizedCharacterEscape(_decodeCharForError);
                return _decodeCharForError;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this._inputPtr < this._inputEnd || _loadMore()) {
                    byte[] bArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    byte b2 = bArr2[i4];
                    int charToHex = CharTypes.charToHex(b2);
                    if (charToHex >= 0) {
                        i3 = (i3 << 4) | charToHex;
                        i2++;
                    } else {
                        _reportUnexpectedChar(b2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    _reportInvalidEOF(str, JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i3;
        }
        _reportInvalidEOF(str, JsonToken.VALUE_STRING);
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _finishAndReturnString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                int i3 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) b;
                i2 = i3;
            } else if (b == 34) {
                this._inputPtr = i + 1;
                return this._textBuffer.setCurrentAndReturn(i2);
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    /* access modifiers changed from: protected */
    public void _finishString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                int i3 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) b;
                i2 = i3;
            } else if (b == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return;
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
    }

    /* access modifiers changed from: protected */
    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (id == 6 || id == 7 || id == 8) {
            return this._textBuffer.contentsAsString();
        }
        return jsonToken.asString();
    }

    /* access modifiers changed from: protected */
    public JsonToken _handleApos() throws IOException {
        int i;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i2 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i3 = this._inputEnd;
            int length = this._inputPtr + (emptyAndGetCurrentSegment.length - i2);
            if (length < i3) {
                i3 = length;
            }
            while (true) {
                int i4 = this._inputPtr;
                if (i4 >= i3) {
                    break;
                }
                this._inputPtr = i4 + 1;
                byte b = bArr[i4] & 255;
                if (b != 39 && iArr[b] == 0) {
                    int i5 = i2 + 1;
                    emptyAndGetCurrentSegment[i2] = (char) b;
                    i2 = i5;
                } else if (b == 39) {
                    this._textBuffer.setCurrentLength(i2);
                    return JsonToken.VALUE_STRING;
                } else {
                    int i6 = iArr[b];
                    if (i6 == 1) {
                        i = _decodeEscaped();
                    } else if (i6 == 2) {
                        i = _decodeUtf8_2(b);
                    } else if (i6 != 3) {
                        if (i6 != 4) {
                            if (b < 32) {
                                _throwUnquotedSpace(b, "string value");
                            }
                            _reportInvalidChar(b);
                            throw null;
                        }
                        int _decodeUtf8_4 = _decodeUtf8_4(b);
                        int i7 = i2 + 1;
                        emptyAndGetCurrentSegment[i2] = (char) (55296 | (_decodeUtf8_4 >> 10));
                        if (i7 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i7 = 0;
                        }
                        i = 56320 | (_decodeUtf8_4 & 1023);
                        i2 = i7;
                    } else if (this._inputEnd - this._inputPtr >= 2) {
                        i = _decodeUtf8_3fast(b);
                    } else {
                        i = _decodeUtf8_3(b);
                    }
                    if (i2 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i2 = 0;
                    }
                    int i8 = i2 + 1;
                    emptyAndGetCurrentSegment[i2] = (char) i;
                    i2 = i8;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=byte, for r4v0, types: [int] */
    public JsonToken _handleInvalidNumberStart(byte b, boolean z) throws IOException {
        String str;
        if (b == 73) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                b = bArr[i];
                if (b == 78) {
                    str = z ? "-INF" : "+INF";
                } else if (b == 110) {
                    str = z ? "-Infinity" : "+Infinity";
                }
                _matchToken(str, 3);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
                throw null;
            }
            _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            throw null;
        }
        reportUnexpectedNumberChar(b, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _handleOddName(int i) throws IOException {
        if (i == 39 && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (isEnabled(Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
            if (inputCodeUtf8JsNames[i] == 0) {
                int[] iArr = this._quadBuffer;
                int i2 = 0;
                byte b = i;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i2 < 4) {
                        i2++;
                        i4 = (i4 << 8) | b;
                    } else {
                        if (i3 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        int i5 = i3 + 1;
                        iArr[i3] = i4;
                        i3 = i5;
                        i4 = b;
                        i2 = 1;
                    }
                    if (this._inputPtr < this._inputEnd || _loadMore()) {
                        byte[] bArr = this._inputBuffer;
                        int i6 = this._inputPtr;
                        b = bArr[i6] & 255;
                        if (inputCodeUtf8JsNames[b] != 0) {
                            if (i2 > 0) {
                                if (i3 >= iArr.length) {
                                    int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                                    this._quadBuffer = growArrayBy;
                                    iArr = growArrayBy;
                                }
                                int i7 = i3 + 1;
                                iArr[i3] = i4;
                                i3 = i7;
                            }
                            String findName = this._symbols.findName(iArr, i3);
                            if (findName == null) {
                                findName = addName(iArr, i3, i2);
                            }
                            return findName;
                        }
                        this._inputPtr = i6 + 1;
                    } else {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                        throw null;
                    }
                }
            } else {
                _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                throw null;
            }
        } else {
            _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r4 != 44) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x00a5;
     */
    public JsonToken _handleUnexpectedValue(int i) throws IOException {
        if (i != 39) {
            if (i == 73) {
                String str = "Infinity";
                _matchToken(str, 1);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN(str, Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                throw null;
            } else if (i != 78) {
                if (i != 93) {
                    if (i != 125) {
                        if (i == 43) {
                            if (this._inputPtr < this._inputEnd || _loadMore()) {
                                byte[] bArr = this._inputBuffer;
                                int i2 = this._inputPtr;
                                this._inputPtr = i2 + 1;
                                return _handleInvalidNumberStart(bArr[i2] & 255, false);
                            }
                            _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                            throw null;
                        }
                    }
                    _reportUnexpectedChar(i, "expected a value");
                    throw null;
                }
                if (isEnabled(Feature.ALLOW_MISSING_VALUES)) {
                    this._inputPtr--;
                    return JsonToken.VALUE_NULL;
                }
                _reportUnexpectedChar(i, "expected a value");
                throw null;
            } else {
                String str2 = "NaN";
                _matchToken(str2, 1);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN(str2, Double.NaN);
                }
                _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                throw null;
            }
        } else if (isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _handleApos();
        }
        if (Character.isJavaIdentifierStart(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append((char) i);
            _reportInvalidToken(sb.toString(), "('true', 'false' or 'null')");
            throw null;
        }
        _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean _loadMore() throws IOException {
        int i = this._inputEnd;
        this._currInputProcessed += (long) i;
        this._currInputRowStart -= i;
        this._nameStartOffset -= i;
        InputStream inputStream = this._inputStream;
        if (inputStream != null) {
            byte[] bArr = this._inputBuffer;
            int length = bArr.length;
            if (length == 0) {
                return false;
            }
            int read = inputStream.read(bArr, 0, length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("InputStream.read() returned 0 characters when trying to read ");
                sb.append(this._inputBuffer.length);
                sb.append(" bytes");
                throw new IOException(sb.toString());
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void _loadMoreGuaranteed() throws IOException {
        if (!_loadMore()) {
            _reportInvalidEOF();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchFalse() throws IOException {
        int i = this._inputPtr;
        if (i + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 115) {
                        int i5 = i4 + 1;
                        if (bArr[i4] == 101) {
                            byte b = bArr[i5] & 255;
                            if (b < 48 || b == 93 || b == 125) {
                                this._inputPtr = i5;
                                return;
                            }
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchNull() throws IOException {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i2 + 1;
                if (bArr[i2] == 108) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 108) {
                        byte b = bArr[i4] & 255;
                        if (b < 48 || b == 93 || b == 125) {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i) throws IOException {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        while (this._inputBuffer[this._inputPtr] == str.charAt(i)) {
            this._inputPtr++;
            i++;
            if (i >= length) {
                byte b = this._inputBuffer[this._inputPtr] & 255;
                if (!(b < 48 || b == 93 || b == 125)) {
                    _checkMatchEnd(str, i, b);
                }
                return;
            }
        }
        _reportInvalidToken(str.substring(0, i));
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _matchTrue() throws IOException {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i2 + 1;
                if (bArr[i2] == 117) {
                    int i4 = i3 + 1;
                    if (bArr[i3] == 101) {
                        byte b = bArr[i4] & 255;
                        if (b < 48 || b == 93 || b == 125) {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v3
  assigns: []
  uses: []
  mth insns count: 123
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    public String _parseAposName() throws IOException {
        int i;
        ? r0;
        int i2;
        int i3;
        int i4;
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (i6 == 39) {
                return "";
            }
            int[] iArr = this._quadBuffer;
            int[] iArr2 = _icLatin1;
            int[] iArr3 = iArr;
            int i7 = 0;
            int i8 = 0;
            ? r8 = 0;
            while (r0 != 39) {
                if (!(iArr2[r0] == 0 || r0 == 34)) {
                    if (r0 != 92) {
                        _throwUnquotedSpace(r0, "name");
                    } else {
                        r0 = _decodeEscaped();
                    }
                    if (r0 > 127) {
                        if (i >= 4) {
                            if (i8 >= iArr3.length) {
                                iArr3 = ParserBase.growArrayBy(iArr3, iArr3.length);
                                this._quadBuffer = iArr3;
                            }
                            int i9 = i8 + 1;
                            iArr3[i8] = r8;
                            i8 = i9;
                            i = 0;
                            r8 = 0;
                        }
                        if (r0 < 2048) {
                            i4 = (r8 << 8) | (r0 >> 6) | 192;
                            i++;
                        } else {
                            int i10 = (r8 << 8) | (r0 >> 12) | 224;
                            int i11 = i + 1;
                            if (i11 >= 4) {
                                if (i8 >= iArr3.length) {
                                    int[] growArrayBy = ParserBase.growArrayBy(iArr3, iArr3.length);
                                    this._quadBuffer = growArrayBy;
                                    iArr3 = growArrayBy;
                                }
                                int i12 = i8 + 1;
                                iArr3[i8] = i10;
                                i8 = i12;
                                i11 = 0;
                                i10 = 0;
                            }
                            i4 = (i10 << 8) | ((r0 >> 6) & 63) | 128;
                            i = i11 + 1;
                        }
                        r0 = (r0 & true) | true;
                    }
                }
                if (i < 4) {
                    i7 = i + 1;
                    i3 = r0 | (r8 << 8);
                } else {
                    if (i8 >= iArr3.length) {
                        iArr3 = ParserBase.growArrayBy(iArr3, iArr3.length);
                        this._quadBuffer = iArr3;
                    }
                    int i13 = i8 + 1;
                    iArr3[i8] = r8;
                    i3 = r0;
                    i8 = i13;
                    i7 = 1;
                }
                if (this._inputPtr < this._inputEnd || _loadMore()) {
                    byte[] bArr2 = this._inputBuffer;
                    int i14 = this._inputPtr;
                    this._inputPtr = i14 + 1;
                    i6 = bArr2[i14] & 255;
                    r8 = i3;
                } else {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    throw null;
                }
            }
            if (i > 0) {
                if (i8 >= iArr3.length) {
                    int[] growArrayBy2 = ParserBase.growArrayBy(iArr3, iArr3.length);
                    this._quadBuffer = growArrayBy2;
                    iArr3 = growArrayBy2;
                }
                i2 = i8 + 1;
                iArr3[i8] = _padLastQuad(r8, i);
            } else {
                i2 = i8;
            }
            String findName = this._symbols.findName(iArr3, i2);
            if (findName == null) {
                findName = addName(iArr3, i2, i);
            }
            return findName;
        }
        _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        throw null;
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i) throws IOException {
        if (i != 34) {
            return _handleOddName(i);
        }
        int i2 = this._inputPtr;
        if (i2 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            byte b2 = bArr[i3] & 255;
            if (iArr[b2] == 0) {
                byte b3 = (b << 8) | b2;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                byte b4 = bArr[i4] & 255;
                if (iArr[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i5 = this._inputPtr;
                    this._inputPtr = i5 + 1;
                    byte b6 = bArr[i5] & 255;
                    if (iArr[b6] == 0) {
                        byte b7 = (b5 << 8) | b6;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        byte b8 = bArr[i6] & 255;
                        if (iArr[b8] == 0) {
                            this._quad1 = b7;
                            return parseMediumName(b8);
                        } else if (b8 == 34) {
                            return findName(b7, 4);
                        } else {
                            return parseName(b7, b8, 4);
                        }
                    } else if (b6 == 34) {
                        return findName(b5, 3);
                    } else {
                        return parseName(b5, b6, 3);
                    }
                } else if (b4 == 34) {
                    return findName(b3, 2);
                } else {
                    return parseName(b3, b4, 2);
                }
            } else if (b2 == 34) {
                return findName(b, 1);
            } else {
                return parseName(b, b2, 1);
            }
        } else if (b == 34) {
            return "";
        } else {
            return parseName(0, b, 0);
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() throws IOException {
        byte b;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 <= 48) {
            if (i2 != 48) {
                return _handleInvalidNumberStart(i2, true);
            }
            i2 = _verifyNoLeadingZeroes();
        } else if (i2 > 57) {
            return _handleInvalidNumberStart(i2, true);
        }
        int i3 = 2;
        emptyAndGetCurrentSegment[1] = (char) i2;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 2);
        int i4 = 1;
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i3, true, i4);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i5 + 1;
            b = bArr2[i5] & 255;
            if (b >= 48 && b <= 57) {
                i4++;
                int i6 = i3 + 1;
                emptyAndGetCurrentSegment[i3] = (char) b;
                i3 = i6;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i3, b, true, i4);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i3);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(b);
        }
        return resetInt(true, i4);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i) throws IOException {
        byte b;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = this._inputPtr;
            if (i4 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i2, false, i3);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            b = bArr[i4] & 255;
            if (b >= 48 && b <= 57) {
                i3++;
                int i5 = i2 + 1;
                emptyAndGetCurrentSegment[i2] = (char) b;
                i2 = i5;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i2, b, false, i3);
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(i2);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(b);
        }
        return resetInt(false, i3);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r10 < 0) goto L_0x0171;
     */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        Base64Variant base64Variant2 = base64Variant;
        OutputStream outputStream2 = outputStream;
        byte[] bArr2 = bArr;
        int i = 3;
        int length = bArr2.length - 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr3 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            byte b = bArr3[i5] & 255;
            if (b > 32) {
                int decodeBase64Char = base64Variant2.decodeBase64Char((int) b);
                if (decodeBase64Char < 0) {
                    if (b == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant2, (int) b, i2);
                }
                if (i4 > length) {
                    i3 += i4;
                    outputStream2.write(bArr2, i2, i4);
                    i4 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                byte b2 = bArr4[i6] & 255;
                int decodeBase64Char2 = base64Variant2.decodeBase64Char((int) b2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant2, (int) b2, 1);
                }
                int i7 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                byte b3 = bArr5[i8] & 255;
                int decodeBase64Char3 = base64Variant2.decodeBase64Char((int) b3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (b3 == 34) {
                            int i9 = i4 + 1;
                            bArr2[i4] = (byte) (i7 >> 4);
                            if (!base64Variant.usesPadding()) {
                                i4 = i9;
                            } else {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                                throw null;
                            }
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant2, (int) b3, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr6 = this._inputBuffer;
                        int i10 = this._inputPtr;
                        this._inputPtr = i10 + 1;
                        byte b4 = bArr6[i10] & 255;
                        if (base64Variant2.usesPaddingChar((int) b4) || _decodeBase64Escape(base64Variant2, (int) b4, i) == -2) {
                            int i11 = i7 >> 4;
                            int i12 = i4 + 1;
                            bArr2[i4] = (byte) i11;
                            i4 = i12;
                            i2 = 0;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant2, b4, i, sb.toString());
                        }
                    }
                }
                int i13 = (i7 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr7 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                byte b5 = bArr7[i14] & 255;
                int decodeBase64Char4 = base64Variant2.decodeBase64Char((int) b5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (b5 == 34) {
                            int i15 = i13 >> 2;
                            int i16 = i4 + 1;
                            bArr2[i4] = (byte) (i15 >> 8);
                            i4 = i16 + 1;
                            bArr2[i16] = (byte) i15;
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                                throw null;
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant2, (int) b5, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i17 = i13 >> 2;
                        int i18 = i4 + 1;
                        bArr2[i4] = (byte) (i17 >> 8);
                        i4 = i18 + 1;
                        bArr2[i18] = (byte) i17;
                        i = 3;
                        i2 = 0;
                    }
                }
                int i19 = (i13 << 6) | decodeBase64Char4;
                int i20 = i4 + 1;
                bArr2[i4] = (byte) (i19 >> 16);
                int i21 = i20 + 1;
                bArr2[i20] = (byte) (i19 >> 8);
                int i22 = i21 + 1;
                bArr2[i21] = (byte) i19;
                i4 = i22;
                i = 3;
                i2 = 0;
            }
            i = 3;
            i2 = 0;
        }
        this._tokenIncomplete = false;
        if (i4 <= 0) {
            return i3;
        }
        int i23 = i3 + i4;
        outputStream2.write(bArr2, 0, i4);
        return i23;
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable) {
            byte[] bArr = this._inputBuffer;
            if (bArr != null) {
                this._inputBuffer = ParserMinimalBase.NO_BYTES;
                this._ioContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidChar(int i) throws JsonParseException {
        if (i < 32) {
            _throwInvalidSpace(i);
            throw null;
        } else {
            _reportInvalidInitial(i);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidInitial(int i) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-8 start byte 0x");
        sb.append(Integer.toHexString(i));
        _reportError(sb.toString());
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-8 middle byte 0x");
        sb.append(Integer.toHexString(i));
        _reportError(sb.toString());
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            if (bArr[i] == 10) {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i >= i2) {
                    this._inputPtr = i;
                    break;
                }
                int i3 = i + 1;
                byte b = bArr[i] & 255;
                if (iArr[b] != 0) {
                    this._inputPtr = i3;
                    if (b != 34) {
                        int i4 = iArr[b];
                        if (i4 == 1) {
                            _decodeEscaped();
                        } else if (i4 == 2) {
                            _skipUtf8_2();
                        } else if (i4 == 3) {
                            _skipUtf8_3();
                        } else if (i4 == 4) {
                            _skipUtf8_4(b);
                        } else if (b < 32) {
                            _throwUnquotedSpace(b, "string value");
                        } else {
                            _reportInvalidChar(b);
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING || (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && this._binaryValue != null)) {
            if (this._tokenIncomplete) {
                try {
                    this._binaryValue = _decodeBase64(base64Variant);
                    this._tokenIncomplete = false;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode VALUE_STRING as base64 (");
                    sb.append(base64Variant);
                    sb.append("): ");
                    sb.append(e.getMessage());
                    throw _constructError(sb.toString());
                }
            } else if (this._binaryValue == null) {
                ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
                _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
                this._binaryValue = _getByteArrayBuilder.toByteArray();
            }
            return this._binaryValue;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Current token (");
        sb2.append(this._currToken);
        sb2.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        _reportError(sb2.toString());
        throw null;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
        return jsonLocation;
    }

    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r0 != 8) goto L_0x0027;
     */
    public int getTextOffset() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int id = jsonToken.id();
            if (id != 5) {
                if (id != 6) {
                    if (id != 7) {
                    }
                } else if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.getTextOffset();
            }
        }
        return 0;
    }

    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) (this._nameStartOffset - 1)), -1, this._nameStartRow, this._nameStartCol);
            return jsonLocation;
        }
        JsonLocation jsonLocation2 = new JsonLocation(_getSourceReference(), this._tokenInputTotal - 1, -1, this._tokenInputRow, this._tokenInputCol);
        return jsonLocation2;
    }

    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i = this._numTypesValid;
        if ((i & 1) == 0) {
            if (i == 0) {
                return _parseIntValue();
            }
            if ((i & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(null);
        }
    }

    public String nextFieldName() throws IOException {
        JsonToken jsonToken;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd == 44) {
                    _skipWSOrEnd = _skipWS();
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                        _closeScope(_skipWSOrEnd);
                        return null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("was expecting comma to separate ");
                    sb.append(this._parsingContext.typeDesc());
                    sb.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, sb.toString());
                    throw null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            _updateNameLocation();
            String _parseName = _parseName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = JsonToken.FIELD_NAME;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return _parseName;
        }
    }

    public String nextTextValue() throws IOException {
        String str = null;
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                return null;
            } else if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            } else {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
        } else {
            if (nextToken() == JsonToken.VALUE_STRING) {
                str = getText();
            }
            return str;
        }
    }

    public JsonToken nextToken() throws IOException {
        JsonToken jsonToken;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken2 = JsonToken.END_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken3 = JsonToken.END_OBJECT;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd == 44) {
                    _skipWSOrEnd = _skipWS();
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                        return _closeScope(_skipWSOrEnd);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("was expecting comma to separate ");
                    sb.append(this._parsingContext.typeDesc());
                    sb.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, sb.toString());
                    throw null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            _updateNameLocation();
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = JsonToken.FIELD_NAME;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return this._currToken;
        }
    }

    /* access modifiers changed from: protected */
    public final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    if (r10 > 0) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        int i5 = i + 1;
                        iArr[i] = _padLastQuad(r8, r10);
                        i = i5;
                    }
                    String findName = this._symbols.findName(iArr, i);
                    return findName == null ? addName(iArr, i, r10) : findName;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        int i6 = i + 1;
                        iArr[i] = r8;
                        i = i6;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i7 = (r8 << 8) | (i3 >> 12) | 224;
                        int i8 = r10 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            int i9 = i + 1;
                            iArr[i] = i7;
                            i = i9;
                            i7 = 0;
                            i8 = 0;
                        }
                        r8 = (i7 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i8 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                int i10 = i + 1;
                iArr[i] = r8;
                i2 = i3;
                i = i10;
                i4 = 1;
            }
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                i3 = bArr[i11] & 255;
            } else {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String parseLongName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        byte b = i;
        int i4 = 3;
        while (true) {
            int i5 = this._inputPtr;
            if (i5 + 4 <= this._inputEnd) {
                this._inputPtr = i5 + 1;
                byte b2 = bArr[i5] & 255;
                if (iArr2[b2] == 0) {
                    byte b3 = (b << 8) | b2;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    byte b4 = bArr[i6] & 255;
                    if (iArr2[b4] == 0) {
                        byte b5 = (b3 << 8) | b4;
                        int i7 = this._inputPtr;
                        this._inputPtr = i7 + 1;
                        byte b6 = bArr[i7] & 255;
                        if (iArr2[b6] == 0) {
                            int i8 = (b5 << 8) | b6;
                            int i9 = this._inputPtr;
                            this._inputPtr = i9 + 1;
                            b = bArr[i9] & 255;
                            if (iArr2[b] == 0) {
                                int[] iArr3 = this._quadBuffer;
                                if (i4 >= iArr3.length) {
                                    this._quadBuffer = ParserBase.growArrayBy(iArr3, i4);
                                }
                                int i10 = i4 + 1;
                                this._quadBuffer[i4] = i8;
                                i4 = i10;
                            } else if (b == 34) {
                                return findName(this._quadBuffer, i4, i8, 4);
                            } else {
                                return parseEscapedName(this._quadBuffer, i4, i8, b, 4);
                            }
                        } else if (b6 == 34) {
                            return findName(this._quadBuffer, i4, (int) b5, 3);
                        } else {
                            return parseEscapedName(this._quadBuffer, i4, b5, b6, 3);
                        }
                    } else if (b4 == 34) {
                        return findName(this._quadBuffer, i4, (int) b3, 2);
                    } else {
                        return parseEscapedName(this._quadBuffer, i4, b3, b4, 2);
                    }
                } else if (b2 == 34) {
                    return findName(this._quadBuffer, i4, b, 1);
                } else {
                    return parseEscapedName(this._quadBuffer, i4, b, b2, 1);
                }
            } else {
                return parseEscapedName(this._quadBuffer, i4, 0, b, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName(int i) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            byte b3 = bArr[i3] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                byte b5 = bArr[i4] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    int i5 = this._inputPtr;
                    this._inputPtr = i5 + 1;
                    byte b7 = bArr[i5] & 255;
                    if (iArr[b7] == 0) {
                        return parseMediumName2(b7, b6);
                    }
                    if (b7 == 34) {
                        return findName(this._quad1, b6, 4);
                    }
                    return parseName(this._quad1, b6, b7, 4);
                } else if (b5 == 34) {
                    return findName(this._quad1, b4, 3);
                } else {
                    return parseName(this._quad1, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return findName(this._quad1, b2, 2);
            } else {
                return parseName(this._quad1, b2, b3, 2);
            }
        } else if (b == 34) {
            return findName(this._quad1, i, 1);
        } else {
            return parseName(this._quad1, i, b, 1);
        }
    }

    /* access modifiers changed from: protected */
    public final String parseMediumName2(int i, int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b3 = bArr[i4] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                byte b5 = bArr[i5] & 255;
                if (iArr[b5] == 0) {
                    byte b6 = (b4 << 8) | b5;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    byte b7 = bArr[i6] & 255;
                    if (iArr[b7] == 0) {
                        return parseLongName(b7, i2, b6);
                    }
                    if (b7 == 34) {
                        return findName(this._quad1, i2, (int) b6, 4);
                    }
                    return parseName(this._quad1, i2, b6, b7, 4);
                } else if (b5 == 34) {
                    return findName(this._quad1, i2, (int) b4, 3);
                } else {
                    return parseName(this._quad1, i2, b4, b5, 3);
                }
            } else if (b3 == 34) {
                return findName(this._quad1, i2, (int) b2, 2);
            } else {
                return parseName(this._quad1, i2, b2, b3, 2);
            }
        } else if (b == 34) {
            return findName(this._quad1, i2, i, 1);
        } else {
            return parseName(this._quad1, i2, i, b, 1);
        }
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            int _readBinary = _readBinary(base64Variant, outputStream, allocBase64Buffer);
            return _readBinary;
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    /* access modifiers changed from: protected */
    public String slowParseName() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i] & 255;
            if (b == 34) {
                return "";
            }
            return parseEscapedName(this._quadBuffer, 0, 0, b, 0);
        }
        _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        throw null;
    }

    private final String parseName(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i, int i2) throws JsonParseException {
        this._inputPtr = i2;
        _reportInvalidOther(i);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    private final String findName(int i, int i2, int i3) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(i, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i3);
    }

    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    private final String findName(int i, int i2, int i3, int i4) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i, i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }
}
