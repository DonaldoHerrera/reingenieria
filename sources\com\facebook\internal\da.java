package com.facebook.internal;

import com.facebook.B;
import java.util.Collection;

/* compiled from: ServerProtocol */
public final class da {
    public static final Collection<String> a = ia.b((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});
    public static final Collection<String> b = ia.b((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});

    public static final String a() {
        return "v3.3";
    }

    public static final String b() {
        return String.format("m.%s", new Object[]{B.n()});
    }

    public static final String c() {
        return String.format("https://graph.%s", new Object[]{B.n()});
    }

    public static final String d() {
        return String.format("https://graph-video.%s", new Object[]{B.n()});
    }
}
