package com.facebook.internal;

import com.facebook.internal.E.b;

/* compiled from: FetchedAppSettingsManager */
class D implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ A b;

    D(b bVar, A a2) {
        this.a = bVar;
        this.b = a2;
    }

    public void run() {
        this.a.a(this.b);
    }
}
