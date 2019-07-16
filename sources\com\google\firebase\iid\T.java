package com.google.firebase.iid;

import android.os.Bundle;

final /* synthetic */ class T implements Runnable {
    private final U a;
    private final Bundle b;
    private final Xy c;

    T(U u, Bundle bundle, Xy xy) {
        this.a = u;
        this.b = bundle;
        this.c = xy;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
