package com.soundcloud.android.onboarding;

import org.json.JSONObject;

/* compiled from: FacebookUserDetailsRequest.kt */
public final class k {
    /* access modifiers changed from: private */
    public static final C4928GKa<String> b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            C4928GKa<String> b = C4928GKa.b(jSONObject.optString(str));
            C7471uYa.a((Object) b, "Optional.fromNullable(optString(key))");
            return b;
        }
        C4928GKa<String> a = C4928GKa.a();
        C7471uYa.a((Object) a, "Optional.absent()");
        return a;
    }
}
