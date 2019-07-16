package com.soundcloud.android.foundation.playqueue;

/* compiled from: PlayableWithReposter */
public abstract class u {
    public static u a(C3508cda cda, C4928GKa<C3508cda> gKa) {
        return new g(cda, gKa);
    }

    public abstract C4928GKa<C3508cda> a();

    public abstract C3508cda b();

    public static u a(C3508cda cda, C3508cda cda2) {
        return new g(cda, C4928GKa.b(cda2));
    }

    public static u a(C3508cda cda) {
        return new g(cda, C4928GKa.a());
    }
}
