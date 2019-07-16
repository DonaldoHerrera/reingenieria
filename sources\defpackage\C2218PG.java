package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: PG reason: default package and case insensitive filesystem */
public class C2218PG extends C2066HG {
    private final C2104JG a;
    private final C2085IG b;
    private final List<C3105lH> c = new ArrayList();
    private C3105lH d;
    private C3143nH e;
    private boolean f = false;
    private boolean g = false;
    private String h;
    private boolean i;

    C2218PG(C2085IG ig, C2104JG jg) {
        this.b = ig;
        this.a = jg;
        this.h = UUID.randomUUID().toString();
        e(null);
        this.e = jg.a() == C2123KG.HTML ? new C3172oH(jg.f()) : new C3210qH(jg.e(), jg.c());
        this.e.a();
        C2331VG.a().a(this);
        this.e.a(ig);
    }

    private C3105lH c(View view) {
        for (C3105lH lHVar : this.c) {
            if (lHVar.get() == view) {
                return lHVar;
            }
        }
        return null;
    }

    private void d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void e(View view) {
        this.d = new C3105lH(view);
    }

    private void f(View view) {
        Collection<C2218PG> b2 = C2331VG.a().b();
        if (b2 != null && b2.size() > 0) {
            for (C2218PG pg : b2) {
                if (pg != this && pg.f() == view) {
                    pg.d.clear();
                }
            }
        }
    }

    private void n() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public void a() {
        if (!this.g) {
            this.d.clear();
            m();
            this.g = true;
            k().f();
            C2331VG.a().c(this);
            k().b();
            this.e = null;
        }
    }

    public void a(C2142LG lg, String str) {
        if (!this.g) {
            C3067jH.a((Object) lg, "Error type is null");
            C3067jH.a(str, "Message is null");
            k().a(lg, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public void a(View view) {
        if (!this.g) {
            d(view);
            if (c(view) == null) {
                this.c.add(new C3105lH(view));
            }
        }
    }

    public String b() {
        return this.h;
    }

    public void b(View view) {
        if (!this.g) {
            C3067jH.a((Object) view, "AdView is null");
            if (f() != view) {
                e(view);
                k().i();
                f(view);
            }
        }
    }

    public void c() {
        if (!this.f) {
            this.f = true;
            C2331VG.a().b(this);
            this.e.a(C2442aH.a().d());
            this.e.a(this, this.a);
        }
    }

    public List<C3105lH> d() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        n();
        k().g();
        this.i = true;
    }

    public View f() {
        return (View) this.d.get();
    }

    public boolean g() {
        return this.f && !this.g;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.b.a();
    }

    public C3143nH k() {
        return this.e;
    }

    public boolean l() {
        return this.b.b();
    }

    public void m() {
        if (!this.g) {
            this.c.clear();
        }
    }
}
