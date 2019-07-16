package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.la;

/* renamed from: com.soundcloud.android.features.library.likes.f reason: case insensitive filesystem */
/* compiled from: TrackLikesFragment.kt */
final class C3592f extends C7540vYa implements C6308dYa<la, la, Boolean> {
    public static final C3592f a = new C3592f();

    C3592f() {
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
