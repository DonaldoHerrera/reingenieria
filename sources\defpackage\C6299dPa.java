package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dPa reason: default package and case insensitive filesystem */
/* compiled from: Settings */
public class C6299dPa {
    private final AtomicReference<C6503gPa> a;
    private final CountDownLatch b;
    private C6435fPa c;
    private boolean d;

    /* renamed from: dPa$a */
    /* compiled from: Settings */
    static class a {
        /* access modifiers changed from: private */
        public static final C6299dPa a = new C6299dPa();
    }

    public static C6299dPa b() {
        return a.a;
    }

    public synchronized C6299dPa a(C5531_Ma _ma, C4931GNa gNa, C4839DOa dOa, String str, String str2, String str3, C7598wNa wna) {
        C5531_Ma _ma2 = _ma;
        synchronized (this) {
            if (this.d) {
                return this;
            }
            if (this.c == null) {
                Context e = _ma.e();
                String c2 = gNa.c();
                String d2 = new C7184qNa().d(e);
                String f = gNa.f();
                C5118MNa mNa = new C5118MNa();
                XOa xOa = new XOa();
                VOa vOa = new VOa(_ma2);
                String c3 = C7391tNa.c(e);
                String str4 = str3;
                YOa yOa = new YOa(_ma2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c2}), dOa);
                String g = gNa.g();
                String str5 = g;
                String str6 = str2;
                String str7 = str;
                C6707jPa jpa = new C6707jPa(d2, str5, gNa.h(), gNa.i(), gNa.d(), C7391tNa.a(C7391tNa.n(e)), str6, str7, C7667xNa.a(f).getId(), c3);
                WOa wOa = new WOa(_ma, jpa, mNa, xOa, vOa, yOa, wna);
                this.c = wOa;
            }
            this.d = true;
            return this;
        }
    }

    public synchronized boolean c() {
        C6503gPa a2;
        a2 = this.c.a();
        a(a2);
        return a2 != null;
    }

    public synchronized boolean d() {
        C6503gPa a2;
        a2 = this.c.a(C6367ePa.SKIP_CACHE_LOOKUP);
        a(a2);
        if (a2 == null) {
            C5328TMa.e().e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a2 != null;
    }

    private C6299dPa() {
        this.a = new AtomicReference<>();
        this.b = new CountDownLatch(1);
        this.d = false;
    }

    public C6503gPa a() {
        try {
            this.b.await();
            return (C6503gPa) this.a.get();
        } catch (InterruptedException unused) {
            C5328TMa.e().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    private void a(C6503gPa gpa) {
        this.a.set(gpa);
        this.b.countDown();
    }
}
