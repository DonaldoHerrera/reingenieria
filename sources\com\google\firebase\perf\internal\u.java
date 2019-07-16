package com.google.firebase.perf.internal;

enum u {
    NETWORK("network", 10, 700, 10, 70),
    TRACE("trace", 10, 300, 10, 30);
    
    private final String d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    private u(String str, int i, int i2, int i3, int i4) {
        this.d = str;
        this.e = 10;
        this.f = i2;
        this.g = 10;
        this.h = i4;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    public final int c() {
        return this.g;
    }

    public final int d() {
        return this.h;
    }

    public final String e() {
        return String.valueOf(this.d).concat("_flimit_time");
    }

    public final String f() {
        return String.valueOf(this.d).concat("_flimit_events");
    }

    public final String g() {
        return String.valueOf(this.d).concat("_blimit_time");
    }

    public final String toString() {
        return name();
    }

    public final String u() {
        return String.valueOf(this.d).concat("_blimit_events");
    }
}
