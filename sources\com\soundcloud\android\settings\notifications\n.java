package com.soundcloud.android.settings.notifications;

import java.util.concurrent.TimeUnit;

/* compiled from: NotificationPreferencesOperations */
class n {
    private static final long a = TimeUnit.MINUTES.toMillis(15);
    private final efa b;
    private final HPa c;
    private final p d;
    private final C6834lGa e;

    n(efa efa, HPa hPa, p pVar, C6834lGa lga) {
        this.b = efa;
        this.c = hPa;
        this.d = pVar;
        this.e = lga;
    }

    private hfa d() {
        return hfa.b(C2226PO.NOTIFICATION_PREFERENCES.a()).c().b();
    }

    private hfa e() {
        return hfa.d(C2226PO.NOTIFICATION_PREFERENCES.a()).a((Object) this.d.a()).c().b();
    }

    private IPa<j> f() {
        return this.b.a(d(), j.class).c(i()).b(this.c);
    }

    private C7118pQa<jfa, IPa<j>> g() {
        return new e(this);
    }

    private C6776kQa<jfa> h() {
        return new g(this);
    }

    private C6776kQa<j> i() {
        return new f(this);
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        boolean z = this.d.c() >= a;
        if (!this.e.d() || (!this.d.d() && !z)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public IPa<j> b() {
        if (this.d.d()) {
            return c().a(g());
        }
        return f();
    }

    /* access modifiers changed from: 0000 */
    public IPa<jfa> c() {
        this.d.a(true);
        return this.b.b(e()).c(h()).b(this.c);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.d.b(str);
    }

    public /* synthetic */ IPa a(jfa jfa) throws Exception {
        if (jfa.g()) {
            return f();
        }
        return IPa.a(this.d.a());
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str) {
        return this.d.a(str);
    }

    public /* synthetic */ void b(jfa jfa) throws Exception {
        if (jfa.g()) {
            this.d.a(false);
        }
    }

    public /* synthetic */ void a(j jVar) throws Exception {
        this.d.a(jVar);
        this.d.e();
    }
}
