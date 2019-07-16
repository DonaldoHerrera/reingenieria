package defpackage;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: oH reason: default package and case insensitive filesystem */
public class C3172oH extends C3143nH {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C3172oH(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
