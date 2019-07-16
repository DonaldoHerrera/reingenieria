package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: TrackLikeOperations.kt */
final class B extends C7540vYa implements C6308dYa<C6185ma, C2862s, C3987k> {
    public static final B a = new B();

    B() {
        super(2);
    }

    /* renamed from: a */
    public final C3987k invoke(C6185ma maVar, C2862s sVar) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(sVar, "like");
        return C3987k.a(sVar, maVar);
    }
}
