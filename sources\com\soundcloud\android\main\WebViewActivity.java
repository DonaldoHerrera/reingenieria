package com.soundcloud.android.main;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

public class WebViewActivity extends RootActivity {
    private WebView n;

    public void onBackPressed() {
        if (!z() || !this.n.canGoBack()) {
            super.onBackPressed();
        } else {
            this.n.goBack();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = (WebView) findViewById(i.webview);
        Uri data = getIntent() != null ? getIntent().getData() : null;
        if (data != null) {
            this.n.getSettings().setJavaScriptEnabled(true);
            this.n.getSettings().setDomStorageEnabled(true);
            this.n.getSettings().setBlockNetworkImage(false);
            this.n.getSettings().setLoadsImagesAutomatically(true);
            this.n.setWebViewClient(new ka(this));
            this.n.loadUrl(data.toString());
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        setContentView(l.web_view);
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return true;
    }
}
