package com.soundcloud.android.features.discovery;

/* compiled from: DiscoveryPresenter.kt */
final class A<T> implements C6776kQa<c> {
    final /* synthetic */ C3551i a;
    final /* synthetic */ H b;

    A(C3551i iVar, H h) {
        this.a = iVar;
        this.b = h;
    }

    /* renamed from: a */
    public final void accept(c cVar) {
        C3551i iVar = this.a;
        C7471uYa.a((Object) cVar, "it");
        C3508cda a2 = iVar.a(cVar);
        if (a2 != null) {
            H h = this.b;
            C4621nja c = C4621nja.c(a2);
            C7471uYa.a((Object) c, "NavigationTarget.forProfile(it)");
            h.a(c);
        }
    }
}
