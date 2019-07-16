package defpackage;

/* renamed from: NMa reason: default package and case insensitive filesystem */
/* compiled from: SingleCheck */
public final class C5148NMa<T> implements C7054oVa<T> {
    private static final Object a = new Object();
    private volatile C7054oVa<T> b;
    private volatile Object c = a;

    private C5148NMa(C7054oVa<T> ova) {
        this.b = ova;
    }

    public static <P extends C7054oVa<T>, T> C7054oVa<T> a(P p) {
        if ((p instanceof C5148NMa) || (p instanceof C4930GMa)) {
            return p;
        }
        C5023JMa.a(p);
        return new C5148NMa((C7054oVa) p);
    }

    public T get() {
        T t = this.c;
        if (t != a) {
            return t;
        }
        C7054oVa<T> ova = this.b;
        if (ova == null) {
            return this.c;
        }
        T t2 = ova.get();
        this.c = t2;
        this.b = null;
        return t2;
    }
}
