package androidx.work.impl.utils;

import androidx.work.WorkerParameters.a;
import androidx.work.impl.m;

/* compiled from: StartWorkRunnable */
public class i implements Runnable {
    private m a;
    private String b;
    private a c;

    public i(m mVar, String str, a aVar) {
        this.a = mVar;
        this.b = str;
        this.c = aVar;
    }

    public void run() {
        this.a.e().a(this.b, this.c);
    }
}
