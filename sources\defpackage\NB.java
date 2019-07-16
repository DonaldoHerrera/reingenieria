package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;

/* renamed from: NB reason: default package */
public final class NB extends CB<EB> {
    private static NB g;
    private final Handler h;
    private final GB i;

    private NB(Context context) {
        this(context, FB.a());
    }

    private NB(Context context, GB gb) {
        super(new C1893zA("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.h = new Handler(Looper.getMainLooper());
        this.i = gb;
    }

    public static synchronized NB a(Context context) {
        NB nb;
        synchronized (NB.class) {
            if (g == null) {
                g = new NB(context);
            }
            nb = g;
        }
        return nb;
    }

    /* access modifiers changed from: private */
    public final void a(EB eb, int i2, int i3) {
        this.h.post(new MB(this, eb, i2, i3));
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        EB a = EB.a(intent.getBundleExtra("session_state"));
        this.a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        if (a.a() == 3) {
            GB gb = this.i;
            if (gb != null) {
                gb.a(a.i, new HB(this, a, intent, context));
                return;
            }
        }
        a(a);
    }
}
