package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: aH reason: default package and case insensitive filesystem */
public class C2442aH implements C1966CG, a {
    private static C2442aH a;
    private float b = 0.0f;
    private final C2006EG c;
    private final C1946BG d;
    private C1986DG e;
    private C2331VG f;

    public C2442aH(C2006EG eg, C1946BG bg) {
        this.c = eg;
        this.d = bg;
    }

    public static C2442aH a() {
        if (a == null) {
            a = new C2442aH(new C2006EG(), new C1946BG());
        }
        return a;
    }

    private C2331VG e() {
        if (this.f == null) {
            this.f = C2331VG.a();
        }
        return this.f;
    }

    public void a(float f2) {
        this.b = f2;
        for (C2218PG k : e().c()) {
            k.k().a(f2);
        }
    }

    public void a(Context context) {
        this.e = this.c.a(new Handler(), context, this.d.a(), this);
    }

    public void a(boolean z) {
        if (z) {
            C3290uH.h().a();
        } else {
            C3290uH.h().c();
        }
    }

    public void b() {
        C2367XG.a().a((a) this);
        C2367XG.a().b();
        if (C2367XG.a().d()) {
            C3290uH.h().a();
        }
        this.e.a();
    }

    public void c() {
        C3290uH.h().b();
        C2367XG.a().c();
        this.e.b();
    }

    public float d() {
        return this.b;
    }
}
