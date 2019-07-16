package com.evernote.android.job.gcm;

import android.content.Context;
import com.evernote.android.job.n;
import com.evernote.android.job.n.a;
import com.evernote.android.job.o;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.PeriodicTask.Builder;
import com.google.android.gms.gcm.Task;

/* compiled from: JobProxyGcm */
public class b implements n {
    private static final Dj a = new Dj("JobProxyGcm");
    private final Context b;
    private final GcmNetworkManager c;

    public b(Context context) {
        this.b = context;
        this.c = GcmNetworkManager.getInstance(context);
    }

    public void a(s sVar) {
        Builder builder = new Builder();
        a(builder, sVar);
        a((Task) builder.setPeriod(sVar.i() / 1000).setFlex(sVar.h() / 1000).build());
        a.a("Scheduled PeriodicTask, %s, interval %s, flex %s", sVar, Gj.a(sVar.i()), Gj.a(sVar.h()));
    }

    /* access modifiers changed from: protected */
    public String b(int i) {
        return String.valueOf(i);
    }

    public boolean b(s sVar) {
        return true;
    }

    public void c(s sVar) {
        a.d("plantPeriodicFlexSupport called although flex is supported");
        long g = a.g(sVar);
        long d = a.d(sVar);
        OneoffTask.Builder builder = new OneoffTask.Builder();
        a(builder, sVar);
        a((Task) builder.setExecutionWindow(g / 1000, d / 1000).build());
        a.a("Scheduled periodic (flex support), %s, start %s, end %s, flex %s", sVar, Gj.a(g), Gj.a(d), Gj.a(sVar.h()));
    }

    public void d(s sVar) {
        long f = a.f(sVar);
        long j = f / 1000;
        long c2 = a.c(sVar);
        long max = Math.max(c2 / 1000, 1 + j);
        OneoffTask.Builder builder = new OneoffTask.Builder();
        a(builder, sVar);
        a((Task) builder.setExecutionWindow(j, max).build());
        a.a("Scheduled OneoffTask, %s, start %s, end %s (from now), reschedule count %d", sVar, Gj.a(f), Gj.a(c2), Integer.valueOf(a.e(sVar)));
    }

    /* access modifiers changed from: protected */
    public String e(s sVar) {
        return b(sVar.k());
    }

    public void a(int i) {
        try {
            this.c.cancelTask(b(i), PlatformGcmService.class);
        } catch (IllegalArgumentException e) {
            if (e.getMessage() == null || !e.getMessage().startsWith("The GcmTaskService class you provided")) {
                throw e;
            }
            throw new o((Throwable) e);
        }
    }

    private void a(Task task) {
        try {
            this.c.schedule(task);
        } catch (IllegalArgumentException e) {
            if (e.getMessage() == null || !e.getMessage().startsWith("The GcmTaskService class you provided")) {
                throw e;
            }
            throw new o((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    public <T extends Task.Builder> T a(T t, s sVar) {
        t.setTag(e(sVar)).setService(PlatformGcmService.class).setUpdateCurrent(true).setRequiredNetwork(a(sVar.y())).setPersisted(Gj.a(this.b)).setRequiresCharging(sVar.B()).setExtras(sVar.q());
        return t;
    }

    /* access modifiers changed from: protected */
    public int a(d dVar) {
        int i = a.a[dVar.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3 || i == 4) {
            return 1;
        }
        throw new IllegalStateException("not implemented");
    }
}
