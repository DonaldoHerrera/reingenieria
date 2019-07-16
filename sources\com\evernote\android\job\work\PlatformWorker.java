package com.evernote.android.job.work;

import android.content.Context;
import android.os.Bundle;
import androidx.work.ListenableWorker.a;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.evernote.android.job.c;
import com.evernote.android.job.c.b;
import com.evernote.android.job.l;
import com.evernote.android.job.n;
import com.evernote.android.job.s;
import java.util.Collection;

public class PlatformWorker extends Worker {
    private static final Dj f = new Dj("PlatformWorker");

    public PlatformWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private int n() {
        return b.a((Collection<String>) e());
    }

    public void i() {
        int n = n();
        c b = l.a(a()).b(n);
        if (b != null) {
            b.a();
            f.a("Called onStopped for %s", b);
            return;
        }
        f.a("Called onStopped, job %d not found", Integer.valueOf(n));
    }

    public a m() {
        int n = n();
        if (n < 0) {
            return a.a();
        }
        try {
            n.a aVar = new n.a(a(), f, n);
            s a = aVar.a(true, true);
            if (a == null) {
                return a.a();
            }
            Bundle bundle = null;
            if (a.w()) {
                bundle = c.b(n);
                if (bundle == null) {
                    f.a("Transient bundle is gone for request %s", a);
                    a a2 = a.a();
                    c.a(n);
                    return a2;
                }
            }
            if (b.SUCCESS == aVar.a(a, bundle)) {
                a c = a.c();
                c.a(n);
                return c;
            }
            a a3 = a.a();
            c.a(n);
            return a3;
        } finally {
            c.a(n);
        }
    }
}
