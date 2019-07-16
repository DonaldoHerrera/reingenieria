package com.soundcloud.android.settings.privacy;

import com.soundcloud.android.ia.p;

/* compiled from: AnalyticsSettingsPresenter.kt */
final class t<T> implements C6776kQa<RVa> {
    final /* synthetic */ w a;

    t(w wVar) {
        this.a = wVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C4655rja b = this.a.b;
        C4621nja e = C4621nja.e(this.a.c.getString(p.url_privacy));
        C7471uYa.a((Object) e, "NavigationTarget.forWebV…ng(R.string.url_privacy))");
        b.a(e);
    }
}
