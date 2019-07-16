package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;

/* compiled from: UserLikesPresenter.kt */
public final class Kb {
    private final Lc a;
    private final C3700b b;
    private final Db c;
    private final Ica d;
    private final HPa e;

    public Kb(Lc lc, C3700b bVar, Db db, Ica ica, HPa hPa) {
        C7471uYa.b(lc, "userProfileOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.a = lc;
        this.b = bVar;
        this.c = db;
        this.d = ica;
        this.e = hPa;
    }

    private final Yca a(C3508cda cda) {
        Object b2 = this.d.a(cda).b();
        C7471uYa.a(b2, "sessionProvider.isLoggedInUser(user).blockingGet()");
        return ((Boolean) b2).booleanValue() ? Yca.YOUR_LIKES : Yca.USERS_LIKES;
    }

    public final Jb a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "user");
        Jb jb = new Jb(a(cda), this.b, this.c, searchQuerySourceInfo, cda, this.a, this.e);
        return jb;
    }
}
