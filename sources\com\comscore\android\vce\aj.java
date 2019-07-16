package com.comscore.android.vce;

import android.annotation.TargetApi;
import android.view.InputEvent;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class aj extends ai {
    aj(al alVar, WebViewClient webViewClient) {
        super(alVar, webViewClient);
    }

    @TargetApi(21)
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onReceivedClientCertRequest", webViewClient, WebView.class, ClientCertRequest.class)) {
                this.a.onReceivedClientCertRequest(webView, clientCertRequest);
                return;
            }
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @TargetApi(21)
    public void onUnhandledInputEvent(WebView webView, InputEvent inputEvent) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("onUnhandledInputEvent", webViewClient, WebView.class, InputEvent.class)) {
                this.a.onUnhandledInputEvent(webView, inputEvent);
                return;
            }
        }
        super.onUnhandledInputEvent(webView, inputEvent);
    }

    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            if (t.a("shouldInterceptRequest", webViewClient, WebView.class, WebResourceRequest.class)) {
                return this.a.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
