package defpackage;

/* renamed from: Yfa reason: default package */
/* compiled from: Result.kt */
public final class Yfa<Key, Type> extends Wfa<Key, Type> {
    private final Type a;

    public Yfa(Type type) {
        super(null);
        this.a = type;
    }

    public final Type a() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Yfa) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Yfa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Type type = this.a;
        if (type != null) {
            return type.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Success(data=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
