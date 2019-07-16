package com.soundcloud.android.onboarding.auth;

import com.comscore.android.id.IdHelperAndroid;

/* compiled from: SignupVia */
public enum pa {
    API("api"),
    FACEBOOK_SSO("facebook:access-token"),
    FACEBOOK_WEBFLOW("facebook:web-flow"),
    GOOGLE_PLUS("google_plus:access-token"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE);
    
    public final String g;

    private pa(String str) {
        this.g = str;
    }

    public String a() {
        return this.g;
    }

    public static pa a(String str) {
        pa[] values;
        for (pa paVar : values()) {
            if (paVar.g.equals(str)) {
                return paVar;
            }
        }
        return NONE;
    }
}
