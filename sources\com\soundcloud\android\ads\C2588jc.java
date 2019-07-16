package com.soundcloud.android.ads;

import com.soundcloud.android.playback.C4519wc;

/* renamed from: com.soundcloud.android.ads.jc reason: case insensitive filesystem */
/* compiled from: PlayerAdsControllerProxy.kt */
final class C2588jc<T, R> implements C7118pQa<T, R> {
    public static final C2588jc a = new C2588jc();

    C2588jc() {
    }

    public final boolean a(C4519wc wcVar) {
        C7471uYa.b(wcVar, "it");
        return wcVar.d() >= C2568ec.b.a();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((C4519wc) obj));
    }
}
