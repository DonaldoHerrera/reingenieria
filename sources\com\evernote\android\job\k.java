package com.evernote.android.job;

import android.content.Context;

/* compiled from: JobManager */
class k extends Thread {
    final /* synthetic */ Context a;
    final /* synthetic */ l b;

    k(l lVar, String str, Context context) {
        this.b = lVar;
        this.a = context;
        super(str);
    }

    public void run() {
        this.b.f = new u(this.a);
        this.b.g.countDown();
    }
}
