package com.soundcloud.android.image;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.EnumSet;

/* renamed from: com.soundcloud.android.image.b reason: case insensitive filesystem */
/* compiled from: ApiImageSize */
public enum C3721b {
    T2480("t2480x2480", 2480, 2480),
    T500("t500x500", HttpStatus.HTTP_INTERNAL_SERVER_ERROR, HttpStatus.HTTP_INTERNAL_SERVER_ERROR),
    T300("t300x300", 300, 300),
    T120("t120x120", 120, 120),
    T47("t47x47", 47, 47),
    T1240x260("t1240x260", 1240, 260),
    T2480x520("t2480x520", 2480, 520),
    Unknown("t120x120", 120, 120);
    
    public static final EnumSet<C3721b> i = null;
    public final int k;
    public final int l;
    public final String m;

    static {
        C3721b bVar;
        i = EnumSet.of(bVar);
    }

    private C3721b(String str, int i2, int i3) {
        this.m = str;
        this.k = i2;
        this.l = i3;
    }

    public static C3721b a(DisplayMetrics displayMetrics) {
        if (displayMetrics.density > 2.0f) {
            return T300;
        }
        return T120;
    }

    public static C3721b b(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        if (max >= 960) {
            return T500;
        }
        if (max >= 480) {
            return T300;
        }
        return T120;
    }

    public static C3721b c(Resources resources) {
        if (Z.a(resources)) {
            return T120;
        }
        if (resources.getDisplayMetrics().density > 1.0f) {
            return T120;
        }
        return T47;
    }

    public static C3721b d(Resources resources) {
        return a(resources.getDisplayMetrics());
    }

    public static C3721b a(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels) >= 1440) {
            return T2480x520;
        }
        return T1240x260;
    }
}
