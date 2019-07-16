package defpackage;

/* renamed from: Rfa reason: default package */
/* compiled from: Result.kt */
public final class Rfa<Key, Type> extends Wfa<Key, Type> {
    private final C4538dga a;

    public Rfa(C4538dga dga) {
        C7471uYa.b(dga, "exception");
        super(null);
        this.a = dga;
    }

    public final C4538dga a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Rfa) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Rfa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4538dga dga = this.a;
        if (dga != null) {
            return dga.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(exception=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
