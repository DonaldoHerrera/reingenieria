package defpackage;

import com.soundcloud.android.ads.data.g;
import com.soundcloud.android.ads.data.t;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.a.C0093d;

/* renamed from: NJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsRepository.kt */
public class C2183NJ {
    /* access modifiers changed from: private */
    public final t a;
    /* access modifiers changed from: private */
    public final C3352xJ b;
    private final HPa c;
    /* access modifiers changed from: private */
    public final HPa d;
    private final C5694cGa e;
    private final C6834lGa f;
    private final C6699jHa g;
    /* access modifiers changed from: private */
    public final C3469VY h;
    private final C3700b i;

    public C2183NJ(t tVar, C3352xJ xJVar, @a HPa hPa, HPa hPa2, C5694cGa cga, C6834lGa lga, C6699jHa jha, C3469VY vy, C3700b bVar) {
        C7471uYa.b(tVar, "videoAdStorage");
        C7471uYa.b(xJVar, "videoAdsFetcher");
        C7471uYa.b(hPa, "loadScheduler");
        C7471uYa.b(hPa2, "fetchScheduler");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(bVar, "analytics");
        this.a = tVar;
        this.b = xJVar;
        this.c = hPa;
        this.d = hPa2;
        this.e = cga;
        this.f = lga;
        this.g = jha;
        this.h = vy;
        this.i = bVar;
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        a(z, "network");
    }

    public IPa<C4928GKa<g>> a() {
        long a2 = this.e.a();
        IPa<C4928GKa<g>> c2 = this.a.b(a2).b(this.c).c((C6776kQa<? super T>) new C1989DJ<Object>(this, a2)).c((C6776kQa<? super T>) new C2009EJ<Object>(this)).c((C6776kQa<? super T>) new C2164MJ<Object>(this, new C2221PJ(this.g.f(), this.g.d(), this.f.b()), a2));
        C7471uYa.a((Object) c2, "videoAdStorage.consume(t…          )\n            }");
        return c2;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        a(z, "db");
    }

    private void a(boolean z, String str) {
        this.i.a((C3702d) new C0093d(str, z));
    }
}
