package com.appboy.ui.actions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.r;
import com.appboy.ui.AppboyWebViewActivity;
import com.appboy.ui.support.UriUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.List;

public class UriAction implements IAction {
    private static final String TAG = Hg.a(UriAction.class);
    private final Hf mChannel;
    private final Bundle mExtras;
    private Uri mUri;
    private boolean mUseWebView;

    UriAction(Uri uri, Bundle bundle, boolean z, Hf hf) {
        this.mUri = uri;
        this.mExtras = bundle;
        this.mUseWebView = z;
        this.mChannel = hf;
    }

    private static Intent getActionViewIntent(Context context, Uri uri, Bundle bundle) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.size() > 1) {
            Iterator it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                if (resolveInfo.activityInfo.packageName.equals(context.getPackageName())) {
                    String str = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting deep link activity to ");
                    sb.append(resolveInfo.activityInfo.packageName);
                    sb.append(".");
                    Log.d(str, sb.toString());
                    intent.setPackage(resolveInfo.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    private static void openUriWithActionView(Context context, Uri uri, Bundle bundle) {
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        actionViewIntent.setFlags(872415232);
        if (actionViewIntent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(actionViewIntent);
            return;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find appropriate activity to open for deep link ");
        sb.append(uri);
        sb.append(".");
        Log.w(str, sb.toString());
    }

    private static void openUriWithActionViewFromPush(Context context, Uri uri, Bundle bundle) {
        Bf bf = new Bf(context);
        Intent actionViewIntent = getActionViewIntent(context, uri, bundle);
        r a = r.a(context);
        if (bf.o()) {
            String t = bf.t();
            if (Ng.d(t)) {
                Hg.c(TAG, "Adding main activity intent to back stack while opening uri from push");
                a.a(UriUtils.getMainActivityIntent(context, bundle));
            } else if (UriUtils.isActivityRegisteredInManifest(context, t)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Adding custom back stack activity while opening uri from push: ");
                sb.append(t);
                Hg.c(str, sb.toString());
                a.a(new Intent().setClassName(context, t));
            } else {
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not adding unregistered activity to the back stack while opening uri from push: ");
                sb2.append(t);
                Hg.c(str2, sb2.toString());
            }
        } else {
            Hg.c(TAG, "Not adding back stack activity while opening uri from push due to disabled configuration setting.");
        }
        a.a(actionViewIntent);
        try {
            a.a(bundle);
        } catch (ActivityNotFoundException e) {
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not find appropriate activity to open for deep link ");
            sb3.append(uri);
            Log.w(str3, sb3.toString(), e);
        }
    }

    static void openUriWithWebView(Context context, Uri uri, Bundle bundle) {
        if (!Fg.b.contains(uri.getScheme())) {
            Log.d(TAG, "Opening non-remote scheme uri with action_view intent.");
            openUriWithActionView(context, uri, bundle);
            return;
        }
        try {
            Intent intent = new Intent(context, AppboyWebViewActivity.class);
            intent.setFlags(872415232);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra(ImagesContract.URL, uri.toString());
            context.startActivity(intent);
        } catch (Exception e) {
            Hg.b(TAG, "Appboy AppboyWebViewActivity not opened successfully.", e);
        }
    }

    public void execute(Context context) {
        if (Fg.a(this.mUri)) {
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Not executing local Uri: ");
            sb.append(this.mUri);
            Hg.a(str, sb.toString());
            return;
        }
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Executing Uri action from channel ");
        sb2.append(this.mChannel);
        sb2.append(": ");
        sb2.append(this.mUri);
        sb2.append(". UseWebView: ");
        sb2.append(this.mUseWebView);
        Hg.a(str2, sb2.toString());
        if (this.mUseWebView) {
            openUriWithWebView(context, this.mUri, this.mExtras);
        } else if (this.mChannel.equals(Hf.PUSH)) {
            openUriWithActionViewFromPush(context, this.mUri, this.mExtras);
        } else {
            openUriWithActionView(context, this.mUri, this.mExtras);
        }
    }

    public Uri getUri() {
        return this.mUri;
    }
}
