package com.google.android.gms.internal.firebase-perf;

public class Jb {
    private static final C0854jb a = C0854jb.a();
    private Oa b;
    private volatile C0835ec c;
    private volatile Oa d;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    private final C0835ec b(C0835ec ecVar) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = ecVar;
                    this.d = Oa.a;
                    this.c = ecVar;
                    this.d = Oa.a;
                }
            }
        }
        return this.c;
    }

    public final C0835ec a(C0835ec ecVar) {
        C0835ec ecVar2 = this.c;
        this.b = null;
        this.d = null;
        this.c = ecVar;
        return ecVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jb)) {
            return false;
        }
        Jb jb = (Jb) obj;
        C0835ec ecVar = this.c;
        C0835ec ecVar2 = jb.c;
        if (ecVar == null && ecVar2 == null) {
            return a().equals(jb.a());
        }
        if (ecVar != null && ecVar2 != null) {
            return ecVar.equals(ecVar2);
        }
        if (ecVar != null) {
            return ecVar.equals(jb.b(ecVar.e()));
        }
        return b(ecVar2.e()).equals(ecVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final Oa a() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                Oa oa = this.d;
                return oa;
            }
            if (this.c == null) {
                this.d = Oa.a;
            } else {
                this.d = this.c.c();
            }
            Oa oa2 = this.d;
            return oa2;
        }
    }

    public final int b() {
        if (this.d != null) {
            return this.d.size();
        }
        if (this.c != null) {
            return this.c.g();
        }
        return 0;
    }
}
