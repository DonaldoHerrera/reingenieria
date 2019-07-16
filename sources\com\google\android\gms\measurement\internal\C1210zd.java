package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.Hc;

/* renamed from: com.google.android.gms.measurement.internal.zd reason: case insensitive filesystem */
public final class C1210zd extends C1095cc {
    private Handler c;
    @VisibleForTesting
    private long d = c().elapsedRealtime();
    @VisibleForTesting
    private long e = this.d;
    private final C1087b f = new Cd(this, this.a);
    private final C1087b g = new Bd(this, this.a);

    C1210zd(Mb mb) {
        super(mb);
    }

    private final void D() {
        synchronized (this) {
            if (this.c == null) {
                this.c = new Hc(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void E() {
        i();
        a(false, false);
        n().a(c().elapsedRealtime());
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        i();
        D();
        if (f().e(p().B(), C1127j.ja)) {
            b().z.a(false);
        }
        e().A().a("Activity resumed, time", Long.valueOf(j));
        this.d = j;
        this.e = this.d;
        if (this.a.b()) {
            if (f().p(p().B())) {
                a(c().currentTimeMillis(), false);
                return;
            }
            this.f.a();
            this.g.a();
            if (b().a(c().currentTimeMillis())) {
                b().s.a(true);
                b().x.a(0);
            }
            if (b().s.a()) {
                this.f.a(Math.max(0, b().q.a() - b().x.a()));
            } else {
                this.g.a(Math.max(0, 3600000 - b().x.a()));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        i();
        D();
        if (f().e(p().B(), C1127j.ja)) {
            b().z.a(true);
        }
        this.f.a();
        this.g.a();
        e().A().a("Activity paused, time", Long.valueOf(j));
        if (this.d != 0) {
            b().x.a(b().x.a() + (j - this.d));
        }
    }

    private final void c(long j) {
        i();
        e().A().a("Session started, time", Long.valueOf(c().elapsedRealtime()));
        Long valueOf = f().n(p().B()) ? Long.valueOf(j / 1000) : null;
        o().a("auto", "_sid", (Object) valueOf, j);
        b().s.a(false);
        Bundle bundle = new Bundle();
        if (f().n(p().B())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        o().a("auto", "_s", j, bundle);
        b().w.a(j);
    }

    /* access modifiers changed from: 0000 */
    public final void A() {
        i();
        this.f.a();
        this.g.a();
        this.d = 0;
        this.e = this.d;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public final void B() {
        i();
        c(c().currentTimeMillis());
    }

    /* access modifiers changed from: 0000 */
    @VisibleForTesting
    public final long C() {
        long elapsedRealtime = c().elapsedRealtime();
        long j = elapsedRealtime - this.e;
        this.e = elapsedRealtime;
        return j;
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C1082a n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C1174sc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ C1084ab p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ Tc r() {
        return super.r();
    }

    /* access modifiers changed from: protected */
    public final boolean y() {
        return false;
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j, boolean z) {
        i();
        D();
        this.f.a();
        this.g.a();
        if (b().a(j)) {
            b().s.a(true);
            b().x.a(0);
        }
        if (z && f().q(p().B())) {
            b().w.a(j);
        }
        if (b().s.a()) {
            c(j);
        } else {
            this.g.a(Math.max(0, 3600000 - b().x.a()));
        }
    }

    public final boolean a(boolean z, boolean z2) {
        i();
        w();
        long elapsedRealtime = c().elapsedRealtime();
        b().w.a(c().currentTimeMillis());
        long j = elapsedRealtime - this.d;
        if (z || j >= 1000) {
            b().x.a(j);
            e().A().a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            Tc.a(r().A(), bundle, true);
            if (f().r(p().B())) {
                if (f().e(p().B(), C1127j.oa)) {
                    if (!z2) {
                        C();
                    }
                } else if (z2) {
                    bundle.putLong("_fr", 1);
                } else {
                    C();
                }
            }
            if (!f().e(p().B(), C1127j.oa) || !z2) {
                o().b("auto", "_e", bundle);
            }
            this.d = elapsedRealtime;
            this.g.a();
            this.g.a(Math.max(0, 3600000 - b().x.a()));
            return true;
        }
        e().A().a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
