package com.appboy.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout.LayoutParams;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.activities.AppboyBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;

public class AppboyWebViewActivity extends AppboyBaseActivity {
    /* access modifiers changed from: private */
    public static final String TAG = Hg.a(AppboyWebViewActivity.class);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(2);
        requestWindowFeature(5);
        getWindow().setFlags(16777216, 16777216);
        setContentView(R$layout.com_appboy_webview_activity);
        setProgressBarVisibility(true);
        WebView webView = (WebView) findViewById(R$id.com_appboy_webview_activity_webview);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setPluginState(PluginState.OFF);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        webView.setLayoutParams(new LayoutParams(-1, -1));
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView webView, int i) {
                if (i < 100) {
                    AppboyWebViewActivity.this.setProgressBarVisibility(true);
                } else {
                    AppboyWebViewActivity.this.setProgressBarVisibility(false);
                }
            }
        });
        webView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                AppboyWebViewActivity.this.startActivity(intent);
            }
        });
        webView.getSettings().setCacheMode(2);
        webView.setLayerType(2, null);
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                try {
                    if (!Fg.b.contains(Uri.parse(str).getScheme())) {
                        ActionFactory.createUriActionFromUrlString(str, AppboyWebViewActivity.this.getIntent().getExtras(), false, Hf.UNKNOWN).execute(webView.getContext());
                        AppboyWebViewActivity.this.finish();
                        return true;
                    }
                } catch (Exception e) {
                    String access$000 = AppboyWebViewActivity.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected exception while processing url ");
                    sb.append(str);
                    sb.append(". Passing url back to WebView.");
                    Hg.c(access$000, sb.toString(), e);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = ImagesContract.URL;
            if (extras.containsKey(str)) {
                webView.loadUrl(extras.getString(str));
            }
        }
    }
}
