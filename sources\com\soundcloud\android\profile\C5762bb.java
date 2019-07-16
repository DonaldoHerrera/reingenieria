package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;

/* renamed from: com.soundcloud.android.profile.bb reason: case insensitive filesystem */
/* compiled from: UserAlbumsPresenter.kt */
public final class C5762bb {
    private final Lc a;
    private final Ica b;
    private final C3700b c;
    private final Db d;
    private final HPa e;

    public C5762bb(Lc lc, Ica ica, C3700b bVar, Db db, HPa hPa) {
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

    public final C5757ab a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "user");
        C5757ab abVar = new C5757ab(this.a, this.c, this.d, cda, searchQuerySourceInfo, this.e);
        return abVar;
    }
}
