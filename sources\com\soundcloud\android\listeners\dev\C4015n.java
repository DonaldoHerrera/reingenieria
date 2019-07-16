package com.soundcloud.android.listeners.dev;

/* renamed from: com.soundcloud.android.listeners.dev.n reason: case insensitive filesystem */
/* compiled from: DevDrawerFragment.kt */
final class C4015n extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    C4015n(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        C4655rja Xb = this.a.Xb();
        C4621nja a2 = C4621nja.a(C3920yea.OFFLINE);
        C7471uYa.a((Object) a2, "NavigationTarget.forUpgrade(UpsellContext.OFFLINE)");
        Xb.a(a2);
    }
}
