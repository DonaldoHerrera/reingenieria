package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.features.library.playlists.C3635l.c;

/* renamed from: com.soundcloud.android.features.library.playlists.g reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionFragment.kt */
final class C3630g extends C7540vYa implements C6308dYa<C3635l, C3635l, Boolean> {
    public static final C3630g a = new C3630g();

    C3630g() {
        super(2);
    }

    public final boolean a(C3635l lVar, C3635l lVar2) {
        C7471uYa.b(lVar, "item1");
        C7471uYa.b(lVar2, "item2");
        if (!(lVar instanceof c) || !(lVar2 instanceof c)) {
            return C7471uYa.a((Object) lVar, (Object) lVar2);
        }
        return C7471uYa.a((Object) lVar.a(), (Object) lVar2.a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((C3635l) obj, (C3635l) obj2));
    }
}
