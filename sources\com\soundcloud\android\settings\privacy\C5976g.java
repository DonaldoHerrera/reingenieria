package com.soundcloud.android.settings.privacy;

import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.settings.privacy.g reason: case insensitive filesystem */
/* compiled from: AdvertisingSettingsPresenter.kt */
final class C5976g<T> implements C6776kQa<RVa> {
    final /* synthetic */ C5979j a;

    C5976g(C5979j jVar) {
        this.a = jVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C4655rja b = this.a.b;
        C4621nja e = C4621nja.e(this.a.c.getString(p.url_privacy));
        C7471uYa.a((Object) e, "NavigationTarget.forWebV…ng(R.string.url_privacy))");
        b.a(e);
    }
}
