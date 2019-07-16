package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import java.util.List;

/* compiled from: TrackLikeOperations.kt */
final class E<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ F a;
    final /* synthetic */ Integer b;

    E(F f, Integer num) {
        this.a = f;
        this.b = num;
    }

    /* renamed from: a */
    public final APa<T> apply(List<C2862s> list) {
        C7471uYa.b(list, "initialPageLikes");
        Integer num = this.b;
        C7471uYa.a((Object) num, "initialLikedTrackCount");
        APa c = APa.c(new T(list, num.intValue()));
        F f = this.a;
        return APa.a((EPa<? extends T>) c, (EPa<? extends T>) f.a.a(f.b, list));
    }
}
