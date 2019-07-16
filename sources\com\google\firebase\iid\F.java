package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

final /* synthetic */ class F implements Runnable {
    private final G a;
    private final Intent b;

    F(G g, Intent intent) {
        this.a = g;
        this.b = intent;
    }

    public final void run() {
        G g = this.a;
        String action = this.b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        g.a();
    }
}
