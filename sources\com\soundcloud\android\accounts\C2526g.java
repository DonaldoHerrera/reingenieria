package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.login.D;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.b;
import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.C4168tb;
import com.soundcloud.android.playback.C4421sb;
import java.io.IOException;

/* renamed from: com.soundcloud.android.accounts.g reason: case insensitive filesystem */
/* compiled from: AccountOperations */
public class C2526g {
    public static final C3508cda a = C3508cda.f(-2);
    private final Context b;
    private final J c;
    private final L d;
    private final C5327TLa e;
    private final HPa f;
    private final C2529j g;
    private final C7730yHa h;
    private final C4421sb i;
    private final C4806CMa<C2325UT> j;
    private final C4806CMa<C2523d> k;
    private final C4806CMa<C4168tb> l;
    private final C4806CMa<D> m;
    private final J n;
    private final C4596kia o;

    C2526g(Context context, J j2, L l2, C5327TLa tLa, C4421sb sbVar, C4806CMa<C2325UT> cMa, C4596kia kia, C4806CMa<C2523d> cMa2, C4806CMa<C4168tb> cMa3, C4806CMa<D> cMa4, C7730yHa yha, HPa hPa, C2529j jVar, J j3) {
        this.b = context;
        this.c = j2;
        this.d = l2;
        this.e = tLa;
        this.i = sbVar;
        this.j = cMa;
        this.o = kia;
        this.k = cMa2;
        this.l = cMa3;
        this.m = cMa4;
        this.h = yha;
        this.f = hPa;
        this.g = jVar;
        this.n = j3;
    }

    private void m() {
        ((D) this.m.get()).b();
    }

    public String a(String str, String str2, Bundle bundle) throws a, IOException {
        return this.h.a(this.b, str, str2, bundle);
    }

    @Deprecated
    public boolean b(C3508cda cda) {
        return cda.equals(c());
    }

    @Deprecated
    public C3508cda c() {
        return (C3508cda) this.g.c().b();
    }

    public C4928GKa<Account> d() {
        return this.c.a();
    }

    public C2358WP e() {
        return this.d.a((Account) d().d());
    }

    public boolean f() {
        return e().e();
    }

    public boolean g() {
        return c().equals(a);
    }

    public boolean h() {
        return ((Boolean) this.g.a().b()).booleanValue();
    }

    public /* synthetic */ void i() throws Exception {
        ((C4168tb) this.l.get()).a((Void) null);
        ((C2523d) this.k.get()).run();
        this.d.a();
        this.o.a();
        m();
        b();
        this.e.c(C3876taa.i, C3707i.a());
        this.i.a();
        this.n.clear();
    }

    public void j() {
        Account account = new Account("SoundCloud", this.b.getString(p.account_type));
        this.g.a(C2529j.a.b());
        this.d.a(account, C2358WP.a);
        this.e.c(C3876taa.i, C3707i.a(a));
    }

    public C6979nPa k() {
        C4928GKa d2 = d();
        if (d2.c()) {
            return ((C2325UT) this.j.get()).c().a((C6368eQa) new C2522c(this, d2)).a(RPa.a()).b(this.f);
        }
        throw new IllegalStateException("Missing Account. One does not simply remove something that does not exist");
    }

    public C6979nPa l() {
        return C6979nPa.b((C6368eQa) new C2521b(this)).b(this.f);
    }

    public void a(String str) {
        b.a(this.b, str);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.g.a(C2529j.a.a());
    }

    public void a(Activity activity) {
        this.c.a("access_token", activity);
    }

    public Account a(C3776gea gea, C2358WP wp) {
        C3508cda l2 = gea.l();
        C4928GKa a2 = this.c.a(l2, gea.j());
        if (!a2.c()) {
            return null;
        }
        this.d.a((Account) a2.b(), wp);
        this.g.a(C2529j.a.a(l2, (Account) a2.b()));
        this.e.c(C3876taa.i, C3707i.a(l2));
        return (Account) a2.b();
    }

    public /* synthetic */ void a(C4928GKa gKa) throws Exception {
        this.c.b((Account) gKa.b());
    }

    public void a(C2358WP wp) {
        this.d.a(wp);
    }

    public void a() {
        if (g()) {
            b();
        }
    }

    public static boolean a(C3508cda cda) {
        return cda.equals(C3508cda.a);
    }
}
