package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: Lv reason: default package and case insensitive filesystem */
public final class C0228Lv implements Closeable {
    private static final char[] a = ")]}'\n".toCharArray();
    private final Reader b;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    static {
        C0232Mv.a = new C0240Ov();
    }

    public C0228Lv(Reader reader) {
        int[] iArr = this.m;
        int i2 = this.n;
        this.n = i2 + 1;
        iArr[i2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.b = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01f4, code lost:
        if (r11 == 6) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0210, code lost:
        if (a(r15) == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0213, code lost:
        if (r11 != 2) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0215, code lost:
        if (r12 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x021b, code lost:
        if (r9 != Long.MIN_VALUE) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x021d, code lost:
        if (r16 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0223, code lost:
        if (r9 != 0) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0225, code lost:
        if (r16 != false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0227, code lost:
        if (r16 == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022a, code lost:
        r9 = -r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x022b, code lost:
        r0.j = r9;
        r0.e += r3;
        r0.i = 15;
        r17 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0239, code lost:
        if (r11 == 2) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x023c, code lost:
        if (r11 == 4) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x023f, code lost:
        if (r11 != 7) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0245, code lost:
        r0.k = r3;
        r0.i = 16;
        r17 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0179 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017a  */
    private final int G() throws IOException {
        int i2;
        int i3;
        String str;
        String str2;
        int[] iArr = this.m;
        int i4 = this.n;
        int i5 = iArr[i4 - 1];
        boolean z = true;
        if (i5 == 1) {
            iArr[i4 - 1] = 2;
        } else if (i5 == 2) {
            int b2 = b(true);
            if (b2 != 44) {
                if (b2 == 59) {
                    I();
                } else if (b2 == 93) {
                    this.i = 4;
                    return 4;
                } else {
                    a("Unterminated array");
                    throw null;
                }
            }
        } else if (i5 == 3 || i5 == 5) {
            this.m[this.n - 1] = 4;
            if (i5 == 5) {
                int b3 = b(true);
                if (b3 != 44) {
                    if (b3 == 59) {
                        I();
                    } else if (b3 == 125) {
                        this.i = 2;
                        return 2;
                    } else {
                        a("Unterminated object");
                        throw null;
                    }
                }
            }
            int b4 = b(true);
            if (b4 == 34) {
                this.i = 13;
                return 13;
            } else if (b4 == 39) {
                I();
                this.i = 12;
                return 12;
            } else if (b4 != 125) {
                I();
                this.e--;
                if (a((char) b4)) {
                    this.i = 14;
                    return 14;
                }
                a("Expected name");
                throw null;
            } else if (i5 != 5) {
                this.i = 2;
                return 2;
            } else {
                a("Expected name");
                throw null;
            }
        } else if (i5 == 4) {
            iArr[i4 - 1] = 5;
            int b5 = b(true);
            if (b5 != 58) {
                if (b5 == 61) {
                    I();
                    if (this.e < this.f || b(1)) {
                        char[] cArr = this.d;
                        int i6 = this.e;
                        if (cArr[i6] == '>') {
                            this.e = i6 + 1;
                        }
                    }
                } else {
                    a("Expected ':'");
                    throw null;
                }
            }
        } else if (i5 == 6) {
            if (this.c) {
                b(true);
                this.e--;
                int i7 = this.e;
                char[] cArr2 = a;
                if (i7 + cArr2.length <= this.f || b(cArr2.length)) {
                    int i8 = 0;
                    while (true) {
                        char[] cArr3 = a;
                        if (i8 < cArr3.length) {
                            if (this.d[this.e + i8] != cArr3[i8]) {
                                break;
                            }
                            i8++;
                        } else {
                            this.e += cArr3.length;
                            break;
                        }
                    }
                }
            }
            this.m[this.n - 1] = 7;
        } else if (i5 == 7) {
            if (b(false) == -1) {
                this.i = 17;
                return 17;
            }
            I();
            this.e--;
        } else if (i5 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b6 = b(true);
        if (b6 == 34) {
            this.i = 9;
            return 9;
        } else if (b6 != 39) {
            if (b6 == 44 || b6 == 59) {
                i2 = 1;
            } else if (b6 == 91) {
                this.i = 3;
                return 3;
            } else if (b6 == 93) {
                i2 = 1;
                if (i5 == 1) {
                    this.i = 4;
                    return 4;
                }
            } else if (b6 != 123) {
                this.e--;
                char c2 = this.d[this.e];
                if (c2 == 't' || c2 == 'T') {
                    str2 = "true";
                    str = "TRUE";
                    i3 = 5;
                } else if (c2 == 'f' || c2 == 'F') {
                    str2 = "false";
                    str = "FALSE";
                    i3 = 6;
                } else {
                    if (c2 == 'n' || c2 == 'N') {
                        str2 = "null";
                        str = "NULL";
                        i3 = 7;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                        return i3;
                    }
                    char[] cArr4 = this.d;
                    int i9 = this.e;
                    long j2 = 0;
                    int i10 = this.f;
                    long j3 = 0;
                    int i11 = 0;
                    char c3 = 0;
                    boolean z2 = true;
                    boolean z3 = false;
                    while (true) {
                        if (i9 + i11 == i10) {
                            if (i11 != cArr4.length) {
                                if (!b(i11 + 1)) {
                                    break;
                                }
                                i9 = this.e;
                                i10 = this.f;
                            } else {
                                break;
                            }
                        }
                        char c4 = cArr4[i9 + i11];
                        if (c4 == '+') {
                            if (c3 != 5) {
                                break;
                            }
                        } else if (c4 != 'E' && c4 != 'e') {
                            if (c4 == '-') {
                                if (c3 != 0) {
                                    if (c3 != 5) {
                                        break;
                                    }
                                } else {
                                    c3 = 1;
                                    z3 = true;
                                    i11++;
                                    z = true;
                                }
                            } else if (c4 == '.') {
                                if (c3 != 2) {
                                    break;
                                }
                                c3 = 3;
                                i11++;
                                z = true;
                            } else if (c4 >= '0' && c4 <= '9') {
                                if (c3 == z || c3 == 0) {
                                    j3 = (long) (-(c4 - '0'));
                                    j2 = 0;
                                    c3 = 2;
                                    i11++;
                                    z = true;
                                } else {
                                    if (c3 == 2) {
                                        if (j3 == j2) {
                                            break;
                                        }
                                        long j4 = (10 * j3) - ((long) (c4 - '0'));
                                        int i12 = (j3 > -922337203685477580L ? 1 : (j3 == -922337203685477580L ? 0 : -1));
                                        z2 = (i12 > 0 || (i12 == 0 && j4 < j3)) & z2;
                                        j3 = j4;
                                    } else {
                                        if (c3 == 3) {
                                            j2 = 0;
                                            c3 = 4;
                                        } else {
                                            if (c3 != 5) {
                                            }
                                            j2 = 0;
                                            c3 = 7;
                                        }
                                        i11++;
                                        z = true;
                                    }
                                    j2 = 0;
                                    i11++;
                                    z = true;
                                }
                            }
                        } else if (c3 != 2 && c3 != 4) {
                            break;
                        } else {
                            c3 = 5;
                            i11++;
                            z = true;
                        }
                        c3 = 6;
                        i11++;
                        z = true;
                    }
                    int i13 = 0;
                    if (i13 != 0) {
                        return i13;
                    }
                    if (a(this.d[this.e])) {
                        I();
                        this.i = 10;
                        return 10;
                    }
                    a("Expected value");
                    throw null;
                }
                int length = str2.length();
                int i14 = 1;
                while (true) {
                    if (i14 < length) {
                        if (this.e + i14 >= this.f && !b(i14 + 1)) {
                            break;
                        }
                        char c5 = this.d[this.e + i14];
                        if (c5 != str2.charAt(i14) && c5 != str.charAt(i14)) {
                            break;
                        }
                        i14++;
                    } else if ((this.e + length >= this.f && !b(length + 1)) || !a(this.d[this.e + length])) {
                        this.e += length;
                        this.i = i3;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                }
            } else {
                this.i = 1;
                return 1;
            }
            if (i5 == i2 || i5 == 2) {
                I();
                this.e -= i2;
                this.i = 7;
                return 7;
            }
            a("Unexpected value");
            throw null;
        } else {
            I();
            this.i = 8;
            return 8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        I();
     */
    private final String H() throws IOException {
        int i2;
        String str;
        int i3 = 0;
        StringBuilder sb = null;
        while (true) {
            i2 = 0;
            while (true) {
                int i4 = this.e;
                if (i4 + i2 < this.f) {
                    char c2 = this.d[i4 + i2];
                    if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (!(c2 == '/' || c2 == '=')) {
                                    if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= this.d.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.d, this.e, i2);
                    this.e += i2;
                    if (!b(1)) {
                    }
                } else if (b(i2 + 1)) {
                }
            }
        }
        i3 = i2;
        if (sb == null) {
            str = new String(this.d, this.e, i3);
        } else {
            sb.append(this.d, this.e, i3);
            str = sb.toString();
        }
        this.e += i3;
        return str;
    }

    private final void I() throws IOException {
        if (!this.c) {
            a("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private final void J() throws IOException {
        char c2;
        do {
            if (this.e >= this.f && !b(1)) {
                break;
            }
            char[] cArr = this.d;
            int i2 = this.e;
            this.e = i2 + 1;
            c2 = cArr[i2];
            if (c2 == 10) {
                this.g++;
                this.h = this.e;
                return;
            }
        } while (c2 != 13);
    }

    private final String K() {
        int i2 = this.g + 1;
        int i3 = (this.e - this.h) + 1;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i2);
        sb.append(" column ");
        sb.append(i3);
        sb.append(" path ");
        StringBuilder sb2 = new StringBuilder("$");
        int i4 = this.n;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.m[i5];
            if (i6 == 1 || i6 == 2) {
                sb2.append('[');
                sb2.append(this.p[i5]);
                sb2.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb2.append('.');
                String[] strArr = this.o;
                if (strArr[i5] != null) {
                    sb2.append(strArr[i5]);
                }
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    private final char L() throws IOException {
        int i2;
        int i3;
        String str = "Unterminated escape sequence";
        if (this.e != this.f || b(1)) {
            char[] cArr = this.d;
            int i4 = this.e;
            this.e = i4 + 1;
            char c2 = cArr[i4];
            if (c2 == 10) {
                this.g++;
                this.h = this.e;
            } else if (!(c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\')) {
                if (c2 == 'b') {
                    return 8;
                }
                if (c2 == 'f') {
                    return 12;
                }
                if (c2 == 'n') {
                    return 10;
                }
                if (c2 == 'r') {
                    return 13;
                }
                if (c2 == 't') {
                    return 9;
                }
                if (c2 != 'u') {
                    a("Invalid escape sequence");
                    throw null;
                } else if (this.e + 4 <= this.f || b(4)) {
                    char c3 = 0;
                    int i5 = this.e;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c4 = this.d[i5];
                        char c5 = (char) (c3 << 4);
                        if (c4 < '0' || c4 > '9') {
                            if (c4 >= 'a' && c4 <= 'f') {
                                i2 = c4 - 'a';
                            } else if (c4 < 'A' || c4 > 'F') {
                                StringBuilder sb = new StringBuilder("\\u");
                                sb.append(new String(this.d, this.e, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i2 = c4 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c4 - '0';
                        }
                        c3 = (char) (c5 + i3);
                        i5++;
                    }
                    this.e += 4;
                    return c3;
                } else {
                    a(str);
                    throw null;
                }
            }
            return c2;
        }
        a(str);
        throw null;
    }

    public final C0236Nv F() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        switch (i2) {
            case 1:
                return C0236Nv.BEGIN_OBJECT;
            case 2:
                return C0236Nv.END_OBJECT;
            case 3:
                return C0236Nv.BEGIN_ARRAY;
            case 4:
                return C0236Nv.END_ARRAY;
            case 5:
            case 6:
                return C0236Nv.BOOLEAN;
            case 7:
                return C0236Nv.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C0236Nv.STRING;
            case 12:
            case 13:
            case 14:
                return C0236Nv.NAME;
            case 15:
            case 16:
                return C0236Nv.NUMBER;
            case 17:
                return C0236Nv.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void a(boolean z) {
        this.c = true;
    }

    public final void b() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 1) {
            a(3);
            this.i = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(F());
        sb.append(K());
        throw new IllegalStateException(sb.toString());
    }

    public final void c() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 4) {
            this.n--;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            this.i = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(F());
        sb.append(K());
        throw new IllegalStateException(sb.toString());
    }

    public final void close() throws IOException {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.b.close();
    }

    public final void d() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 2) {
            this.n--;
            String[] strArr = this.o;
            int i3 = this.n;
            strArr[i3] = null;
            int[] iArr = this.p;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.i = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(F());
        sb.append(K());
        throw new IllegalStateException(sb.toString());
    }

    public final boolean e() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 5) {
            this.i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.i = 0;
            int[] iArr2 = this.p;
            int i4 = this.n - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(F());
            sb.append(K());
            throw new IllegalStateException(sb.toString());
        }
    }

    public final String f() throws IOException {
        String str;
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 14) {
            str = H();
        } else if (i2 == 12) {
            str = b('\'');
        } else if (i2 == 13) {
            str = b('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(F());
            sb.append(K());
            throw new IllegalStateException(sb.toString());
        }
        this.i = 0;
        this.o[this.n - 1] = str;
        return str;
    }

    public final void g() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 7) {
            this.i = 0;
            int[] iArr = this.p;
            int i3 = this.n - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(F());
        sb.append(K());
        throw new IllegalStateException(sb.toString());
    }

    public final String h() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        String str = null;
        if (i2 == 10) {
            str = H();
        } else if (i2 == 8) {
            str = b('\'');
        } else if (i2 == 9) {
            str = b('\"');
        } else if (i2 == 11) {
            this.l = null;
        } else if (i2 == 15) {
            str = Long.toString(this.j);
        } else if (i2 == 16) {
            str = new String(this.d, this.e, this.k);
            this.e += this.k;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(F());
            sb.append(K());
            throw new IllegalStateException(sb.toString());
        }
        this.i = 0;
        int[] iArr = this.p;
        int i3 = this.n - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public final void i() throws IOException {
        int i2;
        int i3 = 0;
        do {
            int i4 = this.i;
            if (i4 == 0) {
                i4 = G();
            }
            if (i4 == 3) {
                a(1);
            } else if (i4 == 1) {
                a(3);
            } else {
                if (i4 == 4) {
                    this.n--;
                } else if (i4 == 2) {
                    this.n--;
                } else if (i4 == 14 || i4 == 10) {
                    while (true) {
                        i2 = 0;
                        while (true) {
                            int i5 = this.e;
                            if (i5 + i2 < this.f) {
                                char c2 = this.d[i5 + i2];
                                if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
                                    if (c2 != '#') {
                                        if (c2 != ',') {
                                            if (!(c2 == '/' || c2 == '=')) {
                                                if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                                                    if (c2 != ';') {
                                                        switch (c2) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.e = i5 + i2;
                                if (!b(1)) {
                                }
                            }
                        }
                    }
                    I();
                    this.e += i2;
                    this.i = 0;
                } else if (i4 == 8 || i4 == 12) {
                    c('\'');
                    this.i = 0;
                } else if (i4 == 9 || i4 == 13) {
                    c('\"');
                    this.i = 0;
                } else {
                    if (i4 == 16) {
                        this.e += this.k;
                    }
                    this.i = 0;
                }
                i3--;
                this.i = 0;
            }
            i3++;
            this.i = 0;
        } while (i3 != 0);
        int[] iArr = this.p;
        int i6 = this.n;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.o[i6 - 1] = "null";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0228Lv.class.getSimpleName());
        sb.append(K());
        return sb.toString();
    }

    public final void a() throws IOException {
        int i2 = this.i;
        if (i2 == 0) {
            i2 = G();
        }
        if (i2 == 3) {
            a(1);
            this.p[this.n - 1] = 0;
            this.i = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(F());
        sb.append(K());
        throw new IllegalStateException(sb.toString());
    }

    private final String b(char c2) throws IOException {
        char[] cArr = this.d;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.e;
            int i3 = this.f;
            int i4 = i2;
            while (true) {
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    char c3 = cArr[i4];
                    if (c3 == c2) {
                        this.e = i5;
                        int i6 = (i5 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i6);
                        }
                        sb.append(cArr, i2, i6);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.e = i5;
                        int i7 = (i5 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i7 + 1) << 1, 16));
                        }
                        sb.append(cArr, i2, i7);
                        sb.append(L());
                    } else {
                        if (c3 == 10) {
                            this.g++;
                            this.h = i5;
                        }
                        i4 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i4 - i2) << 1, 16));
                    }
                    sb.append(cArr, i2, i4 - i2);
                    this.e = i4;
                    if (!b(1)) {
                        a("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private final void c(char c2) throws IOException {
        char[] cArr = this.d;
        while (true) {
            int i2 = this.e;
            int i3 = this.f;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.e = i4;
                        return;
                    } else if (c3 == '\\') {
                        this.e = i4;
                        L();
                        break;
                    } else {
                        if (c3 == 10) {
                            this.g++;
                            this.h = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.e = i2;
                    if (!b(1)) {
                        a("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private final boolean a(char c2) throws IOException {
        if (!(c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ')) {
            if (c2 != '#') {
                if (c2 != ',') {
                    if (!(c2 == '/' || c2 == '=')) {
                        if (!(c2 == '{' || c2 == '}' || c2 == ':')) {
                            if (c2 != ';') {
                                switch (c2) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            I();
        }
        return false;
    }

    private final void a(int i2) {
        int i3 = this.n;
        int[] iArr = this.m;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            int[] iArr3 = new int[(i3 << 1)];
            String[] strArr = new String[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            System.arraycopy(this.p, 0, iArr3, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.m = iArr2;
            this.p = iArr3;
            this.o = strArr;
        }
        int[] iArr4 = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr4[i4] = i2;
    }

    private final IOException a(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(K());
        throw new C0244Pv(sb.toString());
    }

    private final boolean b(int i2) throws IOException {
        char[] cArr = this.d;
        int i3 = this.h;
        int i4 = this.e;
        this.h = i3 - i4;
        int i5 = this.f;
        if (i5 != i4) {
            this.f = i5 - i4;
            System.arraycopy(cArr, i4, cArr, 0, this.f);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.b;
            int i6 = this.f;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            this.f += read;
            if (this.g == 0) {
                int i7 = this.h;
                if (i7 == 0 && this.f > 0 && cArr[0] == 65279) {
                    this.e++;
                    this.h = i7 + 1;
                    i2++;
                }
            }
        } while (this.f < i2);
        return true;
    }

    private final int b(boolean z) throws IOException {
        char[] cArr = this.d;
        int i2 = this.e;
        int i3 = this.f;
        while (true) {
            boolean z2 = true;
            if (i2 == i3) {
                this.e = i2;
                if (b(1)) {
                    i2 = this.e;
                    i3 = this.f;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder("End of input");
                    sb.append(K());
                    throw new EOFException(sb.toString());
                }
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == 10) {
                this.g++;
                this.h = i4;
            } else if (!(c2 == ' ' || c2 == 13 || c2 == 9)) {
                if (c2 == '/') {
                    this.e = i4;
                    if (i4 == i3) {
                        this.e--;
                        boolean b2 = b(2);
                        this.e++;
                        if (!b2) {
                            return c2;
                        }
                    }
                    I();
                    int i5 = this.e;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.e = i5 + 1;
                        while (true) {
                            int i6 = 0;
                            if (this.e + 2 > this.f && !b(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.d;
                            int i7 = this.e;
                            if (cArr2[i7] != 10) {
                                while (i6 < 2) {
                                    if (this.d[this.e + i6] == "*/".charAt(i6)) {
                                        i6++;
                                    }
                                }
                                break;
                            }
                            this.g++;
                            this.h = i7 + 1;
                            this.e++;
                        }
                        if (z2) {
                            i2 = this.e + 2;
                            i3 = this.f;
                        } else {
                            a("Unterminated comment");
                            throw null;
                        }
                    } else if (c3 != '/') {
                        return c2;
                    } else {
                        this.e = i5 + 1;
                        J();
                        i2 = this.e;
                        i3 = this.f;
                    }
                } else if (c2 == '#') {
                    this.e = i4;
                    I();
                    J();
                    i2 = this.e;
                    i3 = this.f;
                } else {
                    this.e = i4;
                    return c2;
                }
            }
            i2 = i4;
        }
    }
}
