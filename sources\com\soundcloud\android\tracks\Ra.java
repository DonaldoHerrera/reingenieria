package com.soundcloud.android.tracks;

import com.soundcloud.android.tracks.Pa.a;
import java.util.List;
import java.util.Set;

/* compiled from: TrackPolicyStorage.kt */
final class Ra<T, R> implements C7118pQa<T, R> {
    public static final Ra a = new Ra();

    Ra() {
    }

    /* renamed from: a */
    public final Set<C3508cda> apply(C5631bLa bla) {
        C7471uYa.b(bla, "queryResult");
        List b = bla.b(new a());
        C7471uYa.a((Object) b, "queryResult.toList(PolicyTrackUrnMapper())");
        return C7676xWa.t(b);
    }
}
