package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ParserMinimalBase extends JsonParser {
    protected static final BigDecimal BD_MAX_INT = new BigDecimal(BI_MAX_INT);
    protected static final BigDecimal BD_MAX_LONG = new BigDecimal(BI_MAX_LONG);
    protected static final BigDecimal BD_MIN_INT = new BigDecimal(BI_MIN_INT);
    protected static final BigDecimal BD_MIN_LONG = new BigDecimal(BI_MIN_LONG);
    protected static final BigInteger BI_MAX_INT = BigInteger.valueOf(2147483647L);
    protected static final BigInteger BI_MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
    protected static final BigInteger BI_MIN_INT = BigInteger.valueOf(-2147483648L);
    protected static final BigInteger BI_MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    protected static final byte[] NO_BYTES = new byte[0];
    protected static final int[] NO_INTS = new int[0];
    protected JsonToken _currToken;
    protected JsonToken _lastClearedToken;

    protected ParserMinimalBase(int i) {
        super(i);
    }

    protected static final String _getCharDesc(int i) {
        char c = (char) i;
        String str = ")";
        if (Character.isISOControl(c)) {
            StringBuilder sb = new StringBuilder();
            sb.append("(CTRL-CHAR, code ");
            sb.append(i);
            sb.append(str);
            return sb.toString();
        }
        String str2 = "' (code ";
        String str3 = "'";
        if (i > 255) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(c);
            sb2.append(str2);
            sb2.append(i);
            sb2.append(" / 0x");
            sb2.append(Integer.toHexString(i));
            sb2.append(str);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(c);
        sb3.append(str2);
        sb3.append(i);
        sb3.append(str);
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    /* access modifiers changed from: protected */
    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e) {
            _reportError(e.getMessage());
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void _handleEOF() throws JsonParseException;

    /* access modifiers changed from: protected */
    public char _handleUnrecognizedCharacterEscape(char c) throws JsonProcessingException {
        if (isEnabled(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized character escape ");
        sb.append(_getCharDesc(c));
        _reportError(sb.toString());
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    /* access modifiers changed from: protected */
    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    /* access modifiers changed from: protected */
    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", new Object[]{Integer.valueOf(length)});
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str) throws JsonParseException {
        throw _constructError(str);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOF() throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append(" in ");
        sb.append(this._currToken);
        _reportInvalidEOF(sb.toString(), this._currToken);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOFInValue(JsonToken jsonToken) throws JsonParseException {
        String str = jsonToken != JsonToken.VALUE_STRING ? (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value";
        _reportInvalidEOF(str, jsonToken);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportMissingRootWS(int i) throws JsonParseException {
        _reportUnexpectedChar(i, "Expected space separating root-level values");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportUnexpectedChar(int i, String str) throws JsonParseException {
        if (i >= 0) {
            String format = String.format("Unexpected character (%s)", new Object[]{_getCharDesc(i)});
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(format);
                sb.append(": ");
                sb.append(str);
                format = sb.toString();
            }
            _reportError(format);
            throw null;
        }
        _reportInvalidEOF();
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _throwInternal() {
        VersionUtil.throwInternal();
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _throwInvalidSpace(int i) throws JsonParseException {
        char c = (char) i;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal character (");
        sb.append(_getCharDesc(c));
        sb.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        _reportError(sb.toString());
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _throwUnquotedSpace(int i, String str) throws JsonParseException {
        if (!isEnabled(Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            char c = (char) i;
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal unquoted character (");
            sb.append(_getCharDesc(c));
            sb.append("): has to be escaped using backslash to be included in ");
            sb.append(str);
            _reportError(sb.toString());
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    public JsonToken currentToken() {
        return this._currToken;
    }

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        return getValueAsInt(0);
    }

    public long getValueAsLong() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        return getValueAsLong(0);
    }

    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return getValueAsString(null);
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        boolean z = true;
        if (jsonToken == null) {
            if (i != 0) {
                z = false;
            }
            return z;
        }
        if (jsonToken.id() != i) {
            z = false;
        }
        return z;
    }

    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    public JsonToken nextValue() throws IOException {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    /* access modifiers changed from: protected */
    public void reportInvalidNumber(String str) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid numeric value: ");
        sb.append(str);
        _reportError(sb.toString());
        throw null;
    }

    /* access modifiers changed from: protected */
    public void reportOverflowInt() throws IOException {
        _reportError(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{_longIntegerDesc(getText()), Integer.valueOf(Integer.MIN_VALUE), Integer.valueOf(BaseClientBuilder.API_PRIORITY_OTHER)}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void reportOverflowLong() throws IOException {
        _reportError(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{_longIntegerDesc(getText()), Long.valueOf(Long.MIN_VALUE), Long.valueOf(Long.MAX_VALUE)}));
        throw null;
    }

    /* access modifiers changed from: protected */
    public void reportUnexpectedNumberChar(int i, String str) throws JsonParseException {
        String format = String.format("Unexpected character (%s) in numeric value", new Object[]{_getCharDesc(i)});
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(": ");
            sb.append(str);
            format = sb.toString();
        }
        _reportError(format);
        throw null;
    }

    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                _handleEOF();
                return this;
            } else if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (nextToken == JsonToken.NOT_AVAILABLE) {
                _reportError("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str, Object obj) throws JsonParseException {
        throw _constructError(String.format(str, new Object[]{obj}));
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidEOF(String str, JsonToken jsonToken) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected end-of-input");
        sb.append(str);
        throw new JsonEOFException(this, jsonToken, sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void _reportError(String str, Object obj, Object obj2) throws JsonParseException {
        throw _constructError(String.format(str, new Object[]{obj, obj2}));
    }

    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken != null) {
            int id = jsonToken.id();
            if (id != 6) {
                switch (id) {
                    case 9:
                        return 1;
                    case 10:
                    case 11:
                        return 0;
                    case 12:
                        Object embeddedObject = getEmbeddedObject();
                        if (embeddedObject instanceof Number) {
                            return ((Number) embeddedObject).intValue();
                        }
                        break;
                }
            } else {
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0;
                }
                i = NumberInput.parseAsInt(text, i);
            }
        }
        return i;
    }

    public long getValueAsLong(long j) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken != null) {
            int id = jsonToken.id();
            if (id != 6) {
                switch (id) {
                    case 9:
                        return 1;
                    case 10:
                    case 11:
                        return 0;
                    case 12:
                        Object embeddedObject = getEmbeddedObject();
                        if (embeddedObject instanceof Number) {
                            return ((Number) embeddedObject).longValue();
                        }
                        break;
                }
            } else {
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0;
                }
                j = NumberInput.parseAsLong(text, j);
            }
        }
        return j;
    }

    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        if (!(jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue())) {
            str = getText();
        }
        return str;
    }
}
