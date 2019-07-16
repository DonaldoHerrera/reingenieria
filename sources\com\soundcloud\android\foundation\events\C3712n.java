package com.soundcloud.android.foundation.events;

import java.util.Locale;

/* renamed from: com.soundcloud.android.foundation.events.n reason: case insensitive filesystem */
/* compiled from: ForceUpdateEvent */
public final class C3712n implements r {
    private final String a;
    private final String b;
    private final int c;

    public C3712n(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public C3816lea a() {
        return C3816lea.a("ForceUpdate", C3808kea.a("Platform version", this.a), C3808kea.a("App version", a(this.b, this.c)));
    }

    private static String a(String str, int i) {
        return String.format(Locale.US, "%s (%d)", new Object[]{str, Integer.valueOf(i)});
    }
}
