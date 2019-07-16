package defpackage;

import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.q;

/* renamed from: cN reason: default package and case insensitive filesystem */
/* compiled from: AppboyPlaySessionState */
public class C2486cN implements q {
    private final C5327TLa a;
    private final C3814lca b;
    private final Na c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public C2486cN(C5327TLa tLa, C3814lca lca, Na na) {
        this.a = tLa;
        this.b = lca;
        this.c = na;
    }

    private com.soundcloud.android.foundation.playqueue.q f() {
        return this.b.h();
    }

    private boolean g() {
        return f().a().c();
    }

    private boolean h() {
        return this.c.e();
    }

    private boolean i() {
        com.soundcloud.android.foundation.playqueue.q f2 = f();
        return f2.j() && this.b.f(f2.c());
    }

    private boolean j() {
        I l = this.b.l();
        return l != null && l.u();
    }

    public /* synthetic */ void a(Iaa iaa) throws Exception {
        this.g = iaa.c() == 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.d;
    }

    public void c() {
        this.d = false;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.d = true;
    }

    public void e() {
        this.a.a(C3876taa.d, (C6776kQa<E>) new C2319UM<E>(this));
        this.a.a(C3876taa.m, (C6776kQa<E>) new C2355WM<E>(this));
        this.a.a(C3876taa.g, (C6776kQa<E>) new C2337VM<E>(this));
    }

    public /* synthetic */ void a(C3422FZ fz) throws Exception {
        this.f = fz.c() == 0;
    }

    public boolean a() {
        return this.e && this.g && !this.f && j() && !i() && !h() && !g();
    }

    /* access modifiers changed from: private */
    public void a(C3699a aVar) {
        if (aVar.a() == 0) {
            this.e = true;
        } else if (aVar.a() == 2) {
            this.e = false;
        }
    }
}
