package com.soundcloud.android.collection.recentlyplayed;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.x reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedFragment.kt */
final class C2834x extends C7540vYa implements C6308dYa<E, E, Boolean> {
    public static final C2834x a = new C2834x();

    C2834x() {
        super(2);
    }

    public final boolean a(E e, E e2) {
        C7471uYa.b(e, "firstItem");
        C7471uYa.b(e2, "secondItem");
        return e.a(e2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((E) obj, (E) obj2));
    }
}
