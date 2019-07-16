package com.soundcloud.android.fcm;

import com.soundcloud.android.fcm.y.p;

/* compiled from: RemoteFeaturesRefreshListener.kt */
final class B<T> implements C6776kQa<IVa<? extends RVa>> {
    final /* synthetic */ z a;

    B(z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final void accept(IVa<? extends RVa> iVa) {
        if (IVa.d(iVa.a())) {
            C5052KJa b = this.a.b;
            Fca fca = new Fca(p.feedback_refreshing_remote_features_succeeded, 2, p.feedback_refreshing_action_restart, new A(this), null, null, 48, null);
            b.a(fca);
            return;
        }
        C5052KJa b2 = this.a.b;
        Fca fca2 = new Fca(p.feedback_refreshing_remote_features_failed, 0, 0, null, null, null, 60, null);
        b2.a(fca2);
    }
}
