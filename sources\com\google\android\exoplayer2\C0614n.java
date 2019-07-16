package com.google.android.exoplayer2;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.source.x;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.n reason: case insensitive filesystem */
/* compiled from: BaseRenderer */
public abstract class C0614n implements O, P {
    private final int a;
    private Q b;
    private int c;
    private int d;
    private x e;
    private Format[] f;
    private long g;
    private long h = Long.MIN_VALUE;
    private boolean i;

    public C0614n(int i2) {
        this.a = i2;
    }

    public /* synthetic */ void a(float f2) throws C0618s {
        N.a(this, f2);
    }

    public void a(int i2, Object obj) throws C0618s {
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j, boolean z) throws C0618s;

    public final void a(Q q, Format[] formatArr, x xVar, long j, boolean z, long j2) throws C0618s {
        C1852xq.b(this.d == 0);
        this.b = q;
        this.d = 1;
        a(z);
        a(formatArr, xVar, j2);
        a(j, z);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) throws C0618s {
    }

    /* access modifiers changed from: protected */
    public void a(Format[] formatArr, long j) throws C0618s {
    }

    /* access modifiers changed from: protected */
    public int b(long j) {
        return this.e.a(j - this.g);
    }

    public final void d() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        C1852xq.b(z);
        this.d = 0;
        this.e = null;
        this.f = null;
        this.i = false;
        t();
    }

    public final int e() {
        return this.a;
    }

    public final boolean g() {
        return this.h == Long.MIN_VALUE;
    }

    public final int getState() {
        return this.d;
    }

    public final void h() {
        this.i = true;
    }

    public final void i() throws IOException {
        this.e.a();
    }

    public final boolean j() {
        return this.i;
    }

    public final P k() {
        return this;
    }

    public final x l() {
        return this.e;
    }

    public final long m() {
        return this.h;
    }

    public Kq n() {
        return null;
    }

    public int o() throws C0618s {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final Q p() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final int q() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final Format[] r() {
        return this.f;
    }

    public final void reset() {
        C1852xq.b(this.d == 0);
        u();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return g() ? this.i : this.e.b();
    }

    public final void setIndex(int i2) {
        this.c = i2;
    }

    public final void start() throws C0618s {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        C1852xq.b(z);
        this.d = 2;
        v();
    }

    public final void stop() throws C0618s {
        C1852xq.b(this.d == 2);
        this.d = 1;
        w();
    }

    /* access modifiers changed from: protected */
    public abstract void t();

    /* access modifiers changed from: protected */
    public void u() {
    }

    /* access modifiers changed from: protected */
    public void v() throws C0618s {
    }

    /* access modifiers changed from: protected */
    public void w() throws C0618s {
    }

    public final void a(Format[] formatArr, x xVar, long j) throws C0618s {
        C1852xq.b(!this.i);
        this.e = xVar;
        this.h = j;
        this.f = formatArr;
        this.g = j;
        a(formatArr, j);
    }

    public final void a(long j) throws C0618s {
        this.i = false;
        this.h = j;
        a(j, false);
    }

    /* access modifiers changed from: protected */
    public final int a(B b2, Qm qm, boolean z) {
        int a2 = this.e.a(b2, qm, z);
        int i2 = -4;
        if (a2 == -4) {
            if (qm.d()) {
                this.h = Long.MIN_VALUE;
                if (!this.i) {
                    i2 = -3;
                }
                return i2;
            }
            qm.d += this.g;
            this.h = Math.max(this.h, qm.d);
        } else if (a2 == -5) {
            Format format = b2.a;
            long j = format.m;
            if (j != Long.MAX_VALUE) {
                b2.a = format.a(j + this.g);
            }
        }
        return a2;
    }

    protected static boolean a(n<?> nVar, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (nVar == null) {
            return false;
        }
        return nVar.a(drmInitData);
    }
}
