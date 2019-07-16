package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: com.soundcloud.android.playback.ui.t reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4490t implements C7118pQa {
    private final /* synthetic */ PlayerPagerPresenter a;
    private final /* synthetic */ q b;
    private final /* synthetic */ C4431ub c;

    public /* synthetic */ C4490t(PlayerPagerPresenter playerPagerPresenter, q qVar, C4431ub ubVar) {
        this.a = playerPagerPresenter;
        this.b = qVar;
        this.c = ubVar;
    }

    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, (C6185ma) obj);
    }
}
