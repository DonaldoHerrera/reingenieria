package com.google.firebase.iid;

import android.util.Log;

final class H implements Runnable {
    private final /* synthetic */ G a;
    private final /* synthetic */ I b;

    H(I i, G g) {
        this.b = i;
        this.a = g;
    }

    public final void run() {
        String str = "EnhancedIntentService";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "bg processing of the intent starting now");
        }
        this.b.a.c(this.a.a);
        this.a.a();
    }
}
