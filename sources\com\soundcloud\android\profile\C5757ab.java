package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.profile.Lc.a;

/* renamed from: com.soundcloud.android.profile.ab reason: case insensitive filesystem */
/* compiled from: UserAlbumsPresenter.kt */
public final class C5757ab extends C5867wc {
    private final Lc q;
    private final C3508cda r;
    private final HPa s;

    public C5757ab(Lc lc, C3700b bVar, Db db, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo, HPa hPa) {
        C7471uYa.b(lc, "userProfileOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(cda, "user");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(bVar, db, cda, searchQuerySourceInfo, Yca.USERS_ALBUMS, hPa);
        this.q = lc;
        this.r = cda;
        this.s = hPa;
    }

    public APa<C2189NP<a>> a(String str) {
        C7471uYa.b(str, "nextPageUrl");
        APa<C2189NP<a>> h = this.q.c(str).h(_a.a);
        C7471uYa.a((Object) h, "userProfileOperations.us…le(playlistItem = it) } }");
        return h;
    }

    public APa<C2189NP<a>> f() {
        APa<C2189NP<a>> h = this.q.c(this.r).h(Ya.a);
        C7471uYa.a((Object) h, "userProfileOperations.us…le(playlistItem = it) } }");
        return h;
    }
}
