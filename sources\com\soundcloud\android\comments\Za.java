package com.soundcloud.android.comments;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: PlayerCommentsPresenter.kt */
public final class Za extends Z {
    private final C5606ava u;

    public Za(C5327TLa tLa, C3700b bVar, mb mbVar, W w, Ea ea, C5606ava ava, HPa hPa, HPa hPa2) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(mbVar, "trackCommentRepository");
        C7471uYa.b(w, "commentsPageMapper");
        C7471uYa.b(ea, "commentsVisibilityProvider");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        super(tLa, bVar, mbVar, w, ea, ava, hPa, hPa2);
        this.u = ava;
    }

    public void a(Da da) {
        C7471uYa.b(da, "view");
        super.a(da);
        C5327TLa f = f();
        C5443XLa<Haa> xLa = C3876taa.f;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYER_COMMAND");
        f.c(xLa, Haa.t());
    }

    public void a(Da da, C2892j jVar) {
        C7471uYa.b(da, "view");
        C7471uYa.b(jVar, "commentAvatarParams");
        C4621nja k = C4621nja.k();
        C7471uYa.a((Object) k, "NavigationTarget.forCommentsClose()");
        da.a(k);
        C5327TLa f = f();
        C5443XLa<Iaa> xLa = C3876taa.d;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYER_UI");
        f.a(xLa).a(Iaa.a).f().c((C6776kQa<? super T>) new Ya<Object>(da, jVar));
        C5327TLa f2 = f();
        C5443XLa<Haa> xLa2 = C3876taa.f;
        C7471uYa.a((Object) xLa2, "EventQueue.PLAYER_COMMAND");
        f2.c(xLa2, Haa.a());
    }

    public void a() {
        super.a();
        C5327TLa f = f();
        C5443XLa<Haa> xLa = C3876taa.f;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYER_COMMAND");
        f.c(xLa, Haa.w());
    }
}
