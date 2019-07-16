package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.view.View;
import java.util.Map;

public class ReactiveVideoTrackerPlugin implements MoatPlugin<ReactiveVideoTracker> {
    /* access modifiers changed from: private */
    public final String a;

    static class a implements ReactiveVideoTracker {
        a() {
        }

        public void changeTargetView(View view) {
        }

        public void dispatchEvent(MoatAdEvent moatAdEvent) {
        }

        public void setActivity(Activity activity) {
        }

        public void setPlayerVolume(Double d) {
        }

        public void stopTracking() {
        }

        public boolean trackVideoAd(Map<String, String> map, Integer num, View view) {
            return false;
        }
    }

    public ReactiveVideoTrackerPlugin(String str) {
        this.a = str;
    }

    /* renamed from: c */
    public ReactiveVideoTracker a() {
        return (ReactiveVideoTracker) v.a((a<T>) new a<ReactiveVideoTracker>() {
            public com.moat.analytics.mobile.scl.a.b.a<ReactiveVideoTracker> a() {
                return com.moat.analytics.mobile.scl.a.b.a.a(new w(ReactiveVideoTrackerPlugin.this.a));
            }
        }, (c<T>) new a<T>());
    }

    /* renamed from: d */
    public ReactiveVideoTracker b() {
        return new a();
    }
}
