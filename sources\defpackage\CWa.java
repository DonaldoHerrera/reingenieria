package defpackage;

/* renamed from: CWa reason: default package */
/* compiled from: IndexedValue.kt */
public final class CWa<T> {
    private final int a;
    private final T b;

    public CWa(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final T d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWa) {
                CWa cWa = (CWa) obj;
                if (!(this.a == cWa.a) || !C7471uYa.a((Object) this.b, (Object) cWa.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
