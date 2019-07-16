package com.soundcloud.android.features.library;

import com.soundcloud.android.collection.B;

/* renamed from: com.soundcloud.android.features.library.h reason: case insensitive filesystem */
/* compiled from: LibraryFragment.kt */
final class C3582h extends C7540vYa implements C6308dYa<B, B, Boolean> {
    public static final C3582h a = new C3582h();

    C3582h() {
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
