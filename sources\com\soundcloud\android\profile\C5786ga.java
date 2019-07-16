package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.playback.Db;

/* renamed from: com.soundcloud.android.profile.ga reason: case insensitive filesystem */
/* compiled from: ProfileBucketsPresenter.kt */
public final class C5786ga {
    private final I a;
    private final C5604aua b;
    private final Ica c;
    private final Db d;
    private final HPa e;

    public C5786ga(I i, C5604aua aua, Ica ica, Db db, HPa hPa) {
        C7471uYa.b(i, "profileBucketsDataSource");
        C7471uYa.b(aua, "liveEntities");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.a = i;
        this.b = aua;
        this.c = ica;
        this.d = db;
        this.e = hPa;
    }

    public final C5781fa a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "userUrn");
        C5781fa faVar = new C5781fa(this.a, this.b, this.c, this.d, cda, searchQuerySourceInfo, this.e);
        return faVar;
    }
}
