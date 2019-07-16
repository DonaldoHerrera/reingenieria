package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: iA reason: default package and case insensitive filesystem */
public final class C1377iA extends CB<C1683sA> {
    public C1377iA(Context context) {
        super(new C1893zA("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        String str = "package.name";
        if (!context.getPackageName().equals(intent.getStringExtra(str))) {
            this.a.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra(str));
            return;
        }
        C1683sA sAVar = new C1683sA(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getStringExtra(str));
        this.a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", sAVar);
        a(sAVar);
    }
}
