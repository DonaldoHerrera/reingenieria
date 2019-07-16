package com.facebook.login;

/* renamed from: com.facebook.login.b reason: case insensitive filesystem */
/* compiled from: DefaultAudience */
public enum C0569b {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    
    private final String f;

    private C0569b(String str) {
        this.f = str;
    }

    public String a() {
        return this.f;
    }
}
