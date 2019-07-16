package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.TextBuffer;

public final class JsonStringEncoder {
    private static final byte[] HB = CharTypes.copyHexBytes();
    private static final char[] HC = CharTypes.copyHexChars();
    protected final char[] _qbuf = new char[6];
    protected TextBuffer _text;

    public JsonStringEncoder() {
        char[] cArr = this._qbuf;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    private int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int _appendNumeric(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HC;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r9 >= 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r1 = _appendNumeric(r1, r11._qbuf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = _appendNamed(r9, r11._qbuf);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r9 = r7 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r9 <= r6.length) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r9 = r6.length - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r9 <= 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        java.lang.System.arraycopy(r11._qbuf, 0, r6, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r6 = r0.finishCurrentSegment();
        r1 = r1 - r9;
        java.lang.System.arraycopy(r11._qbuf, r9, r6, 0, r1);
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        java.lang.System.arraycopy(r11._qbuf, 0, r6, r7, r1);
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        r8 = r1 + 1;
        r1 = r12.charAt(r1);
        r9 = r2[r1];
     */
    public char[] quoteAsString(String str) {
        int i;
        TextBuffer textBuffer = this._text;
        if (textBuffer == null) {
            textBuffer = new TextBuffer(null);
            this._text = textBuffer;
        }
        char[] emptyAndGetCurrentSegment = textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length = iArr.length;
        int length2 = str.length();
        char[] cArr = emptyAndGetCurrentSegment;
        int i2 = 0;
        int i3 = 0;
        loop0:
        while (true) {
            if (i2 >= length2) {
                break;
            }
            while (true) {
                char charAt = str.charAt(i2);
                if (charAt < length && iArr[charAt] != 0) {
                    break;
                }
                if (i3 >= cArr.length) {
                    cArr = textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                int i4 = i3 + 1;
                cArr[i3] = charAt;
                i2++;
                if (i2 >= length2) {
                    i3 = i4;
                    break loop0;
                }
                i3 = i4;
            }
            i2 = i;
        }
        textBuffer.setCurrentLength(i3);
        return textBuffer.contentsAsArray();
    }
}
