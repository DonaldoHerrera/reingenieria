package com.soundcloud.android.playback.ui;

import com.google.common.base.Function;
import com.soundcloud.android.playback.Ba;
import com.soundcloud.android.playback.C4420sa;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: PlayerTrackState */
public class Pb extends C4510zb implements Vca {
    static final Pb b = new Pb(false, false);
    private final boolean c;
    private final boolean d;
    private final C4519wc e;
    private final C4431ub f;
    private C4928GKa<Sda> g = C4928GKa.a();

    Pb(C6185ma maVar, boolean z, boolean z2, C4519wc wcVar, C4431ub ubVar) {
        super(maVar);
        this.c = z;
        this.d = z2;
        this.e = wcVar;
        this.f = ubVar;
    }

    public void a(Sda sda) {
        this.g = C4928GKa.c(sda);
    }

    public C4928GKa<String> b() {
        return this.a.c() ? ((C6185ma) this.a.b()).b() : C4928GKa.a();
    }

    /* access modifiers changed from: 0000 */
    public long g() {
        return ((Long) this.a.b((Function<? super T, V>) r.a).d(Long.valueOf(0))).longValue();
    }

    public String getTitle() {
        return (String) this.a.b((Function<? super T, V>) C4476o.a).d("");
    }

    public C4519wc h() {
        return this.e;
    }

    public C4431ub i() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public int j() {
        return ((Integer) this.a.b((Function<? super T, V>) C4434a.a).d(Integer.valueOf(0))).intValue();
    }

    /* access modifiers changed from: 0000 */
    public long k() {
        if (this.a.c()) {
            return C4420sa.a((C6185ma) this.a.b());
        }
        return 0;
    }

    public C4928GKa<C6185ma> l() {
        return this.a;
    }

    public C4928GKa<Sda> m() {
        return this.g;
    }

    public String n() {
        return (String) this.a.b((Function<? super T, V>) C4491ta.a).d("");
    }

    public C3508cda o() {
        return (C3508cda) this.a.b((Function<? super T, V>) C4488sa.a).d(C3508cda.a);
    }

    /* access modifiers changed from: 0000 */
    public String p() {
        return (String) this.a.b((Function<? super T, V>) C4494ua.a).d("");
    }

    public boolean q() {
        return ((Boolean) this.a.b((Function<? super T, V>) C4482q.a).d(Boolean.valueOf(false))).booleanValue();
    }

    public boolean r() {
        return ((Boolean) this.a.b((Function<? super T, V>) C4506ya.a).d(Boolean.valueOf(false))).booleanValue();
    }

    public boolean s() {
        return this.c;
    }

    public boolean t() {
        return !this.a.c();
    }

    public boolean u() {
        return this.d;
    }

    public boolean v() {
        return ((Boolean) this.a.b((Function<? super T, V>) C4437b.a).d(Boolean.valueOf(false))).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public boolean w() {
        return ((Boolean) this.a.b((Function<? super T, V>) C4461j.a).d(Boolean.valueOf(false))).booleanValue();
    }

    public C3508cda a() {
        return super.f();
    }

    Pb(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = C4519wc.a();
        this.f = Ba.a;
    }
}
