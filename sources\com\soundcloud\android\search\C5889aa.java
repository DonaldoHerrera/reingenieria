package com.soundcloud.android.search;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* renamed from: com.soundcloud.android.search.aa reason: case insensitive filesystem */
/* compiled from: SearchResultsPresenter.kt */
final class C5889aa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C5903ha a;

    C5889aa(C5903ha haVar) {
        this.a = haVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(Ea ea) {
        C7471uYa.b(ea, "it");
        Db h = this.a.h();
        List a2 = ea.a();
        int b = ea.b();
        PlaySessionSource playSessionSource = new PlaySessionSource(ea.d().b());
        playSessionSource.a(ea.c());
        return h.b(a2, b, playSessionSource);
    }
}
