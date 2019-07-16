package com.google.android.gms.internal.measurement;

public class Wb {
    private static final C1042tb a = C1042tb.b();
    private Ya b;
    private volatile C1026qc c;
    private volatile Ya d;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    private final C1026qc b(C1026qc qcVar) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = qcVar;
                    this.d = Ya.a;
                    this.c = qcVar;
                    this.d = Ya.a;
                }
            }
        }
        return this.c;
    }

    public final C1026qc a(C1026qc qcVar) {
        C1026qc qcVar2 = this.c;
        this.b = null;
        this.d = null;
        this.c = qcVar;
        return qcVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wb)) {
            return false;
        }
        Wb wb = (Wb) obj;
        C1026qc qcVar = this.c;
        C1026qc qcVar2 = wb.c;
        if (qcVar == null && qcVar2 == null) {
            return a().equals(wb.a());
        }
        if (qcVar != null && qcVar2 != null) {
            return qcVar.equals(qcVar2);
        }
        if (qcVar != null) {
            return qcVar.equals(wb.b(qcVar.a()));
        }
        return b(qcVar2.a()).equals(qcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final Ya a() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                Ya ya = this.d;
                return ya;
            }
            if (this.c == null) {
                this.d = Ya.a;
            } else {
                this.d = this.c.e();
            }
            Ya ya2 = this.d;
            return ya2;
        }
    }

    public final int b() {
        if (this.d != null) {
            return this.d.size();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0;
    }
}
