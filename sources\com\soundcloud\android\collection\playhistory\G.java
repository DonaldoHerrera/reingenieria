package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.recentlyplayed.C2817j;
import com.soundcloud.android.collection.recentlyplayed.Ga;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.C4431ub;

/* compiled from: PlayHistoryController.kt */
public final class G {
    /* access modifiers changed from: private */
    public final C5327TLa a;
    /* access modifiers changed from: private */
    public final va b;
    private final Ga c;
    private final Fa d;
    private final C2817j e;
    private final r f;
    private final HPa g;

    public G(C5327TLa tLa, va vaVar, Ga ga, Fa fa, C2817j jVar, r rVar, HPa hPa) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(vaVar, "playHistoryStorage");
        C7471uYa.b(ga, "recentlyPlayedStorage");
        C7471uYa.b(fa, "pushPlayHistoryCommand");
        C7471uYa.b(jVar, "pushRecentlyPlayedCommand");
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(hPa, "scheduler");
        this.a = tLa;
        this.b = vaVar;
        this.c = ga;
        this.d = fa;
        this.e = jVar;
        this.f = rVar;
        this.g = hPa;
    }

    public final void a() {
        C2350WH a2 = this.f.a();
        C5327TLa tLa = this.a;
        C5443XLa<C4431ub> xLa = C3876taa.b;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
        APa.a((EPa<? extends T1>) a2, (EPa<? extends T2>) tLa.a(xLa), (C6504gQa<? super T1, ? super T2, ? extends R>) A.a).a(this.g).a((C7256rQa<? super T>) new C2797z<Object>(new B(this))).h(C.a).d((C6776kQa<? super T>) new D<Object>(this)).d((C6776kQa<? super T>) new C2796y<Object>(new E(this))).d((C6776kQa<? super T>) new F<Object>(this)).d(this.d.b()).d(this.e.b()).a((GPa<? super T>) new C5037Jua<Object>());
    }

    /* access modifiers changed from: private */
    public final boolean a(Eaa eaa) {
        q b2 = eaa.a().b();
        C4431ub b3 = eaa.b();
        return b3.j() && (C7471uYa.a((Object) q.a, (Object) b2) ^ true) && C7471uYa.a((Object) b2.c(), (Object) b3.s()) && !b2.e();
    }

    /* access modifiers changed from: private */
    public final void a(ua uaVar) {
        if (uaVar.c() != 0) {
            this.c.a(uaVar);
        }
    }
}
