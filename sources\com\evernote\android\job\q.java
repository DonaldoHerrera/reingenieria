package com.evernote.android.job;

import com.evernote.android.job.s.c;

/* compiled from: JobRequest */
class q implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ s b;

    q(s sVar, c cVar) {
        this.b = sVar;
        this.a = cVar;
    }

    public void run() {
        try {
            this.a.a(this.b.E(), this.b.p(), null);
        } catch (Exception e) {
            this.a.a(-1, this.b.p(), e);
        }
    }
}
