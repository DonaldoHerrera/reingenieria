package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.pb reason: case insensitive filesystem */
class C1159pb extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public final Kd a;
    private boolean b;
    private boolean c;

    C1159pb(Kd kd) {
        Preconditions.checkNotNull(kd);
        this.a = kd;
    }

    public final void a() {
        this.a.m();
        this.a.d().i();
        this.a.d().i();
        if (this.b) {
            this.a.e().A().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.e().s().a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void b() {
        this.a.m();
        this.a.d().i();
        if (!this.b) {
            this.a.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.c = this.a.k().u();
            this.a.e().A().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
            this.b = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.a.m();
        String action = intent.getAction();
        this.a.e().A().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean u = this.a.k().u();
            if (this.c != u) {
                this.c = u;
                this.a.d().a((Runnable) new C1173sb(this, u));
            }
            return;
        }
        this.a.e().v().a("NetworkBroadcastReceiver received unknown action", action);
    }
}
