package com.moat.analytics.mobile.scl;

import android.view.View;
import java.util.Map;
import org.json.JSONObject;

abstract class g<PlayerOrIMAAd> extends c<PlayerOrIMAAd> {
    int k = Integer.MIN_VALUE;
    private a l = a.UNINITIALIZED;
    private int m = Integer.MIN_VALUE;
    private double n = Double.NaN;
    private int o = Integer.MIN_VALUE;
    private int p = 0;

    protected enum a {
        UNINITIALIZED,
        PAUSED,
        PLAYING,
        STOPPED,
        COMPLETED
    }

    g(String str) {
        super(str);
    }

    private void k() {
        this.g.postDelayed(new Runnable() {
            public void run() {
                g gVar;
                try {
                    if (g.this.i.get() == null || g.this.f()) {
                        gVar = g.this;
                    } else if (Boolean.valueOf(g.this.j()).booleanValue()) {
                        g.this.g.postDelayed(this, 200);
                        return;
                    } else {
                        gVar = g.this;
                    }
                    gVar.e();
                } catch (Exception e) {
                    g.this.e();
                    l.a(e);
                }
            }
        }, 200);
    }

    /* access modifiers changed from: protected */
    public JSONObject a(MoatAdEvent moatAdEvent) {
        Integer num;
        if (!moatAdEvent.b.equals(MoatAdEvent.a)) {
            num = moatAdEvent.b;
        } else {
            try {
                num = g();
            } catch (Exception unused) {
                num = Integer.valueOf(this.m);
            }
            moatAdEvent.b = num;
        }
        if (moatAdEvent.b.intValue() < 0 || (moatAdEvent.b.intValue() == 0 && moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE && this.m > 0)) {
            num = Integer.valueOf(this.m);
            moatAdEvent.b = num;
        }
        if (moatAdEvent.d == MoatAdEventType.AD_EVT_COMPLETE) {
            if (num.intValue() != Integer.MIN_VALUE) {
                int i = this.k;
                if (i != Integer.MIN_VALUE && a(num, Integer.valueOf(i))) {
                    this.l = a.COMPLETED;
                }
            }
            this.l = a.STOPPED;
            moatAdEvent.d = MoatAdEventType.AD_EVT_STOPPED;
        }
        return super.a(moatAdEvent);
    }

    public boolean a(Map<String, String> map, PlayerOrIMAAd playerorimaad, View view) {
        try {
            k();
        } catch (Exception e) {
            l.a(e);
        }
        return super.a(map, playerorimaad, view);
    }

    /* access modifiers changed from: protected */
    public abstract Integer g();

    /* access modifiers changed from: protected */
    public abstract boolean h();

    /* access modifiers changed from: protected */
    public abstract Integer i();

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095 A[Catch:{ Exception -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097 A[Catch:{ Exception -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7 A[Catch:{ Exception -> 0x00cc }] */
    public boolean j() {
        boolean z;
        a aVar;
        if (this.i.get() == null || f()) {
            return false;
        }
        boolean z2 = true;
        try {
            int intValue = g().intValue();
            if (this.m >= 0 && intValue < 0) {
                return false;
            }
            this.m = intValue;
            if (intValue == 0) {
                return true;
            }
            int intValue2 = i().intValue();
            boolean h = h();
            double d = ((double) intValue2) / 4.0d;
            double a2 = p.a();
            MoatAdEventType moatAdEventType = null;
            if (intValue > this.o) {
                this.o = intValue;
            }
            if (this.k == Integer.MIN_VALUE) {
                this.k = intValue2;
            }
            if (!h) {
                if (this.l != a.PAUSED) {
                    moatAdEventType = MoatAdEventType.AD_EVT_PAUSED;
                    aVar = a.PAUSED;
                }
                if (moatAdEventType != null) {
                }
                moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                z = true;
                if (z) {
                }
                this.n = a2;
                this.p = 0;
                return true;
            } else if (this.l == a.UNINITIALIZED) {
                moatAdEventType = MoatAdEventType.AD_EVT_START;
                aVar = a.PLAYING;
            } else if (this.l == a.PAUSED) {
                moatAdEventType = MoatAdEventType.AD_EVT_PLAYING;
                aVar = a.PLAYING;
            } else {
                int floor = ((int) Math.floor(((double) intValue) / d)) - 1;
                if (floor > -1 && floor < 3) {
                    MoatAdEventType moatAdEventType2 = c.e[floor];
                    if (!this.f.containsKey(moatAdEventType2)) {
                        this.f.put(moatAdEventType2, Integer.valueOf(1));
                        moatAdEventType = moatAdEventType2;
                    }
                }
                z = moatAdEventType != null;
                if (!z && !Double.isNaN(this.n) && Math.abs(this.n - a2) > 0.05d) {
                    moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
                    z = true;
                }
                if (z) {
                    dispatchEvent(new MoatAdEvent(moatAdEventType, Integer.valueOf(intValue), Double.valueOf(a2)));
                }
                this.n = a2;
                this.p = 0;
                return true;
            }
            this.l = aVar;
            if (moatAdEventType != null) {
            }
            moatAdEventType = MoatAdEventType.AD_EVT_VOLUME_CHANGE;
            z = true;
            if (z) {
            }
            this.n = a2;
            this.p = 0;
            return true;
        } catch (Exception unused) {
            int i = this.p;
            this.p = i + 1;
            if (i >= 5) {
                z2 = false;
            }
            return z2;
        }
    }

    public void stopTracking() {
        try {
            dispatchEvent(new MoatAdEvent(MoatAdEventType.AD_EVT_COMPLETE));
        } catch (Exception e) {
            l.a(e);
        }
    }
}
