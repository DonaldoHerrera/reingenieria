package defpackage;

/* renamed from: NV reason: default package */
/* compiled from: RepositoryExtensions.kt */
final class NV<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ MV a;

    NV(MV mv) {
        this.a = mv;
    }

    /* renamed from: a */
    public final Ida<T> apply(HVa<Integer, ? extends Ida<T>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        int intValue = ((Number) hVa.a()).intValue();
        Ida<T> ida = (Ida) hVa.b();
        if (intValue != 0 || !(this.a instanceof a)) {
            return ida;
        }
        if (ida instanceof c) {
            return b.a.a(((c) ida).a(), C6918mWa.a(), ((a) this.a).a());
        }
        if (ida instanceof b) {
            b bVar = (b) ida;
            return b.a.a(bVar.b(), bVar.c(), ((a) this.a).a());
        }
        throw new IllegalStateException("Unexpected response from storage");
    }
}
