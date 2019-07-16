package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class I extends Binder {
    /* access modifiers changed from: private */
    public final zzc a;

    I(zzc zzc) {
        this.a = zzc;
    }

    public final void a(G g) {
        if (Binder.getCallingUid() == Process.myUid()) {
            String str = "EnhancedIntentService";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "service received new intent via bind strategy");
            }
            if (this.a.b(g.a)) {
                g.a();
                return;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "intent being queued for bg execution");
            }
            this.a.a.execute(new H(this, g));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
