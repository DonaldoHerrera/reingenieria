package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class Xa<V> {
    private static final Object a = new Object();
    private final String b;
    private final Ya<V> c;
    private final V d;
    private final V e;
    private final Object f;
    private volatile V g;
    private volatile V h;

    private Xa(String str, V v, V v2, Ya<V> ya) {
        this.f = new Object();
        this.g = null;
        this.h = null;
        this.b = str;
        this.d = v;
        this.e = v2;
        this.c = ya;
    }

    public final String a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return r0;
     */
    public final V a(V v) {
        synchronized (this.f) {
            V v2 = this.g;
        }
        if (v != null) {
            return v;
        }
        if (C1127j.a == null) {
            return this.d;
        }
        synchronized (a) {
            if (be.a()) {
                V v3 = this.h == null ? this.d : this.h;
            } else if (!be.a()) {
                be beVar = C1127j.a;
                try {
                    for (Xa xa : C1127j.b) {
                        synchronized (a) {
                            if (!be.a()) {
                                xa.h = xa.c != null ? xa.c.get() : null;
                            } else {
                                throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                            }
                        }
                    }
                } catch (SecurityException e2) {
                    C1127j.a((Exception) e2);
                }
            } else {
                throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
            }
        }
        Ya<V> ya = this.c;
        if (ya == null) {
            be beVar2 = C1127j.a;
            return this.d;
        }
        try {
            return ya.get();
        } catch (SecurityException e3) {
            C1127j.a((Exception) e3);
            be beVar3 = C1127j.a;
            return this.d;
        }
    }
}
