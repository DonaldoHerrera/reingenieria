package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

final /* synthetic */ class zzq implements Callable {
    private final Av zzkc;

    private zzq(Av av) {
        this.zzkc = av;
    }

    static Callable zza(Av av) {
        return new zzq(av);
    }

    public final Object call() {
        return Boolean.valueOf(this.zzkc.a());
    }
}
