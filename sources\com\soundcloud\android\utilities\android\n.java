package com.soundcloud.android.utilities.android;

import android.content.Context;
import android.webkit.WebSettings;

/* compiled from: WebViewHelper.kt */
public class n {
    public String a(Context context) {
        C7471uYa.b(context, "context");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        C7471uYa.a((Object) defaultUserAgent, "WebSettings.getDefaultUserAgent(context)");
        return defaultUserAgent;
    }
}
