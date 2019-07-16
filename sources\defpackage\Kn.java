package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: Kn reason: default package */
/* compiled from: DefaultOggSeeker */
final class Kn implements Pn {
    private final On a = new On();
    /* access modifiers changed from: private */
    public final long b;
    private final long c;
    /* access modifiers changed from: private */
    public final Sn d;
    private int e;
    /* access modifiers changed from: private */
    public long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    /* renamed from: Kn$a */
    /* compiled from: DefaultOggSeeker */
    private class a implements C1363hn {
        private a() {
        }

        public defpackage.C1363hn.a a(long j) {
            if (j == 0) {
                return new defpackage.C1363hn.a(new C1393in(0, Kn.this.b));
            }
            long b = Kn.this.d.b(j);
            Kn kn = Kn.this;
            return new defpackage.C1363hn.a(new C1393in(j, kn.a(kn.b, b, 30000)));
        }

        public boolean b() {
            return true;
        }

        public long c() {
            return Kn.this.d.a(Kn.this.f);
        }
    }

    public Kn(long j2, long j3, Sn sn, long j4, long j5, boolean z) {
        C1852xq.a(j2 >= 0 && j3 > j2);
        this.d = sn;
        this.b = j2;
        this.c = j3;
        if (j4 == j3 - j2 || z) {
            this.f = j5;
            this.e = 3;
            return;
        }
        this.e = 0;
    }

    /* access modifiers changed from: 0000 */
    public long b(C0313an anVar) throws IOException, InterruptedException {
        c(anVar);
        this.a.a();
        while ((this.a.c & 4) != 4 && anVar.getPosition() < this.c) {
            this.a.a(anVar, false);
            On on = this.a;
            anVar.c(on.i + on.j);
        }
        return this.a.d;
    }

    public long c(long j2) {
        int i2 = this.e;
        C1852xq.a(i2 == 3 || i2 == 2);
        long j3 = 0;
        if (j2 != 0) {
            j3 = this.d.b(j2);
        }
        this.h = j3;
        this.e = 2;
        a();
        return this.h;
    }

    public a d() {
        if (this.f != 0) {
            return new a();
        }
        return null;
    }

    public long a(C0313an anVar) throws IOException, InterruptedException {
        int i2 = this.e;
        if (i2 == 0) {
            this.g = anVar.getPosition();
            this.e = 1;
            long j2 = this.c - 65307;
            if (j2 > this.g) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j3 = this.h;
                long j4 = 0;
                if (j3 != 0) {
                    long a2 = a(j3, anVar);
                    if (a2 >= 0) {
                        return a2;
                    }
                    j4 = a(anVar, this.h, -(a2 + 2));
                }
                this.e = 3;
                return -(j4 + 2);
            } else if (i2 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.f = b(anVar);
        this.e = 3;
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public void c(C0313an anVar) throws IOException, InterruptedException {
        if (!a(anVar, this.c)) {
            throw new EOFException();
        }
    }

    public void a() {
        this.i = this.b;
        this.j = this.c;
        this.k = 0;
        this.l = this.f;
    }

    public long a(long j2, C0313an anVar) throws IOException, InterruptedException {
        long j3 = 2;
        if (this.i == this.j) {
            return -(this.k + 2);
        }
        long position = anVar.getPosition();
        if (!a(anVar, this.j)) {
            long j4 = this.i;
            if (j4 != position) {
                return j4;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(anVar, false);
        anVar.a();
        On on = this.a;
        long j5 = j2 - on.d;
        int i2 = on.i + on.j;
        int i3 = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
        if (i3 < 0 || j5 > 72000) {
            if (i3 < 0) {
                this.j = position;
                this.l = this.a.d;
            } else {
                long j6 = (long) i2;
                this.i = anVar.getPosition() + j6;
                this.k = this.a.d;
                if ((this.j - this.i) + j6 < 100000) {
                    anVar.c(i2);
                    return -(this.k + 2);
                }
            }
            long j7 = this.j;
            long j8 = this.i;
            if (j7 - j8 < 100000) {
                this.j = j8;
                return j8;
            }
            long j9 = (long) i2;
            if (i3 > 0) {
                j3 = 1;
            }
            long position2 = anVar.getPosition() - (j9 * j3);
            long j10 = this.j;
            long j11 = this.i;
            return Math.min(Math.max(position2 + ((j5 * (j10 - j11)) / (this.l - this.k)), j11), this.j - 1);
        }
        anVar.c(i2);
        return -(this.a.d + 2);
    }

    /* access modifiers changed from: private */
    public long a(long j2, long j3, long j4) {
        long j5 = this.c;
        long j6 = this.b;
        long j7 = j2 + (((j3 * (j5 - j6)) / this.f) - j4);
        if (j7 < j6) {
            j7 = j6;
        }
        long j8 = this.c;
        return j7 >= j8 ? j8 - 1 : j7;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C0313an anVar, long j2) throws IOException, InterruptedException {
        int i2;
        long min = Math.min(j2 + 3, this.c);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            int i3 = 0;
            if (anVar.getPosition() + ((long) length) > min) {
                int position = (int) (min - anVar.getPosition());
                if (position < 4) {
                    return false;
                }
                length = position;
            }
            anVar.a(bArr, 0, length, false);
            while (true) {
                i2 = length - 3;
                if (i3 >= i2) {
                    break;
                } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                    anVar.c(i3);
                    return true;
                } else {
                    i3++;
                }
            }
            anVar.c(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public long a(C0313an anVar, long j2, long j3) throws IOException, InterruptedException {
        this.a.a(anVar, false);
        while (true) {
            On on = this.a;
            if (on.d < j2) {
                anVar.c(on.i + on.j);
                On on2 = this.a;
                long j4 = on2.d;
                on2.a(anVar, false);
                j3 = j4;
            } else {
                anVar.a();
                return j3;
            }
        }
    }
}
