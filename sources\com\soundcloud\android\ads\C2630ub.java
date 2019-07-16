package com.soundcloud.android.ads;

/* renamed from: com.soundcloud.android.ads.ub reason: case insensitive filesystem */
/* compiled from: CompanionAdLoadedStateProvider.kt */
public class C2630ub {
    private final C2332VH<C3508cda> a;

    public C2630ub() {
        C2332VH<C3508cda> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create()");
        this.a = s;
    }

    public APa<C3508cda> a() {
        APa<C3508cda> h = this.a.h();
        C7471uYa.a((Object) h, "loadedSubject.hide()");
        return h;
    }

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        this.a.accept(cda);
    }
}
