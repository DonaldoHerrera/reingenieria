package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: _G reason: default package and case insensitive filesystem */
public class C2423_G {
    private static C2423_G a = new C2423_G();

    private C2423_G() {
    }

    public static C2423_G a() {
        return a;
    }

    public void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public void a(WebView webView, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public void a(WebView webView, C2142LG lg, String str) {
        a(webView, "error", lg.toString(), str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject) {
        String str2 = "publishVideoEvent";
        if (jSONObject != null) {
            a(webView, str2, str, jSONObject);
            return;
        }
        a(webView, str2, str);
    }

    public void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        a(webView, "startSession", str, jSONObject, jSONObject2);
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            a(sb, objArr);
            sb.append(")}");
            a(webView, sb);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The WebView is null for ");
        sb2.append(str);
        C3029hH.a(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(WebView webView, StringBuilder sb) {
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new C2404ZG(this, webView, sb2));
        }
    }

    public void a(WebView webView, JSONObject jSONObject) {
        a(webView, "init", jSONObject);
    }

    /* access modifiers changed from: 0000 */
    public void a(StringBuilder sb, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append('\"');
                } else {
                    if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.append('\"');
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
    }

    public boolean a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("javascript: ");
        sb.append(str);
        webView.loadUrl(sb.toString());
        return true;
    }

    public void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public void b(WebView webView, String str) {
        if (str != null) {
            a(webView, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", str));
        }
    }

    public void c(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public void d(WebView webView, String str) {
        a(webView, "setState", str);
    }
}
