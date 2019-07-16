package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.properties.m.w;
import com.soundcloud.android.utilities.android.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* renamed from: fL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule */
public abstract class C2995fL {

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: fL$a */
    /* compiled from: AnalyticsModule */
    @interface a {
    }

    @b
    static int a() {
        return 100;
    }

    static C2014EO a(com.soundcloud.android.properties.a aVar, C4806CMa<C3277tO> cMa, C4806CMa<C1934AO> cMa2) {
        if (aVar.a((defpackage.C3821mba.a) w.a)) {
            return (C2014EO) cMa.get();
        }
        return (C2014EO) cMa2.get();
    }

    @a
    static C2350WH<J> b() {
        return C2332VH.s();
    }

    @e
    static C7648wza<Boolean> c(@defpackage.C7853zya.a SharedPreferences sharedPreferences) {
        return new C7579vza("dev.flushEventloggerInstantly", sharedPreferences);
    }

    @d
    static C7648wza<Boolean> b(@defpackage.C7853zya.a SharedPreferences sharedPreferences) {
        return new C7579vza("dev_event_logger_monitor_mute_key", sharedPreferences);
    }

    @SuppressLint({"sc.SilentExceptionUsage"})
    static C3035hN a(C3054iN iNVar, k kVar, C5495ZFa zFa, C3469VY vy) {
        try {
            return new C3035hN(iNVar, kVar, zFa);
        } catch (Exception e) {
            vy.a(e, new HVa[0]);
            return null;
        }
    }

    static FirebaseAnalytics a(Context context, C7319sKa ska) {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        instance.a(ska.a());
        return instance;
    }

    static C7319sKa a(C3177oM oMVar) {
        return new C7319sKa(oMVar.b(), oMVar.d(), oMVar.c());
    }

    @c
    static C7648wza<Boolean> a(@defpackage.C7853zya.a SharedPreferences sharedPreferences) {
        return new C7579vza("dev_drawer_event_logger_monitor_key", sharedPreferences);
    }

    static defpackage.C2353WK.a a(SharedPreferences sharedPreferences, C3274tL tLVar, C5327TLa tLa, @a C2350WH<J> wh) {
        C2090IL il = new C2090IL(a(tLVar, sharedPreferences), wh, tLa.a(C3876taa.m), tLa.a(C3876taa.x), tLa.a(C3876taa.y), tLa.a(C3876taa.i));
        return il;
    }

    private static APa<List<C3254sL>> a(C3274tL tLVar, SharedPreferences sharedPreferences) {
        return APa.a((CPa<T>) new C1990DK<T>(tLVar, sharedPreferences));
    }

    static /* synthetic */ void a(C3274tL tLVar, SharedPreferences sharedPreferences, BPa bPa) throws Exception {
        bPa.a(tLVar.a());
        C2030FK fk = new C2030FK(bPa, tLVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(fk);
        bPa.a((C6708jQa) new C2010EK(sharedPreferences, fk));
    }

    static /* synthetic */ void a(BPa bPa, C3274tL tLVar, SharedPreferences sharedPreferences, String str) {
        if ("analytics_enabled".equals(str)) {
            bPa.a(tLVar.a());
        }
    }
}
