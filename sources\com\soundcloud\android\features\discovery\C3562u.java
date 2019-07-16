package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.PromotedSourceInfo;

/* renamed from: com.soundcloud.android.features.discovery.u reason: case insensitive filesystem */
/* compiled from: DiscoveryPresenter.kt */
final class C3562u<T, R> implements C7118pQa<T, R> {
    public static final C3562u a = new C3562u();

    C3562u() {
    }

    /* renamed from: a */
    public final PromotedSourceInfo apply(c cVar) {
        C7471uYa.b(cVar, "it");
        return PromotedSourceInfo.a.a(cVar.g(), cVar.e());
    }
}
