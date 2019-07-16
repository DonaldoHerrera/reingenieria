package defpackage;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;

@EVa(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0012J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0012J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J0\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u0014\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0019H\u0012J\f\u0010&\u001a\u00020\u001f*\u00020!H\u0012J\f\u0010'\u001a\u00020\u001f*\u00020!H\u0012J$\u0010(\u001a\u00020\u001f*\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006*"}, d2 = {"Lcom/soundcloud/android/ads/overlays/HtmlVisualAdRenderer;", "", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "(Lcom/soundcloud/android/utils/DeviceHelper;)V", "scWebViewClient", "Lcom/soundcloud/android/ads/overlays/SCWebViewClient;", "webViewHtmlLoadingObservable", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/ads/overlays/HtmlVisualAdLoadingState;", "getWebViewHtmlLoadingObservable", "()Lio/reactivex/Observable;", "buildLayoutParamsForWebView", "Landroid/widget/RelativeLayout$LayoutParams;", "apiWidth", "", "apiHeight", "isResponsive", "", "canFitIntoDeviceScreen", "widthInPx", "heightInPx", "dpToPx", "sizeDp", "displayMetrics", "Landroid/util/DisplayMetrics;", "getAdjustedSize", "Lkotlin/Pair;", "apihtmlWidth", "apiHtmlHeight", "render", "", "webView", "Landroid/webkit/WebView;", "htmlResource", "", "scaleDownToScreenSize", "", "disableScroll", "disableZoom", "setLayout", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: _J reason: default package and case insensitive filesystem */
/* compiled from: HtmlVisualAdRenderer.kt */
public class C2426_J {
    private final C3013gK a = new C3013gK();
    private final APa<C2407ZJ> b = this.a.a();
    private final C6699jHa c;

    /* renamed from: _J$a */
    /* compiled from: HtmlVisualAdRenderer.kt */
    public static class a {
        private final C6699jHa a;

        public a(C6699jHa jha) {
            C7471uYa.b(jha, "deviceHelper");
            this.a = jha;
        }

        public C2426_J a() {
            return new C2426_J(this.a);
        }
    }

    public C2426_J(C6699jHa jha) {
        C7471uYa.b(jha, "deviceHelper");
        this.c = jha;
    }

    private void b(WebView webView) {
        webView.getSettings().setSupportZoom(false);
        WebSettings settings = webView.getSettings();
        C7471uYa.a((Object) settings, "settings");
        settings.setBuiltInZoomControls(false);
    }

    public APa<C2407ZJ> a() {
        return this.b;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void a(WebView webView, String str, int i, int i2, boolean z) {
        C7471uYa.b(webView, "webView");
        C7471uYa.b(str, "htmlResource");
        webView.loadData(str, "text/html", "UTF-8");
        a(webView, i, i2, z);
        b(webView);
        a(webView);
        webView.requestFocus(130);
        WebSettings settings = webView.getSettings();
        C7471uYa.a((Object) settings, "settings");
        settings.setJavaScriptEnabled(true);
        C3013gK gKVar = this.a;
        webView.setWebViewClient(gKVar);
        webView.setOnTouchListener(new C2445aK(new C0283Yb(webView.getContext(), new defpackage.C3013gK.a())));
    }

    private HVa<Integer, Integer> b(int i, int i2, boolean z) {
        DisplayMetrics g = this.c.g();
        int a2 = a(i, g);
        int a3 = a(i2, g);
        int i3 = this.c.m() ? g.widthPixels : g.heightPixels;
        if (z) {
            a2 = i3;
            a3 = a2;
        } else if (!a(a2, a3)) {
            HVa a4 = a((float) a2, (float) a3, g);
            int intValue = ((Number) a4.c()).intValue();
            a3 = ((Number) a4.d()).intValue();
            a2 = intValue;
        }
        return NVa.a(Integer.valueOf(a2), Integer.valueOf(a3));
    }

    private void a(WebView webView, int i, int i2, boolean z) {
        webView.setInitialScale(1);
        WebSettings settings = webView.getSettings();
        String str = "settings";
        C7471uYa.a((Object) settings, str);
        settings.setLoadWithOverviewMode(true);
        WebSettings settings2 = webView.getSettings();
        C7471uYa.a((Object) settings2, str);
        settings2.setUseWideViewPort(true);
        webView.setLayoutParams(a(i, i2, z));
    }

    private void a(WebView webView) {
        webView.setOverScrollMode(2);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
    }

    private LayoutParams a(int i, int i2, boolean z) {
        HVa b2 = b(i, i2, z);
        LayoutParams layoutParams = new LayoutParams(((Number) b2.c()).intValue(), ((Number) b2.d()).intValue());
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    private boolean a(int i, int i2) {
        DisplayMetrics g = this.c.g();
        if (this.c.m() && i <= g.widthPixels) {
            return true;
        }
        if (!this.c.k() || i2 > g.heightPixels) {
            return false;
        }
        return true;
    }

    private HVa<Integer, Integer> a(float f, float f2, DisplayMetrics displayMetrics) {
        float f3 = this.c.m() ? ((float) displayMetrics.widthPixels) / f : ((float) displayMetrics.heightPixels) / f2;
        return NVa.a(Integer.valueOf((int) (f * f3)), Integer.valueOf((int) (f2 * f3)));
    }

    private int a(int i, DisplayMetrics displayMetrics) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }
}
