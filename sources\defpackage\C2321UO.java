package defpackage;

/* renamed from: UO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideAsyncApiClientRxFactory */
public final class C2321UO implements C4961HMa<IPa<efa>> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;

    public static IPa<efa> a(C4806CMa<efa> cMa, HPa hPa) {
        IPa<efa> a2 = C2264RO.a(cMa, hPa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public IPa<efa> get() {
        return a(C4930GMa.a(this.a), (HPa) this.b.get());
    }
}
