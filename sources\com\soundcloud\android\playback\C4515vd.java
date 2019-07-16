package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.vd reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4515vd<T> implements C6776kQa<C3508cda> {
    final /* synthetic */ C4323id a;

    C4515vd(C4323id idVar) {
        this.a = idVar;
    }

    /* renamed from: a */
    public final void accept(C3508cda cda) {
        C4323id idVar = this.a;
        C3760eea g = idVar.g;
        C7471uYa.a((Object) cda, "urn");
        VPa c = Nda.a(g.a(cda, a.SYNC_MISSING)).a((C7256rQa<? super T>) new C4353od<Object>(this)).a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C4428td<Object,Object>(this)).c((C6776kQa<? super T>) new C4433ud<Object>(this));
        C7471uYa.a((Object) c, "trackRepository.track(ur…be { performPreload(it) }");
        idVar.c = c;
    }
}
