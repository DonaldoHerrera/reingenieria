package com.comscore.android.vce;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ScrollView;
import java.util.HashMap;

class x {
    String a;
    final p b;
    final ah<Activity> c;
    ah<WebView> d;
    y e;
    final k f;
    final a g;
    final l h;
    final s i;
    final i j;
    private String k;
    private boolean l;
    private final ah<View> m;
    private Integer n;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private ah<ScrollView> r;
    private int s = 50;
    private boolean t = false;
    private boolean u = false;

    x(p pVar, y yVar, k kVar, a aVar, l lVar, s sVar, i iVar, Activity activity, View view) {
        String str = "BaseTrack";
        this.a = str;
        this.k = str;
        this.b = pVar;
        this.e = yVar;
        this.f = kVar;
        this.g = aVar;
        this.h = lVar;
        this.i = sVar;
        this.j = iVar;
        this.c = this.i.a(activity);
        this.m = this.i.a(view);
        this.e.a(this.k);
        this.i.a((Runnable) new Runnable() {
            public void run() {
                try {
                    x.this.a();
                } catch (Exception unused) {
                }
            }
        });
    }

    private void a(ae aeVar, ae aeVar2) {
        int[] a2 = this.h.a(aeVar, aeVar2);
        this.e.d(a2[0]);
        this.e.e(a2[1]);
    }

    private void a(ae aeVar, ae aeVar2, boolean z, ae aeVar3) {
        if (!z) {
            this.e.a(aeVar.d(), aeVar.c());
            this.e.b(aeVar.a(), aeVar.b());
            if (this.h.b(aeVar2, aeVar3)) {
                this.e.c(false);
                this.e.d(false);
                if (this.r != null && this.p) {
                    a(true);
                }
            } else if (this.o && !z && this.r != null && !this.p) {
                y();
            }
        }
    }

    private void a(ae aeVar, boolean z, ae aeVar2, ae aeVar3, int i2, int i3) {
        Activity activity = (Activity) this.c.get();
        if (activity != null && ((View) this.m.get()) != null) {
            ah<ScrollView> ahVar = this.r;
            ScrollView scrollView = ahVar != null ? (ScrollView) ahVar.get() : null;
            float[] a2 = this.h.a(activity, aeVar, z, aeVar2, aeVar3, i2, i3, this.e.p(), this.e.q());
            this.e.a(a2[0]);
            this.e.b(a2[1]);
            this.e.c(a2[2]);
            if (scrollView != null) {
                this.e.d(a2[3]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void A() {
        B();
        if (this.o) {
            this.e.a(true);
            G();
            L();
            y();
        }
        C();
    }

    /* access modifiers changed from: 0000 */
    public void B() {
    }

    /* access modifiers changed from: 0000 */
    public void C() {
    }

    /* access modifiers changed from: 0000 */
    public void D() {
        if (E()) {
            if (this.o) {
                this.e.a(false);
                L();
            }
            z();
            F();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean E() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void F() {
    }

    /* access modifiers changed from: 0000 */
    public void G() {
        Activity activity = (Activity) this.c.get();
        if (activity != null) {
            View view = (View) this.m.get();
            if (view != null) {
                ae c2 = this.f.c(view);
                View c3 = this.f.c(activity);
                if (c3 != null) {
                    ae c4 = this.f.c(c3);
                    boolean a2 = this.f.a(view);
                    ah<ScrollView> ahVar = this.r;
                    ae aeVar = null;
                    View view2 = ahVar != null ? (ScrollView) ahVar.get() : null;
                    if (view2 != null) {
                        aeVar = this.f.c(view2);
                    }
                    ae aeVar2 = aeVar;
                    ae b2 = this.f.b();
                    int p2 = this.j.p();
                    if (p2 == -1) {
                        p2 = this.f.d();
                    }
                    int i2 = p2;
                    int q2 = this.j.q();
                    if (q2 == -1) {
                        q2 = this.f.e();
                    }
                    int i3 = q2;
                    b(i2);
                    J();
                    if (view2 != null) {
                        a(aeVar2);
                    }
                    ae b3 = this.h.b(c2);
                    ae a3 = this.h.a(c2);
                    a(c4, b2);
                    a(b3, a3, a2, b2);
                    a(a3, a2, aeVar2, b2, i2, i3);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void H() {
    }

    /* access modifiers changed from: 0000 */
    public boolean I() {
        H();
        Activity activity = (Activity) this.c.get();
        if (activity == null) {
            return false;
        }
        View view = (View) this.m.get();
        if (view == null) {
            return false;
        }
        return this.h.b(activity, view);
    }

    /* access modifiers changed from: 0000 */
    public void J() {
        Activity activity = (Activity) this.c.get();
        if (activity != null) {
            View view = (View) this.m.get();
            if (view != null) {
                float[] a2 = this.h.a(activity, view);
                this.e.a(a2[0], a2[1]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void K() {
        ah<WebView> ahVar = this.d;
        if (ahVar != null) {
            WebView webView = (WebView) ahVar.get();
            if (webView != null && this.q) {
                a aVar = this.g;
                String J = this.e.J();
                StringBuilder sb = new StringBuilder();
                sb.append(this.k);
                sb.append("-meta-values");
                aVar.b(J, webView, sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void L() {
        ah<WebView> ahVar = this.d;
        if (ahVar != null) {
            WebView webView = (WebView) ahVar.get();
            if (webView != null && this.q) {
                a aVar = this.g;
                String K = this.e.K();
                StringBuilder sb = new StringBuilder();
                sb.append(this.k);
                sb.append("-vi-values");
                aVar.a(K, webView, sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public String M() {
        return this.e.K();
    }

    /* access modifiers changed from: 0000 */
    public WebView N() {
        ah<WebView> ahVar = this.d;
        if (ahVar == null) {
            return null;
        }
        return (WebView) ahVar.get();
    }

    /* access modifiers changed from: 0000 */
    public void O() {
        G();
    }

    /* access modifiers changed from: 0000 */
    public void P() {
    }

    /* access modifiers changed from: 0000 */
    public int Q() {
        return this.s;
    }

    /* access modifiers changed from: 0000 */
    public void R() {
        if (h() != null) {
            boolean S = S();
            if (!S) {
                S = I();
            }
            if (S) {
                G();
                L();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    public boolean S() {
        boolean z;
        Activity h2 = h();
        if (h2 == null) {
            return false;
        }
        View i2 = i();
        if (i2 == null) {
            return false;
        }
        if (this.f.a(i2)) {
            this.e.a(false);
            z();
            L();
            return false;
        }
        boolean z2 = true;
        boolean z3 = this.s != 50;
        View a2 = this.f.a(h2);
        if (a2 == null) {
            return false;
        }
        ae c2 = this.f.c(i2);
        int[][] a3 = this.h.a(c2, this.s);
        int p2 = this.j.p();
        if (p2 == -1) {
            p2 = this.f.d();
        }
        int a4 = this.f.a(a2, i2, a3, z3, p2);
        int t2 = this.e.t();
        int i3 = z3 ? 2 : 0;
        if (a4 <= i3 || c2.g() <= 0.0f) {
            if (t2 == 1) {
                this.e.c(false);
                this.e.d(false);
            }
            z = false;
            if (z3) {
                int i4 = this.s;
                if (i4 > 50) {
                    i3 = 4;
                } else if (i4 < 50) {
                    i3 = 1;
                }
                int u2 = this.e.u();
                if (a4 <= i3 || c2.g() <= 0.0f) {
                    if (u2 == 1) {
                        this.e.d(false);
                        return z2;
                    }
                } else if (u2 != 1) {
                    this.e.d(true);
                    return z2;
                }
            }
            z2 = z;
            return z2;
        }
        if (t2 != 1) {
            this.e.c(true);
            this.e.d(true);
        }
        z = false;
        if (z3) {
        }
        z2 = z;
        return z2;
        z = true;
        if (z3) {
        }
        z2 = z;
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Activity activity = (Activity) this.c.get();
        if (activity != null) {
            View view = (View) this.m.get();
            if (view != null) {
                View a2 = this.f.a(activity);
                if (a2 != null) {
                    ScrollView b2 = this.f.b(a2, view);
                    if (b2 != null) {
                        this.r = new ah<>(b2);
                        a(this.f.c((View) b2));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, float f3) {
        this.h.a(f2, f3);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        if (!this.o && m()) {
            this.o = true;
            c(i2);
            n();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ae aeVar) {
        if (aeVar != null) {
            this.e.d(aeVar.d(), aeVar.c());
            this.e.c(aeVar.a(), aeVar.b());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ah<WebView> ahVar) {
        this.d = ahVar;
        ah<WebView> ahVar2 = this.d;
        if (ahVar2 != null) {
            WebView webView = (WebView) ahVar2.get();
            if (webView != null) {
                this.n = Integer.valueOf(webView.hashCode());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        ah<WebView> ahVar = this.d;
        if (ahVar != null) {
            WebView webView = (WebView) ahVar.get();
            if (webView != null && this.q) {
                a aVar = this.g;
                StringBuilder sb = new StringBuilder();
                sb.append(this.k);
                sb.append("-vi-values");
                aVar.a(str, webView, sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(HashMap<String, String> hashMap) {
        if (this.o) {
            Activity activity = (Activity) this.c.get();
            if (activity != null) {
                if (this.f.d(activity)) {
                    String D = this.e.D();
                    String str = "ns_vc_aot";
                    if (D == null) {
                        D = (String) hashMap.get(str);
                    }
                    boolean z = !D.equals((String) hashMap.get(str));
                    if (!z) {
                        String E = this.e.E();
                        String str2 = "ns_ap_po";
                        if (E == null) {
                            E = (String) hashMap.get(str2);
                        }
                        if (!E.equals((String) hashMap.get(str2))) {
                            z = true;
                        }
                    }
                    if (z) {
                        this.i.a(new Runnable() {
                            public void run() {
                                try {
                                    x.this.G();
                                    x.this.L();
                                } catch (Exception unused) {
                                }
                            }
                        }, 200);
                    }
                }
            } else {
                return;
            }
        }
        this.e.a(hashMap);
        P();
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (this.p) {
            this.p = false;
            this.l = true;
        }
        if (!z && this.t) {
            this.t = false;
            this.j.b(this);
        }
        if (this.u) {
            this.u = false;
            this.j.d(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        this.e.c(this.f.a(i2));
        ae c2 = this.f.c();
        this.e.e(c2.a(), c2.b());
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        d();
        q();
        ah<View> ahVar = this.m;
        if (ahVar != null) {
            ahVar.clear();
        }
        ah<WebView> ahVar2 = this.d;
        if (ahVar2 != null) {
            ahVar2.clear();
            this.d = null;
        }
        ah<ScrollView> ahVar3 = this.r;
        if (ahVar3 != null) {
            ahVar3.clear();
        }
        this.e.a();
        this.e = null;
        Integer num = this.n;
        if (num != null) {
            this.f.a(num);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        if (i2 > 0 && i2 <= 100) {
            this.s = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public ah<Activity> g() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Activity h() {
        ah<Activity> ahVar = this.c;
        if (ahVar == null) {
            return null;
        }
        return (Activity) ahVar.get();
    }

    /* access modifiers changed from: 0000 */
    public View i() {
        ah<View> ahVar = this.m;
        if (ahVar == null) {
            return null;
        }
        return (View) ahVar.get();
    }

    /* access modifiers changed from: 0000 */
    public y j() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public boolean l() {
        if (this.p) {
            return true;
        }
        if (!this.l) {
            return false;
        }
        this.l = false;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean m() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void n() {
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        View view = (View) this.m.get();
        if (view != null) {
            if (!this.f.a(view)) {
                this.e.a(true);
                this.e.c(true);
                this.e.d(true);
            } else {
                this.e.a(false);
                this.e.c(false);
                this.e.d(false);
            }
            this.e.g(false);
            G();
            this.q = true;
            y();
            p();
            L();
            K();
        }
    }

    /* access modifiers changed from: 0000 */
    public void p() {
    }

    /* access modifiers changed from: 0000 */
    public void q() {
        if (this.o) {
            this.o = false;
            z();
            r();
        }
    }

    /* access modifiers changed from: 0000 */
    public void r() {
    }

    /* access modifiers changed from: 0000 */
    public void s() {
        if (this.o) {
            this.e.f(false);
            G();
            L();
        }
    }

    /* access modifiers changed from: 0000 */
    public void t() {
        if (this.o) {
            this.e.f(true);
            G();
            L();
        }
    }

    /* access modifiers changed from: 0000 */
    public void u() {
        if (this.o) {
            this.e.e(true);
            L();
        }
        z();
        v();
    }

    /* access modifiers changed from: 0000 */
    public void v() {
    }

    /* access modifiers changed from: 0000 */
    public void w() {
        if (this.o) {
            this.e.e(false);
            G();
            L();
            y();
        }
        x();
    }

    /* access modifiers changed from: 0000 */
    public void x() {
    }

    /* access modifiers changed from: 0000 */
    public void y() {
        if (!this.p) {
            this.p = true;
            if (this.i.d() == h()) {
                if (!this.t) {
                    this.t = true;
                    this.j.a(this);
                }
                if (!this.u) {
                    this.u = true;
                    this.j.c(this);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void z() {
        a(false);
    }
}
