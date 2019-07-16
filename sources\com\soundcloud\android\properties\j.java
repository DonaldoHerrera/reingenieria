package com.soundcloud.android.properties;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: ApplicationProperties */
public class j {
    private static a a;
    static final boolean b = (Build.PRODUCT != null);
    static final boolean c;
    private static final List<String> d = Arrays.asList(new String[]{a.ALPHA.name().toLowerCase(Locale.US), a.BETA.name().toLowerCase(Locale.US), a.DEBUG.name().toLowerCase(Locale.US)});
    private static final List<String> e = Arrays.asList(new String[]{a.ALPHA.name().toLowerCase(Locale.US), a.DEBUG.name().toLowerCase(Locale.US)});

    /* compiled from: ApplicationProperties */
    private enum a {
        DEBUG(r1, r1),
        ALPHA("android-alpha-logs@soundcloud.com", "android-alpha-logs-playback@soundcloud.com"),
        BETA("android-beta-logs@soundcloud.com", "android-beta-logs-playback@soundcloud.com"),
        RELEASE(null, null);
        
        /* access modifiers changed from: private */
        public final String f;
        /* access modifiers changed from: private */
        public final String g;

        private a(String str, String str2) {
            this.f = str;
            this.g = str2;
        }
    }

    static {
        boolean z;
        if (!"google_sdk".equals(Build.PRODUCT)) {
            if (!"sdk".equals(Build.PRODUCT)) {
                if (!"full_x86".equals(Build.PRODUCT)) {
                    if (!"sdk_x86".equals(Build.PRODUCT)) {
                        if (!"google_sdk_x86".equals(Build.PRODUCT)) {
                            z = false;
                            c = z;
                        }
                    }
                }
            }
        }
        z = true;
        c = z;
    }

    public j(C7181qKa qka) {
        a = a.valueOf(qka.m().toUpperCase(Locale.US));
    }

    private boolean a(a... aVarArr) {
        return Arrays.asList(aVarArr).contains(a);
    }

    public static boolean e() {
        return e.contains("release");
    }

    public static boolean g() {
        return d.contains("release");
    }

    public String b() {
        return a.name();
    }

    public String c() {
        return a.f;
    }

    public String d() {
        return a.g;
    }

    public boolean f() {
        return a(a.BETA);
    }

    public boolean h() {
        return a(a.DEBUG);
    }

    public boolean i() {
        return a(a.DEBUG);
    }

    public boolean j() {
        return b && i();
    }

    public boolean k() {
        return i();
    }

    public boolean l() {
        return a(a.RELEASE);
    }

    public boolean m() {
        return a(a.ALPHA, a.BETA, a.DEBUG);
    }

    public boolean n() {
        if (!c && b && a != null) {
            if (!a(a.DEBUG)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("buildType", (Object) a).a("isDevice", b).a("isEmulator", c).toString();
    }

    public boolean a() {
        return a(a.RELEASE, a.BETA);
    }
}
