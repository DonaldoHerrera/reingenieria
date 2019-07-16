package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.r;
import com.soundcloud.android.ia.p;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.ja reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedPresenter.kt */
final class C2818ja<T> implements C6776kQa<T> {
    final /* synthetic */ C2816ia a;

    C2818ja(C2816ia iaVar) {
        this.a = iaVar;
    }

    /* renamed from: a */
    public final void accept(RVa rVa) {
        this.a.l.a().c(new r(p.collections_recently_played_clear_error_message, this.a.m, this.a.r));
    }
}
