package com.moat.analytics.mobile.scl;

import android.content.Context;
import android.media.AudioManager;
import android.os.AsyncTask;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

class p {
    /* access modifiers changed from: private */
    public static String a;

    p() {
    }

    static double a() {
        try {
            AudioManager audioManager = (AudioManager) a.a().getSystemService("audio");
            return ((double) d()) / ((double) audioManager.getStreamMaxVolume(3));
        } catch (Exception e) {
            l.a(e);
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    static void a(final Context context) {
        try {
            AsyncTask.execute(new Runnable() {
                public void run() {
                    String str;
                    try {
                        Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        String str2 = "MoatUtil";
                        if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            p.a = advertisingIdInfo.getId();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Retrieved Advertising ID = ");
                            sb.append(p.a);
                            str = sb.toString();
                        } else {
                            str = "User has limited ad tracking";
                        }
                        n.a(3, str2, (Object) this, str);
                    } catch (Exception e) {
                        l.a(e);
                    }
                }
            });
        } catch (Exception e) {
            l.a(e);
        }
    }

    static String b() {
        return a;
    }

    private static int d() {
        try {
            return ((AudioManager) a.a().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception e) {
            l.a(e);
            return 0;
        }
    }
}
