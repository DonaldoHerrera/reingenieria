package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kh reason: default package and case insensitive filesystem */
/* compiled from: EnabledSessionAnalyticsManagerStrategy */
class C1449kh implements C1903zh {
    private final C5531_Ma a;
    private final C4839DOa b;
    private final Context c;
    private final C1813wh d;
    private final ScheduledExecutorService e;
    private final AtomicReference<ScheduledFuture<?>> f = new AtomicReference<>();
    final Ch g;
    private final C1542nh h;
    C7323sOa i;
    C7184qNa j = new C7184qNa();
    C1480lh k = new C1634qh();
    boolean l = true;
    boolean m = true;
    volatile int n = -1;
    boolean o = false;
    boolean p = false;

    public C1449kh(C5531_Ma _ma, Context context, ScheduledExecutorService scheduledExecutorService, C1813wh whVar, C4839DOa dOa, Ch ch, C1542nh nhVar) {
        this.a = _ma;
        this.c = context;
        this.e = scheduledExecutorService;
        this.d = whVar;
        this.b = dOa;
        this.g = ch;
        this.h = nhVar;
    }

    public void a(NOa nOa, String str) {
        C1843xh xhVar = new C1843xh(this.a, str, nOa.a, this.b, this.j.d(this.c));
        this.i = C1264eh.a(xhVar);
        this.d.a(nOa);
        this.o = nOa.f;
        this.p = nOa.g;
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase analytics forwarding ");
        String str2 = "enabled";
        String str3 = "disabled";
        sb.append(this.o ? str2 : str3);
        String str4 = "Answers";
        e2.d(str4, sb.toString());
        C5701cNa e3 = C5328TMa.e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase analytics including purchase events ");
        sb2.append(this.p ? str2 : str3);
        e3.d(str4, sb2.toString());
        this.l = nOa.h;
        C5701cNa e4 = C5328TMa.e();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Custom event tracking ");
        sb3.append(this.l ? str2 : str3);
        e4.d(str4, sb3.toString());
        this.m = nOa.i;
        C5701cNa e5 = C5328TMa.e();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Predefined event tracking ");
        if (!this.m) {
            str2 = str3;
        }
        sb4.append(str2);
        e5.d(str4, sb4.toString());
        if (nOa.k > 1) {
            C5328TMa.e().d(str4, "Event sampling enabled");
            this.k = new C1783vh(nOa.k);
        }
        this.n = nOa.b;
        a(0, (long) this.n);
    }

    public void b() {
        if (this.f.get() != null) {
            C7391tNa.c(this.c, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f.get()).cancel(false);
            this.f.set(null);
        }
    }

    public void c() {
        if (this.i == null) {
            C7391tNa.c(this.c, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C7391tNa.c(this.c, "Sending all files");
        List d2 = this.d.d();
        int i2 = 0;
        while (true) {
            try {
                if (d2.size() <= 0) {
                    break;
                }
                C7391tNa.c(this.c, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(d2.size())}));
                boolean a2 = this.i.a(d2);
                if (a2) {
                    i2 += d2.size();
                    this.d.a(d2);
                }
                if (!a2) {
                    break;
                }
                d2 = this.d.d();
            } catch (Exception e2) {
                Context context = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to send batch of analytics files to server: ");
                sb.append(e2.getMessage());
                C7391tNa.a(context, sb.toString(), (Throwable) e2);
            }
        }
        if (i2 == 0) {
            this.d.b();
        }
    }

    public void d() {
        this.d.a();
    }

    public void e() {
        if (this.n != -1) {
            a((long) this.n, (long) this.n);
        }
    }

    public void a(a aVar) {
        Bh a2 = aVar.a(this.g);
        String str = "Answers";
        if (!this.l && b.CUSTOM.equals(a2.c)) {
            C5701cNa e2 = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Custom events tracking disabled - skipping event: ");
            sb.append(a2);
            e2.d(str, sb.toString());
        } else if (!this.m && b.PREDEFINED.equals(a2.c)) {
            C5701cNa e3 = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Predefined events tracking disabled - skipping event: ");
            sb2.append(a2);
            e3.d(str, sb2.toString());
        } else if (this.k.a(a2)) {
            C5701cNa e4 = C5328TMa.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Skipping filtered event: ");
            sb3.append(a2);
            e4.d(str, sb3.toString());
        } else {
            try {
                this.d.a(a2);
            } catch (IOException e5) {
                C5701cNa e6 = C5328TMa.e();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to write event: ");
                sb4.append(a2);
                e6.e(str, sb4.toString(), e5);
            }
            e();
            boolean z = b.CUSTOM.equals(a2.c) || b.PREDEFINED.equals(a2.c);
            boolean equals = "purchase".equals(a2.g);
            if (this.o && z && (!equals || this.p)) {
                try {
                    this.h.a(a2);
                } catch (Exception e7) {
                    C5701cNa e8 = C5328TMa.e();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to map event to Firebase: ");
                    sb5.append(a2);
                    e8.e(str, sb5.toString(), e7);
                }
            }
        }
    }

    public boolean a() {
        try {
            return this.d.g();
        } catch (IOException e2) {
            C7391tNa.a(this.c, "Failed to roll file over.", (Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2, long j3) {
        if (this.f.get() == null) {
            C7530vOa voa = new C7530vOa(this.c, this);
            Context context = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling time based file roll over every ");
            sb.append(j3);
            sb.append(" seconds");
            C7391tNa.c(context, sb.toString());
            try {
                this.f.set(this.e.scheduleAtFixedRate(voa, j2, j3, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e2) {
                C7391tNa.a(this.c, "Failed to schedule time based file roll over", (Throwable) e2);
            }
        }
    }
}
