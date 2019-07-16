package com.evernote.android.job.v14;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.evernote.android.job.g;
import com.evernote.android.job.n;
import com.evernote.android.job.s;

/* compiled from: JobProxy14 */
public class a implements n {
    protected final Context a;
    protected final Dj b;
    private AlarmManager c;

    public a(Context context) {
        this(context, "JobProxy14");
    }

    private void f(s sVar) {
        this.b.a("Scheduled alarm, %s, delay %s (from now), exact %b, reschedule count %d", sVar, Gj.a(com.evernote.android.job.n.a.a(sVar)), Boolean.valueOf(sVar.s()), Integer.valueOf(com.evernote.android.job.n.a.e(sVar)));
    }

    /* access modifiers changed from: protected */
    public int a(boolean z) {
        return !z ? 1207959552 : 134217728;
    }

    /* access modifiers changed from: protected */
    public void a(s sVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        long e = e(sVar);
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            alarmManager.setExactAndAllowWhileIdle(b(true), e, pendingIntent);
        } else if (i >= 19) {
            alarmManager.setExact(b(true), e, pendingIntent);
        } else {
            alarmManager.set(b(true), e, pendingIntent);
        }
        f(sVar);
    }

    /* access modifiers changed from: protected */
    public void b(s sVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(1, g.a().currentTimeMillis() + com.evernote.android.job.n.a.b(sVar), pendingIntent);
        this.b.a("Scheduled repeating alarm (flex support), %s, interval %s, flex %s", sVar, Gj.a(sVar.i()), Gj.a(sVar.h()));
    }

    /* access modifiers changed from: protected */
    public void c(s sVar, AlarmManager alarmManager, PendingIntent pendingIntent) {
        alarmManager.set(b(false), e(sVar), pendingIntent);
        f(sVar);
    }

    public void d(s sVar) {
        PendingIntent a2 = a(sVar, false);
        AlarmManager a3 = a();
        if (a3 != null) {
            try {
                if (!sVar.s()) {
                    c(sVar, a3, a2);
                } else if (sVar.o() != 1 || sVar.g() > 0) {
                    a(sVar, a3, a2);
                } else {
                    PlatformAlarmService.a(this.a, sVar.k(), sVar.q());
                }
            } catch (Exception e) {
                this.b.a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public long e(s sVar) {
        long elapsedRealtime;
        long a2;
        if (g.h()) {
            elapsedRealtime = g.a().currentTimeMillis();
            a2 = com.evernote.android.job.n.a.a(sVar);
        } else {
            elapsedRealtime = g.a().elapsedRealtime();
            a2 = com.evernote.android.job.n.a.a(sVar);
        }
        return elapsedRealtime + a2;
    }

    protected a(Context context, String str) {
        this.a = context;
        this.b = new Dj(str);
    }

    public void c(s sVar) {
        PendingIntent a2 = a(sVar, false);
        AlarmManager a3 = a();
        if (a3 != null) {
            try {
                b(sVar, a3, a2);
            } catch (Exception e) {
                this.b.a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int b(boolean z) {
        if (z) {
            return g.h() ? 0 : 2;
        }
        return g.h() ? 1 : 3;
    }

    public void a(s sVar) {
        PendingIntent a2 = a(sVar, true);
        AlarmManager a3 = a();
        if (a3 != null) {
            a3.setRepeating(b(true), e(sVar), sVar.i(), a2);
        }
        this.b.a("Scheduled repeating alarm, %s, interval %s", sVar, Gj.a(sVar.i()));
    }

    public boolean b(s sVar) {
        return a(sVar, 536870912) != null;
    }

    public void a(int i) {
        AlarmManager a2 = a();
        if (a2 != null) {
            try {
                a2.cancel(a(i, false, null, a(true)));
                a2.cancel(a(i, false, null, a(false)));
            } catch (Exception e) {
                this.b.a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public PendingIntent a(s sVar, boolean z) {
        return a(sVar, a(z));
    }

    /* access modifiers changed from: protected */
    public PendingIntent a(s sVar, int i) {
        return a(sVar.k(), sVar.s(), sVar.q(), i);
    }

    /* access modifiers changed from: protected */
    public PendingIntent a(int i, boolean z, Bundle bundle, int i2) {
        try {
            return PendingIntent.getBroadcast(this.a, i, PlatformAlarmReceiver.a(this.a, i, z, bundle), i2);
        } catch (Exception e) {
            this.b.a((Throwable) e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public AlarmManager a() {
        if (this.c == null) {
            this.c = (AlarmManager) this.a.getSystemService("alarm");
        }
        if (this.c == null) {
            this.b.b("AlarmManager is null");
        }
        return this.c;
    }
}
