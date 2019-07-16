package com.appboy.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appboy.h;
import java.math.BigDecimal;
import org.json.JSONObject;

public class AppboyInAppMessageHtmlJavascriptInterface {
    private static final String TAG = Hg.a(AppboyInAppMessageHtmlJavascriptInterface.class);
    private Context mContext;
    private AppboyInAppMessageHtmlUserJavascriptInterface mUserInterface;

    public AppboyInAppMessageHtmlJavascriptInterface(Context context) {
        this.mContext = context;
        this.mUserInterface = new AppboyInAppMessageHtmlUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public AppboyInAppMessageHtmlUserJavascriptInterface getUser() {
        return this.mUserInterface;
    }

    @JavascriptInterface
    public void logCustomEventWithJSON(String str, String str2) {
        h.a(this.mContext).a(str, parseProperties(str2));
    }

    @JavascriptInterface
    public void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        String str4 = str;
        String str5 = str2;
        h.a(this.mContext).a(str4, str5, new BigDecimal(Double.toString(d)), i, parseProperties(str3));
    }

    /* access modifiers changed from: 0000 */
    public C1782vg parseProperties(String str) {
        if (str != null) {
            try {
                if (!str.equals("undefined") && !str.equals("null")) {
                    return new C1782vg(new JSONObject(str));
                }
            } catch (Exception e) {
                String str2 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse properties JSON String: ");
                sb.append(str);
                Hg.b(str2, sb.toString(), e);
            }
        }
        return null;
    }

    @JavascriptInterface
    public void requestImmediateDataFlush() {
        h.a(this.mContext).j();
    }
}
