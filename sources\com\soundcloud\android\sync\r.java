package com.soundcloud.android.sync;

import java.util.concurrent.Callable;

/* compiled from: DefaultSyncJob */
public class r extends W {
    private final Callable<Boolean> a;
    private final C4928GKa<na> b;
    private boolean c;
    private Exception d;

    public r(Callable<Boolean> callable, na naVar) {
        this.a = callable;
        this.b = C4928GKa.c(naVar);
    }

    public Exception a() {
        return this.d;
    }

    public C4928GKa<na> b() {
        return this.b;
    }

    public void c() {
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.d == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.b.equals(((r) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void run() {
        try {
            this.c = ((Boolean) this.a.call()).booleanValue();
        } catch (Exception e) {
            this.d = e;
            C7316sHa.a((Throwable) e, this.a.getClass());
        }
    }
}
