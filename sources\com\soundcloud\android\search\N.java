package com.soundcloud.android.search;

/* compiled from: SearchResultsFragment.kt */
final class N extends C7540vYa implements C6308dYa<Wca, Wca, Boolean> {
    public static final N a = new N();

    N() {
        super(2);
    }

    public final boolean a(Wca wca, Wca wca2) {
        C7471uYa.b(wca, "firstItem");
        C7471uYa.b(wca2, "secondItem");
        return C7471uYa.a((Object) wca.a(), (Object) wca2.a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((Wca) obj, (Wca) obj2));
    }
}
