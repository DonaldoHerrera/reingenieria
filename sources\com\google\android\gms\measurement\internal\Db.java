package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

final class Db {
    private long A;
    private long B;
    private String C;
    private boolean D;
    private long E;
    private long F;
    private final Mb a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private long w;
    private long x;
    private long y;
    private long z;

    Db(Mb mb, String str) {
        Preconditions.checkNotNull(mb);
        Preconditions.checkNotEmpty(str);
        this.a = mb;
        this.b = str;
        this.a.d().i();
    }

    public final String A() {
        this.a.d().i();
        return this.C;
    }

    public final String B() {
        this.a.d().i();
        String str = this.C;
        h((String) null);
        return str;
    }

    public final long C() {
        this.a.d().i();
        return this.p;
    }

    public final boolean D() {
        this.a.d().i();
        return this.q;
    }

    public final boolean E() {
        this.a.d().i();
        return this.r;
    }

    public final Boolean F() {
        this.a.d().i();
        return this.t;
    }

    public final List<String> G() {
        this.a.d().i();
        return this.v;
    }

    public final String a() {
        this.a.d().i();
        return this.c;
    }

    public final void b(String str) {
        this.a.d().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= !Vd.e(this.d, str);
        this.d = str;
    }

    public final String c() {
        this.a.d().i();
        return this.d;
    }

    public final void d(String str) {
        this.a.d().i();
        this.D |= !Vd.e(this.e, str);
        this.e = str;
    }

    public final void e() {
        this.a.d().i();
        this.D = false;
    }

    public final String f() {
        this.a.d().i();
        return this.b;
    }

    public final String g() {
        this.a.d().i();
        return this.s;
    }

    public final String h() {
        this.a.d().i();
        return this.e;
    }

    public final long i() {
        this.a.d().i();
        return this.h;
    }

    public final long j() {
        this.a.d().i();
        return this.i;
    }

    public final String k() {
        this.a.d().i();
        return this.j;
    }

    public final long l() {
        this.a.d().i();
        return this.k;
    }

    public final String m() {
        this.a.d().i();
        return this.l;
    }

    public final long n() {
        this.a.d().i();
        return this.m;
    }

    public final long o() {
        this.a.d().i();
        return this.n;
    }

    public final long p() {
        this.a.d().i();
        return this.u;
    }

    public final long q() {
        this.a.d().i();
        return this.g;
    }

    public final long r() {
        this.a.d().i();
        return this.E;
    }

    public final long s() {
        this.a.d().i();
        return this.F;
    }

    public final void t() {
        this.a.d().i();
        long j2 = this.g + 1;
        if (j2 > 2147483647L) {
            this.a.e().v().a("Bundle index overflow. appId", C1124ib.a(this.b));
            j2 = 0;
        }
        this.D = true;
        this.g = j2;
    }

    public final long u() {
        this.a.d().i();
        return this.w;
    }

    public final long v() {
        this.a.d().i();
        return this.x;
    }

    public final long w() {
        this.a.d().i();
        return this.y;
    }

    public final long x() {
        this.a.d().i();
        return this.z;
    }

    public final long y() {
        this.a.d().i();
        return this.B;
    }

    public final long z() {
        this.a.d().i();
        return this.A;
    }

    public final void a(String str) {
        this.a.d().i();
        this.D |= !Vd.e(this.c, str);
        this.c = str;
    }

    public final void c(String str) {
        this.a.d().i();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= !Vd.e(this.s, str);
        this.s = str;
    }

    public final void e(String str) {
        this.a.d().i();
        this.D |= !Vd.e(this.f, str);
        this.f = str;
    }

    public final void f(String str) {
        this.a.d().i();
        this.D |= !Vd.e(this.j, str);
        this.j = str;
    }

    public final void g(String str) {
        this.a.d().i();
        this.D |= !Vd.e(this.l, str);
        this.l = str;
    }

    public final void h(long j2) {
        this.a.d().i();
        this.D |= this.E != j2;
        this.E = j2;
    }

    public final void i(long j2) {
        this.a.d().i();
        this.D |= this.F != j2;
        this.F = j2;
    }

    public final void j(long j2) {
        this.a.d().i();
        this.D |= this.w != j2;
        this.w = j2;
    }

    public final void k(long j2) {
        this.a.d().i();
        this.D |= this.x != j2;
        this.x = j2;
    }

    public final void l(long j2) {
        this.a.d().i();
        this.D |= this.y != j2;
        this.y = j2;
    }

    public final void m(long j2) {
        this.a.d().i();
        this.D |= this.z != j2;
        this.z = j2;
    }

    public final void n(long j2) {
        this.a.d().i();
        this.D |= this.B != j2;
        this.B = j2;
    }

    public final void o(long j2) {
        this.a.d().i();
        this.D |= this.A != j2;
        this.A = j2;
    }

    public final void p(long j2) {
        this.a.d().i();
        this.D |= this.p != j2;
        this.p = j2;
    }

    public final void d(long j2) {
        this.a.d().i();
        this.D |= this.m != j2;
        this.m = j2;
    }

    public final String b() {
        this.a.d().i();
        return this.f;
    }

    public final void a(long j2) {
        this.a.d().i();
        this.D |= this.h != j2;
        this.h = j2;
    }

    public final void e(long j2) {
        this.a.d().i();
        this.D |= this.n != j2;
        this.n = j2;
    }

    public final void f(long j2) {
        this.a.d().i();
        this.D |= this.u != j2;
        this.u = j2;
    }

    public final void g(long j2) {
        boolean z2 = true;
        Preconditions.checkArgument(j2 >= 0);
        this.a.d().i();
        boolean z3 = this.D;
        if (this.g == j2) {
            z2 = false;
        }
        this.D = z2 | z3;
        this.g = j2;
    }

    public final void h(String str) {
        this.a.d().i();
        this.D |= !Vd.e(this.C, str);
        this.C = str;
    }

    public final void b(long j2) {
        this.a.d().i();
        this.D |= this.i != j2;
        this.i = j2;
    }

    public final void c(long j2) {
        this.a.d().i();
        this.D |= this.k != j2;
        this.k = j2;
    }

    public final boolean d() {
        this.a.d().i();
        return this.o;
    }

    public final void a(boolean z2) {
        this.a.d().i();
        this.D |= this.o != z2;
        this.o = z2;
    }

    public final void b(boolean z2) {
        this.a.d().i();
        this.D = this.q != z2;
        this.q = z2;
    }

    public final void c(boolean z2) {
        this.a.d().i();
        this.D = this.r != z2;
        this.r = z2;
    }

    public final void a(Boolean bool) {
        this.a.d().i();
        this.D = !Vd.a(this.t, bool);
        this.t = bool;
    }

    public final void a(List<String> list) {
        this.a.d().i();
        if (!Vd.a(this.v, list)) {
            this.D = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }
}
