package com.soundcloud.android.trackinfo;

/* renamed from: com.soundcloud.android.trackinfo.c reason: case insensitive filesystem */
/* compiled from: NewTrackInfoCollectionRenderer.kt */
final class C6145c extends C7540vYa implements C6308dYa<B, B, Boolean> {
    public static final C6145c a = new C6145c();

    C6145c() {
        super(2);
    }

    public final boolean a(B b, B b2) {
        C7471uYa.b(b, "firstItem");
        C7471uYa.b(b2, "secondItem");
        return b.c() == b2.c();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((B) obj, (B) obj2));
    }
}
