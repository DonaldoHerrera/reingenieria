package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.i;

/* renamed from: Ge reason: default package */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class Ge<T> extends Ie<T> {
    private static final String g = i.a("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver h = new Fe(this);

    public Ge(Context context, C1811wf wfVar) {
        super(context, wfVar);
    }

    public abstract void a(Context context, Intent intent);

    public void b() {
        i.a().a(g, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.c.registerReceiver(this.h, d());
    }

    public void c() {
        i.a().a(g, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.c.unregisterReceiver(this.h);
    }

    public abstract IntentFilter d();
}
