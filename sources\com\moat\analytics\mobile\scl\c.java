package com.moat.analytics.mobile.scl;

import android.os.Handler;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

abstract class c<PlayerOrIMAAd> extends b {
    static final MoatAdEventType[] e = {MoatAdEventType.AD_EVT_FIRST_QUARTILE, MoatAdEventType.AD_EVT_MID_POINT, MoatAdEventType.AD_EVT_THIRD_QUARTILE};
    final Map<MoatAdEventType, Integer> f;
    final Handler g;
    Map<String, String> h;
    WeakReference<PlayerOrIMAAd> i;
    WeakReference<View> j;
    private boolean k;
    private Double l;
    /* access modifiers changed from: private */
    public final f m = new f(a.a(), a.VIDEO);
    private final String n;

    c(String str) {
        super(null, false, true);
        n.a(3, "MoatBaseVideoTracker", (Object) this, "Initializing.");
        this.n = str;
        this.m.a(str);
        super.a(this.m.b);
        super.a(this.m.a);
        this.f = new HashMap();
        this.g = new Handler();
        this.k = false;
        this.l = Double.valueOf(1.0d);
    }

    private void b(MoatAdEvent moatAdEvent) {
        JSONObject a = a(moatAdEvent);
        String str = "MoatBaseVideoTracker";
        n.a(3, str, (Object) this, String.format("Received event: %s", new Object[]{a.toString()}));
        this.a.a(this.m.c, a);
        MoatAdEventType moatAdEventType = moatAdEvent.d;
        if (moatAdEventType == MoatAdEventType.AD_EVT_COMPLETE || moatAdEventType == MoatAdEventType.AD_EVT_STOPPED || moatAdEventType == MoatAdEventType.AD_EVT_SKIPPED) {
            this.f.put(moatAdEventType, Integer.valueOf(1));
            e();
        }
    }

    private void g() {
        Map d = d();
        Integer num = (Integer) d.get("width");
        Integer num2 = (Integer) d.get("height");
        Integer num3 = (Integer) d.get("duration");
        n.a(3, "MoatBaseVideoTracker", (Object) this, String.format(Locale.ROOT, "Player metadata: height = %d, width = %d, duration = %d", new Object[]{num2, num, num3}));
        this.m.a(this.n, this.h, num, num2, num3);
        super.changeTargetView((View) this.j.get());
        super.startTracking();
    }

    /* access modifiers changed from: 0000 */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        if (Double.isNaN(moatAdEvent.c.doubleValue())) {
            try {
                moatAdEvent.c = Double.valueOf(p.a());
            } catch (Exception unused) {
                moatAdEvent.c = Double.valueOf(1.0d);
            }
        }
        String format = String.format(Locale.ROOT, "adVolume before adjusting for player volume %f", new Object[]{moatAdEvent.c});
        String str = "MoatBaseVideoTracker";
        n.a(3, str, (Object) this, format);
        moatAdEvent.c = Double.valueOf(moatAdEvent.c.doubleValue() * this.l.doubleValue());
        n.a(3, str, (Object) this, String.format(Locale.ROOT, "adVolume after adjusting for player volume %f", new Object[]{moatAdEvent.c}));
        return new JSONObject(moatAdEvent.a());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Integer num, Integer num2) {
        return ((double) Math.abs(num2.intValue() - num.intValue())) <= Math.min(750.0d, ((double) num2.intValue()) * 0.05d);
    }

    public boolean a(Map<String, String> map, PlayerOrIMAAd playerorimaad, View view) {
        boolean z;
        String str;
        boolean z2 = false;
        String str2 = "MoatBaseVideoTracker";
        if (map == null) {
            try {
                n.a(3, str2, (Object) this, "trackVideoAd received null adIds object. Not tracking.");
                z = false;
            } catch (Exception e2) {
                l.a(e2);
            }
        } else {
            z = true;
        }
        if (view == null) {
            n.a(3, str2, (Object) this, "trackVideoAd received null video view instance");
        }
        if (playerorimaad == null) {
            n.a(3, str2, (Object) this, "trackVideoAd received null ad instance. Not tracking.");
            z = false;
        }
        if (z) {
            String str3 = "trackVideoAd tracking ids: %s | ad: %s | view: %s";
            Object[] objArr = new Object[3];
            objArr[0] = new JSONObject(map).toString();
            objArr[1] = playerorimaad.toString();
            if (view != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(view.getClass().getSimpleName());
                sb.append("@");
                sb.append(view.hashCode());
                str = sb.toString();
            } else {
                str = "null";
            }
            objArr[2] = str;
            n.a(3, str2, (Object) this, String.format(str3, objArr));
            this.h = map;
            this.i = new WeakReference<>(playerorimaad);
            this.j = new WeakReference<>(view);
            g();
        }
        z2 = z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Attempt to start tracking ad was ");
        sb2.append(z2 ? "" : "un");
        sb2.append("successful.");
        n.a(3, str2, (Object) this, sb2.toString());
        return z2;
    }

    public void changeTargetView(View view) {
        String str;
        if (view != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(view.getClass().getSimpleName());
            sb.append("@");
            sb.append(view.hashCode());
            str = sb.toString();
        } else {
            str = "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("changing view to ");
        sb2.append(str);
        n.a(3, "MoatBaseVideoTracker", (Object) this, sb2.toString());
        this.j = new WeakReference<>(view);
        try {
            super.changeTargetView(view);
        } catch (Exception e2) {
            l.a(e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, Object> d();

    public void dispatchEvent(MoatAdEvent moatAdEvent) {
        try {
            b(moatAdEvent);
        } catch (Exception e2) {
            l.a(e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (!this.k) {
            this.g.postDelayed(new Runnable() {
                public void run() {
                    try {
                        n.a(3, "MoatBaseVideoTracker", (Object) this, "Shutting down.");
                        c.this.m.a();
                    } catch (Exception e) {
                        l.a(e);
                    }
                }
            }, 500);
            this.k = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.f.containsKey(MoatAdEventType.AD_EVT_COMPLETE) || this.f.containsKey(MoatAdEventType.AD_EVT_STOPPED) || this.f.containsKey(MoatAdEventType.AD_EVT_SKIPPED);
    }

    public void setPlayerVolume(Double d) {
        if (!d.equals(this.l)) {
            n.a(3, "MoatBaseVideoTracker", (Object) this, String.format(Locale.ROOT, "player volume changed to %f ", new Object[]{d}));
            this.l = d;
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_VOLUME_CHANGE, MoatAdEvent.a));
        }
    }

    public void stopTracking() {
        try {
            super.stopTracking();
            e();
        } catch (Exception e2) {
            l.a(e2);
        }
    }
}
