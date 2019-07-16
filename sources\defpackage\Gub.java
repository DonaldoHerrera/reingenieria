package defpackage;

/* renamed from: Gub reason: default package */
/* compiled from: CapturedTypeApproximation.kt */
public final class Gub<T> {
    private final T a;
    private final T b;

    public Gub(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public final T a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    public final T c() {
        return this.a;
    }

    public final T d() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gub) {
                Gub gub = (Gub) obj;
                if (C7471uYa.a((Object) this.a, (Object) gub.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApproximationBounds(lower=");
        sb.append(this.a);
        sb.append(", upper=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
