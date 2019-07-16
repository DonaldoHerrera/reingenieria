package com.facebook.login;

import com.facebook.C0594t;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.f reason: case insensitive filesystem */
/* compiled from: DeviceAuthDialog */
class C0573f implements b {
    final /* synthetic */ DeviceAuthDialog a;

    C0573f(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    public void a(L l) {
        if (!this.a.e.get()) {
            FacebookRequestError a2 = l.a();
            if (a2 != null) {
                int h = a2.h();
                if (h != 1349152) {
                    switch (h) {
                        case 1349172:
                        case 1349174:
                            this.a.Tb();
                            break;
                        case 1349173:
                            this.a.Qb();
                            break;
                        default:
                            this.a.a(l.a().e());
                            break;
                    }
                } else {
                    if (this.a.h != null) {
                        C1330gl.a(this.a.h.d());
                    }
                    if (this.a.l != null) {
                        DeviceAuthDialog deviceAuthDialog = this.a;
                        deviceAuthDialog.a(deviceAuthDialog.l);
                    } else {
                        this.a.Qb();
                    }
                }
                return;
            }
            try {
                JSONObject b = l.b();
                this.a.a(b.getString("access_token"), Long.valueOf(b.getLong("expires_in")), Long.valueOf(b.optLong("data_access_expiration_time")));
            } catch (JSONException e) {
                this.a.a(new C0594t((Throwable) e));
            }
        }
    }
}
