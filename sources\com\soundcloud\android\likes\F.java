package com.soundcloud.android.likes;

/* compiled from: TrackLikeOperations.kt */
final class F<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C4001z a;
    final /* synthetic */ long b;

    F(C4001z zVar, long j) {
        this.a = zVar;
        this.b = j;
    }

    /* renamed from: a */
    public final APa<T> apply(Integer num) {
        C7471uYa.b(num, "initialLikedTrackCount");
        return this.a.b.b(this.b, 30).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new E<Object,Object>(this, num));
    }
}
