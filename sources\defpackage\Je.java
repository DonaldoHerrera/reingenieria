package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.work.i;

/* renamed from: Je reason: default package */
/* compiled from: NetworkStateTracker */
public class Je extends Ie<C1690se> {
    static final String g = i.a("NetworkStateTracker");
    private final ConnectivityManager h = ((ConnectivityManager) this.c.getSystemService("connectivity"));
    private b i;
    private a j;

    /* renamed from: Je$a */
    /* compiled from: NetworkStateTracker */
    private class a extends BroadcastReceiver {
        a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                i.a().a(Je.g, "Network broadcast received", new Throwable[0]);
                Je je = Je.this;
                je.a(je.d());
            }
        }
    }

    /* renamed from: Je$b */
    /* compiled from: NetworkStateTracker */
    private class b extends NetworkCallback {
        b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            i.a().a(Je.g, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            Je je = Je.this;
            je.a(je.d());
        }

        public void onLost(Network network) {
            i.a().a(Je.g, "Network connection lost", new Throwable[0]);
            Je je = Je.this;
            je.a(je.d());
        }
    }

    public Je(Context context, C1811wf wfVar) {
        super(context, wfVar);
        if (f()) {
            this.i = new b();
        } else {
            this.j = new a();
        }
    }

    private boolean e() {
        boolean z = false;
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(this.h.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
            z = true;
        }
        return z;
    }

    private static boolean f() {
        return VERSION.SDK_INT >= 24;
    }

    public void b() {
        if (f()) {
            i.a().a(g, "Registering network callback", new Throwable[0]);
            this.h.registerDefaultNetworkCallback(this.i);
            return;
        }
        i.a().a(g, "Registering broadcast receiver", new Throwable[0]);
        this.c.registerReceiver(this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void c() {
        if (f()) {
            try {
                i.a().a(g, "Unregistering network callback", new Throwable[0]);
                this.h.unregisterNetworkCallback(this.i);
            } catch (IllegalArgumentException e) {
                i.a().b(g, "Received exception while unregistering network callback", e);
            }
        } else {
            i.a().a(g, "Unregistering broadcast receiver", new Throwable[0]);
            this.c.unregisterReceiver(this.j);
        }
    }

    /* access modifiers changed from: 0000 */
    public C1690se d() {
        NetworkInfo activeNetworkInfo = this.h.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e = e();
        boolean a2 = C1628qb.a(this.h);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C1690se(z2, e, a2, z);
    }

    public C1690se a() {
        return d();
    }
}
