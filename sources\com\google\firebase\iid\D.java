package com.google.firebase.iid;

import android.content.Intent;

final class D implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ zzc c;

    D(zzc zzc, Intent intent, Intent intent2) {
        this.c = zzc;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.c(this.a);
        this.c.d(this.b);
    }
}
