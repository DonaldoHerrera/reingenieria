package com.mattprecious.telescope;

/* compiled from: Preconditions */
final class d {
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
