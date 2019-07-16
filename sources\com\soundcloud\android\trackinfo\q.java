package com.soundcloud.android.trackinfo;

/* compiled from: NewTrackInfoPresenter.kt */
public final class q extends C7658xEa<B, y, z, z, A> {
    private final HPa l;
    private final C3501bea m;
    private final u n;
    private final Ica o;

    public q(HPa hPa, C3501bea bea, u uVar, Ica ica) {
        C7471uYa.b(hPa, "mainScheduler");
        C7471uYa.b(bea, "fullTrackRepository");
        C7471uYa.b(uVar, "newTrackStatsMapper");
        C7471uYa.b(ica, "sessionProvider");
        super(hPa);
        this.l = hPa;
        this.m = bea;
        this.n = uVar;
        this.o = ica;
    }

    /* renamed from: b */
    public APa<d<y, B>> e(z zVar) {
        C7471uYa.b(zVar, "pageParams");
        return d(zVar);
    }

    /* renamed from: a */
    public APa<d<y, B>> d(z zVar) {
        C7471uYa.b(zVar, "pageParams");
        APa<d<y, B>> a = APa.a((EPa<? extends T1>) this.o.c().g(), (EPa<? extends T2>) this.m.a(zVar.a()), (C6504gQa<? super T1, ? super T2, ? extends R>) new p<Object,Object,Object>(this));
        C7471uYa.a((Object) a, "Observable.combineLatest…)\n            }\n        )");
        return a;
    }

    /* access modifiers changed from: private */
    public final d<y, B> a(Pda<C3493aea> pda, C3508cda cda) {
        if (pda instanceof a) {
            return a((C3493aea) ((a) pda).a(), cda);
        }
        if (pda instanceof b) {
            return a((C3493aea) ((b) pda).a(), cda);
        }
        if (!(pda instanceof c)) {
            throw new FVa();
        } else if (((c) pda).a() instanceof Oda) {
            return new a(y.SERVER_ERROR);
        } else {
            return new a(y.NETWORK_ERROR);
        }
    }

    private final b<y, B> a(C3493aea aea, C3508cda cda) {
        C3493aea aea2 = aea;
        B b = new B(0, aea2, this.n.a(D.PLAYS_COUNT, cda, aea), this.n.a(D.LIKES_COUNT, cda, aea), this.n.a(D.COMMENTS_COUNT, cda, aea), this.n.a(D.REPOSTS_COUNT, cda, aea), 1, null);
        return new b<>(b, null, 2, null);
    }
}
