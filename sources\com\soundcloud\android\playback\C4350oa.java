package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.oa reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionStateProvider.kt */
public class C4350oa implements C4416rb {
    private final C6713jVa<C3508cda> a;
    private C4431ub b;
    private final C6713jVa<C4513vb> c;
    private final C6713jVa<C4519wc> d;
    private final C4421sb e;
    private final C4526xc f;
    /* access modifiers changed from: private */
    public final C5327TLa g;

    public C4350oa(C4421sb sbVar, C4526xc xcVar, C5327TLa tLa) {
        C7471uYa.b(sbVar, "playSessionStateStorage");
        C7471uYa.b(xcVar, "playbackProgressRepository");
        C7471uYa.b(tLa, "eventBus");
        this.e = sbVar;
        this.f = xcVar;
        this.g = tLa;
        C6713jVa<C3508cda> f2 = C6713jVa.f(C3508cda.a);
        C7471uYa.a((Object) f2, "BehaviorSubject.createDefault(Urn.NOT_SET)");
        this.a = f2;
        C6713jVa<C4513vb> s = C6713jVa.s();
        String str = "BehaviorSubject.create()";
        C7471uYa.a((Object) s, str);
        this.c = s;
        C6713jVa<C4519wc> s2 = C6713jVa.s();
        C7471uYa.a((Object) s2, str);
        this.d = s2;
        this.c.a((C6572hQa<? super T, ? super T>) new C4340ma<Object,Object>(new C4320ia(this))).f((C6776kQa<? super T>) new C4345na<Object>(new C4325ja(this)));
        this.d.d().f((C6776kQa<? super T>) new C4345na<Object>(new C4330ka(this)));
    }

    /* access modifiers changed from: private */
    public void b(C4513vb vbVar) {
        boolean z = !e(vbVar.s());
        if (z) {
            this.e.a(vbVar.s());
            this.a.a(vbVar.s());
        }
        C4519wc wcVar = new C4519wc(vbVar.getPosition(), vbVar.getDuration(), vbVar.s());
        b(wcVar);
        this.b = vbVar;
        if (z || vbVar.k()) {
            if (vbVar.s().x()) {
                this.e.a(vbVar.getPosition(), vbVar.getDuration());
            } else {
                this.e.b();
            }
        }
        C5327TLa tLa = this.g;
        C5443XLa<C4431ub> xLa = C3876taa.b;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
        tLa.c(xLa, vbVar);
    }

    private C4519wc d(C3508cda cda) {
        return (C4519wc) this.f.a(cda).d();
    }

    private boolean e(C3508cda cda) {
        return C7471uYa.a((Object) this.e.d(), (Object) cda);
    }

    public C4519wc c(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C4519wc d2 = d(cda);
        if (d2 != null || !e(cda)) {
            if (d2 == null) {
                d2 = C4519wc.a();
                C7471uYa.a((Object) d2, "PlaybackProgress.empty()");
            }
            return d2;
        }
        C4519wc wcVar = new C4519wc(this.e.f(), this.e.e(), cda);
        return wcVar;
    }

    public boolean isPlaying() {
        C4431ub ubVar = this.b;
        if (ubVar != null) {
            return ubVar.p();
        }
        return false;
    }

    public void a(C4513vb vbVar) {
        C7471uYa.b(vbVar, "stateCompat");
        this.c.a(vbVar);
        C6713jVa<C4519wc> jva = this.d;
        C4519wc wcVar = new C4519wc(vbVar.getPosition(), vbVar.getDuration(), vbVar.s());
        jva.a(wcVar);
    }

    /* access modifiers changed from: private */
    public boolean a(C4513vb vbVar, C4513vb vbVar2) {
        return C7471uYa.a((Object) vbVar.s(), (Object) vbVar2.s()) && vbVar.c().getState() == vbVar2.c().getState();
    }

    /* access modifiers changed from: private */
    public void a(C4519wc wcVar) {
        b(wcVar);
        C5327TLa tLa = this.g;
        C5443XLa<C4519wc> xLa = C3876taa.c;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_PROGRESS");
        tLa.c(xLa, wcVar);
    }

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C4928GKa a2 = this.f.a(cda);
        this.f.b(cda);
        if (b(cda) || e(cda)) {
            this.e.b();
        }
        a2.a((C7733yKa<? super T>) new C4335la<Object>(this, cda));
    }

    private void b(C4519wc wcVar) {
        this.f.a(wcVar.e(), wcVar);
    }

    public APa<C3508cda> a() {
        APa<C3508cda> d2 = this.a.d();
        C7471uYa.a((Object) d2, "nowPlayingUrn.distinctUntilChanged()");
        return d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 != null) goto L_0x0015;
     */
    public boolean b(C3508cda cda) {
        Object obj;
        C7471uYa.b(cda, "urn");
        C4431ub ubVar = this.b;
        if (ubVar != null) {
            obj = ubVar.s();
        }
        obj = Boolean.valueOf(false);
        return C7471uYa.a((Object) cda, obj);
    }

    public C4519wc b() {
        C4431ub ubVar = this.b;
        if (ubVar != null) {
            C3508cda s = ubVar.s();
            if (s != null) {
                C4519wc c2 = c(s);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        C4519wc a2 = C4519wc.a();
        C7471uYa.a((Object) a2, "PlaybackProgress.empty()");
        return a2;
    }
}
