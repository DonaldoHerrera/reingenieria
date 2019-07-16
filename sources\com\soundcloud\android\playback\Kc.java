package com.soundcloud.android.playback;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.PowerManager;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.properties.m.e;
import com.soundcloud.android.properties.m.f;
import com.soundcloud.android.properties.m.g;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PlayerModule */
public abstract class Kc {

    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: PlayerModule */
    @interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: PlayerModule */
    public @interface b {
    }

    @a
    static String a(C3284tV tVVar) {
        return new String(tVVar.a("flipper_cache"), C5053KKa.c);
    }

    static Ula a(Context context, Ec ec, @a String str, @defpackage.C7853zya.b File file, AudioManager audioManager, com.soundcloud.android.properties.a aVar) {
        Ula ula = new Ula(ec.a(context, str, file), a(audioManager), aVar.a((defpackage.C3821mba.a) g.a), aVar.a((defpackage.C3821mba.a) e.a), aVar.a((defpackage.C3821mba.a) f.a));
        return ula;
    }

    private static Long a(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            return Long.valueOf(Long.parseLong(property));
        }
        return null;
    }

    static Yla a(Ula ula, PowerManager powerManager, d dVar) {
        return new Yla(ula, powerManager, dVar);
    }

    static C3781hba a(C7181qKa qka, C6699jHa jha) {
        return new C3781hba(qka.h(), jha.j());
    }

    static C3789iba a(Context context, C3781hba hba, C6834lGa lga, C5694cGa cga, d dVar) {
        C3789iba iba = new C3789iba(context, hba, lga, cga, dVar);
        return iba;
    }

    static C4703wma a(Context context, C6834lGa lga, C5694cGa cga, d dVar) {
        return new C4703wma(context, lga, cga, dVar);
    }

    static C4685uma a(C4703wma wma) {
        return wma.a();
    }

    @b
    static C7648wza<Boolean> a(@defpackage.C7853zya.a SharedPreferences sharedPreferences) {
        return new C7579vza("dev_drawer_immediately_skippable_ads", sharedPreferences);
    }
}
