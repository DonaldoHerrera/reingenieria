package defpackage;

import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: uo reason: default package and case insensitive filesystem */
/* compiled from: PsBinarySearchSeeker */
final class C1760uo extends Um {

    /* renamed from: uo$a */
    /* compiled from: PsBinarySearchSeeker */
    private static final class a implements g {
        private final Zq a;
        private final Pq b;

        public f a(C0313an anVar, long j, c cVar) throws IOException, InterruptedException {
            long position = anVar.getPosition();
            int min = (int) Math.min(20000, anVar.getLength() - position);
            this.b.c(min);
            anVar.a(this.b.a, 0, min);
            return a(this.b, j, position);
        }

        private a(Zq zq) {
            this.a = zq;
            this.b = new Pq();
        }

        public void a() {
            this.b.a(C0471ar.f);
        }

        private f a(Pq pq, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (pq.a() >= 4) {
                if (C1760uo.b(pq.a, pq.c()) != 442) {
                    pq.f(1);
                } else {
                    pq.f(4);
                    long a2 = C1790vo.a(pq);
                    if (a2 != -9223372036854775807L) {
                        long b2 = this.a.b(a2);
                        if (b2 > j) {
                            if (j3 == -9223372036854775807L) {
                                return f.a(b2, j2);
                            }
                            return f.a(j2 + ((long) i2));
                        } else if (100000 + b2 > j) {
                            return f.a(j2 + ((long) pq.c()));
                        } else {
                            i2 = pq.c();
                            j3 = b2;
                        }
                    }
                    a(pq);
                    i = pq.c();
                }
            }
            if (j3 != -9223372036854775807L) {
                return f.b(j3, j2 + ((long) i));
            }
            return f.a;
        }

        private static void a(Pq pq) {
            int d = pq.d();
            if (pq.a() < 10) {
                pq.e(d);
                return;
            }
            pq.f(9);
            int t = pq.t() & 7;
            if (pq.a() < t) {
                pq.e(d);
                return;
            }
            pq.f(t);
            if (pq.a() < 4) {
                pq.e(d);
                return;
            }
            if (C1760uo.b(pq.a, pq.c()) == 443) {
                pq.f(4);
                int z = pq.z();
                if (pq.a() < z) {
                    pq.e(d);
                    return;
                }
                pq.f(z);
            }
            while (pq.a() >= 4) {
                int a2 = C1760uo.b(pq.a, pq.c());
                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                    break;
                }
                pq.f(4);
                if (pq.a() < 2) {
                    pq.e(d);
                    return;
                } else {
                    pq.e(Math.min(pq.d(), pq.c() + pq.z()));
                }
            }
        }
    }

    public C1760uo(Zq zq, long j, long j2) {
        super(new b(), new a(zq), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
