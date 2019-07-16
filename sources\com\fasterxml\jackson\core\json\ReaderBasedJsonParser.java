package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

public class ReaderBasedJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            _reportInvalidToken(str.substring(0, i));
            throw null;
        }
    }

    private void _closeScope(int i) throws JsonParseException {
        if (i == 93) {
            _updateLocation();
            if (this._parsingContext.inArray()) {
                this._parsingContext = this._parsingContext.clearAndGetParent();
                this._currToken = JsonToken.END_ARRAY;
            } else {
                _reportMismatchedEndMarker(i, '}');
                throw null;
            }
        }
        if (i == 125) {
            _updateLocation();
            if (this._parsingContext.inObject()) {
                this._parsingContext = this._parsingContext.clearAndGetParent();
                this._currToken = JsonToken.END_OBJECT;
                return;
            }
            _reportMismatchedEndMarker(i, ']');
            throw null;
        }
    }

    private String _handleOddName2(int i, int i2, int[] iArr) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (c >= length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this._inputPtr++;
            i2 = (i2 * 33) + c;
            int i3 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            if (i3 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i3;
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
    }

    private final void _matchFalse() throws IOException {
        int i = this._inputPtr;
        if (i + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i] == 'a') {
                int i2 = i + 1;
                if (cArr[i2] == 'l') {
                    int i3 = i2 + 1;
                    if (cArr[i3] == 's') {
                        int i4 = i3 + 1;
                        if (cArr[i4] == 'e') {
                            int i5 = i4 + 1;
                            char c = cArr[i5];
                            if (c < '0' || c == ']' || c == '}') {
                                this._inputPtr = i5;
                                return;
                            }
                        }
                    }
                }
            }
        }
        _matchToken("false", 1);
    }

    private final void _matchNull() throws IOException {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i] == 'u') {
                int i2 = i + 1;
                if (cArr[i2] == 'l') {
                    int i3 = i2 + 1;
                    if (cArr[i3] == 'l') {
                        int i4 = i3 + 1;
                        char c = cArr[i4];
                        if (c < '0' || c == ']' || c == '}') {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken("null", 1);
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
            char c = this._inputBuffer[this._inputPtr];
            if (!(c < '0' || c == ']' || c == '}')) {
                _checkMatchEnd(str, i, c);
            }
        }
    }

    private final void _matchTrue() throws IOException {
        int i = this._inputPtr;
        if (i + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i] == 'r') {
                int i2 = i + 1;
                if (cArr[i2] == 'u') {
                    int i3 = i2 + 1;
                    if (cArr[i3] == 'e') {
                        int i4 = i3 + 1;
                        char c = cArr[i4];
                        if (c < '0' || c == ']' || c == '}') {
                            this._inputPtr = i4;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken("true", 1);
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
        }
        if (i != 44) {
            if (i == 45) {
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            } else if (i == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            } else if (i != 93) {
                if (i == 102) {
                    _matchToken("false", 1);
                    JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                } else if (i == 110) {
                    _matchToken("null", 1);
                    JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                } else if (i == 116) {
                    _matchToken("true", 1);
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
                    }
                    JsonToken _handleOddValue = _handleOddValue(i);
                    this._currToken = _handleOddValue;
                    return _handleOddValue;
                } else {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    JsonToken jsonToken6 = JsonToken.START_OBJECT;
                    this._currToken = jsonToken6;
                    return jsonToken6;
                }
            }
        }
        if (isEnabled(Feature.ALLOW_MISSING_VALUES)) {
            this._inputPtr--;
            JsonToken jsonToken7 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
        JsonToken _handleOddValue2 = _handleOddValue(i);
        this._currToken = _handleOddValue2;
        return _handleOddValue2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [int] */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5, types: [char[]] */
    /* JADX WARNING: type inference failed for: r8v6, types: [char] */
    /* JADX WARNING: type inference failed for: r8v7, types: [int] */
    /* JADX WARNING: type inference failed for: r8v8, types: [char[]] */
    /* JADX WARNING: type inference failed for: r8v9, types: [char] */
    /* JADX WARNING: type inference failed for: r8v11, types: [char[]] */
    /* JADX WARNING: type inference failed for: r8v12, types: [char] */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r5v3, types: [char[]] */
    /* JADX WARNING: type inference failed for: r10v11, types: [char, int] */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r10v11, types: [char, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r8v12, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r8v6, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=null, for r8v9, types: [char] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r5v3, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r8v11, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r8v5, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char[], code=null, for r8v8, types: [char[]] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r8v0, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v14
  assigns: []
  uses: []
  mth insns count: 71
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
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARNING: Unknown variable types count: 11 */
    private final JsonToken _parseFloat(int r8, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        int i5 = this._inputEnd;
        int i6 = 0;
        if (r8 == 46) {
            int i7 = 0;
            while (i2 < i5) {
                int i8 = i2 + 1;
                ? r10 = this._inputBuffer[i2];
                if (r10 >= 48 && r10 <= 57) {
                    i7++;
                    i2 = i8;
                } else if (i7 != 0) {
                    i4 = i7;
                    r8 = r10;
                    i2 = i8;
                } else {
                    reportUnexpectedNumberChar(r10, "Decimal point not followed by a digit");
                    throw null;
                }
            }
            return _parseNumber2(z, i);
        }
        i4 = 0;
        r8 = r8;
        if (r8 == 101 || r8 == 69) {
            if (r10 >= i5) {
                this._inputPtr = i;
                return _parseNumber2(z, i);
            }
            int i9 = r10 + 1;
            r8 = this._inputBuffer[r10];
            if (r8 == 45 || r8 == 43) {
                if (i9 >= i5) {
                    this._inputPtr = i;
                    return _parseNumber2(z, i);
                }
                r10 = i9 + 1;
                r8 = this._inputBuffer[i9];
                if (r8 > 57 && r8 >= 48) {
                    i6++;
                    if (r10 >= i5) {
                        this._inputPtr = i;
                    } else {
                        i9 = r10 + 1;
                        r8 = this._inputBuffer[r10];
                    }
                    this._inputPtr = i;
                    return _parseNumber2(z, i);
                } else if (i6 == 0) {
                    reportUnexpectedNumberChar(r8, "Exponent indicator not followed by a digit");
                    throw null;
                }
            }
            r10 = i9;
            r8 = r8;
            if (r8 > 57) {
            }
            if (i6 == 0) {
            }
        }
        int i10 = r10 - 1;
        this._inputPtr = i10;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(r8);
        }
        this._textBuffer.resetWithShared(this._inputBuffer, i, i10 - i);
        return resetFloat(z, i3, i4, i6);
    }

    private String _parseName2(int i, int i2, int i3) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                char c = cArr[i4];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = _decodeEscaped();
                    } else if (c <= i3) {
                        if (c == i3) {
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            TextBuffer textBuffer = this._textBuffer;
                            return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
                        } else if (c < ' ') {
                            _throwUnquotedSpace(c, "name");
                        }
                    }
                }
                i2 = (i2 * 33) + c;
                int i5 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c;
                if (i5 >= currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                } else {
                    currentSegmentSize = i5;
                }
            } else {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z, int i) throws IOException {
        int i2;
        char c;
        boolean z2;
        int i3;
        char c2;
        char c3;
        char c4;
        int i4;
        int i5;
        boolean z3 = z;
        this._inputPtr = z3 ? i + 1 : i;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i6 = 0;
        if (z3) {
            emptyAndGetCurrentSegment[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = this._inputPtr;
        if (i7 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i7 + 1;
            c = cArr[i7];
        } else {
            c = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (c == '0') {
            c = _verifyNoLeadingZeroes();
        }
        char[] cArr2 = emptyAndGetCurrentSegment;
        int i8 = 0;
        while (true) {
            if (c >= '0' && c <= '9') {
                i8++;
                if (i2 >= cArr2.length) {
                    cArr2 = this._textBuffer.finishCurrentSegment();
                    i2 = 0;
                }
                int i9 = i2 + 1;
                cArr2[i2] = c;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i2 = i9;
                    c = 0;
                    z2 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                c = cArr3[i10];
                i2 = i9;
            } else {
                z2 = false;
            }
        }
        z2 = false;
        if (i8 == 0) {
            return _handleInvalidNumberStart(c, z3);
        }
        if (c == '.') {
            if (i2 >= cArr2.length) {
                cArr2 = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i11 = i2 + 1;
            cArr2[i2] = c;
            int i12 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                char[] cArr4 = this._inputBuffer;
                int i13 = this._inputPtr;
                this._inputPtr = i13 + 1;
                c = cArr4[i13];
                if (c < '0' || c > '9') {
                    break;
                }
                i12++;
                if (i11 >= cArr2.length) {
                    cArr2 = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                int i14 = i11 + 1;
                cArr2[i11] = c;
                i11 = i14;
            }
            if (i12 != 0) {
                int i15 = i11;
                i3 = i12;
                i2 = i15;
            } else {
                reportUnexpectedNumberChar(c, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i3 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i2 >= cArr2.length) {
                cArr2 = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i16 = i2 + 1;
            cArr2[i2] = c;
            int i17 = this._inputPtr;
            String str = "expected a digit for number exponent";
            if (i17 < this._inputEnd) {
                char[] cArr5 = this._inputBuffer;
                this._inputPtr = i17 + 1;
                c2 = cArr5[i17];
            } else {
                c2 = getNextChar(str);
            }
            if (c2 == '-' || c2 == '+') {
                if (i16 >= cArr2.length) {
                    cArr2 = this._textBuffer.finishCurrentSegment();
                    i16 = 0;
                }
                int i18 = i16 + 1;
                cArr2[i16] = c2;
                int i19 = this._inputPtr;
                if (i19 < this._inputEnd) {
                    char[] cArr6 = this._inputBuffer;
                    this._inputPtr = i19 + 1;
                    c3 = cArr6[i19];
                } else {
                    c3 = getNextChar(str);
                }
                c4 = c3;
                i4 = i18;
            } else {
                c4 = c2;
                i4 = i16;
            }
            int i20 = 0;
            while (true) {
                if (c <= '9' && c >= '0') {
                    i20++;
                    if (i4 >= cArr2.length) {
                        cArr2 = this._textBuffer.finishCurrentSegment();
                        i4 = 0;
                    }
                    i5 = i4 + 1;
                    cArr2[i4] = c;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i6 = i20;
                        z2 = true;
                        break;
                    }
                    char[] cArr7 = this._inputBuffer;
                    int i21 = this._inputPtr;
                    this._inputPtr = i21 + 1;
                    c4 = cArr7[i21];
                    i4 = i5;
                } else {
                    i5 = i4;
                    i6 = i20;
                }
            }
            i5 = i4;
            i6 = i20;
            if (i6 == 0) {
                reportUnexpectedNumberChar(c, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(c);
            }
        }
        this._textBuffer.setCurrentLength(i2);
        return reset(z3, i8, i3, i6);
    }

    private final int _skipAfterComma2() throws IOException {
        char c;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        return c;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
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
        return c;
    }

    private void _skipCComment() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i2 = this._inputPtr;
                    if (cArr2[i2] == '/') {
                        this._inputPtr = i2 + 1;
                        return;
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
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
        char[] cArr = this._inputBuffer;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this._inputPtr = i2;
            char c2 = cArr[i2];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == 9) {
                    char[] cArr2 = this._inputBuffer;
                    int i3 = this._inputPtr + 1;
                    this._inputPtr = i3;
                    char c3 = cArr2[i3];
                    if (c3 > ' ') {
                        if (c3 == '/' || c3 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return c3;
                    }
                }
                return _skipColon2(true);
            } else if (c2 == '/' || c2 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return c2;
            }
        } else {
            if (c == ' ' || c == 9) {
                char[] cArr3 = this._inputBuffer;
                int i4 = this._inputPtr + 1;
                this._inputPtr = i4;
                c = cArr3[i4];
            }
            if (c != ':') {
                return _skipColon2(false);
            }
            char[] cArr4 = this._inputBuffer;
            int i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            char c4 = cArr4[i5];
            if (c4 <= ' ') {
                if (c4 == ' ' || c4 == 9) {
                    char[] cArr5 = this._inputBuffer;
                    int i6 = this._inputPtr + 1;
                    this._inputPtr = i6;
                    char c5 = cArr5[i6];
                    if (c5 > ' ') {
                        if (c5 == '/' || c5 == '#') {
                            return _skipColon2(true);
                        }
                        this._inputPtr++;
                        return c5;
                    }
                }
                return _skipColon2(true);
            } else if (c4 == '/' || c4 == '#') {
                return _skipColon2(true);
            } else {
                this._inputPtr++;
                return c4;
            }
        }
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        if (z) {
                            return c;
                        }
                        if (c == ':') {
                            z = true;
                        } else {
                            _reportUnexpectedChar(c, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (c >= ' ') {
                    continue;
                } else if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
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

    private final int _skipComma(int i) throws IOException {
        if (i == 44) {
            while (true) {
                int i2 = this._inputPtr;
                if (i2 >= this._inputEnd) {
                    return _skipAfterComma2();
                }
                char[] cArr = this._inputBuffer;
                this._inputPtr = i2 + 1;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c != '/' && c != '#') {
                        return c;
                    }
                    this._inputPtr--;
                    return _skipAfterComma2();
                } else if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c == 13) {
                        _skipCR();
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                        throw null;
                    }
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("was expecting comma to separate ");
            sb.append(this._parsingContext.typeDesc());
            sb.append(" entries");
            _reportUnexpectedChar(i, sb.toString());
            throw null;
        }
    }

    private void _skipComment() throws IOException {
        if (!isEnabled(Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c == '/') {
                _skipLine();
            } else if (c == '*') {
                _skipCComment();
            } else {
                _reportUnexpectedChar(c, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            _reportInvalidEOF(" in a comment", null);
            throw null;
        }
    }

    private void _skipLine() throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                        return;
                    } else if (c == 13) {
                        _skipCR();
                        return;
                    } else if (c != 9) {
                        _throwInvalidSpace(c);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c <= ' ') {
            if (c != ' ') {
                if (c == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (c == 13) {
                    _skipCR();
                } else if (c != 9) {
                    _throwInvalidSpace(c);
                    throw null;
                }
            }
            while (true) {
                int i2 = this._inputPtr;
                if (i2 >= this._inputEnd) {
                    return _skipWSOrEnd2();
                }
                char[] cArr2 = this._inputBuffer;
                this._inputPtr = i2 + 1;
                char c2 = cArr2[i2];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this._inputPtr--;
                    return _skipWSOrEnd2();
                } else if (c2 != ' ') {
                    if (c2 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = this._inputPtr;
                    } else if (c2 == 13) {
                        _skipCR();
                    } else if (c2 != 9) {
                        _throwInvalidSpace(c2);
                        throw null;
                    }
                }
            }
        } else if (c != '/' && c != '#') {
            return c;
        } else {
            this._inputPtr--;
            return _skipWSOrEnd2();
        }
    }

    private int _skipWSOrEnd2() throws IOException {
        char c;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    _skipComment();
                } else if (c != '#' || !_skipYAMLComment()) {
                    return c;
                }
            } else if (c == ' ') {
                continue;
            } else if (c == 10) {
                this._currInputRow++;
                this._currInputRowStart = this._inputPtr;
            } else if (c == 13) {
                _skipCR();
            } else if (c != 9) {
                _throwInvalidSpace(c);
                throw null;
            }
        }
        return c;
    }

    private boolean _skipYAMLComment() throws IOException {
        if (!isEnabled(Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i = this._inputPtr;
        this._nameStartOffset = (long) i;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i - this._currInputRowStart;
    }

    private char _verifyNLZ2() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return '0';
        }
        char c = this._inputBuffer[this._inputPtr];
        if (c < '0' || c > '9') {
            return '0';
        }
        if (isEnabled(Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            this._inputPtr++;
            if (c == '0') {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr = this._inputBuffer;
                    int i = this._inputPtr;
                    c = cArr[i];
                    if (c < '0' || c > '9') {
                        return '0';
                    }
                    this._inputPtr = i + 1;
                } while (c == '0');
            }
            return c;
        }
        reportInvalidNumber("Leading zeroes not allowed");
        throw null;
    }

    private final char _verifyNoLeadingZeroes() throws IOException {
        int i = this._inputPtr;
        if (i < this._inputEnd) {
            char c = this._inputBuffer[i];
            if (c < '0' || c > '9') {
                return '0';
            }
        }
        return _verifyNLZ2();
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

    /* access modifiers changed from: protected */
    public void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c2 = cArr2[i2];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c2, 1);
                }
                int i3 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                char c3 = cArr3[i4];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            _getByteArrayBuilder.append(i3 >> 4);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c3, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        char c4 = cArr4[i5];
                        if (base64Variant.usesPaddingChar(c4) || _decodeBase64Escape(base64Variant, c4, 3) == -2) {
                            _getByteArrayBuilder.append(i3 >> 4);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(base64Variant.getPaddingChar());
                            sb.append("'");
                            throw reportInvalidBase64Char(base64Variant, c4, 3, sb.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                char c5 = cArr5[i7];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            _getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c5, 3);
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
    public char _decodeEscaped() throws IOException {
        String str = " in character escape sequence";
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (!(c == '\"' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    c = 8;
                } else if (c == 'f') {
                    return 12;
                } else {
                    if (c == 'n') {
                        return 10;
                    }
                    if (c == 'r') {
                        return 13;
                    }
                    if (c == 't') {
                        return 9;
                    }
                    if (c != 'u') {
                        _handleUnrecognizedCharacterEscape(c);
                        return c;
                    }
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < 4) {
                        if (this._inputPtr < this._inputEnd || _loadMore()) {
                            char[] cArr2 = this._inputBuffer;
                            int i4 = this._inputPtr;
                            this._inputPtr = i4 + 1;
                            char c2 = cArr2[i4];
                            int charToHex = CharTypes.charToHex(c2);
                            if (charToHex >= 0) {
                                i3 = (i3 << 4) | charToHex;
                                i2++;
                            } else {
                                _reportUnexpectedChar(c2, "expected a hex-digit for character escape sequence");
                                throw null;
                            }
                        } else {
                            _reportInvalidEOF(str, JsonToken.VALUE_STRING);
                            throw null;
                        }
                    }
                    return (char) i3;
                }
            }
            return c;
        }
        _reportInvalidEOF(str, JsonToken.VALUE_STRING);
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _finishString() throws IOException {
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        if (i < i2) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i3 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i3, i - i3);
                    this._inputPtr = i + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i4, i - i4);
        this._inputPtr = i;
        _finishString2();
    }

    /* access modifiers changed from: protected */
    public void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c < length && iArr[c] != 0) {
                    if (c == '\"') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return;
                    } else if (c == '\\') {
                        c = _decodeEscaped();
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "string value");
                    }
                }
                if (currentSegmentSize >= currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                }
                int i2 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c;
                currentSegmentSize = i2;
            } else {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                throw null;
            }
        }
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
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = _decodeEscaped();
                    } else if (c <= '\'') {
                        if (c == '\'') {
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return JsonToken.VALUE_STRING;
                        } else if (c < ' ') {
                            _throwUnquotedSpace(c, "string value");
                        }
                    }
                }
                if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                }
                int i2 = currentSegmentSize + 1;
                emptyAndGetCurrentSegment[currentSegmentSize] = c;
                currentSegmentSize = i2;
            } else {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=char, for r10v0, types: [int] */
    public JsonToken _handleInvalidNumberStart(char c, boolean z) throws IOException {
        if (c == 73) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                c = cArr[i];
                double d = Double.NEGATIVE_INFINITY;
                String str = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow";
                String str2 = "Non-standard token '";
                if (c == 78) {
                    String str3 = z ? "-INF" : "+INF";
                    _matchToken(str3, 3);
                    if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                        if (!z) {
                            d = Double.POSITIVE_INFINITY;
                        }
                        return resetAsNaN(str3, d);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str3);
                    sb.append(str);
                    _reportError(sb.toString());
                    throw null;
                } else if (c == 110) {
                    String str4 = z ? "-Infinity" : "+Infinity";
                    _matchToken(str4, 3);
                    if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                        if (!z) {
                            d = Double.POSITIVE_INFINITY;
                        }
                        return resetAsNaN(str4, d);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str4);
                    sb2.append(str);
                    _reportError(sb2.toString());
                    throw null;
                }
            } else {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                throw null;
            }
        }
        reportUnexpectedNumberChar(c, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _handleOddName(int i) throws IOException {
        if (i == 39 && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseAposName();
        }
        if (isEnabled(Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
            int length = inputCodeLatin1JsNames.length;
            boolean z = i < length ? inputCodeLatin1JsNames[i] == 0 : Character.isJavaIdentifierPart((char) i);
            if (z) {
                int i2 = this._inputPtr;
                int i3 = this._hashSeed;
                int i4 = this._inputEnd;
                if (i2 < i4) {
                    do {
                        char[] cArr = this._inputBuffer;
                        char c = cArr[i2];
                        if (c < length) {
                            if (inputCodeLatin1JsNames[c] != 0) {
                                int i5 = this._inputPtr - 1;
                                this._inputPtr = i2;
                                return this._symbols.findSymbol(cArr, i5, i2 - i5, i3);
                            }
                        } else if (!Character.isJavaIdentifierPart((char) c)) {
                            int i6 = this._inputPtr - 1;
                            this._inputPtr = i2;
                            return this._symbols.findSymbol(this._inputBuffer, i6, i2 - i6, i3);
                        }
                        i3 = (i3 * 33) + c;
                        i2++;
                    } while (i2 < i4);
                }
                int i7 = this._inputPtr - 1;
                this._inputPtr = i2;
                return _handleOddName2(i7, i3, inputCodeLatin1JsNames);
            }
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
            throw null;
        }
        _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4 != 44) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r3._parsingContext.inArray() == false) goto L_0x0099;
     */
    public JsonToken _handleOddValue(int i) throws IOException {
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
                    if (i == 43) {
                        if (this._inputPtr < this._inputEnd || _loadMore()) {
                            char[] cArr = this._inputBuffer;
                            int i2 = this._inputPtr;
                            this._inputPtr = i2 + 1;
                            return _handleInvalidNumberStart(cArr[i2], false);
                        }
                        _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                        throw null;
                    }
                }
                if (isEnabled(Feature.ALLOW_MISSING_VALUES)) {
                    this._inputPtr--;
                    return JsonToken.VALUE_NULL;
                }
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
    public boolean _loadMore() throws IOException {
        int i = this._inputEnd;
        long j = (long) i;
        this._currInputProcessed += j;
        this._currInputRowStart -= i;
        this._nameStartOffset -= j;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Reader returned 0 characters when trying to read ");
                sb.append(this._inputEnd);
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
                char c = this._inputBuffer[this._inputPtr];
                if (!(c < '0' || c == ']' || c == '}')) {
                    _checkMatchEnd(str, i, c);
                }
                return;
            }
        }
        _reportInvalidToken(str.substring(0, i));
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _parseAposName() throws IOException {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int i3 = this._inputEnd;
        if (i < i3) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c = cArr[i];
                if (c != '\'') {
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this._inputPtr;
                    this._inputPtr = i + 1;
                    return this._symbols.findSymbol(cArr, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this._inputPtr;
        this._inputPtr = i;
        return _parseName2(i5, i2, 39);
    }

    /* access modifiers changed from: protected */
    public final String _parseName() throws IOException {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this._inputPtr;
                this._inputPtr = i + 1;
                return this._symbols.findSymbol(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this._inputPtr;
        this._inputPtr = i;
        return _parseName2(i4, i2, 34);
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parseNegNumber() throws IOException {
        int i = this._inputPtr;
        int i2 = i - 1;
        int i3 = this._inputEnd;
        if (i >= i3) {
            return _parseNumber2(true, i2);
        }
        int i4 = i + 1;
        char c = this._inputBuffer[i];
        if (c > '9' || c < '0') {
            this._inputPtr = i4;
            return _handleInvalidNumberStart(c, true);
        } else if (c == '0') {
            return _parseNumber2(true, i2);
        } else {
            int i5 = 1;
            while (i4 < i3) {
                int i6 = i4 + 1;
                char c2 = this._inputBuffer[i4];
                if (c2 >= '0' && c2 <= '9') {
                    i5++;
                    i4 = i6;
                } else if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this._inputPtr = i6;
                    return _parseFloat(c2, i2, i6, true, i5);
                } else {
                    int i7 = i6 - 1;
                    this._inputPtr = i7;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c2);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i2, i7 - i2);
                    return resetInt(true, i5);
                }
            }
            return _parseNumber2(true, i2);
        }
    }

    /* access modifiers changed from: protected */
    public final JsonToken _parsePosNumber(int i) throws IOException {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i == 48) {
            return _parseNumber2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this._inputBuffer[i2];
            if (c >= '0' && c <= '9') {
                i5++;
                i2 = i6;
            } else if (c == '.' || c == 'e' || c == 'E') {
                this._inputPtr = i6;
                return _parseFloat(c, i3, i6, false, i5);
            } else {
                int i7 = i6 - 1;
                this._inputPtr = i7;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i3, i7 - i3);
                return resetInt(false, i5);
            }
        }
        this._inputPtr = i3;
        return _parseNumber2(false, i3);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r10 < 0) goto L_0x0167;
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
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c = cArr[i5];
            if (c > ' ') {
                int decodeBase64Char = base64Variant2.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant2, c, i2);
                }
                if (i4 > length) {
                    i3 += i4;
                    outputStream2.write(bArr2, i2, i4);
                    i4 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                char c2 = cArr2[i6];
                int decodeBase64Char2 = base64Variant2.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant2, c2, 1);
                }
                int i7 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c3 = cArr3[i8];
                int decodeBase64Char3 = base64Variant2.decodeBase64Char(c3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c3 == '\"') {
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
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant2, c3, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i10 = this._inputPtr;
                        this._inputPtr = i10 + 1;
                        char c4 = cArr4[i10];
                        if (base64Variant2.usesPaddingChar(c4) || _decodeBase64Escape(base64Variant2, c4, i) == -2) {
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
                            throw reportInvalidBase64Char(base64Variant2, c4, i, sb.toString());
                        }
                    }
                }
                int i13 = (i7 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                char c5 = cArr5[i14];
                int decodeBase64Char4 = base64Variant2.decodeBase64Char(c5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c5 == '\"') {
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
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant2, c5, 3);
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
            char[] cArr = this._inputBuffer;
            if (cArr != null) {
                this._inputBuffer = null;
                this._ioContext.releaseTokenBuffer(cArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            if (cArr[i] == 10) {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i >= i2) {
                this._inputPtr = i;
                if (_loadMore()) {
                    i = this._inputPtr;
                    i2 = this._inputEnd;
                } else {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this._inputPtr = i3;
                    _decodeEscaped();
                    i = this._inputPtr;
                    i2 = this._inputEnd;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this._inputPtr = i3;
                        return;
                    } else if (c < ' ') {
                        this._inputPtr = i3;
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            byte[] bArr = this._binaryValue;
            if (bArr != null) {
                return bArr;
            }
        }
        if (this._currToken == JsonToken.VALUE_STRING) {
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
        int i = (this._inputPtr - this._currInputRowStart) + 1;
        JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), -1, ((long) this._inputPtr) + this._currInputProcessed, this._currInputRow, i);
        return jsonLocation;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public char getNextChar(String str) throws IOException {
        return getNextChar(str, null);
    }

    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final char[] getTextCharacters() throws IOException {
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

    public final int getTextLength() throws IOException {
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
    public final int getTextOffset() throws IOException {
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
            JsonLocation jsonLocation = new JsonLocation(_getSourceReference(), -1, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
            return jsonLocation;
        }
        JsonLocation jsonLocation2 = new JsonLocation(_getSourceReference(), -1, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
        return jsonLocation2;
    }

    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
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
                    jsonToken = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            jsonToken = JsonToken.START_OBJECT;
        }
        this._nextToken = jsonToken;
        return _parseName;
    }

    public final String nextTextValue() throws IOException {
        String str = null;
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        if (nextToken() == JsonToken.VALUE_STRING) {
            str = getText();
        }
        return str;
    }

    public final JsonToken nextToken() throws IOException {
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
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean inObject = this._parsingContext.inObject();
        if (inObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
            this._currToken = JsonToken.FIELD_NAME;
            _skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (_skipWSOrEnd == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipWSOrEnd == 91) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipWSOrEnd == 110) {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        } else if (_skipWSOrEnd == 116) {
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else if (_skipWSOrEnd == 123) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_OBJECT;
        } else if (_skipWSOrEnd != 125) {
            switch (_skipWSOrEnd) {
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
                    jsonToken = _parsePosNumber(_skipWSOrEnd);
                    break;
                default:
                    jsonToken = _handleOddValue(_skipWSOrEnd);
                    break;
            }
        } else {
            _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
            throw null;
        }
        if (inObject) {
            this._nextToken = jsonToken;
            return this._currToken;
        }
        this._currToken = jsonToken;
        return jsonToken;
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
    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this._inputPtr++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    /* access modifiers changed from: protected */
    public char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            return cArr[i];
        }
        _reportInvalidEOF(str, jsonToken);
        throw null;
    }

    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }
}
