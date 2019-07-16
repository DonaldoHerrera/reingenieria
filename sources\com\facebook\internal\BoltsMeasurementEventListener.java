package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BoltsMeasurementEventListener extends BroadcastReceiver {
    private static BoltsMeasurementEventListener a;
    private Context b;

    private BoltsMeasurementEventListener(Context context) {
        this.b = context.getApplicationContext();
    }

    private void a() {
        C1600pd.a(this.b).a((BroadcastReceiver) this);
    }

    private void b() {
        C1600pd.a(this.b).a(this, new IntentFilter("com.parse.bolts.measurement_event"));
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C1452kk kkVar = new C1452kk(context);
        StringBuilder sb = new StringBuilder();
        sb.append("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            String str2 = "";
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", str2).replaceAll("[ -]*$", str2), (String) bundleExtra.get(str));
        }
        kkVar.a(sb2, bundle);
    }

    public static BoltsMeasurementEventListener a(Context context) {
        BoltsMeasurementEventListener boltsMeasurementEventListener = a;
        if (boltsMeasurementEventListener != null) {
            return boltsMeasurementEventListener;
        }
        a = new BoltsMeasurementEventListener(context);
        a.b();
        return a;
    }
}
