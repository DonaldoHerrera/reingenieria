package com.soundcloud.android.stations;

/* renamed from: com.soundcloud.android.stations.na reason: case insensitive filesystem */
/* compiled from: LikedStationsFragment.kt */
final class C6030na extends C7540vYa implements C6308dYa<Nb, Nb, Boolean> {
    public static final C6030na a = new C6030na();

    C6030na() {
        super(2);
    }

    public final boolean a(Nb nb, Nb nb2) {
        C7471uYa.b(nb, "first");
        C7471uYa.b(nb2, "second");
        return Ob.a(nb, nb2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((Nb) obj, (Nb) obj2));
    }
}
