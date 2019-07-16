package com.facebook.share.internal;

import com.facebook.C0594t;
import com.facebook.share.internal.t.c;

/* compiled from: LikeActionController */
class k implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ t b;
    final /* synthetic */ C0594t c;

    k(c cVar, t tVar, C0594t tVar2) {
        this.a = cVar;
        this.b = tVar;
        this.c = tVar2;
    }

    public void run() {
        this.a.a(this.b, this.c);
    }
}
