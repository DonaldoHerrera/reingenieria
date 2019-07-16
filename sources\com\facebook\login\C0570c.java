package com.facebook.login;

import com.facebook.C0594t;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.c reason: case insensitive filesystem */
/* compiled from: DeviceAuthDialog */
class C0570c implements b {
    final /* synthetic */ DeviceAuthDialog a;

    C0570c(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    public void a(L l) {
        if (!this.a.j) {
            if (l.a() != null) {
                this.a.a(l.a().e());
                return;
            }
            JSONObject b = l.b();
            RequestState requestState = new RequestState();
            try {
                requestState.b(b.getString("user_code"));
                requestState.a(b.getString("code"));
                requestState.a(b.getLong("interval"));
                this.a.a(requestState);
            } catch (JSONException e) {
                this.a.a(new C0594t((Throwable) e));
            }
        }
    }
}
