package com.soundcloud.android.ads;

import android.content.SharedPreferences;
import com.soundcloud.android.properties.j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.ads.fb reason: case insensitive filesystem */
/* compiled from: AdsStorage */
public class C2571fb {
    private static final long a = TimeUnit.MINUTES.toMillis(30);
    private static final long b = TimeUnit.MINUTES.toMillis(1);
    private final SharedPreferences c;
    private final C5694cGa d;

    public C2571fb(SharedPreferences sharedPreferences, C5694cGa cga) {
        this.c = sharedPreferences;
        this.d = cga;
    }

    private long c() {
        return j.g() ? b : a;
    }

    public void a() {
        this.c.edit().putLong("last_prestitial_fetch", this.d.a()).apply();
    }

    public boolean b() {
        return this.d.a() > this.c.getLong("last_prestitial_fetch", 1) + c();
    }
}
