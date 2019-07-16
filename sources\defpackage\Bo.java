package defpackage;

import java.io.IOException;

/* renamed from: Bo reason: default package */
/* compiled from: TsBinarySearchSeeker */
final class Bo extends Um {

    /* renamed from: Bo$a */
    /* compiled from: TsBinarySearchSeeker */
    private static final class a implements g {
        private final Zq a;
        private final Pq b = new Pq();
        private final int c;

        public a(int i, Zq zq) {
            this.c = i;
            this.a = zq;
        }

        public f a(C0313an anVar, long j, c cVar) throws IOException, InterruptedException {
            long position = anVar.getPosition();
            int min = (int) Math.min(112800, anVar.getLength() - position);
            this.b.c(min);
            anVar.a(this.b.a, 0, min);
            return a(this.b, j, position);
        }

        private f a(Pq pq, long j, long j2) {
            Pq pq2 = pq;
            long j3 = j2;
            int d = pq.d();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (pq.a() >= 188) {
                int a2 = Fo.a(pq2.a, pq.c(), d);
                int i = a2 + 188;
                if (i > d) {
                    break;
                }
                long a3 = Fo.a(pq2, a2, this.c);
                if (a3 != -9223372036854775807L) {
                    long b2 = this.a.b(a3);
                    if (b2 > j) {
                        if (j6 == -9223372036854775807L) {
                            return f.a(b2, j3);
                        }
                        return f.a(j3 + j5);
                    } else if (100000 + b2 > j) {
                        return f.a(j3 + ((long) a2));
                    } else {
                        j5 = (long) a2;
                        j6 = b2;
                    }
                }
                pq2.e(i);
                j4 = (long) i;
            }
            if (j6 != -9223372036854775807L) {
                return f.b(j6, j3 + j4);
            }
            return f.a;
        }

        public void a() {
            this.b.a(C0471ar.f);
        }
    }

    public Bo(Zq zq, long j, long j2, int i) {
        long j3 = j;
        super(new b(), new a(i, zq), j3, 0, j + 1, 0, j2, 188, 940);
    }
}
