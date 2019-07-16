package com.facebook;

import android.os.Bundle;
import com.facebook.GraphRequest.b;
import com.facebook.internal.A;
import com.facebook.internal.C0542c;
import com.facebook.internal.E;
import org.json.JSONObject;

/* compiled from: UserSettingsManager */
class aa implements Runnable {
    final /* synthetic */ long a;

    aa(long j) {
        this.a = j;
    }

    public void run() {
        if (ba.e.a()) {
            A a2 = E.a(B.f(), false);
            if (a2 != null && a2.b()) {
                C0542c a3 = C0542c.a(B.e());
                if (((a3 == null || a3.a() == null) ? null : a3.a()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", a3.a());
                    String str = "auto_event_setup_enabled";
                    bundle.putString("fields", str);
                    GraphRequest a4 = GraphRequest.a((AccessToken) null, B.f(), (b) null);
                    a4.a(true);
                    a4.a(bundle);
                    JSONObject b = a4.b().b();
                    if (b != null) {
                        ba.f.b = Boolean.valueOf(b.optBoolean(str, false));
                        ba.f.d = this.a;
                        ba.d(ba.f);
                    }
                }
            }
        }
    }
}
