package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.td reason: case insensitive filesystem */
public final class C1044td {
    private final byte[] a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = BaseClientBuilder.API_PRIORITY_OTHER;
    private int i;
    private int j = 64;
    private int k = 67108864;
    private C0989kb l;

    private C1044td(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = 0;
        int i4 = i3 + 0;
        this.d = i4;
        this.c = i4;
        this.f = 0;
    }

    public static C1044td a(byte[] bArr, int i2, int i3) {
        return new C1044td(bArr, 0, i3);
    }

    private final void b(int i2) throws Bd {
        if (this.g != i2) {
            throw new Bd("Protocol message end-group tag did not match expected tag.");
        }
    }

    private final void g() {
        this.d += this.e;
        int i2 = this.d;
        int i3 = this.h;
        if (i2 > i3) {
            this.e = i2 - i3;
            this.d = i2 - this.e;
            return;
        }
        this.e = 0;
    }

    private final byte h() throws IOException {
        int i2 = this.f;
        if (i2 != this.d) {
            byte[] bArr = this.a;
            this.f = i2 + 1;
            return bArr[i2];
        }
        throw Bd.a();
    }

    public final int c() throws IOException {
        if (this.f == this.d) {
            this.g = 0;
            return 0;
        }
        this.g = e();
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        throw new Bd("Protocol message contained an invalid tag (zero).");
    }

    public final boolean d() throws IOException {
        return e() != 0;
    }

    public final int e() throws IOException {
        byte b2;
        int i2;
        byte h2 = h();
        if (h2 >= 0) {
            return h2;
        }
        byte b3 = h2 & Ascii.DEL;
        byte h3 = h();
        if (h3 >= 0) {
            i2 = h3 << 7;
        } else {
            b3 |= (h3 & Ascii.DEL) << 7;
            byte h4 = h();
            if (h4 >= 0) {
                i2 = h4 << Ascii.SO;
            } else {
                b3 |= (h4 & Ascii.DEL) << Ascii.SO;
                byte h5 = h();
                if (h5 >= 0) {
                    i2 = h5 << Ascii.NAK;
                } else {
                    byte b4 = b3 | ((h5 & Ascii.DEL) << Ascii.NAK);
                    byte h6 = h();
                    b2 = b4 | (h6 << Ascii.FS);
                    if (h6 < 0) {
                        for (int i3 = 0; i3 < 5; i3++) {
                            if (h() >= 0) {
                                return b2;
                            }
                        }
                        throw Bd.c();
                    }
                    return b2;
                }
            }
        }
        b2 = b3 | i2;
        return b2;
    }

    public final long f() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte h2 = h();
            j2 |= ((long) (h2 & Ascii.DEL)) << i2;
            if ((h2 & 128) == 0) {
                return j2;
            }
        }
        throw Bd.c();
    }

    public final boolean a(int i2) throws IOException {
        int c2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            e();
            return true;
        } else if (i3 == 1) {
            h();
            h();
            h();
            h();
            h();
            h();
            h();
            h();
            return true;
        } else if (i3 == 2) {
            c(e());
            return true;
        } else if (i3 == 3) {
            do {
                c2 = c();
                if (c2 == 0) {
                    break;
                }
            } while (a(c2));
            b(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                h();
                h();
                h();
                h();
                return true;
            }
            throw new Bd("Protocol message tag had invalid wire type.");
        }
    }

    public final String b() throws IOException {
        int e2 = e();
        if (e2 >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (e2 <= i2 - i3) {
                String str = new String(this.a, i3, e2, Cd.a);
                this.f += e2;
                return str;
            }
            throw Bd.a();
        }
        throw Bd.b();
    }

    private final void c(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = i3 + i2;
            int i5 = this.h;
            if (i4 > i5) {
                c(i5 - i3);
                throw Bd.a();
            } else if (i2 <= this.d - i3) {
                this.f = i3 + i2;
            } else {
                throw Bd.a();
            }
        } else {
            throw Bd.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(int i2, int i3) {
        int i4 = this.f;
        int i5 = this.b;
        if (i2 > i4 - i5) {
            int i6 = i4 - i5;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i2);
            sb.append(" is beyond current ");
            sb.append(i6);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0) {
            this.f = i5 + i2;
            this.g = i3;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final void a(Ed ed) throws IOException {
        int e2 = e();
        if (this.i >= this.j) {
            throw new Bd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (e2 >= 0) {
            int i2 = e2 + this.f;
            int i3 = this.h;
            if (i2 <= i3) {
                this.h = i2;
                g();
                this.i++;
                ed.a(this);
                b(0);
                this.i--;
                this.h = i3;
                g();
                return;
            }
            throw Bd.a();
        } else {
            throw Bd.b();
        }
    }

    public final <T extends Gb<T, ?>> T a(C1073yc<T> ycVar) throws IOException {
        try {
            if (this.l == null) {
                this.l = C0989kb.a(this.a, this.b, this.c);
            }
            int t = this.l.t();
            int i2 = this.f - this.b;
            if (t <= i2) {
                this.l.f(i2 - t);
                this.l.c(this.j - this.i);
                T t2 = (Gb) this.l.a(ycVar, C1042tb.c());
                a(this.g);
                return t2;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(t), Integer.valueOf(i2)}));
        } catch (Rb e2) {
            throw new Bd("", e2);
        }
    }

    public final int a() {
        return this.f - this.b;
    }

    public final byte[] a(int i2, int i3) {
        if (i3 == 0) {
            return Fd.h;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.b + i2, bArr, 0, i3);
        return bArr;
    }
}
