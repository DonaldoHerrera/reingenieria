package com.soundcloud.android.collection;

/* renamed from: com.soundcloud.android.collection.z reason: case insensitive filesystem */
/* compiled from: CollectionFragment.kt */
final class C2844z extends C7540vYa implements C6308dYa<B, B, Boolean> {
    public static final C2844z a = new C2844z();

    C2844z() {
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
