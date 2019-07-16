package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a reason: case insensitive filesystem */
public final class C1082a extends Ca {
    private final Map<String, Long> b = new T();
    private final Map<String, Integer> c = new T();
    private long d;

    public C1082a(Mb mb) {
        super(mb);
    }

    /* access modifiers changed from: private */
    public final void c(String str, long j) {
        g();
        i();
        Preconditions.checkNotEmpty(str);
        if (this.c.isEmpty()) {
            this.d = j;
        }
        Integer num = (Integer) this.c.get(str);
        if (num != null) {
            this.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.c.size() >= 100) {
            e().v().a("Too many ads visible");
        } else {
            this.c.put(str, Integer.valueOf(1));
            this.b.put(str, Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    public final void d(String str, long j) {
        g();
        i();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) this.c.get(str);
        if (num != null) {
            Uc A = r().A();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.c.remove(str);
                Long l = (Long) this.b.get(str);
                if (l == null) {
                    e().s().a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    this.b.remove(str);
                    a(str, longValue, A);
                }
                if (this.c.isEmpty()) {
                    long j2 = this.d;
                    if (j2 == 0) {
                        e().s().a("First ad exposure time was never set");
                        return;
                    } else {
                        a(j - j2, A);
                        this.d = 0;
                    }
                }
                return;
            }
            this.c.put(str, Integer.valueOf(intValue));
            return;
        }
        e().s().a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            e().s().a("Ad unit id must be a non-empty string");
        } else {
            d().a((Runnable) new C1088ba(this, str, j));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            e().s().a("Ad unit id must be a non-empty string");
        } else {
            d().a((Runnable) new C1206z(this, str, j));
        }
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
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

    public final /* bridge */ /* synthetic */ C1174sc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Tc r() {
        return super.r();
    }

    private final void a(long j, Uc uc) {
        if (uc == null) {
            e().A().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            e().A().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            Tc.a(uc, bundle, true);
            o().b("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        for (String put : this.b.keySet()) {
            this.b.put(put, Long.valueOf(j));
        }
        if (!this.b.isEmpty()) {
            this.d = j;
        }
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    private final void a(String str, long j, Uc uc) {
        if (uc == null) {
            e().A().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            e().A().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            Tc.a(uc, bundle, true);
            o().b("am", "_xu", bundle);
        }
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final void a(long j) {
        Uc A = r().A();
        for (String str : this.b.keySet()) {
            a(str, j - ((Long) this.b.get(str)).longValue(), A);
        }
        if (!this.b.isEmpty()) {
            a(j - this.d, A);
        }
        b(j);
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
