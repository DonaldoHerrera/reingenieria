package defpackage;

/* renamed from: KMa reason: default package and case insensitive filesystem */
/* compiled from: ProviderOfLazy */
public final class C5055KMa<T> implements C7054oVa<C4806CMa<T>> {
    private final C7054oVa<T> a;

    private C5055KMa(C7054oVa<T> ova) {
        this.a = ova;
    }

    public static <T> C7054oVa<C4806CMa<T>> a(C7054oVa<T> ova) {
        C5023JMa.a(ova);
        return new C5055KMa(ova);
    }

    public C4806CMa<T> get() {
        return C4930GMa.a(this.a);
    }
}
