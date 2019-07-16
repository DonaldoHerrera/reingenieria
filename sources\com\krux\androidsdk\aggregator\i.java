package com.krux.androidsdk.aggregator;

import android.os.Bundle;
import android.util.Log;

final class i implements d {
    final /* synthetic */ h a;

    i(h hVar) {
        this.a = hVar;
    }

    public final void a(Bundle bundle) {
        try {
            this.a.o = bundle.getString("beacon_url");
            this.a.p = bundle.getString("beacon_http_response");
            this.a.q = bundle.getString("beacon_http_status_code");
            if (this.a.x != null) {
                this.a.x.countDown();
            }
        } catch (Exception e) {
            String c = h.a;
            StringBuilder sb = new StringBuilder("Unable to get results from event publisher service: ");
            sb.append(e);
            Log.e(c, sb.toString());
        }
    }
}
