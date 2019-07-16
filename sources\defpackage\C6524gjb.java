package defpackage;

/* renamed from: gjb reason: default package and case insensitive filesystem */
/* compiled from: typeEnhancement.kt */
final class C6524gjb<T> {
    private final T a;
    private final C6723jeb b;

    public C6524gjb(T t, C6723jeb jeb) {
        this.a = t;
        this.b = jeb;
    }

    public final T a() {
        return this.a;
    }

    public final C6723jeb b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6524gjb) {
                C6524gjb gjb = (C6524gjb) obj;
                if (C7471uYa.a((Object) this.a, (Object) gjb.a)) {
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
        C6723jeb jeb = this.b;
        if (jeb != null) {
            i = jeb.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnhancementResult(result=");
        sb.append(this.a);
        sb.append(", enhancementAnnotations=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
