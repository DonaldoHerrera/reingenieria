package com.facebook;

import com.facebook.K.b;

/* compiled from: ProgressOutputStream */
class V implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ W b;

    V(W w, b bVar) {
        this.b = w;
        this.a = bVar;
    }

    public void run() {
        this.a.a(this.b.b, this.b.d, this.b.f);
    }
}
