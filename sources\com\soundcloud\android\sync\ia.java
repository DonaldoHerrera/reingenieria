package com.soundcloud.android.sync;

/* compiled from: SyncResult */
public abstract class ia {

    /* compiled from: SyncResult */
    public enum a {
        SYNCED,
        SYNCING,
        NO_OP,
        ERROR
    }

    public static ia c() {
        return new C6128k(a.NO_OP, C4928GKa.a());
    }

    public static ia d() {
        return new C6128k(a.SYNCED, C4928GKa.a());
    }

    public static ia e() {
        return new C6128k(a.SYNCING, C4928GKa.a());
    }

    public boolean a() {
        return b().equals(a.ERROR);
    }

    public abstract a b();

    public abstract C4928GKa<Throwable> f();

    public boolean g() {
        return b().equals(a.NO_OP);
    }

    public static ia a(Throwable th) {
        return new C6128k(a.ERROR, C4928GKa.c(th));
    }
}
