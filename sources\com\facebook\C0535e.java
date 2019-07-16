package com.facebook;

import com.facebook.GraphRequest.b;
import org.json.JSONObject;

/* renamed from: com.facebook.e reason: case insensitive filesystem */
/* compiled from: AccessTokenManager */
class C0535e implements b {
    final /* synthetic */ a a;
    final /* synthetic */ C0537g b;

    C0535e(C0537g gVar, a aVar) {
        this.b = gVar;
        this.a = aVar;
    }

    public void a(L l) {
        JSONObject b2 = l.b();
        if (b2 != null) {
            this.a.a = b2.optString("access_token");
            this.a.b = b2.optInt("expires_at");
            this.a.c = Long.valueOf(b2.optLong("data_access_expiration_time"));
        }
    }
}
