package com.facebook.internal;

/* compiled from: InternalSettings */
public class T {
    private static volatile String a;

    public static String a() {
        return a;
    }

    public static boolean b() {
        return a != null && a.startsWith("Unity.");
    }
}
