package com.appboy.ui.actions;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;

public final class GooglePlayAppDetailsAction implements IAction {
    private static final String TAG = Hg.a(GooglePlayAppDetailsAction.class);
    private final Ef mAppStore;
    private final Hf mChannel;
    private final String mKindleId;
    private final String mPackageName;
    private boolean mUseWebView;

    public GooglePlayAppDetailsAction(String str, boolean z, Ef ef, String str2, Hf hf) {
        this.mPackageName = str;
        this.mUseWebView = z;
        this.mAppStore = ef;
        this.mKindleId = str2;
        this.mChannel = hf;
    }

    public void execute(Context context) {
        String str;
        String str2;
        if (this.mAppStore != Ef.KINDLE_STORE) {
            try {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            } catch (NameNotFoundException unused) {
                Hg.c(TAG, "Google Play Store not found, launching Play Store with WebView");
                this.mUseWebView = true;
            } catch (Exception unused2) {
                Hg.b(TAG, "Unexpected exception while checking for com.google.android.gsf.");
                this.mUseWebView = true;
            }
        }
        if (this.mUseWebView) {
            if (this.mAppStore == Ef.KINDLE_STORE) {
                StringBuilder sb = new StringBuilder();
                sb.append("http://www.amazon.com/gp/mas/dl/android?asin=");
                sb.append(this.mKindleId);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https://play.google.com/store/apps/details?id=");
                sb2.append(this.mPackageName);
                str2 = sb2.toString();
            }
            UriAction.openUriWithWebView(context, Uri.parse(str2), null);
            return;
        }
        if (this.mAppStore == Ef.KINDLE_STORE) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("amzn://apps/android?asin=");
            sb3.append(this.mKindleId);
            str = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("market://details?id=");
            sb4.append(this.mPackageName);
            str = sb4.toString();
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
