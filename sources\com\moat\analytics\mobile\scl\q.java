package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

class q extends b implements NativeDisplayTracker {
    private final Map<String, String> e;

    static class a implements c<NativeDisplayTracker> {
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> a;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> b;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> c;

        static {
            com.moat.analytics.mobile.scl.a.b.a<Method> a2 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a3 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a4 = com.moat.analytics.mobile.scl.a.b.a.a();
            try {
                Method method = NativeDisplayTracker.class.getMethod("startTracking", new Class[0]);
                Method method2 = NativeDisplayTracker.class.getMethod("stopTracking", new Class[0]);
                Method method3 = NativeDisplayTracker.class.getMethod("setActivity", new Class[]{Activity.class});
                a2 = com.moat.analytics.mobile.scl.a.b.a.a(method);
                a3 = com.moat.analytics.mobile.scl.a.b.a.a(method2);
                a4 = com.moat.analytics.mobile.scl.a.b.a.a(method3);
            } catch (NoSuchMethodException e) {
                l.a(e);
            }
            a = a2;
            b = a3;
            c = a4;
        }

        a() {
        }

        public Class<NativeDisplayTracker> a() {
            return NativeDisplayTracker.class;
        }
    }

    q(View view, Map<String, String> map) {
        super(view, true, false);
        n.a(3, "MoatNativeDispTracker", (Object) this, "Initializing.");
        this.e = map;
        f fVar = ((j) MoatAnalytics.getInstance()).a;
        if (fVar != null) {
            super.a(fVar.b);
            super.a(fVar.a);
        }
        super.a(d());
    }

    private static String a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 8; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("moatClientLevel");
            sb.append(i);
            String sb2 = sb.toString();
            if (map.containsKey(sb2)) {
                linkedHashMap.put(sb2, map.get(sb2));
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("moatClientSlicer");
            sb3.append(i2);
            String sb4 = sb3.toString();
            if (map.containsKey(sb4)) {
                linkedHashMap.put(sb4, map.get(sb4));
            }
        }
        for (String str : map.keySet()) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        return new JSONObject(linkedHashMap).toString();
    }

    private String d() {
        try {
            String a2 = a(this.e);
            StringBuilder sb = new StringBuilder();
            sb.append("Parsed ad ids = ");
            sb.append(a2);
            n.a(3, "MoatNativeDispTracker", (Object) this, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"adIds\":");
            sb2.append(a2);
            sb2.append(", \"adKey\":\"");
            sb2.append(this.b);
            sb2.append("\", \"adSize\":");
            sb2.append(e());
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e2) {
            l.a(e2);
            return "";
        }
    }

    private String e() {
        try {
            Rect b = super.b();
            int width = b.width();
            int height = b.height();
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.toString(width));
            hashMap.put("height", Integer.toString(height));
            return new JSONObject(hashMap).toString();
        } catch (Exception e2) {
            l.a(e2);
            return null;
        }
    }

    public void startTracking() {
        boolean z;
        try {
            super.startTracking();
            z = true;
        } catch (Exception e2) {
            l.a(e2);
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to start tracking ad was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        n.a(3, "MoatNativeDispTracker", (Object) this, sb.toString());
    }

    public void stopTracking() {
        try {
            n.a(3, "MoatNativeDispTracker", (Object) this, "Called stopTracking.");
            super.stopTracking();
        } catch (Exception e2) {
            l.a(e2);
        }
    }
}
