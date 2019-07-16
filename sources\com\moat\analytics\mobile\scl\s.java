package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class s extends g<MediaPlayer> implements NativeVideoTracker {

    static class a implements c<NativeVideoTracker> {
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
            Class<NativeVideoTracker> cls = NativeVideoTracker.class;
            try {
                Method method = cls.getMethod("setActivity", new Class[]{Activity.class});
                Method method2 = cls.getMethod("trackVideoAd", new Class[]{Map.class, MediaPlayer.class, View.class});
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

        public Class<NativeVideoTracker> a() {
            return NativeVideoTracker.class;
        }
    }

    s(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> d() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.i.get();
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(mediaPlayer.getVideoWidth()));
        hashMap.put("height", Integer.valueOf(mediaPlayer.getVideoHeight()));
        hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public Integer g() {
        return Integer.valueOf(((MediaPlayer) this.i.get()).getCurrentPosition());
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return ((MediaPlayer) this.i.get()).isPlaying();
    }

    /* access modifiers changed from: protected */
    public Integer i() {
        return Integer.valueOf(((MediaPlayer) this.i.get()).getDuration());
    }

    /* renamed from: trackVideoAd */
    public boolean a(Map<String, String> map, MediaPlayer mediaPlayer, View view) {
        String str;
        String str2 = "MoatNativeVideoTracker";
        if (mediaPlayer == null) {
            str = "Null player instance. Not tracking.";
        } else {
            try {
                mediaPlayer.getCurrentPosition();
                return super.a(map, mediaPlayer, view);
            } catch (Exception unused) {
                str = "Playback has already completed. Not tracking.";
            }
        }
        n.a(3, str2, (Object) this, str);
        return false;
    }
}
