package com.appboy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import bo.app.aa;
import bo.app.ab;
import bo.app.av;
import bo.app.aw;
import bo.app.ay;
import bo.app.bb;
import bo.app.bf;
import bo.app.bk;
import bo.app.bl;
import bo.app.bo;
import bo.app.bq;
import bo.app.bt;
import bo.app.bx;
import bo.app.cc;
import bo.app.df;
import bo.app.dj;
import bo.app.dn;
import bo.app.ea;
import bo.app.fa;
import bo.app.fb;
import bo.app.ff;
import bo.app.fp;
import bo.app.ft;
import bo.app.fx;
import bo.app.ga;
import bo.app.gc;
import bo.app.gi;
import bo.app.gj;
import bo.app.gk;
import bo.app.gk.a;
import bo.app.gv;
import bo.app.j;
import bo.app.k;
import bo.app.v;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class h implements l, p {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(h.class);
    private static final Set<String> b = new HashSet(Arrays.asList(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"}));
    private static final Set<String> c = new HashSet(Arrays.asList(new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"}));
    private static final Set<String> d = new HashSet(Collections.singletonList("calypso appcrawler"));
    @SuppressLint({"StaticFieldLeak"})
    private static volatile h e = null;
    private static final Object f = new Object();
    private static volatile m g;
    private static volatile o h;
    private static volatile boolean i = false;
    private static volatile boolean j = false;
    private static volatile boolean k = false;
    private final aw A;
    private final bf B;
    private final av C;
    private final Object D = new Object();
    private final Object E = new Object();
    private final Context l;
    /* access modifiers changed from: private */
    public final gj m;
    /* access modifiers changed from: private */
    public final aa n;
    private volatile j o;
    private volatile ab p;
    private volatile ThreadPoolExecutor q;
    volatile ea r;
    volatile df s;
    volatile fp t;
    volatile ay u;
    volatile dj v;
    volatile bb w;
    private final j x;
    final Bf y;
    private final bk z;

    h(Context context) {
        long nanoTime = System.nanoTime();
        Hg.a(a, "Appboy SDK Initializing");
        this.l = context.getApplicationContext();
        String str = Build.MODEL;
        if (str != null && d.contains(str.toLowerCase(Locale.US))) {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Device build model matches a known crawler. Enabling mock network request mode. Device model: ");
            sb.append(str);
            Hg.c(str2, sb.toString());
            b();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 8, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10));
        threadPoolExecutor.execute(new a(this));
        this.x = new j(this.l);
        this.y = new Bf(this.l);
        this.A = new aw(this.l);
        this.n = new aa(threadPoolExecutor);
        if (!this.y.p()) {
            gk l2 = l();
            this.m = gj.a();
            this.m.a(l2);
            this.m.a(j);
        } else {
            this.m = null;
        }
        if (!Ng.d(this.y.g())) {
            e(this.y.g());
        }
        this.z = new bl(this.l, this.y);
        if (!this.y.B()) {
            Hg.c(a, "Automatic GCM registration not enabled in appboy.xml. Appboy will not register for GCM.");
            this.B = null;
        } else if (bf.a(this.l, this.y)) {
            Hg.c(a, "Google Cloud Messaging found. Setting up Google Cloud Messaging");
            this.B = new bf(this.l, this.z);
            String k2 = this.y.k();
            if (k2 != null) {
                this.B.a(k2);
            } else {
                Hg.b(a, "GCM Sender Id not found, not registering with GCM Server");
            }
        } else {
            Hg.b(a, "GCM manifest requirements not met. Appboy will not register for GCM.");
            this.B = null;
        }
        if (!this.y.z()) {
            Hg.c(a, "Automatic ADM registration not enabled in appboy.xml. Appboy will not register for ADM.");
            this.C = null;
        } else if (av.a(this.l)) {
            Hg.c(a, "Amazon Device Messaging found. Setting up Amazon Device Messaging");
            this.C = new av(this.l, this.z);
            this.C.a();
        } else {
            Hg.b(a, "ADM manifest requirements not met. Appboy will not register for ADM.");
            this.C = null;
        }
        ea eaVar = new ea(this.l, this.x, this.y, this.n, this.A, this.z, i, j);
        a(eaVar);
        threadPoolExecutor.execute(new b(this));
        long nanoTime2 = System.nanoTime();
        String str3 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Appboy loaded in ");
        sb2.append(TimeUnit.MILLISECONDS.convert(nanoTime2 - nanoTime, TimeUnit.NANOSECONDS));
        sb2.append(" ms.");
        Hg.a(str3, sb2.toString());
    }

    private void e(String str) {
        synchronized (f) {
            a((m) new g(this, str));
        }
    }

    private gk l() {
        fx fxVar;
        int a2 = Gg.a();
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Setting maximum in-memory image cache size in bytes to: ");
        sb.append(a2);
        Hg.a(str, sb.toString());
        try {
            fxVar = new fx(this.l.getCacheDir(), this.l.getCacheDir(), new gc(), (long) a2, 50);
        } catch (IOException e2) {
            Hg.b(a, "Couldn't create Universal image loader LRU disk cache.", e2);
            fxVar = null;
        }
        a a3 = new a(this.l).a(3).a().a(gv.LIFO).a(new gi.a().a(true).b(true).a());
        if (fxVar != null) {
            a3.a((ft) fxVar);
        } else {
            a3.a((ga) new gc()).c(50).b(a2);
        }
        return a3.b();
    }

    /* access modifiers changed from: private */
    public void m() {
        boolean z2 = true;
        for (String str : c) {
            if (!Mg.a(this.l, str)) {
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("The Appboy SDK requires the permission ");
                sb.append(str);
                sb.append(". Check your app manifest.");
                Hg.b(str2, sb.toString());
                z2 = false;
            }
        }
        if (this.y.d().toString().equals("")) {
            Hg.b(a, "The Appboy SDK requires a non-empty API key. Check your appboy.xml.");
            z2 = false;
        }
        if (!z2) {
            Hg.b(a, "The Appboy SDK is not integrated correctly. Please visit https://www.appboy.com/documentation/Android");
        }
    }

    public void d(String str) {
        try {
            if (Ng.d(str)) {
                Hg.e(a, "Push registration ID must not be null or blank. Not registering for push messages from Appboy.");
                return;
            }
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Push token ");
            sb.append(str);
            sb.append(" registered and immediately being flushed.");
            Hg.c(str2, sb.toString());
            this.z.a(str);
            j();
        } catch (Exception e2) {
            Hg.d(a, "Failed to set the registration ID.", e2);
            a((Throwable) e2);
        }
    }

    public boolean f() {
        try {
            return this.w.a((bo) bx.g());
        } catch (Exception e2) {
            Hg.d(a, "Failed to log that the feed was displayed.", e2);
            a((Throwable) e2);
            return false;
        }
    }

    public boolean g() {
        try {
            return this.w.a((bo) bx.h());
        } catch (Exception e2) {
            Hg.d(a, "Failed to log that feedback was displayed.", e2);
            a((Throwable) e2);
            return false;
        }
    }

    public void h() {
        synchronized (this.E) {
            try {
                this.w.a(new cc.a().a());
            } catch (Exception e2) {
                Hg.d(a, "Failed to request refresh of feed.", e2);
                a((Throwable) e2);
            }
        }
    }

    public void i() {
        this.q.execute(new c(this));
    }

    public void j() {
        synchronized (this.E) {
            try {
                this.w.d();
            } catch (Exception e2) {
                Hg.d(a, "Failed to request data flush.", e2);
                a((Throwable) e2);
            }
        }
    }

    @Deprecated
    public void k() {
        synchronized (this.E) {
            try {
                this.w.a(new cc.a().c());
            } catch (Exception e2) {
                Hg.d(a, "Failed to request in-app message refresh.", e2);
                a((Throwable) e2);
            }
        }
    }

    public boolean b(Activity activity) {
        boolean z2;
        synchronized (this.E) {
            z2 = false;
            try {
                if (!this.w.a(activity).a().equals(this.w.b())) {
                    z2 = true;
                }
            } catch (Exception e2) {
                Hg.d(a, "Failed to open session.", e2);
                a((Throwable) e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public boolean c(String str) {
        try {
            if (!Ng.d(str)) {
                return this.w.a((bo) bx.b(str));
            }
            Hg.e(a, "Campaign ID cannot be null or blank");
            return false;
        } catch (Exception e2) {
            Hg.d(a, "Failed to log opened push.", e2);
            a((Throwable) e2);
            return false;
        }
    }

    public static h a(Context context) {
        if (e == null) {
            synchronized (h.class) {
                if (e == null) {
                    e = new h(context);
                }
            }
        }
        return e;
    }

    public static boolean e() {
        return j;
    }

    public j c() {
        j jVar;
        synchronized (this.D) {
            jVar = this.o;
        }
        return jVar;
    }

    public static o d() {
        return h;
    }

    private void a(ea eaVar) {
        synchronized (this.D) {
            synchronized (this.E) {
                this.r = eaVar;
                this.w = eaVar.d();
                this.v = eaVar.a();
                this.t = eaVar.l();
                this.u = eaVar.m();
                j jVar = new j(eaVar.g(), this.w, this.x.a(), eaVar.j(), this.v);
                this.o = jVar;
                eaVar.c().a(eaVar.f());
                eaVar.e().a();
                this.p = eaVar.f();
                this.q = eaVar.h();
                this.s = eaVar.i();
                this.t = eaVar.l();
                eaVar.k().a(this.q, eaVar.e());
            }
        }
    }

    public boolean b(String str) {
        boolean a2;
        synchronized (this.E) {
            a2 = a(str, (C1782vg) null);
        }
        return a2;
    }

    public void b(Yf<Zf> yf) {
        try {
            this.n.a(yf, Zf.class);
        } catch (Exception e2) {
            Hg.d(a, "Failed to add subscriber to new in-app messages.", e2);
            a((Throwable) e2);
        }
    }

    public static boolean b() {
        if (e == null) {
            synchronized (h.class) {
                if (e == null) {
                    if (i) {
                        Hg.c(a, "Appboy network requests already being mocked. Note that events dispatched in this mode are dropped.");
                        return true;
                    }
                    Hg.c(a, "Appboy network requests will be mocked. Events dispatched in this mode will be dropped.");
                    i = true;
                    return true;
                }
            }
        }
        Hg.b(a, "Attempt to enable mocking Appboy network requests had no effect since getInstance() has already been called.");
        return false;
    }

    public boolean a(Activity activity) {
        synchronized (this.E) {
            try {
                bt b2 = this.w.b(activity);
                if (b2 == null) {
                    return false;
                }
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Closed session with ID: ");
                sb.append(b2.a());
                Hg.c(str, sb.toString());
                return true;
            } catch (Exception e2) {
                Hg.d(a, "Failed to close session.", e2);
                a((Throwable) e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(String str, String str2, boolean z2) {
        synchronized (this.E) {
            try {
                this.w.a(str, str2, z2);
            } catch (Exception e2) {
                String str3 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to submit feedback: ");
                sb.append(str2);
                Hg.d(str3, sb.toString(), e2);
                a((Throwable) e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public boolean a(String str, C1782vg vgVar) {
        synchronized (this.E) {
            try {
                if (Ng.d(str)) {
                    Hg.e(a, "The custom event name cannot be null or contain only whitespaces. Ignoring custom event.");
                    return false;
                } else if (this.v.m().contains(str)) {
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The custom event is a blacklisted custom event: ");
                    sb.append(str);
                    sb.append(". Ignoring custom event.");
                    Hg.e(str2, sb.toString());
                    return false;
                } else {
                    String a2 = Og.a(str);
                    bx a3 = bx.a(a2, vgVar);
                    if (!this.w.a((bo) a3)) {
                        return false;
                    }
                    this.t.a((fb) new fa(a2, vgVar, a3));
                    return true;
                }
            } catch (Exception e2) {
                String str3 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to log custom event: ");
                sb2.append(str);
                Hg.d(str3, sb2.toString(), e2);
                a((Throwable) e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(String str, String str2, BigDecimal bigDecimal, int i2, C1782vg vgVar) {
        synchronized (this.E) {
            try {
                if (Ng.d(str)) {
                    Hg.e(a, "The productId is empty, not logging in-app purchase to Appboy.");
                    return false;
                } else if (this.v.o().contains(str)) {
                    String str3 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The productId is a blacklisted productId: ");
                    sb.append(str);
                    sb.append(", not logging in-app purchase to Appboy.");
                    Hg.e(str3, sb.toString());
                    return false;
                } else if (str2 == null) {
                    String str4 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("The currencyCode is null. Expected one of ");
                    sb2.append(b);
                    sb2.append(". Not logging in-app purchase to Appboy.");
                    Hg.e(str4, sb2.toString());
                    return false;
                } else {
                    String upperCase = str2.trim().toUpperCase(Locale.US);
                    if (!b.contains(upperCase)) {
                        String str5 = a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("The currencyCode ");
                        sb3.append(upperCase);
                        sb3.append(" is invalid. Expected one of ");
                        sb3.append(b);
                        sb3.append(". Not logging in-app purchase to Appboy.");
                        Hg.e(str5, sb3.toString());
                        return false;
                    } else if (bigDecimal == null) {
                        Hg.e(a, "The price is null. Not logging in-app purchase to Appboy.");
                        return false;
                    } else if (i2 <= 0) {
                        Hg.e(a, "The requested purchase quantity is less than zero. Not logging in-app purchase to Appboy.");
                        return false;
                    } else if (i2 > 100) {
                        Hg.e(a, "The requested purchase quantity is greater than the maximum of 100. Not logging in-app purchase to Appboy.");
                        return false;
                    } else {
                        String a2 = Og.a(str);
                        bx a3 = bx.a(a2, upperCase, bigDecimal, i2, vgVar);
                        if (!this.w.a((bo) a3)) {
                            return false;
                        }
                        this.t.a((fb) new ff(a2, vgVar, a3));
                        return true;
                    }
                }
            } catch (Exception e2) {
                String str6 = a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to log purchase event of ");
                sb4.append(str);
                Hg.d(str6, sb4.toString(), e2);
                a((Throwable) e2);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(Intent intent) {
        String str = "ab_push_fetch_test_triggers_key";
        boolean z2 = false;
        try {
            String stringExtra = intent.getStringExtra("cid");
            if (!Ng.d(stringExtra)) {
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Logging push click to Appboy. Campaign Id: ");
                sb.append(stringExtra);
                Hg.c(str2, sb.toString());
                z2 = c(stringExtra);
            } else {
                Hg.c(a, "No campaign Id associated with this notification. Not logging push click to Appboy.");
            }
            if (intent.hasExtra(str) && intent.getStringExtra(str).equals("true")) {
                Hg.c(a, "Push contained key for fetching test triggers, fetching triggers.");
                this.w.a(new cc.a().b());
            }
        } catch (Exception e2) {
            Hg.d(a, "Error logging push notification", e2);
        }
        return z2;
    }

    public boolean a(String str, String str2) {
        try {
            if (Ng.d(str)) {
                Hg.e(a, "Campaign ID cannot be null or blank. Not logging push action click.");
                return false;
            } else if (!Ng.d(str2)) {
                return this.w.a((bo) bx.b(str, str2));
            } else {
                Hg.e(a, "Action ID cannot be null or blank. Not logging push action click.");
                return false;
            }
        } catch (Exception e2) {
            Hg.d(a, "Failed to log push notification action clicked.", e2);
            a((Throwable) e2);
            return false;
        }
    }

    public void a(Yf<Xf> yf) {
        try {
            this.n.a(yf, Xf.class);
        } catch (Exception e2) {
            Hg.d(a, "Failed to add subscriber for feed updates.", e2);
            a((Throwable) e2);
        }
    }

    public <T> void a(Yf<T> yf, Class<T> cls) {
        try {
            this.n.b(yf, cls);
        } catch (Exception e2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove ");
            sb.append(cls.getName());
            sb.append(" subscriber.");
            Hg.d(str, sb.toString(), e2);
            a((Throwable) e2);
        }
    }

    public j a(String str) {
        synchronized (this.D) {
            try {
                if (Ng.e(str)) {
                    Hg.b(a, "ArgumentException: userId passed to changeUser was null or empty. The current user will remain the active user.");
                    j jVar = this.o;
                    return jVar;
                }
                String a2 = this.o.a();
                if (a2.equals(str)) {
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received request to change current user ");
                    sb.append(str);
                    sb.append(" to the same user id. Doing nothing.");
                    Hg.c(str2, sb.toString());
                } else {
                    if (a2.equals("")) {
                        String str3 = a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Changing anonymous user to ");
                        sb2.append(str);
                        Hg.c(str3, sb2.toString());
                        this.x.b(str);
                        this.o.a(str);
                    } else {
                        String str4 = a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Changing current user ");
                        sb3.append(a2);
                        sb3.append(" to new user ");
                        sb3.append(str);
                        sb3.append(".");
                        Hg.c(str4, sb3.toString());
                        Xf xf = new Xf(new ArrayList(), str, false, dn.a());
                        this.n.a(xf, Xf.class);
                    }
                    this.w.c();
                    this.x.a(str);
                    ea eaVar = this.r;
                    ea eaVar2 = new ea(this.l, this.x, this.y, this.n, this.A, this.z, i, j);
                    a(eaVar2);
                    this.r.g().d();
                    this.w.a();
                    this.w.a(new cc.a().a());
                    eaVar.n();
                }
            } catch (Exception e2) {
                String str5 = a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to set external id to: ");
                sb4.append(str);
                Hg.d(str5, sb4.toString(), e2);
                a((Throwable) e2);
            }
        }
        return this.o;
    }

    public void a(String str, ImageView imageView, boolean z2) {
        if (this.m == null) {
            Hg.e(a, "Uil LRU memory and disc cache unavailable. Could not fetch and render image.");
        } else {
            imageView.post(new f(this, str, imageView, z2));
        }
    }

    private void a(Throwable th) {
        try {
            this.p.a(th, Throwable.class);
        } catch (Exception e2) {
            Hg.b(a, "Failed to log throwable.", e2);
        }
    }

    /* access modifiers changed from: private */
    @TargetApi(16)
    public void a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (VERSION.SDK_INT < 16) {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void a(m mVar) {
        synchronized (f) {
            g = mVar;
        }
    }

    public static Uri a(Uri uri) {
        synchronized (f) {
            if (g != null) {
                try {
                    Uri a2 = g.a(uri);
                    if (a2 != null) {
                        return a2;
                    }
                } catch (Exception unused) {
                    Hg.b(a, "Caught exception trying to get an Appboy API endpoint from the AppboyEndpointProvider. Using the original URI");
                }
            }
        }
        return uri;
    }

    public static boolean a(Context context, Af af) {
        if (e != null) {
            Hg.e(a, "Appboy.configure() must be called before the first call to Appboy.getInstance()");
        } else if (!k) {
            synchronized (h.class) {
                if (e != null || k) {
                    Hg.c(a, "Appboy.configure() can only be called once during the lifetime of the singleton.");
                } else {
                    k kVar = new k(context.getApplicationContext());
                    if (af != null) {
                        k = true;
                        kVar.a(af);
                        return true;
                    }
                    Hg.c(a, "Appboy.configure() called with a null config; Clearing all configuration values.");
                    kVar.a();
                    return true;
                }
            }
        } else {
            Hg.e(a, "Appboy.configure() can only be called once during the lifetime of the singleton.");
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(bq bqVar) {
        this.u.a(bqVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        this.u.a(z2);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, v vVar) {
        this.u.b(str, vVar);
    }
}
