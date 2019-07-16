package com.comscore.android.vce;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class ai extends WebViewClient {
    WebViewClient a;
    private ah<al> b;

    ai(al alVar, WebViewClient webViewClient) {
        this.b = new ah<>(alVar);
        this.a = webViewClient;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("doUpdateVisitedHistory", webViewClient, WebView.class, String.class, Boolean.TYPE)) {
                this.a.doUpdateVisitedHistory(webView, str, z);
                return;
            }
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onFormResubmission", webViewClient, WebView.class, Message.class, Message.class)) {
                this.a.onFormResubmission(webView, message, message2);
                return;
            }
        }
        super.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onLoadResource", webViewClient, WebView.class, String.class)) {
                this.a.onLoadResource(webView, str);
                return;
            }
        }
        super.onLoadResource(webView, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    public void onPageFinished(WebView webView, String str) {
        al alVar;
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onPageFinished", webViewClient, WebView.class, String.class)) {
                this.a.onPageFinished(webView, str);
                ah<al> ahVar = this.b;
                alVar = ahVar == null ? (al) ahVar.get() : null;
                if (alVar == null) {
                    alVar.c();
                    return;
                }
                return;
            }
        }
        super.onPageFinished(webView, str);
        ah<al> ahVar2 = this.b;
        if (ahVar2 == null) {
        }
        if (alVar == null) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        al alVar;
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onPageStarted", webViewClient, WebView.class, String.class, Bitmap.class)) {
                this.a.onPageStarted(webView, str, bitmap);
                ah<al> ahVar = this.b;
                alVar = ahVar == null ? (al) ahVar.get() : null;
                if (alVar == null) {
                    alVar.d();
                    return;
                }
                return;
            }
        }
        super.onPageStarted(webView, str, bitmap);
        ah<al> ahVar2 = this.b;
        if (ahVar2 == null) {
        }
        if (alVar == null) {
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedError", webViewClient, WebView.class, Integer.TYPE, String.class, String.class)) {
                this.a.onReceivedError(webView, i, str, str2);
                return;
            }
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedHttpAuthRequest", webViewClient, WebView.class, HttpAuthHandler.class, String.class, String.class)) {
                this.a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                return;
            }
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedLoginRequest", webViewClient, WebView.class, String.class, String.class, String.class)) {
                this.a.onReceivedLoginRequest(webView, str, str2, str3);
                return;
            }
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedSslError", webViewClient, WebView.class, SslErrorHandler.class, SslError.class)) {
                this.a.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    public void onScaleChanged(WebView webView, float f, float f2) {
        al alVar;
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            Class cls = Float.TYPE;
            if (t.a("onScaleChanged", webViewClient, WebView.class, cls, cls)) {
                this.a.onScaleChanged(webView, f, f2);
                ah<al> ahVar = this.b;
                alVar = ahVar == null ? (al) ahVar.get() : null;
                if (alVar == null) {
                    alVar.a(f2);
                    return;
                }
                return;
            }
        }
        super.onScaleChanged(webView, f, f2);
        ah<al> ahVar2 = this.b;
        if (ahVar2 == null) {
        }
        if (alVar == null) {
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onUnhandledKeyEvent", webViewClient, WebView.class, KeyEvent.class)) {
                this.a.onUnhandledKeyEvent(webView, keyEvent);
                return;
            }
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldInterceptRequest", webViewClient, WebView.class, String.class)) {
                return this.a.shouldInterceptRequest(webView, str);
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldOverrideKeyEvent", webViewClient, WebView.class, KeyEvent.class)) {
                return this.a.shouldOverrideKeyEvent(webView, keyEvent);
            }
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldOverrideUrlLoading", webViewClient, WebView.class, String.class)) {
                return this.a.shouldOverrideUrlLoading(webView, str);
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
