package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.playqueue.m;

/* renamed from: com.soundcloud.android.profile.pb reason: case insensitive filesystem */
/* compiled from: UserDetailsPresenter.kt */
final class C5832pb<T> implements C6776kQa<String> {
    final /* synthetic */ C5841rb a;

    C5832pb(C5841rb rbVar) {
        this.a = rbVar;
    }

    /* renamed from: a */
    public final void accept(String str) {
        C4655rja f = this.a.f();
        C4621nja a2 = C4621nja.a(str, C4928GKa.a(), this.a.g().b(), C4928GKa.c(m.RECOMMENDATIONS));
        C7471uYa.a((Object) a2, "NavigationTarget.forNavi…ySource.RECOMMENDATIONS))");
        f.a(a2);
    }
}
