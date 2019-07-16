package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.e;

final class Za implements Ja {
    private final La a;
    private final String b;
    private final _a c;

    Za(La la, String str, Object[] objArr) {
        this.a = la;
        this.b = str;
        this.c = new _a(la.getClass(), str, objArr);
    }

    public final int a() {
        return (this.c.d & 1) == 1 ? e.i : e.j;
    }

    public final boolean b() {
        return (this.c.d & 2) == 2;
    }

    public final La c() {
        return this.a;
    }

    public final int d() {
        return this.c.e;
    }

    /* access modifiers changed from: 0000 */
    public final _a e() {
        return this.c;
    }

    public final int f() {
        return this.c.h;
    }

    public final int g() {
        return this.c.i;
    }

    public final int h() {
        return this.c.j;
    }

    public final int i() {
        return this.c.m;
    }

    /* access modifiers changed from: 0000 */
    public final int[] j() {
        return this.c.n;
    }

    public final int k() {
        return this.c.l;
    }

    public final int l() {
        return this.c.k;
    }
}
