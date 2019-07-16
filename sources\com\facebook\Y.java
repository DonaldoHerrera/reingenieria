package com.facebook;

import com.facebook.GraphRequest.d;

/* compiled from: RequestProgress */
class Y implements Runnable {
    final /* synthetic */ d a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ Z d;

    Y(Z z, d dVar, long j, long j2) {
        this.d = z;
        this.a = dVar;
        this.b = j;
        this.c = j2;
    }

    public void run() {
        this.a.onProgress(this.b, this.c);
    }
}
