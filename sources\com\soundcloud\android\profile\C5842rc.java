package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.f;

/* renamed from: com.soundcloud.android.profile.rc reason: case insensitive filesystem */
/* compiled from: UserPlayablePresenter.kt */
final class C5842rc<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5867wc a;

    C5842rc(C5867wc wcVar) {
        this.a = wcVar;
    }

    /* renamed from: a */
    public final C4621nja apply(C5882zc zcVar) {
        C7471uYa.b(zcVar, "it");
        C3508cda a2 = zcVar.a();
        Yca c = this.a.p;
        C4928GKa b = C4928GKa.b(this.a.o);
        C4928GKa a3 = C4928GKa.a();
        f fVar = K.a;
        C3508cda a4 = zcVar.a();
        C3710l lVar = r7;
        C3710l lVar2 = new C3710l(null, this.a.p.a(), null, false, null, null, null, null, null, null, null, null, null, null, 16381, null);
        return C4621nja.a(a2, c, b, a3, C4928GKa.c(fVar.e(a4, lVar)));
    }
}
