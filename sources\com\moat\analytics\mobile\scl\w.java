package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

class w extends c<Object> implements ReactiveVideoTracker {
    private Integer k;

    static class a implements c<ReactiveVideoTracker> {
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> a;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> b;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> c;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> d;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> e;
        private static final com.moat.analytics.mobile.scl.a.b.a<Method> f;

        static {
            com.moat.analytics.mobile.scl.a.b.a<Method> a2 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a3 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a4 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a5 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a6 = com.moat.analytics.mobile.scl.a.b.a.a();
            com.moat.analytics.mobile.scl.a.b.a<Method> a7 = com.moat.analytics.mobile.scl.a.b.a.a();
            Class<ReactiveVideoTracker> cls = ReactiveVideoTracker.class;
            try {
                Method method = WebAdTracker.class.getMethod("setActivity", new Class[]{Activity.class});
                Method method2 = cls.getMethod("trackVideoAd", new Class[]{Map.class, View.class, View.class});
                Method method3 = cls.getMethod("setPlayerVolume", new Class[]{Double.class});
                Method method4 = cls.getMethod("changeTargetView", new Class[]{View.class});
                Method method5 = cls.getMethod("dispatchEvent", new Class[]{MoatAdEvent.class});
                Method method6 = cls.getMethod("stopTracking", new Class[0]);
                a2 = com.moat.analytics.mobile.scl.a.b.a.a(method);
                a3 = com.moat.analytics.mobile.scl.a.b.a.a(method2);
                a4 = com.moat.analytics.mobile.scl.a.b.a.a(method3);
                a5 = com.moat.analytics.mobile.scl.a.b.a.a(method4);
                a6 = com.moat.analytics.mobile.scl.a.b.a.a(method5);
                a7 = com.moat.analytics.mobile.scl.a.b.a.a(method6);
            } catch (NoSuchMethodException e2) {
                l.a(e2);
            }
            a = a2;
            b = a3;
            c = a4;
            d = a5;
            e = a6;
            f = a7;
        }

        a() {
        }

        public Class<ReactiveVideoTracker> a() {
            return ReactiveVideoTracker.class;
        }
    }

    public w(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        if (moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE && !moatAdEvent.b.equals(MoatAdEvent.a) && !a(moatAdEvent.b, this.k)) {
            moatAdEvent.d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> d() {
        Integer num;
        HashMap hashMap = new HashMap();
        View view = (View) this.j.get();
        Integer valueOf = Integer.valueOf(0);
        if (view != null) {
            valueOf = Integer.valueOf(view.getWidth());
            num = Integer.valueOf(view.getHeight());
        } else {
            num = valueOf;
        }
        hashMap.put("duration", this.k);
        hashMap.put("width", valueOf);
        hashMap.put("height", num);
        return hashMap;
    }

    public void stopTracking() {
        super.stopTracking();
    }

    public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
        if (num.intValue() < 1000) {
            n.a(3, "MoatReactiveVideoTracker", (Object) this, String.format(Locale.ROOT, "Invalid duration = %d. Please make sure duration is in milliseconds.", new Object[]{num}));
            return false;
        }
        this.k = num;
        return super.a(map, new Object(), view);
    }
}
