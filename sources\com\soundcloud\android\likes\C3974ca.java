package com.soundcloud.android.likes;

/* renamed from: com.soundcloud.android.likes.ca reason: case insensitive filesystem */
/* compiled from: TrackLikesUniflowFragment.kt */
final class C3974ca extends C7540vYa implements C6308dYa<la, la, Boolean> {
    public static final C3974ca a = new C3974ca();

    C3974ca() {
        super(2);
    }

    public final boolean a(la laVar, la laVar2) {
        C7471uYa.b(laVar, "first");
        C7471uYa.b(laVar2, "second");
        return laVar.a(laVar2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((la) obj, (la) obj2));
    }
}
