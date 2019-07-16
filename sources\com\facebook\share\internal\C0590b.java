package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.b reason: case insensitive filesystem */
/* compiled from: DeviceShareDialogFragment */
class C0590b implements b {
    final /* synthetic */ DeviceShareDialogFragment a;

    C0590b(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.a = deviceShareDialogFragment;
    }

    public void a(L l) {
        FacebookRequestError a2 = l.a();
        if (a2 != null) {
            this.a.a(a2);
            return;
        }
        JSONObject b = l.b();
        RequestState requestState = new RequestState();
        try {
            requestState.a(b.getString("user_code"));
            requestState.a(b.getLong("expires_in"));
            this.a.a(requestState);
        } catch (JSONException unused) {
            this.a.a(new FacebookRequestError(0, "", "Malformed server response"));
        }
    }
}
