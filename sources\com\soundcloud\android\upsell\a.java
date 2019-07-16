package com.soundcloud.android.upsell;

/* compiled from: InlineUpsellOperations */
public class a {
    private c a;
    private C2436_U b;
    private C6713jVa<Boolean> c = C6713jVa.s();

    a(c cVar, C2436_U _u) {
        this.a = cVar;
        this.b = _u;
    }

    private boolean a(String str) {
        return this.b.s() && this.a.a(str);
    }

    private boolean f() {
        return a("stream");
    }

    public void b() {
        this.a.b("playlist");
    }

    public void c() {
        this.a.b("stream");
        this.c.a(Boolean.valueOf(false));
    }

    public boolean d() {
        return a("playlist");
    }

    public APa<Boolean> e() {
        if (!this.c.u()) {
            this.c.a(Boolean.valueOf(f()));
        }
        return this.c;
    }

    public void a() {
        this.a.a();
    }
}
