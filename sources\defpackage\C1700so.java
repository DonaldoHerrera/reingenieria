package defpackage;

import com.google.android.exoplayer2.H;

/* renamed from: so reason: default package and case insensitive filesystem */
/* compiled from: PesReader */
public final class C1700so implements Eo {
    private final C1425jo a;
    private final Oq b = new Oq(new byte[10]);
    private int c = 0;
    private int d;
    private Zq e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public C1700so(C1425jo joVar) {
        this.a = joVar;
    }

    private boolean b() {
        this.b.b(0);
        int a2 = this.b.a(24);
        if (a2 != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(a2);
            Iq.d("PesReader", sb.toString());
            this.j = -1;
            return false;
        }
        this.b.c(8);
        int a3 = this.b.a(16);
        this.b.c(5);
        this.k = this.b.e();
        this.b.c(2);
        this.f = this.b.e();
        this.g = this.b.e();
        this.b.c(6);
        this.i = this.b.a(8);
        if (a3 == 0) {
            this.j = -1;
        } else {
            this.j = ((a3 + 6) - 9) - this.i;
        }
        return true;
    }

    private void c() {
        this.b.b(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.b.c(4);
            long a2 = ((long) this.b.a(3)) << 30;
            this.b.c(1);
            long a3 = a2 | ((long) (this.b.a(15) << 15));
            this.b.c(1);
            long a4 = a3 | ((long) this.b.a(15));
            this.b.c(1);
            if (!this.h && this.g) {
                this.b.c(4);
                long a5 = ((long) this.b.a(3)) << 30;
                this.b.c(1);
                long a6 = a5 | ((long) (this.b.a(15) << 15));
                this.b.c(1);
                long a7 = a6 | ((long) this.b.a(15));
                this.b.c(1);
                this.e.b(a7);
                this.h = true;
            }
            this.l = this.e.b(a4);
        }
    }

    public void a(Zq zq, C0498bn bnVar, d dVar) {
        this.e = zq;
        this.a.a(bnVar, dVar);
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    public final void a(Pq pq, int i2) throws H {
        if ((i2 & 1) != 0) {
            int i3 = this.c;
            if (!(i3 == 0 || i3 == 1)) {
                String str = "PesReader";
                if (i3 == 2) {
                    Iq.d(str, "Unexpected start indicator reading extended header");
                } else if (i3 == 3) {
                    if (this.j != -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(this.j);
                        sb.append(" more bytes");
                        Iq.d(str, sb.toString());
                    }
                    this.a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (pq.a() > 0) {
            int i4 = this.c;
            if (i4 != 0) {
                int i5 = 0;
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (a(pq, this.b.a, Math.min(10, this.i)) && a(pq, (byte[]) null, this.i)) {
                            c();
                            if (this.k) {
                                i5 = 4;
                            }
                            i2 |= i5;
                            this.a.a(this.l, i2);
                            a(3);
                        }
                    } else if (i4 == 3) {
                        int a2 = pq.a();
                        int i6 = this.j;
                        if (i6 != -1) {
                            i5 = a2 - i6;
                        }
                        if (i5 > 0) {
                            a2 -= i5;
                            pq.d(pq.c() + a2);
                        }
                        this.a.a(pq);
                        int i7 = this.j;
                        if (i7 != -1) {
                            this.j = i7 - a2;
                            if (this.j == 0) {
                                this.a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(pq, this.b.a, 9)) {
                    if (b()) {
                        i5 = 2;
                    }
                    a(i5);
                }
            } else {
                pq.f(pq.a());
            }
        }
    }

    private void a(int i2) {
        this.c = i2;
        this.d = 0;
    }

    private boolean a(Pq pq, byte[] bArr, int i2) {
        int min = Math.min(pq.a(), i2 - this.d);
        boolean z = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            pq.f(min);
        } else {
            pq.a(bArr, this.d, min);
        }
        this.d += min;
        if (this.d != i2) {
            z = false;
        }
        return z;
    }
}
