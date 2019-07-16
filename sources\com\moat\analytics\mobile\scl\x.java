package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.webkit.WebView;
import java.lang.reflect.Method;

class x extends b implements WebAdTracker {

    static class a implements c<WebAdTracker> {
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> a;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> b;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> c;

        static {
            com.moat.analytics.mobile.scl.a.b.a<Method> a2 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a3 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a4 = com.moat.analytics.mobile.scl.a.b.a.a();
            try {
                Method method = WebAdTracker.class.getMethod("startTracking", new Class[0]);
                Method method2 = WebAdTracker.class.getMethod("stopTracking", new Class[0]);
                Method method3 = WebAdTracker.class.getMethod("setActivity", new Class[]{Activity.class});
                a2 = com.moat.analytics.mobile.scl.a.b.a.a(method);
                a3 = com.moat.analytics.mobile.scl.a.b.a.a(method2);
                a4 = com.moat.analytics.mobile.scl.a.b.a.a(method3);
            } catch (NoSuchMethodException e) {
                l.a(e);
            }
            a = a2;
            b = a3;
            c = a4;
        }

        a() {
        }

        public Class<WebAdTracker> a() {
            return WebAdTracker.class;
        }
    }

    x(WebView webView) {
        super(webView, false, false);
        if (u.d().b()) {
            n.a(3, "MoatWebAdTracker", (Object) this, "In initialization method.");
        }
        super.a(webView);
    }

    public void startTracking() {
        boolean z;
        String str = "MoatWebAdTracker";
        try {
            n.a(3, str, (Object) this, "In startTracking method.");
            super.startTracking();
            z = true;
        } catch (Exception e) {
            l.a(e);
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to start tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        n.a(3, str, (Object) this, sb.toString());
    }

    public void stopTracking() {
        boolean z;
        String str = "MoatWebAdTracker";
        try {
            n.a(3, str, (Object) this, "In stopTracking method.");
            super.stopTracking();
            z = true;
        } catch (Exception e) {
            l.a(e);
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to stop tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        n.a(3, str, (Object) this, sb.toString());
    }
}
