package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: Qv reason: default package and case insensitive filesystem */
public final class C0248Qv implements Closeable, Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private String i;
    private boolean j;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            a[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        String[] strArr3 = b;
        strArr3[62] = "\\u003e";
        strArr3[38] = "\\u0026";
        strArr3[61] = "\\u003d";
        strArr3[39] = "\\u0027";
    }

    public C0248Qv(Writer writer) {
        a(6);
        this.g = ":";
        this.j = true;
        this.c = writer;
    }

    private final int f() {
        int i2 = this.e;
        if (i2 != 0) {
            return this.d[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void g() throws IOException {
        if (this.i != null) {
            int f2 = f();
            if (f2 == 5) {
                this.c.write(44);
            } else if (f2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            b(4);
            d(this.i);
            this.i = null;
        }
    }

    private final void i() throws IOException {
        int f2 = f();
        if (f2 == 1) {
            b(2);
            h();
        } else if (f2 == 2) {
            this.c.append(',');
            h();
        } else if (f2 != 4) {
            if (f2 != 6) {
                if (f2 != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
        } else {
            this.c.append(this.g);
            b(5);
        }
    }

    public final void a(String str) {
        if (str.length() == 0) {
            this.f = null;
            this.g = ":";
            return;
        }
        this.f = str;
        this.g = ": ";
    }

    public final C0248Qv b() throws IOException {
        a(1, 2, "]");
        return this;
    }

    public final C0248Qv c() throws IOException {
        g();
        b(3, "{");
        return this;
    }

    public final void close() throws IOException {
        this.c.close();
        int i2 = this.e;
        if (i2 > 1 || (i2 == 1 && this.d[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    public final C0248Qv d() throws IOException {
        a(3, 5, "}");
        return this;
    }

    public final C0248Qv e() throws IOException {
        if (this.i != null) {
            if (this.j) {
                g();
            } else {
                this.i = null;
                return this;
            }
        }
        i();
        this.c.write("null");
        return this;
    }

    public final void flush() throws IOException {
        if (this.e != 0) {
            this.c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final C0248Qv h(long j2) throws IOException {
        g();
        i();
        this.c.write(Long.toString(j2));
        return this;
    }

    private final C0248Qv b(int i2, String str) throws IOException {
        i();
        a(i2);
        this.c.write(str);
        return this;
    }

    private final void d(String str) throws IOException {
        String str2;
        String[] strArr = a;
        String str3 = "\"";
        this.c.write(str3);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.c.write(str, i2, i3 - i2);
            }
            this.c.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.c.write(str, i2, length - i2);
        }
        this.c.write(str3);
    }

    public final C0248Qv c(String str) throws IOException {
        if (str == null) {
            e();
            return this;
        }
        g();
        i();
        d(str);
        return this;
    }

    private final void h() throws IOException {
        if (this.f != null) {
            this.c.write("\n");
            int i2 = this.e;
            for (int i3 = 1; i3 < i2; i3++) {
                this.c.write(this.f);
            }
        }
    }

    private final void b(int i2) {
        this.d[this.e - 1] = i2;
    }

    public final void a(boolean z) {
        this.h = true;
    }

    public final C0248Qv b(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.i != null) {
            throw new IllegalStateException();
        } else if (this.e != 0) {
            this.i = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final C0248Qv a() throws IOException {
        g();
        b(1, "[");
        return this;
    }

    private final C0248Qv a(int i2, int i3, String str) throws IOException {
        int f2 = f();
        if (f2 != i3 && f2 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.i == null) {
            this.e--;
            if (f2 == i3) {
                h();
            }
            this.c.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Dangling name: ");
            sb.append(this.i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final C0248Qv b(boolean z) throws IOException {
        g();
        i();
        this.c.write(z ? "true" : "false");
        return this;
    }

    private final void a(int i2) {
        int i3 = this.e;
        int[] iArr = this.d;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 << 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.d = iArr2;
        }
        int[] iArr3 = this.d;
        int i4 = this.e;
        this.e = i4 + 1;
        iArr3[i4] = i2;
    }

    public final C0248Qv a(double d2) throws IOException {
        g();
        if (this.h || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
            i();
            this.c.append(Double.toString(d2));
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(d2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final C0248Qv a(Number number) throws IOException {
        if (number == null) {
            e();
            return this;
        }
        g();
        String obj = number.toString();
        if (this.h || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            i();
            this.c.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }
}
