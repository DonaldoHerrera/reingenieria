package com.soundcloud.android.foundation.events;

import java.util.UUID;

/* compiled from: TrackingEvent */
public abstract class J {
    /* access modifiers changed from: protected */
    public static String b() {
        return UUID.randomUUID().toString();
    }

    /* access modifiers changed from: protected */
    public static long c() {
        return System.currentTimeMillis();
    }

    public String d() {
        throw new UnsupportedOperationException("Not implemented in new tracking");
    }

    public long e() {
        return g();
    }

    @C3783hda
    public abstract String f();

    @C3783hda
    public abstract long g();
}
