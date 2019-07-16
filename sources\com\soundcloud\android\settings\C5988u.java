package com.soundcloud.android.settings;

import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4165se;

/* renamed from: com.soundcloud.android.settings.u reason: case insensitive filesystem */
/* compiled from: OfflineUsage */
public class C5988u {
    private final double a = 5.36870912E8d;
    private final C4165se b;
    private final C4088fe c;
    private long d;
    private long e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    C5988u(C4165se seVar, C4088fe feVar) {
        this.b = seVar;
        this.c = feVar;
    }

    private double m() {
        return (5.36870912E8d / ((double) this.d)) * 100.0d;
    }

    private long n() {
        return this.e + this.g;
    }

    public long a() {
        return this.h ? n() : this.f;
    }

    public long b() {
        return this.e;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return Math.max(0, h() - this.g);
    }

    public int e() {
        if (!this.h) {
            long j = this.d;
            if (j != 0) {
                return (int) ((this.f * 100) / j);
            }
        }
        return 100;
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return this.e - d();
    }

    public long h() {
        if (this.h) {
            return n();
        }
        return Math.min(this.f, n());
    }

    public long i() {
        return (this.d - this.e) - this.g;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.h;
    }

    public void l() {
        this.d = this.b.e();
        this.e = this.b.d();
        this.f = this.c.e();
        this.g = this.b.f();
        this.h = !this.c.i();
        this.i = this.c.k();
    }

    public boolean a(int i2) {
        double d2 = (double) i2;
        long min = Math.min((long) (((double) ((int) Math.max(Math.ceil(d2 / m()), 1.0d))) * 5.36870912E8d), this.d);
        this.h = d2 >= 100.0d - m();
        long j = this.g;
        if (min < j) {
            this.f = j;
            return false;
        }
        this.f = min;
        return true;
    }
}
