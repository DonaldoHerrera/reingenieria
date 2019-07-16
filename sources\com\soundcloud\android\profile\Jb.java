package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.profile.Lc.a;

/* compiled from: UserLikesPresenter.kt */
public final class Jb extends C5867wc {
    private final C3508cda q;
    private final Lc r;
    private final HPa s;

    public Jb(Yca yca, C3700b bVar, Db db, SearchQuerySourceInfo searchQuerySourceInfo, C3508cda cda, Lc lc, HPa hPa) {
        C7471uYa.b(yca, "screen");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(cda, "user");
        C7471uYa.b(lc, "userProfileOperations");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(bVar, db, cda, searchQuerySourceInfo, yca, hPa);
        this.q = cda;
        this.r = lc;
        this.s = hPa;
    }

    public APa<C2189NP<a>> a(String str) {
        C7471uYa.b(str, "nextPageUrl");
        return this.r.d(str);
    }

    public APa<C2189NP<a>> f() {
        return this.r.d(this.q);
    }
}
