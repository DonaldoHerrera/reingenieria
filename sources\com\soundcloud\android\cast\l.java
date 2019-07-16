package com.soundcloud.android.cast;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.cast.framework.C0635c;
import com.soundcloud.android.accounts.C2526g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CastModule */
public abstract class l {

    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: CastModule */
    public @interface a {
    }

    static C2733g a(C7730yHa yha, Context context) {
        try {
            if (b(yha, context)) {
                return new B(C0635c.a(context));
            }
            return new D();
        } catch (Exception unused) {
            return new D();
        }
    }

    private static boolean b(C7730yHa yha, Context context) {
        return yha.a(context, 9256000);
    }

    static C2732f a(Context context, C4806CMa<C2733g> cMa, C7730yHa yha) {
        if (!"Dalvik".equals(System.getProperty("java.vm.name")) || !b(yha, context)) {
            return new C();
        }
        return new z((C2733g) cMa.get());
    }

    static C3183oS a(C2526g gVar) {
        return C3183oS.a(C2322UP.a(gVar.e()));
    }

    @a
    static C7648wza<String> a(@defpackage.C7853zya.a SharedPreferences sharedPreferences) {
        return new C7855zza("receiver_id_override", sharedPreferences);
    }
}
