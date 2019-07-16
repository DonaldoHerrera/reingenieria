package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;

/* compiled from: UserPlaylistsPresenter.kt */
public final class Ic {
    private final Lc a;
    private final Ica b;
    private final C3700b c;
    private final Db d;
    private final HPa e;

    public Ic(Lc lc, Ica ica, C3700b bVar, Db db, HPa hPa) {
        C7471uYa.b(lc, "userProfileOperations");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.a = lc;
        this.b = ica;
        this.c = bVar;
        this.d = db;
        this.e = hPa;
    }

    private final Yca a(C3508cda cda) {
        Object b2 = this.b.a(cda).b();
        C7471uYa.a(b2, "sessionProvider.isLoggedInUser(user).blockingGet()");
        return ((Boolean) b2).booleanValue() ? Yca.YOUR_PLAYLISTS : Yca.USERS_PLAYLISTS;
    }

    public final Hc a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "user");
        Hc hc = new Hc(a(cda), this.c, this.d, searchQuerySourceInfo, cda, this.a, this.e);
        return hc;
    }
}
