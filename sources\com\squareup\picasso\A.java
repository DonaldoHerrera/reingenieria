package com.squareup.picasso;

/* compiled from: NetworkPolicy */
public enum A {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int e;

    private A(int i) {
        this.e = i;
    }

    public static boolean a(int i) {
        return (i & OFFLINE.e) != 0;
    }

    public static boolean b(int i) {
        return (i & NO_CACHE.e) == 0;
    }

    public static boolean c(int i) {
        return (i & NO_STORE.e) == 0;
    }
}
