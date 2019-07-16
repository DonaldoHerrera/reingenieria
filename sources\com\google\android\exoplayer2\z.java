package com.google.android.exoplayer2;

import java.util.HashSet;

/* compiled from: ExoPlayerLibraryInfo */
public final class z {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (z.class) {
            str = b;
        }
        return str;
    }
}
