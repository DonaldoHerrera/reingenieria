package com.comscore.android.vce;

import android.annotation.SuppressLint;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

class am {
    private static final String a = "WebViewManager";
    private final p b;
    private final s c;
    private final k d;
    private final an e;
    private final LinkedList<al> f;
    private boolean g;
    /* access modifiers changed from: private */
    public a h;
    private boolean i = false;
    private boolean j;
    /* access modifiers changed from: private */
    public boolean k = false;
    /* access modifiers changed from: private */
    public float l = 1.0f;
    private final ah<WebView> m;
    private z n;

    class a {
        a() {
        }

        @JavascriptInterface
        public void wvUnload() {
            am.this.t();
        }

        @JavascriptInterface
        public void wvload() {
            am.this.u();
        }
    }

    am(p pVar, s sVar, k kVar, an anVar, WebView webView) {
        this.b = pVar;
        this.c = sVar;
        this.d = kVar;
        this.m = new ah<>(webView);
        this.j = false;
        this.f = new LinkedList<>();
        this.e = anVar;
        this.e.a(this);
    }

    /* access modifiers changed from: private */
    public void a(final float f2, final boolean z) {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (z) {
                        am.this.k = true;
                    }
                    am.this.a(f2);
                } catch (Exception unused) {
                }
            }
        });
    }

    private void a(final WebView webView, final WebViewClient webViewClient, final ak akVar) {
        this.c.b(new Runnable() {
            public void run() {
                try {
                    am.this.b(webView, webViewClient, akVar);
                } catch (Exception unused) {
                }
            }
        });
    }

    private void a(final WebView webView, ak akVar) {
        v();
        b(webView, akVar);
        if (akVar.a() != null && this.d.b((Object) akVar.a()).contains("com.mopub.")) {
            this.c.b(new Runnable() {
                public void run() {
                    try {
                        if (webView.getProgress() == 100) {
                            am.this.s();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049 A[Catch:{ Exception -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    public void b(WebView webView, WebViewClient webViewClient, ak akVar) {
        String str;
        if (akVar.d()) {
            webView.setWebViewClient(webViewClient);
            return;
        }
        try {
            Class cls = webView.getClass();
            while (true) {
                if (cls.getCanonicalName().equals("android.webkit.WebView")) {
                    break;
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    cls = webView.getClass();
                    break;
                }
            }
            Field field = null;
            if (!this.d.i() || this.d.h()) {
                if (this.d.h()) {
                    str = "mProvider";
                }
                if (field == null) {
                    field.setAccessible(true);
                    Object obj = field.get(webView);
                    if (obj != null) {
                        obj.getClass().getDeclaredMethod("setWebViewClient", new Class[]{WebViewClient.class}).invoke(obj, new Object[]{webViewClient});
                        return;
                    }
                    return;
                }
                return;
            }
            str = "mCallbackProxy";
            field = cls.getDeclaredField(str);
            if (field == null) {
            }
        } catch (Exception unused) {
        }
    }

    private void b(WebView webView, ak akVar) {
        al alVar = new al(this.b, this.d, this, akVar.a());
        a(webView, alVar.e(), akVar);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((al) it.next()).a();
        }
        this.f.add(alVar);
        this.n.e(1);
    }

    private void q() {
        this.j = false;
        this.n.W();
    }

    /* access modifiers changed from: private */
    public void r() {
        v();
    }

    /* access modifiers changed from: private */
    public void s() {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    am.this.j();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void t() {
        q();
        this.i = true;
    }

    /* access modifiers changed from: private */
    public void u() {
        if (!this.i && !this.g) {
            this.e.d();
        }
        j();
        this.i = true;
    }

    private void v() {
        final WebView webView = (WebView) this.m.get();
        if (webView != null && this.h == null) {
            this.h = new a();
            this.c.b(new Runnable() {
                @SuppressLint({"AddJavascriptInterface"})
                public void run() {
                    try {
                        webView.addJavascriptInterface(am.this.h, "VCEJSObj");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void w() {
        this.n.e(0);
        v();
        this.e.a(this.i);
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        this.n.a(f2);
    }

    /* access modifiers changed from: 0000 */
    public void a(z zVar) {
        this.n = zVar;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public void b(float f2) {
        a(f2, true);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public WebViewClient d() {
        if (this.f.size() > 0) {
            return ((al) this.f.getLast()).e();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        return this.f.size();
    }

    /* access modifiers changed from: 0000 */
    public WebViewClient f() {
        if (this.f.size() > 0) {
            return ((al) this.f.getLast()).f();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public a g() {
        return this.h;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        if (!this.g) {
            this.e.a(this.i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        if (!this.g) {
            this.e.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        this.j = true;
        this.n.V();
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.j = false;
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    am.this.r();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void m() {
        this.c.a((Runnable) new Runnable() {
            public void run() {
                try {
                    am.this.j();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        if (!this.k) {
            final WebView webView = (WebView) this.m.get();
            if (webView != null && !this.d.g()) {
                this.c.b(new Runnable() {
                    public void run() {
                        try {
                            float scale = webView.getScale();
                            if (scale != am.this.l) {
                                am.this.l = scale;
                                am.this.a(scale, false);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        WebView webView = (WebView) this.m.get();
        if (webView != null) {
            ak a2 = this.d.a(webView);
            if (a2.j()) {
                this.g = true;
                a(webView, a2);
            } else {
                this.g = false;
                w();
            }
            a2.k();
        }
    }

    /* access modifiers changed from: 0000 */
    public void p() {
        this.e.e();
        ah<WebView> ahVar = this.m;
        if (ahVar != null) {
            ahVar.clear();
        }
        LinkedList<al> linkedList = this.f;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((al) it.next()).b();
            }
            this.f.clear();
        }
    }
}
