package com.squareup.picasso;

/* compiled from: MemoryPolicy */
public enum z {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int d;

    private z(int i) {
        this.d = i;
    }

    static boolean a(int i) {
        return (i & NO_CACHE.d) == 0;
    }

    static boolean b(int i) {
        return (i & NO_STORE.d) == 0;
    }
}
