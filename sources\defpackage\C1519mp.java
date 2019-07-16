package defpackage;

/* renamed from: mp reason: default package and case insensitive filesystem */
/* compiled from: CeaUtil */
public final class C1519mp {
    public static final int a = C0471ar.b("GA94");

    public static void a(long j, Pq pq, C1424jn[] jnVarArr) {
        while (true) {
            boolean z = true;
            if (pq.a() > 1) {
                int a2 = a(pq);
                int a3 = a(pq);
                int c = pq.c() + a3;
                if (a3 == -1 || a3 > pq.a()) {
                    Iq.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    c = pq.d();
                } else if (a2 == 4 && a3 >= 8) {
                    int t = pq.t();
                    int z2 = pq.z();
                    int h = z2 == 49 ? pq.h() : 0;
                    int t2 = pq.t();
                    if (z2 == 47) {
                        pq.f(1);
                    }
                    boolean z3 = t == 181 && (z2 == 49 || z2 == 47) && t2 == 3;
                    if (z2 == 49) {
                        if (h != a) {
                            z = false;
                        }
                        z3 &= z;
                    }
                    if (z3) {
                        b(j, pq, jnVarArr);
                    }
                }
                pq.e(c);
            } else {
                return;
            }
        }
    }

    public static void b(long j, Pq pq, C1424jn[] jnVarArr) {
        int t = pq.t();
        if ((t & 64) != 0) {
            int i = t & 31;
            pq.f(1);
            int i2 = i * 3;
            int c = pq.c();
            for (C1424jn jnVar : jnVarArr) {
                pq.e(c);
                jnVar.a(pq, i2);
                jnVar.a(j, 1, i2, 0, null);
            }
        }
    }

    private static int a(Pq pq) {
        int i = 0;
        while (pq.a() != 0) {
            int t = pq.t();
            i += t;
            if (t != 255) {
                return i;
            }
        }
        return -1;
    }
}
