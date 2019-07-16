package com.soundcloud.android.payments;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.payments.Fa.i;
import com.soundcloud.android.view.CircularProgressBar;
import com.soundcloud.android.view.Y;
import com.soundcloud.android.view.customfontviews.CustomFontButton;

@EVa(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u00011B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0012J\b\u0010\"\u001a\u00020\u001fH\u0013J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J\u0010\u0010\u0007\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010\u000b\u001a\u00020\u001fH\u0016J \u0010*\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/soundcloud/android/payments/WebCheckoutView;", "", "()V", "loading", "Landroid/view/View;", "getLoading", "()Landroid/view/View;", "setLoading", "(Landroid/view/View;)V", "retry", "getRetry", "setRetry", "retryButton", "Landroid/widget/Button;", "getRetryButton", "()Landroid/widget/Button;", "setRetryButton", "(Landroid/widget/Button;)V", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "webviewMonitor", "Lcom/soundcloud/android/view/WebViewMonitor;", "getWebviewMonitor", "()Lcom/soundcloud/android/view/WebViewMonitor;", "setWebviewMonitor", "(Lcom/soundcloud/android/view/WebViewMonitor;)V", "bindViews", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "configureWebView", "handleBackPress", "", "loadUrl", "url", "", "onDestroy", "isLoading", "setupContentView", "listener", "Lcom/soundcloud/android/payments/WebCheckoutView$Listener;", "setupJavaScriptInterface", "name", "checkoutInterface", "Lcom/soundcloud/android/payments/WebCheckoutInterface;", "Listener", "payments_release"}, mv = {1, 1, 15})
/* compiled from: WebCheckoutView.kt */
public class Va {
    public WebView a;
    public Y b;
    public View c;
    public View d;
    public Button e;

    /* compiled from: WebCheckoutView.kt */
    public interface a {
        void p();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void i() {
        WebSettings settings = d().getSettings();
        C7471uYa.a((Object) settings, "settings");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setLoadsImagesAutomatically(true);
        d().setWebViewClient(new Wa());
        e().b(d());
    }

    public void a(WebView webView) {
        C7471uYa.b(webView, "<set-?>");
        this.a = webView;
    }

    public View b() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        C7471uYa.b("retry");
        throw null;
    }

    public Button c() {
        Button button = this.e;
        if (button != null) {
            return button;
        }
        C7471uYa.b("retryButton");
        throw null;
    }

    public WebView d() {
        WebView webView = this.a;
        if (webView != null) {
            return webView;
        }
        C7471uYa.b("webView");
        throw null;
    }

    public Y e() {
        Y y = this.b;
        if (y != null) {
            return y;
        }
        C7471uYa.b("webviewMonitor");
        throw null;
    }

    public boolean f() {
        if (!d().canGoBack()) {
            return false;
        }
        d().goBack();
        return true;
    }

    public void g() {
        e().a(d());
    }

    public void h() {
        a().setVisibility(8);
        b().setVisibility(0);
    }

    public void a(Y y) {
        C7471uYa.b(y, "<set-?>");
        this.b = y;
    }

    public void b(View view) {
        C7471uYa.b(view, "<set-?>");
        this.d = view;
    }

    public View a() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        C7471uYa.b("loading");
        throw null;
    }

    public void a(View view) {
        C7471uYa.b(view, "<set-?>");
        this.c = view;
    }

    public void a(Button button) {
        C7471uYa.b(button, "<set-?>");
        this.e = button;
    }

    public void a(AppCompatActivity appCompatActivity, a aVar, Y y) {
        C7471uYa.b(appCompatActivity, "activity");
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        C7471uYa.b(y, "webviewMonitor");
        a(y);
        a(appCompatActivity);
        i();
        c().setOnClickListener(new Xa(aVar));
    }

    private void a(AppCompatActivity appCompatActivity) {
        WebView webView = (WebView) appCompatActivity.findViewById(i.payment_form);
        C7471uYa.a((Object) webView, "activity.payment_form");
        a(webView);
        CircularProgressBar circularProgressBar = (CircularProgressBar) appCompatActivity.findViewById(i.loading);
        C7471uYa.a((Object) circularProgressBar, "activity.loading");
        a((View) circularProgressBar);
        RelativeLayout relativeLayout = (RelativeLayout) appCompatActivity.findViewById(i.retry);
        C7471uYa.a((Object) relativeLayout, "activity.retry");
        b(relativeLayout);
        CustomFontButton customFontButton = (CustomFontButton) appCompatActivity.findViewById(i.retry_button);
        C7471uYa.a((Object) customFontButton, "activity.retry_button");
        a((Button) customFontButton);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void a(String str, Ra ra) {
        C7471uYa.b(str, "name");
        C7471uYa.b(ra, "checkoutInterface");
        d().addJavascriptInterface(ra, str);
    }

    public void a(String str) {
        C7471uYa.b(str, ImagesContract.URL);
        d().loadUrl(str);
    }

    public void a(boolean z) {
        int i = 8;
        b().setVisibility(8);
        View a2 = a();
        int i2 = 0;
        if (z) {
            i = 0;
        }
        a2.setVisibility(i);
        WebView d2 = d();
        if (z) {
            i2 = 4;
        }
        d2.setVisibility(i2);
    }
}
