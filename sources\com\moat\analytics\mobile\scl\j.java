package com.moat.analytics.mobile.scl;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

class j extends MoatAnalytics implements b {
    f a;
    WeakReference<Context> b;
    private boolean c = false;
    private String d;

    j() {
    }

    private void a(MoatOptions moatOptions, Application application) {
        u.d().f();
        if (application != null) {
            if (this.c) {
                n.a(3, "MoatAnalytics", (Object) this, "Moat SDK has already been started.");
                return;
            }
            this.b = new WeakReference<>(application.getApplicationContext());
            this.c = true;
            a.a(application);
            u.d().a((b) this);
            if (!moatOptions.disableAdIdCollection) {
                p.a((Context) application);
            }
        }
    }

    private void d() {
        if (this.a == null) {
            this.a = new f(a.a(), a.DISPLAY);
            this.a.a(this.d);
            StringBuilder sb = new StringBuilder();
            sb.append("Preparing native display tracking with partner code ");
            sb.append(this.d);
            n.a(3, "MoatAnalytics", (Object) this, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.c;
    }

    public void b() {
        if (this.d != null) {
            try {
                d();
            } catch (Exception e) {
                l.a(e);
            }
        }
    }

    public void c() {
    }

    public void prepareNativeDisplayTracking(String str) {
        this.d = str;
        if (u.d().a() != d.OFF) {
            try {
                d();
            } catch (Exception e) {
                l.a(e);
            }
        }
    }

    public void start(Application application) {
        start(new MoatOptions(), application);
    }

    public void start(MoatOptions moatOptions, Application application) {
        try {
            a(moatOptions, application);
        } catch (Exception e) {
            l.a(e);
        }
    }
}
