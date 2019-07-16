package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.Locale;

/* renamed from: rM reason: default package and case insensitive filesystem */
/* compiled from: Referrer */
public enum C3235rM {
    OTHER("other"),
    HOME_BUTTON("home_button"),
    FACEBOOK("facebook"),
    INSTAGRAM("instagram"),
    TWITTER("twitter"),
    MOBI("mobi"),
    GOOGLE_PLUS("google_plus"),
    APPBOY_NOTIFICATION("appboy_notification"),
    STREAM_NOTIFICATION("stream_notification"),
    ACTIVITIES_NOTIFICATION("activities_notification"),
    PLAYBACK_NOTIFICATION("playback_notification"),
    PLAYBACK_WIDGET("playback_widget"),
    LAUNCHER_SHORTCUT("launcher_shortcut"),
    GOOGLE_CRAWLER("google_crawler");
    
    private final String p;

    private C3235rM(String str) {
        this.p = str;
    }

    public static C3235rM b(Intent intent) {
        return values()[intent.getIntExtra("ReferrerOrdinal", 0)];
    }

    public static boolean c(Intent intent) {
        return intent.hasExtra("ReferrerOrdinal");
    }

    public String a() {
        return this.p;
    }

    public String toString() {
        return a();
    }

    public static String b(String str) {
        if (str != null) {
            String host = Uri.parse(str).getHost();
            if (C5206PKa.b(host)) {
                if (host.indexOf("www.") == 0) {
                    host = host.substring(4);
                }
                return host;
            }
        }
        return OTHER.a();
    }

    public void a(Intent intent) {
        intent.putExtra("ReferrerOrdinal", ordinal());
    }

    public static C3235rM a(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return OTHER;
        }
    }
}
