package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;

public class bd {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(bd.class);
    /* access modifiers changed from: private */
    public final Object b = new Object();
    private final dh c;
    /* access modifiers changed from: private */
    public final ab d;
    private final Context e;
    private final AlarmManager f;
    private final int g;
    private final String h;
    private final dj i;
    private volatile bt j;

    public bd(dh dhVar, ab abVar, Context context, AlarmManager alarmManager, int i2, dj djVar) {
        this.c = dhVar;
        this.d = abVar;
        this.e = context;
        this.f = alarmManager;
        this.g = i2;
        this.i = djVar;
        AnonymousClass1 r2 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                synchronized (bd.this.b) {
                    try {
                        bd.this.i();
                    } catch (Exception e) {
                        try {
                            bd.this.d.a(e, Throwable.class);
                        } catch (Exception e2) {
                            Hg.b(bd.a, "Failed to log throwable.", e2);
                        }
                    }
                }
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".intent.APPBOY_SESSION_SHOULD_SEAL");
        this.h = sb.toString();
        context.registerReceiver(r2, new IntentFilter(this.h));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        return true;
     */
    private boolean g() {
        synchronized (this.b) {
            i();
            if (this.j != null) {
                if (!this.j.c()) {
                    if (this.j.b() == null) {
                        return false;
                    }
                    this.j.a(null);
                    return true;
                }
            }
            bt btVar = this.j;
            this.j = h();
            if (btVar != null && btVar.c()) {
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Clearing completely dispatched sealed session ");
                sb.append(btVar.a());
                Hg.a(str, sb.toString());
                this.c.b(btVar);
            }
        }
    }

    private bt h() {
        bt btVar = new bt(bv.a(), dn.b());
        this.i.a(true);
        this.d.a(aj.a, aj.class);
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("New session created with ID: ");
        sb.append(btVar.a());
        Hg.c(str, sb.toString());
        return btVar;
    }

    /* access modifiers changed from: private */
    public void i() {
        synchronized (this.b) {
            if (this.j == null) {
                this.j = this.c.a();
                if (this.j != null) {
                    String str = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Restored session from offline storage: ");
                    sb.append(this.j.a().toString());
                    Hg.a(str, sb.toString());
                }
            }
            if (this.j != null && this.j.b() != null && !this.j.c() && (this.j.b().doubleValue() + ((double) ((long) this.g))) * 1000.0d <= ((double) dn.c())) {
                String str2 = a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Session [");
                sb2.append(this.j.a());
                sb2.append("] being sealed because its end time is over the grace period.");
                Hg.c(str2, sb2.toString());
                e();
                this.c.b(this.j);
                this.j = null;
            }
        }
    }

    private void j() {
        Intent intent = new Intent(this.h);
        intent.putExtra("session_id", this.j.toString());
        this.f.set(2, SystemClock.elapsedRealtime() + ((long) (this.g * 1000)), PendingIntent.getBroadcast(this.e, 0, intent, 1073741824));
    }

    private void k() {
        Intent intent = new Intent(this.h);
        intent.putExtra("session_id", this.j.toString());
        this.f.cancel(PendingIntent.getBroadcast(this.e, 0, intent, 1073741824));
    }

    public boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.j != null && this.j.c();
        }
        return z;
    }

    public void e() {
        synchronized (this.b) {
            if (this.j != null) {
                this.j.d();
                this.c.a(this.j);
                this.d.a(new ak(this.j), ak.class);
            }
        }
    }

    public bt a() {
        bt btVar;
        synchronized (this.b) {
            if (g()) {
                this.c.a(this.j);
            }
            k();
            this.d.a(al.a, al.class);
            btVar = this.j;
        }
        return btVar;
    }

    public bt b() {
        bt btVar;
        synchronized (this.b) {
            g();
            this.j.a(Double.valueOf(dn.b()));
            this.c.a(this.j);
            j();
            this.d.a(am.a, am.class);
            btVar = this.j;
        }
        return btVar;
    }

    public bv c() {
        synchronized (this.b) {
            i();
            if (this.j == null) {
                return null;
            }
            bv a2 = this.j.a();
            return a2;
        }
    }
}
