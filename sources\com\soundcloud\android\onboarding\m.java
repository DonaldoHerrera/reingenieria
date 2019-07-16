package com.soundcloud.android.onboarding;

/* compiled from: LoginProvider */
public enum m {
    PASSWORD("password"),
    FACEBOOK("facebook"),
    GOOGLE("google");
    
    private final String e;

    private m(String str) {
        this.e = str;
    }

    public String toString() {
        return this.e;
    }
}
