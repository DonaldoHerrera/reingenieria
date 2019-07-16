package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Ti reason: default package */
/* compiled from: DevicePowerStateListener */
class Ti {
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static final IntentFilter b = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    private static final IntentFilter c = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Context e;
    private final BroadcastReceiver f = new Si(this);
    private final BroadcastReceiver g = new Ri(this);
    /* access modifiers changed from: private */
    public boolean h;

    public Ti(Context context) {
        this.e = context;
    }

    public void b() {
        boolean z = true;
        if (!this.d.getAndSet(true)) {
            Intent registerReceiver = this.e.registerReceiver(null, a);
            int i = -1;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("status", -1);
            }
            if (!(i == 2 || i == 5)) {
                z = false;
            }
            this.h = z;
            this.e.registerReceiver(this.g, b);
            this.e.registerReceiver(this.f, c);
        }
    }

    public boolean c() {
        return this.h;
    }

    public void a() {
        if (this.d.getAndSet(false)) {
            this.e.unregisterReceiver(this.g);
            this.e.unregisterReceiver(this.f);
        }
    }
}
