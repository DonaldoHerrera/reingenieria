package com.moat.analytics.mobile.scl;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.soundcloud.flippernative.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

class i {
    boolean a = false;
    /* access modifiers changed from: private */
    public int b = 0;
    private boolean c = false;
    private boolean d = false;
    private final WeakReference<WebView> e;
    private final Map<b, String> f;
    private final LinkedList<String> g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final long i;
    private com.moat.analytics.mobile.scl.a.b.a<String> j;
    private final List<String> k;
    private final a l;
    private final BroadcastReceiver m = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                i.this.c();
            } catch (Exception e) {
                l.a(e);
            }
            if (System.currentTimeMillis() - i.this.i > 10000) {
                i.this.e();
            }
        }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                i.this.d();
            } catch (Exception e) {
                l.a(e);
            }
        }
    };

    enum a {
        WEBVIEW,
        NATIVE_DISPLAY,
        NATIVE_VIDEO
    }

    i(WebView webView, a aVar) {
        this.e = new WeakReference<>(webView);
        this.l = aVar;
        this.j = com.moat.analytics.mobile.scl.a.b.a.a();
        this.g = new LinkedList<>();
        this.k = new ArrayList();
        this.f = new WeakHashMap();
        this.i = System.currentTimeMillis();
        IntentFilter intentFilter = new IntentFilter("UPDATE_METADATA");
        IntentFilter intentFilter2 = new IntentFilter("UPDATE_VIEW_INFO");
        C1600pd.a(g()).a(this.m, intentFilter);
        C1600pd.a(g()).a(this.n, intentFilter2);
        try {
            n.a(3, "MoatJavaScriptBridge", (Object) this, b() ? "bridge installed" : "bridge not installed");
        } catch (Exception e2) {
            l.a(e2);
        }
    }

    private boolean a(WebView webView, String str) {
        StringBuilder sb;
        String str2;
        String str3 = "MoatJavaScriptBridge";
        if (webView == null) {
            sb = new StringBuilder();
            str2 = "WebView is null. Can't ";
        } else if (webView.getSettings().getJavaScriptEnabled()) {
            return true;
        } else {
            sb = new StringBuilder();
            str2 = "JavaScript is not enabled in the given WebView. Can't ";
        }
        sb.append(str2);
        sb.append(str);
        n.a(6, str3, (Object) this, sb.toString());
        return false;
    }

    private boolean b() {
        if (i() != null && !a(i(), "installBridge")) {
            return false;
        }
        this.a = true;
        h.a().a(g(), this);
        return true;
    }

    /* access modifiers changed from: private */
    public void c() {
        String str = "MoatJavaScriptBridge";
        try {
            if (u.d().a() != d.OFF) {
                if (!this.d) {
                    n.a(3, str, (Object) this, "Ready for communication (setting environment variables).");
                    this.d = true;
                }
                String format = String.format("javascript:(function(d,l){function m(){function d(a){var b=a.c,c=a.a,f=a.b;a=a.f;var g=[];if(c)b[c]&&g.push(b[c].fn[0]);else for(key in b)if(b[key])for(var e=0,h=b[key].fn.length;e<h;e++)g.push(b[key].fn[e]);e=0;for(h=g.length;e<h;e++){var k=g[e];if('function'===typeof k)try{f?k(f):k()}catch(l){}a&&delete b[c]}}function f(a,b,c){'function'===typeof a&&(b===kuea&&c[b]?c[b].fn.push(a):c[b]={ts:+new Date,fn:[a]})}kuea=+new Date;iymv={};briz=!1;ewat=+new Date;bnkr=[];bjmk={};dptk={};uqaj={};ryup={};yhgt={};this.g=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash;this.aqzx=a.aqzx;this.appId=a.appId};this.nvsj=function(a){briz||(f(a,ewat,iymv),briz=!0)};this.bpsy=function(a,b){var c=b||kuea;c!==kuea&&bjmk[c]||f(a,c,bjmk)};this.qmrv=function(a,b){var c=b||kuea;c!==kuea&&uqaj[c]||f(a,c,uqaj)};this.lgpr=function(a,b){f(a,b||kuea,yhgt)};this.xrnk=function(a){delete yhgt[a||kuea]};this.vgft=function(a){return dptk[a||kuea]||!1};this.lkpu=function(a){return ryup[a||kuea]||!1};this.crts=function(a){var b={c:iymv,b:a,a:ewat};briz?d(b):bnkr.push(a)};this.mqjh=function(a){var b=a||kuea;dptk[b]=!0;var c={c:bjmk,f:!0};b!==kuea&&(c.b=a,c.a=a);d(c)};this.egpw=function(a){var b=a||kuea;ryup[b]=!0;var c={c:uqaj,f:!0};b!==kuea&&(c.b=a,c.a=a);d(c)};this.sglu=function(a){var b={c:yhgt,b:a.event||a,f:!1};(a.adKey||kuea)!==kuea&&(b.a=a.adKey);d(b);return 0<Object.keys(yhgt).length}}'undefined'===typeof d.MoatMAK&&(d.MoatMAK=new m,d.MoatMAK.g(l),d.__zMoatInit__=!0)})(window,%s);", new Object[]{k()});
                if (h()) {
                    i().loadUrl(format);
                }
            }
        } catch (Exception e2) {
            n.a(str, (Object) this, "Failed to initialize communication (did not set environment variables).", (Throwable) e2);
        }
    }

    private boolean c(String str) {
        if (this.a) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bridge is not installed in the given WebView. Can't ");
        sb.append(str);
        n.a(6, "MoatJavaScriptBridge", (Object) this, sb.toString());
        return false;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    public void d() {
        String sb;
        try {
            if (u.d().a() != d.OFF) {
                String str = "MoatJavaScriptBridge";
                if (this.e != null) {
                    if (h()) {
                        if (!this.c || i().getUrl() != null) {
                            if (i().getUrl() != null) {
                                this.c = true;
                            }
                            for (Entry key : this.f.entrySet()) {
                                b bVar = (b) key.getKey();
                                if (bVar == null || bVar.c() == null) {
                                    n.a(3, str, (Object) this, "Tracker has no subject");
                                    if (!bVar.c) {
                                        c(bVar);
                                    }
                                }
                                if (bVar.d) {
                                    d(String.format("javascript: MoatMAK.mqjh(\"%s\")", new Object[]{bVar.b}));
                                    String format = String.format("javascript: MoatMAK.sglu(%s)", new Object[]{bVar.a()});
                                    if (VERSION.SDK_INT >= 19) {
                                        i().evaluateJavascript(format, new ValueCallback<String>() {
                                            /* renamed from: a */
                                            public void onReceiveValue(String str) {
                                                String str2 = "null";
                                                String str3 = "MoatJavaScriptBridge";
                                                if (str == null || str.equalsIgnoreCase(str2) || str.equalsIgnoreCase("false")) {
                                                    i iVar = i.this;
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Received value is:");
                                                    if (str != null) {
                                                        StringBuilder sb2 = new StringBuilder();
                                                        sb2.append("(String)");
                                                        sb2.append(str);
                                                        str2 = sb2.toString();
                                                    }
                                                    sb.append(str2);
                                                    n.a(3, str3, (Object) iVar, sb.toString());
                                                    if (i.this.b >= 50) {
                                                        i.this.f();
                                                    }
                                                    i.this.b = i.this.b + 1;
                                                } else if (str.equalsIgnoreCase("true")) {
                                                    if (i.this.b != 0) {
                                                        n.a(3, str3, (Object) i.this, "Javascript has found ad");
                                                        i.this.e();
                                                    }
                                                    i.this.b = 0;
                                                } else {
                                                    i iVar2 = i.this;
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append("Received unusual value from Javascript:");
                                                    sb3.append(str);
                                                    n.a(3, str3, (Object) iVar2, sb3.toString());
                                                }
                                            }
                                        });
                                    } else {
                                        i().loadUrl(format);
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
                if (this.e == null) {
                    sb = "WebView ref became null, stopping tracking loop";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WebView became null");
                    sb2.append(i() == null ? "" : "based on null url");
                    sb2.append(", stopping tracking loop");
                    sb = sb2.toString();
                }
                n.a(3, str, (Object) this, sb);
                f();
            }
        } catch (Exception e2) {
            l.a(e2);
            f();
        }
    }

    private void d(b bVar) {
        n.a(3, "MoatJavaScriptBridge", (Object) this, "Stopping view update loop");
        if (bVar != null) {
            h.a().a(bVar);
        }
    }

    private void d(String str) {
        if (h()) {
            i().loadUrl(str);
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        n.a(3, "MoatJavaScriptBridge", (Object) this, "Stopping metadata reporting loop");
        h.a().a(this);
        C1600pd.a(g()).a(this.m);
    }

    /* access modifiers changed from: private */
    public void f() {
        n.a(3, "MoatJavaScriptBridge", (Object) this, "Cleaning up");
        e();
        for (Entry key : this.f.entrySet()) {
            d((b) key.getKey());
        }
        this.f.clear();
        C1600pd.a(g()).a(this.n);
    }

    private Context g() {
        return (Context) ((j) MoatAnalytics.getInstance()).b.get();
    }

    private boolean h() {
        return i() != null;
    }

    private WebView i() {
        return (WebView) this.e.get();
    }

    private String j() {
        if (this.j.c()) {
            return (String) this.j.b();
        }
        String str = "_unknown_";
        try {
            if (h()) {
                Context context = i().getContext();
                str = context.getPackageManager().getApplicationLabel(context.getApplicationContext().getApplicationInfo()).toString();
                this.j = com.moat.analytics.mobile.scl.a.b.a.a(str);
            } else {
                n.a(3, "MoatJavaScriptBridge", (Object) this, "Can't get app name, WebView is null.");
            }
        } catch (Exception e2) {
            l.a(e2);
        }
        return str;
    }

    private String k() {
        try {
            HashMap hashMap = new HashMap();
            String j2 = j();
            String num = Integer.toString(VERSION.SDK_INT);
            String b2 = p.b();
            String str = this.l == a.WEBVIEW ? BuildConfig.VERSION_NAME : "1";
            hashMap.put("versionHash", "836cf3246c33629b8774ad205b387a651e021955");
            hashMap.put("appName", j2);
            hashMap.put("namespace", "SCL");
            hashMap.put("version", "2.1.0");
            hashMap.put("deviceOS", num);
            hashMap.put("isNative", str);
            if (b2 != null) {
                hashMap.put("aqzx", b2);
            }
            return new JSONObject(hashMap).toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        n.a(3, "MoatJavaScriptBridge", (Object) this, "webViewReady");
        this.h.compareAndSet(false, true);
        e();
        for (String d2 : this.k) {
            d(d2);
        }
        this.k.clear();
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("adding tracker");
            sb.append(bVar.b);
            n.a(3, "MoatJavaScriptBridge", (Object) this, sb.toString());
            this.f.put(bVar, "");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        String format = String.format("javascript: MoatMAK.crts(%s)", new Object[]{str});
        if (this.h.get()) {
            d(format);
        } else {
            this.k.add(format);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (!this.h.get() || !h()) {
            this.g.add(jSONObject2);
            return;
        }
        d(String.format("javascript:%s.dispatchEvent(%s);", new Object[]{str, jSONObject2}));
    }

    /* access modifiers changed from: 0000 */
    public void b(String str) {
        n.a(3, "MoatJavaScriptBridge", (Object) this, "flushDispatchQueue");
        this.h.compareAndSet(false, true);
        if (this.g.size() >= 200) {
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < 10; i2++) {
                linkedList.addFirst((String) this.g.removeFirst());
            }
            int min = Math.min(Math.min(this.g.size() / 200, 10) + 200, this.g.size());
            for (int i3 = 0; i3 < min; i3++) {
                this.g.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.g.addFirst((String) it.next());
            }
        }
        int i4 = 0;
        while (!this.g.isEmpty() && i4 < 200) {
            i4++;
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            while (!this.g.isEmpty() && i4 < 200) {
                i4++;
                String str2 = (String) this.g.getFirst();
                if (sb.length() + str2.length() > 2000) {
                    break;
                }
                this.g.removeFirst();
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(str2);
            }
            d(String.format("javascript:%s.dispatchMany([%s])", new Object[]{str, sb.toString()}));
        }
        this.g.clear();
    }

    /* access modifiers changed from: 0000 */
    public boolean b(b bVar) {
        String str = "startTracking";
        String str2 = "MoatJavaScriptBridge";
        try {
            if (h() && a(i(), str)) {
                if (c(str)) {
                    if (bVar.c() == null) {
                        if (!bVar.c) {
                            n.a(3, str2, (Object) this, "Tracker subject is null, won't start tracking");
                            return false;
                        }
                        n.a(3, str2, (Object) this, "Tracker subject is null at start");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Starting tracking on tracker");
                    sb.append(bVar.b);
                    n.a(3, str2, (Object) this, sb.toString());
                    d(String.format("javascript: MoatMAK.mqjh(\"%s\")", new Object[]{bVar.b}));
                    h.a().a(g(), bVar);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            n.a(str2, (Object) this, "Failed to initialize impression start.", (Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c(b bVar) {
        String str = "MoatJavaScriptBridge";
        boolean z = false;
        if (h()) {
            String str2 = "stopTracking";
            if (a(i(), str2) && c(str2)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Ending tracking on tracker");
                    sb.append(bVar.b);
                    n.a(3, str, (Object) this, sb.toString());
                    d(String.format("javascript: MoatMAK.egpw(\"%s\")", new Object[]{bVar.b}));
                } catch (Exception e2) {
                    n.a(str, (Object) this, "Failed to end impression.", (Throwable) e2);
                }
                z = true;
            }
        }
        if (this.l == a.NATIVE_DISPLAY) {
            d(bVar);
        } else {
            f();
        }
        this.f.remove(bVar);
        return z;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            super.finalize();
            n.a(3, "MoatJavaScriptBridge", (Object) this, "finalize");
            f();
        } catch (Exception e2) {
            l.a(e2);
        }
    }
}
