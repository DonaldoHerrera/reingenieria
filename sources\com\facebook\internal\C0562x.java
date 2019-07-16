package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.x reason: case insensitive filesystem */
/* compiled from: FacebookWebFallbackDialog */
public class C0562x extends oa {
    private static final String o = "com.facebook.internal.x";
    private boolean p;

    private C0562x(Context context, String str, String str2) {
        super(context, str);
        b(str2);
    }

    public void cancel() {
        WebView b = b();
        if (!d() || c() || b == null || !b.isShown()) {
            super.cancel();
        } else if (!this.p) {
            this.p = true;
            StringBuilder sb = new StringBuilder();
            sb.append("javascript:");
            sb.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            b.loadUrl(sb.toString());
            new Handler(Looper.getMainLooper()).postDelayed(new C0561w(this), 1500);
        }
    }

    public static C0562x a(Context context, String str, String str2) {
        oa.a(context);
        return new C0562x(context, str, str2);
    }

    /* access modifiers changed from: protected */
    public Bundle a(String str) {
        Bundle d = ia.d(Uri.parse(str).getQuery());
        String str2 = "bridge_args";
        String string = d.getString(str2);
        d.remove(str2);
        String str3 = "Unable to parse bridge_args JSON";
        if (!ia.b(string)) {
            try {
                d.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C0550k.a(new JSONObject(string)));
            } catch (JSONException e) {
                ia.a(o, str3, (Throwable) e);
            }
        }
        String str4 = "method_results";
        String string2 = d.getString(str4);
        d.remove(str4);
        if (!ia.b(string2)) {
            if (ia.b(string2)) {
                string2 = "{}";
            }
            try {
                d.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C0550k.a(new JSONObject(string2)));
            } catch (JSONException e2) {
                ia.a(o, str3, (Throwable) e2);
            }
        }
        d.remove("version");
        d.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", Z.c());
        return d;
    }
}
