package com.soundcloud.android.settings.privacy;

import com.soundcloud.android.ia.p;

/* compiled from: CommunicationsSettingsPresenter.kt */
final class G<T> implements C6776kQa<RVa> {
    final /* synthetic */ J a;

    G(J j) {
        this.a = j;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        C4655rja b = this.a.b;
        C4621nja e = C4621nja.e(this.a.c.getString(p.url_privacy));
        C7471uYa.a((Object) e, "NavigationTarget.forWebV…ng(R.string.url_privacy))");
        b.a(e);
    }
}
