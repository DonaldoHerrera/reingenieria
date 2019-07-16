package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ImagesContract;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/ads/overlays/SCWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "htmlLoadingObservable", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/ads/overlays/HtmlVisualAdLoadingState;", "getHtmlLoadingObservable", "()Lio/reactivex/Observable;", "htmlLoadingSubject", "Lcom/jakewharton/rxrelay2/PublishRelay;", "wasLinkClicked", "", "getWasLinkClicked", "()Z", "setWasLinkClicked", "(Z)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "resetWasLinkClickedFlag", "shouldOverrideUrlLoading", "LocalOnGestureListener", "base_release"}, mv = {1, 1, 15})
/* renamed from: gK reason: default package and case insensitive filesystem */
/* compiled from: SCWebViewClient.kt */
public final class C3013gK extends WebViewClient {
    private final C2332VH<C2407ZJ> a;
    private final APa<C2407ZJ> b;
    private boolean c;

    /* renamed from: gK$a */
    /* compiled from: SCWebViewClient.kt */
    public final class a implements OnGestureListener {
        public a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            C7471uYa.b(motionEvent, "e");
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C7471uYa.b(motionEvent, "e1");
            C7471uYa.b(motionEvent2, "e2");
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C7471uYa.b(motionEvent, "e1");
            C7471uYa.b(motionEvent2, "e2");
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            C7471uYa.b(motionEvent, "e");
            C3013gK.this.a(true);
            return false;
        }
    }

    public C3013gK() {
        C2332VH<C2407ZJ> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create()");
        this.a = s;
        APa<C2407ZJ> h = this.a.h();
        C7471uYa.a((Object) h, "htmlLoadingSubject.hide()");
        this.b = h;
    }

    private final void b() {
        this.c = false;
    }

    public final APa<C2407ZJ> a() {
        return this.b;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onPageFinished(WebView webView, String str) {
        C7471uYa.b(webView, "view");
        super.onPageFinished(webView, str);
        WebSettings settings = webView.getSettings();
        C7471uYa.a((Object) settings, "view.settings");
        settings.setJavaScriptEnabled(true);
        this.a.accept(b.a);
        webView.evaluateJavascript("var meta = document.createElement('meta');\nmeta.setAttribute('name', 'viewport');\nmeta.setAttribute('content', 'width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no');\ndocument.getElementsByTagName('head')[0].appendChild(meta);\ndocument.body.style.margin = '0';\n", null);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C7471uYa.b(webView, "view");
        C7471uYa.b(webResourceRequest, "request");
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.a.accept(defpackage.C2407ZJ.a.a);
    }

    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C7471uYa.b(webView, "view");
        C7471uYa.b(webResourceRequest, "request");
        boolean z = this.c;
        b();
        if (z) {
            C2332VH<C2407ZJ> vh = this.a;
            String uri = webResourceRequest.getUrl().toString();
            C7471uYa.a((Object) uri, "request.url.toString()");
            vh.accept(new c(uri));
        }
        return z;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C7471uYa.b(webView, "view");
        C7471uYa.b(str, ImagesContract.URL);
        boolean z = this.c;
        b();
        if (z) {
            this.a.accept(new c(str));
        }
        return z;
    }
}
