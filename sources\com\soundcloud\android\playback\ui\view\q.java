package com.soundcloud.android.playback.ui.view;

/* compiled from: VisualPlayerCommentsPresenter.kt */
final class q<T1, T2, R> implements C6504gQa<Ul<? extends C3799jda>, Ul<? extends a>, Ul<? extends C3799jda>> {
    final /* synthetic */ n a;

    q(n nVar) {
        this.a = nVar;
    }

    /* renamed from: a */
    public final Ul<C3799jda> apply(Ul<C3799jda> ul, Ul<a> ul2) {
        C7471uYa.b(ul, "lastComment");
        C7471uYa.b(ul2, "newState");
        if (ul2 instanceof Wl) {
            Wl wl = (Wl) ul2;
            if (((a) wl.a()).b().b().a()) {
                return this.a.a((a) wl.a(), ul);
            }
        }
        return Tl.b;
    }
}
