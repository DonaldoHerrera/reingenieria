package com.facebook;

import com.facebook.K.a;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.f reason: case insensitive filesystem */
/* compiled from: AccessTokenManager */
class C0536f implements a {
    final /* synthetic */ AccessToken a;
    final /* synthetic */ AccessToken.a b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ a d;
    final /* synthetic */ Set e;
    final /* synthetic */ Set f;
    final /* synthetic */ Set g;
    final /* synthetic */ C0537g h;

    C0536f(C0537g gVar, AccessToken accessToken, AccessToken.a aVar, AtomicBoolean atomicBoolean, a aVar2, Set set, Set set2, Set set3) {
        this.h = gVar;
        this.a = accessToken;
        this.b = aVar;
        this.c = atomicBoolean;
        this.d = aVar2;
        this.e = set;
        this.f = set2;
        this.g = set3;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0053=Splitter:B:18:0x0053, B:52:0x010d=Splitter:B:52:0x010d} */
    public void a(K k) {
        AccessToken accessToken;
        AccessToken.a aVar;
        String str;
        Set set;
        Set set2;
        Set set3;
        Date date;
        Date date2;
        try {
            if (C0537g.d().c() != null) {
                if (C0537g.d().c().l() == this.a.l()) {
                    if (!this.c.get() && this.d.a == null && this.d.b == 0) {
                        if (this.b != null) {
                            this.b.a(new C0594t("Failed to refresh access token"));
                        }
                        this.h.e.set(false);
                        AccessToken.a aVar2 = this.b;
                        return;
                    }
                    if (this.d.a != null) {
                        str = this.d.a;
                    } else {
                        str = this.a.k();
                    }
                    String str2 = str;
                    String b2 = this.a.b();
                    String l = this.a.l();
                    if (this.c.get()) {
                        set = this.e;
                    } else {
                        set = this.a.i();
                    }
                    Collection collection = set;
                    if (this.c.get()) {
                        set2 = this.f;
                    } else {
                        set2 = this.a.e();
                    }
                    Collection collection2 = set2;
                    if (this.c.get()) {
                        set3 = this.g;
                    } else {
                        set3 = this.a.f();
                    }
                    Collection collection3 = set3;
                    C0538h j = this.a.j();
                    if (this.d.b != 0) {
                        date = new Date(((long) this.d.b) * 1000);
                    } else {
                        date = this.a.g();
                    }
                    Date date3 = new Date();
                    if (this.d.c != null) {
                        date2 = new Date(1000 * this.d.c.longValue());
                    } else {
                        date2 = this.a.d();
                    }
                    AccessToken accessToken2 = new AccessToken(str2, b2, l, collection, collection2, collection3, j, date, date3, date2);
                    try {
                        C0537g.d().a(accessToken2);
                        this.h.e.set(false);
                        AccessToken.a aVar3 = this.b;
                        if (aVar3 != null) {
                            aVar3.a(accessToken2);
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        accessToken = accessToken2;
                        this.h.e.set(false);
                        aVar = this.b;
                        aVar.a(accessToken);
                        throw th;
                    }
                }
            }
            if (this.b != null) {
                this.b.a(new C0594t("No current access token to refresh"));
            }
            this.h.e.set(false);
            AccessToken.a aVar4 = this.b;
        } catch (Throwable th2) {
            th = th2;
            accessToken = null;
            this.h.e.set(false);
            aVar = this.b;
            if (!(aVar == null || accessToken == null)) {
                aVar.a(accessToken);
            }
            throw th;
        }
    }
}
