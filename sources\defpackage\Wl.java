package defpackage;

/* renamed from: Wl reason: default package */
/* compiled from: Optional.kt */
public final class Wl<T> extends Ul<T> {
    private final T b;

    public Wl(T t) {
        C7471uYa.b(t, "value");
        super(null);
        this.b = t;
    }

    public final T a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.Wl) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Wl) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.b;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Some(");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
