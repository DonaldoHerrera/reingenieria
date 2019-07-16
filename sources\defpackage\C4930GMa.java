package defpackage;

/* renamed from: GMa reason: default package and case insensitive filesystem */
/* compiled from: DoubleCheck */
public final class C4930GMa<T> implements C7054oVa<T>, C4806CMa<T> {
    private static final Object a = new Object();
    private volatile C7054oVa<T> b;
    private volatile Object c = a;

    private C4930GMa(C7054oVa<T> ova) {
        this.b = ova;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != a) || obj == obj2) {
            return obj2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Scoped provider was invoked recursively returning different results: ");
        sb.append(obj);
        sb.append(" & ");
        sb.append(obj2);
        sb.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(sb.toString());
    }

    public static <P extends C7054oVa<T>, T> C7054oVa<T> b(P p) {
        C5023JMa.a(p);
        if (p instanceof C4930GMa) {
            return p;
        }
        return new C4930GMa(p);
    }

    public T get() {
        T t = this.c;
        if (t == a) {
            synchronized (this) {
                t = this.c;
                if (t == a) {
                    t = this.b.get();
                    a(this.c, t);
                    this.c = t;
                    this.b = null;
                }
            }
        }
        return t;
    }

    public static <P extends C7054oVa<T>, T> C4806CMa<T> a(P p) {
        if (p instanceof C4806CMa) {
            return (C4806CMa) p;
        }
        C5023JMa.a(p);
        return new C4930GMa((C7054oVa) p);
    }
}
