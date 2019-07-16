package com.facebook.share.internal;

import android.content.Context;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0565j;

/* compiled from: LikeActionController */
class l extends C0565j {
    l() {
    }

    /* access modifiers changed from: protected */
    public void a(AccessToken accessToken, AccessToken accessToken2) {
        Context e = B.e();
        if (accessToken2 == null) {
            t.i = (t.i + 1) % 1000;
            e.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", t.i).apply();
            t.c.clear();
            t.b.b();
        }
        t.d((t) null, "com.facebook.sdk.LikeActionController.DID_RESET");
    }
}
