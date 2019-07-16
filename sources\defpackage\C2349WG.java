package defpackage;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: WG reason: default package and case insensitive filesystem */
class C2349WG extends BroadcastReceiver {
    final /* synthetic */ C2367XG a;

    C2349WG(C2367XG xg) {
        this.a = xg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r3.inKeyguardRestrictedInputMode() == false) goto L_0x0023;
     */
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                this.a.a(true);
            } else {
                if (!"android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                        if (keyguardManager != null) {
                        }
                    }
                }
                this.a.a(false);
            }
        }
    }
}
