package com.evernote.android.job.work;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.c;
import androidx.work.c.a;
import androidx.work.j;
import androidx.work.k;
import androidx.work.q;
import androidx.work.r;
import com.evernote.android.job.n;
import com.evernote.android.job.o;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: JobProxyWorkManager */
public class b implements n {
    private static final Dj a = new Dj("JobProxyWork");
    private final Context b;

    public b(Context context) {
        this.b = context;
    }

    private static c e(s sVar) {
        a aVar = new a();
        aVar.a(sVar.A());
        aVar.b(sVar.B());
        aVar.d(sVar.D());
        aVar.a(a(sVar.y()));
        if (VERSION.SDK_INT >= 23) {
            aVar.c(sVar.C());
        }
        return aVar.a();
    }

    public void a(s sVar) {
        androidx.work.n.a aVar = new androidx.work.n.a(PlatformWorker.class, sVar.i(), TimeUnit.MILLISECONDS, sVar.h(), TimeUnit.MILLISECONDS);
        androidx.work.n nVar = (androidx.work.n) ((androidx.work.n.a) ((androidx.work.n.a) aVar.a(e(sVar))).a(b(sVar.k()))).a();
        r a2 = a();
        if (a2 != null) {
            a2.a((androidx.work.s) nVar);
            return;
        }
        throw new o("WorkManager is null");
    }

    public boolean b(s sVar) {
        List a2 = a(b(sVar.k()));
        if (a2 == null || a2.isEmpty() || ((q) a2.get(0)).a() != q.a.ENQUEUED) {
            return false;
        }
        return true;
    }

    public void c(s sVar) {
        a.d("plantPeriodicFlexSupport called although flex is supported");
        a(sVar);
    }

    public void d(s sVar) {
        if (sVar.w()) {
            c.a(sVar.k(), sVar.q());
        }
        k kVar = (k) ((k.a) ((k.a) new k.a(PlatformWorker.class).setInitialDelay(sVar.o(), TimeUnit.MILLISECONDS).a(e(sVar))).a(b(sVar.k()))).a();
        r a2 = a();
        if (a2 != null) {
            a2.a((androidx.work.s) kVar);
            return;
        }
        throw new o("WorkManager is null");
    }

    static String b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("android-job-");
        sb.append(i);
        return sb.toString();
    }

    public void a(int i) {
        r a2 = a();
        if (a2 != null) {
            a2.a(b(i));
            c.a(i);
        }
    }

    static int a(Collection<String> collection) {
        for (String str : collection) {
            if (str.startsWith("android-job-")) {
                return Integer.parseInt(str.substring(12));
            }
        }
        return -1;
    }

    private static j a(d dVar) {
        int i = a.a[dVar.ordinal()];
        if (i == 1) {
            return j.NOT_REQUIRED;
        }
        if (i == 2) {
            return j.METERED;
        }
        if (i == 3) {
            return j.CONNECTED;
        }
        if (i == 4) {
            return j.UNMETERED;
        }
        if (i == 5) {
            return j.NOT_ROAMING;
        }
        throw new IllegalStateException("Not implemented");
    }

    private r a() {
        r rVar;
        try {
            rVar = r.a();
        } catch (Throwable unused) {
            rVar = null;
        }
        if (rVar == null) {
            try {
                r.a(this.b, new androidx.work.b.a().a());
                rVar = r.a();
            } catch (Throwable unused2) {
            }
            a.d("WorkManager getInstance() returned null, now: %s", rVar);
        }
        return rVar;
    }

    private List<q> a(String str) {
        r a2 = a();
        if (a2 == null) {
            return Collections.emptyList();
        }
        try {
            return (List) a2.c(str).get(5, TimeUnit.SECONDS);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }
}
