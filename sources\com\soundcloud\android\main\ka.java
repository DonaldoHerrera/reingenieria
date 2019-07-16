package com.soundcloud.android.main;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.soundcloud.android.deeplinks.e;

/* compiled from: WebViewActivity */
class ka extends WebViewClient {
    final /* synthetic */ WebViewActivity a;

    ka(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if (!e.d(parse)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        this.a.startActivity(intent);
        return true;
    }
}
