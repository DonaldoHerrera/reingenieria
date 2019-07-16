package com.soundcloud.android.payments;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ImagesContract;

/* compiled from: WebCheckoutView.kt */
public final class Wa extends WebViewClient {
    Wa() {
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C7471uYa.b(webView, "view");
        C7471uYa.b(webResourceRequest, "request");
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C7471uYa.b(webView, "view");
        C7471uYa.b(str, ImagesContract.URL);
        return false;
    }
}
