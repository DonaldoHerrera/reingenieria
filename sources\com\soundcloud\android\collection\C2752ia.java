package com.soundcloud.android.collection;

import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4536zc;

/* renamed from: com.soundcloud.android.collection.ia reason: case insensitive filesystem */
/* compiled from: CollectionPresenter.kt */
final /* synthetic */ class C2752ia extends C7402tYa implements _Xa<C4536zc, RVa> {
    C2752ia(C4425ta taVar) {
        super(1, taVar);
    }

    public final void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "p1");
        ((C4425ta) this.c).a(zcVar);
    }

    public final String getName() {
        return "call";
    }

    public final C7610wZa h() {
        return HYa.a(C4425ta.class);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C4536zc) obj);
        return RVa.a;
    }

    public final String j() {
        return "call(Lcom/soundcloud/android/playback/PlaybackResult;)V";
    }
}
