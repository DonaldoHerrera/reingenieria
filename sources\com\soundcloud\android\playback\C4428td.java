package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.td reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
final class C4428td<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ C4515vd a;

    C4428td(C4515vd vdVar) {
        this.a = vdVar;
    }

    /* renamed from: a */
    public final C7531vPa<c> apply(C3509cea cea) {
        C7471uYa.b(cea, "nextTrack");
        _Ua _ua = _Ua.a;
        C5327TLa b = this.a.a.f;
        C5443XLa<C4431ub> xLa = C3876taa.b;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
        C6985nVa a2 = b.a(xLa);
        C5327TLa b2 = this.a.a.f;
        C5443XLa<C6902mGa> xLa2 = C3876taa.l;
        C7471uYa.a((Object) xLa2, "EventQueue.NETWORK_CONNECTION_CHANGED");
        C6985nVa a3 = b2.a(xLa2);
        C5327TLa b3 = this.a.a.f;
        C5443XLa<C4519wc> xLa3 = C3876taa.c;
        C7471uYa.a((Object) xLa3, "EventQueue.PLAYBACK_PROGRESS");
        return APa.a((EPa<? extends T1>) a2, (EPa<? extends T2>) a3, (EPa<? extends T3>) b3.a(xLa3), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new C4358pd<Object,Object,Object,Object>()).a((C7256rQa<? super T>) new C4414qd<Object>(this)).f().a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C4418rd<Object,Object>(this, cea)).f(new C4423sd(cea));
    }
}
