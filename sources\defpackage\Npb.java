package defpackage;

/* renamed from: Npb reason: default package */
/* compiled from: constantValues.kt */
public abstract class Npb<T> {
    private final T a;

    public Npb(T t) {
        this.a = t;
    }

    public T a() {
        return this.a;
    }

    public abstract C7706xtb a(C6450fdb fdb);

    public boolean equals(Object obj) {
        if (this != obj) {
            Object a2 = a();
            Object obj2 = null;
            if (!(obj instanceof Npb)) {
                obj = null;
            }
            Npb npb = (Npb) obj;
            if (npb != null) {
                obj2 = npb.a();
            }
            if (!C7471uYa.a(a2, obj2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object a2 = a();
        if (a2 != null) {
            return a2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(a());
    }
}
