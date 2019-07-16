package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.appboy.services.AppboyDataSyncService;

public class o {
    /* access modifiers changed from: private */
    public static final String a = Hg.a(o.class);
    private final Context b;
    /* access modifiers changed from: private */
    public final q c;
    private final AlarmManager d;
    private final n e;
    private final BroadcastReceiver f;
    private final PendingIntent g;
    /* access modifiers changed from: private */
    public y h;
    private long i;
    private boolean j;
    private volatile boolean k = false;

    /* renamed from: bo.app.o$4 reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[x.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            a[x.NONE.ordinal()] = 1;
            a[x.TWO_G.ordinal()] = 2;
            a[x.FOUR_G.ordinal()] = 3;
            a[x.WIFI.ordinal()] = 4;
            a[x.THREE_G.ordinal()] = 5;
        }
    }

    public o(Context context, final ab abVar, q qVar, AlarmManager alarmManager, n nVar, String str) {
        this.b = context;
        this.c = qVar;
        this.d = alarmManager;
        this.e = nVar;
        this.h = y.NO_SESSION;
        this.i = -1;
        if (!dy.a(this.b, AppboyDataSyncService.class)) {
            Hg.b(a, "Appboy periodic data flushing is not available. Declare <service android:name=\"com.appboy.services.AppboyDataSyncService\"/> in your AndroidManifest.xml to enable Appboy periodic data flushing.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationContext().getPackageName());
        sb.append(".REQUEST_DATA_SYNC");
        this.g = PendingIntent.getService(this.b, str.hashCode(), new Intent(sb.toString()).setClass(context, AppboyDataSyncService.class), 134217728);
        this.f = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                try {
                    o.this.c.a(intent, (ConnectivityManager) context.getSystemService("connectivity"));
                    o.this.c();
                } catch (Exception e) {
                    Hg.b(o.a, "Failed to process connectivity event.", e);
                    o.this.a(abVar, (Throwable) e);
                }
            }
        };
        Hg.a(a, "Registered broadcast filters");
    }

    private void g() {
        PendingIntent pendingIntent = this.g;
        if (pendingIntent != null) {
            this.d.cancel(pendingIntent);
        }
    }

    public synchronized boolean b() {
        if (!this.k) {
            Hg.a(a, "The data sync policy is not running. Ignoring request.");
            return false;
        }
        Hg.a(a, "Data sync stopped");
        g();
        e();
        this.k = false;
        return true;
    }

    /* access modifiers changed from: protected */
    public void c() {
        long j2 = this.i;
        if (this.h == y.NO_SESSION || this.j) {
            this.i = -1;
        } else {
            int i2 = AnonymousClass4.a[this.c.a().ordinal()];
            if (i2 == 1) {
                this.i = -1;
            } else if (i2 == 2) {
                this.i = this.e.a();
            } else if (i2 == 3 || i2 == 4) {
                this.i = this.e.c();
            } else {
                this.i = this.e.b();
            }
        }
        long j3 = this.i;
        if (j2 != j3) {
            a(j3);
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Dispatch state has changed from ");
            sb.append(j2);
            sb.append(" to ");
            sb.append(this.i);
            sb.append(".");
            Hg.a(str, sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.b.registerReceiver(this.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.b.unregisterReceiver(this.f);
    }

    public void a(aa aaVar) {
        aaVar.a((Yf<T>) new Yf<al>() {
            /* renamed from: a */
            public void trigger(al alVar) {
                o.this.h = y.OPEN_SESSION;
                o.this.c();
            }
        }, al.class);
        aaVar.a((Yf<T>) new Yf<am>() {
            /* renamed from: a */
            public void trigger(am amVar) {
                o.this.h = y.NO_SESSION;
                o.this.c();
            }
        }, am.class);
    }

    public synchronized void a(boolean z) {
        this.j = z;
        c();
        if (z) {
            b();
        } else {
            a();
        }
    }

    public synchronized boolean a() {
        if (this.k) {
            Hg.a(a, "The data sync policy is already running. Ignoring request.");
            return false;
        }
        Hg.a(a, "Data sync started");
        d();
        a(3000);
        this.k = true;
        return true;
    }

    private void a(long j2) {
        if (this.d == null) {
            Hg.a(a, "Alarm manager was null. Ignoring request to reset it.");
            return;
        }
        if (this.i <= 0) {
            Hg.a(a, "Cancelling alarm because delay value was not positive.");
            g();
        } else {
            a(dn.c() + j2, this.i);
        }
    }

    private void a(long j2, long j3) {
        this.d.setInexactRepeating(1, j2, j3, this.g);
    }

    /* access modifiers changed from: private */
    public void a(ab abVar, Throwable th) {
        try {
            abVar.a(th, Throwable.class);
        } catch (Exception e2) {
            Hg.b(a, "Failed to log throwable.", e2);
        }
    }
}
