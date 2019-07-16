package com.moat.analytics.mobile.scl;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.scl.a.a.a;
import java.lang.ref.WeakReference;
import java.util.Map;

class m extends MoatFactory {
    m() {
        if (!a()) {
            n.a(3, "MoatFactory", (Object) this, "Failed to initialize MoatFactory. Please check that you've initialized the Moat SDK correctly.");
            throw new l();
        }
    }

    private NativeDisplayTracker a(View view, final Map<String, String> map) {
        a.a(view);
        a.a(map);
        final WeakReference weakReference = new WeakReference(view);
        return (NativeDisplayTracker) v.a((a<T>) new a<NativeDisplayTracker>() {
            public com.moat.analytics.mobile.scl.a.b.a<NativeDisplayTracker> a() {
                View view = (View) weakReference.get();
                String str = "MoatFactory";
                if (view == null) {
                    n.a(3, str, (Object) this, "Target view is null. Not creating NativeDisplayTracker.");
                    return com.moat.analytics.mobile.scl.a.b.a.a();
                }
                Map map = map;
                if (map == null || map.isEmpty()) {
                    n.a(3, str, (Object) this, "adIds is null or empty. NativeDisplayTracker initialization failed.");
                    return com.moat.analytics.mobile.scl.a.b.a.a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Creating NativeDisplayTracker for ");
                sb.append(view.getClass().getSimpleName());
                sb.append("@");
                sb.append(view.hashCode());
                n.a(3, str, (Object) this, sb.toString());
                return com.moat.analytics.mobile.scl.a.b.a.a(new q(view, map));
            }
        }, (c<T>) new a<T>());
    }

    private NativeVideoTracker a(final String str) {
        return (NativeVideoTracker) v.a((a<T>) new a<NativeVideoTracker>() {
            public com.moat.analytics.mobile.scl.a.b.a<NativeVideoTracker> a() {
                String str = str;
                String str2 = "MoatFactory";
                if (str == null || str.isEmpty()) {
                    n.a(3, str2, (Object) this, "partnerCode is null or empty. NativeVideoTracker initialization failed.");
                    return com.moat.analytics.mobile.scl.a.b.a.a();
                }
                n.a(3, str2, (Object) this, "Creating NativeVideo tracker.");
                return com.moat.analytics.mobile.scl.a.b.a.a(new s(str));
            }
        }, (c<T>) new a<T>());
    }

    private WebAdTracker a(ViewGroup viewGroup) {
        a.a(viewGroup);
        final WeakReference weakReference = new WeakReference(viewGroup);
        return (WebAdTracker) v.a((a<T>) new a<WebAdTracker>() {
            public com.moat.analytics.mobile.scl.a.b.a<WebAdTracker> a() {
                ViewGroup viewGroup = (ViewGroup) weakReference.get();
                String str = "MoatFactory";
                if (viewGroup == null) {
                    n.a(3, str, (Object) this, "Target ViewGroup is null. Not creating WebAdTracker.");
                    return com.moat.analytics.mobile.scl.a.b.a.a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Creating WebAdTracker for ");
                sb.append(viewGroup.getClass().getSimpleName());
                sb.append("@");
                sb.append(viewGroup.hashCode());
                n.a(3, str, (Object) this, sb.toString());
                com.moat.analytics.mobile.scl.a.b.a a2 = y.a(viewGroup);
                boolean c = a2.c();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("WebView ");
                sb2.append(c ? "" : "not ");
                sb2.append("found inside of ad container.");
                n.a(3, str, (Object) this, sb2.toString());
                return com.moat.analytics.mobile.scl.a.b.a.a(new x((WebView) a2.c(null)));
            }
        }, (c<T>) new a<T>());
    }

    private WebAdTracker a(WebView webView) {
        a.a(webView);
        final WeakReference weakReference = new WeakReference(webView);
        return (WebAdTracker) v.a((a<T>) new a<WebAdTracker>() {
            public com.moat.analytics.mobile.scl.a.b.a<WebAdTracker> a() {
                WebView webView = (WebView) weakReference.get();
                String str = "MoatFactory";
                if (webView == null) {
                    n.a(3, str, (Object) this, "Target ViewGroup is null. Not creating WebAdTracker.");
                    return com.moat.analytics.mobile.scl.a.b.a.a();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Creating WebAdTracker for ");
                sb.append(webView.getClass().getSimpleName());
                sb.append("@");
                sb.append(webView.hashCode());
                n.a(3, str, (Object) this, sb.toString());
                return com.moat.analytics.mobile.scl.a.b.a.a(new x(webView));
            }
        }, (c<T>) new a<T>());
    }

    private <T> T a(MoatPlugin<T> moatPlugin) {
        return moatPlugin.a();
    }

    private boolean a() {
        return ((j) MoatAnalytics.getInstance()).a();
    }

    public <T> T createCustomTracker(MoatPlugin<T> moatPlugin) {
        try {
            return a(moatPlugin);
        } catch (Exception e) {
            l.a(e);
            return moatPlugin.b();
        }
    }

    public NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map) {
        try {
            return a(view, map);
        } catch (Exception e) {
            l.a(e);
            return new c();
        }
    }

    public NativeVideoTracker createNativeVideoTracker(String str) {
        try {
            return a(str);
        } catch (Exception e) {
            l.a(e);
            return new d();
        }
    }

    public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        try {
            return a(viewGroup);
        } catch (Exception e) {
            l.a(e);
            return new f();
        }
    }

    public WebAdTracker createWebAdTracker(WebView webView) {
        try {
            return a(webView);
        } catch (Exception e) {
            l.a(e);
            return new f();
        }
    }
}
