package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager */
public final class E {
    /* access modifiers changed from: private */
    public static final String a = "E";
    private static final String[] b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};
    /* access modifiers changed from: private */
    public static final Map<String, A> c = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public static final AtomicReference<a> d = new AtomicReference<>(a.NOT_LOADED);
    private static final ConcurrentLinkedQueue<b> e = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */
    public static boolean f = false;
    private static boolean g = false;
    private static JSONArray h = null;

    /* compiled from: FetchedAppSettingsManager */
    enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* compiled from: FetchedAppSettingsManager */
    public interface b {
        void a();

        void a(A a);
    }

    public static void f() {
        Context e2 = B.e();
        String f2 = B.f();
        if (ia.b(f2)) {
            d.set(a.ERROR);
            g();
        } else if (c.containsKey(f2)) {
            d.set(a.SUCCESS);
            g();
        } else {
            if (!(d.compareAndSet(a.NOT_LOADED, a.LOADING) || d.compareAndSet(a.ERROR, a.LOADING))) {
                g();
            } else {
                B.m().execute(new B(e2, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{f2}), f2));
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    public static synchronized void g() {
        synchronized (E.class) {
            a aVar = (a) d.get();
            if (!a.NOT_LOADED.equals(aVar)) {
                if (!a.LOADING.equals(aVar)) {
                    A a2 = (A) c.get(B.f());
                    Handler handler = new Handler(Looper.getMainLooper());
                    if (a.ERROR.equals(aVar)) {
                        while (!e.isEmpty()) {
                            handler.post(new C((b) e.poll()));
                        }
                        return;
                    }
                    while (!e.isEmpty()) {
                        handler.post(new D((b) e.poll(), a2));
                    }
                }
            }
        }
    }

    public static A b(String str) {
        if (str != null) {
            return (A) c.get(str);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(b))));
        GraphRequest a2 = GraphRequest.a((AccessToken) null, str, (com.facebook.GraphRequest.b) null);
        a2.a(true);
        a2.a(bundle);
        return a2.b().b();
    }

    /* access modifiers changed from: private */
    public static A b(String str, JSONObject jSONObject) {
        C0559u uVar;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            uVar = C0559u.a();
        } else {
            uVar = C0559u.a(optJSONArray);
        }
        C0559u uVar2 = uVar;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        h = optJSONArray2;
        if (h != null && T.b()) {
            Gk.a(optJSONArray2.toString());
        }
        A a2 = r2;
        A a3 = new A(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject2.optInt("app_events_session_timeout", Vk.a()), ea.a(jSONObject2.optLong("seamless_login")), a(jSONObject2.optJSONObject("android_dialog_configs")), z, uVar2, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4);
        A a4 = a2;
        c.put(str, a4);
        return a4;
    }

    public static A a(String str, boolean z) {
        if (!z && c.containsKey(str)) {
            return (A) c.get(str);
        }
        JSONObject c2 = c(str);
        if (c2 == null) {
            return null;
        }
        A b2 = b(str, c2);
        if (str.equals(B.f())) {
            d.set(a.SUCCESS);
            g();
        }
        return b2;
    }

    private static Map<String, Map<String, com.facebook.internal.A.a>> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    com.facebook.internal.A.a a2 = com.facebook.internal.A.a.a(optJSONArray.optJSONObject(i));
                    if (a2 != null) {
                        String a3 = a2.a();
                        Map map = (Map) hashMap.get(a3);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a3, map);
                        }
                        map.put(a2.b(), a2);
                    }
                }
            }
        }
        return hashMap;
    }
}
