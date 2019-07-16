package com.soundcloud.android.playback.playqueue;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.playqueue.r;

@SuppressLint({"sc.MissingCompositeDisposableRecycle"})
/* renamed from: com.soundcloud.android.playback.playqueue.ca reason: case insensitive filesystem */
/* compiled from: ArtworkPresenter.kt */
public final class C4364ca {
    private final UPa a = new UPa();
    /* access modifiers changed from: private */
    public ArtworkView b;
    /* access modifiers changed from: private */
    public final C5327TLa c;
    private final r d;
    /* access modifiers changed from: private */
    public final C3760eea e;
    /* access modifiers changed from: private */
    public final Ona f;
    private final HPa g;

    public C4364ca(C5327TLa tLa, r rVar, C3760eea eea, Ona ona, HPa hPa) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(ona, "trackPageStateEmitter");
        C7471uYa.b(hPa, "mainThread");
        this.c = tLa;
        this.d = rVar;
        this.e = eea;
        this.f = ona;
        this.g = hPa;
    }

    private final void b() {
        this.a.b(this.d.a().a((C7256rQa<? super T>) O.a).h(P.a).d().f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new Q<Object,Object>(this)).a(this.g).a((C7256rQa<? super T>) new S<Object>(this)).d((C6776kQa<? super T>) new T<Object>(this)).k(new Z(this)).a(this.g).a((C7256rQa<? super T>) new C4360aa<Object>(this)).f((C6776kQa<? super T>) new C4362ba<Object>(this)));
    }

    public final void a(ArtworkView artworkView) {
        C7471uYa.b(artworkView, "artworkView");
        this.b = artworkView;
        b();
    }

    public final void a() {
        this.b = null;
        this.a.b();
    }

    public final void a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            ArtworkView artworkView = this.b;
            if (artworkView != null) {
                artworkView.a(0, Math.min(0, -(i2 - i)));
            }
        }
    }
}
