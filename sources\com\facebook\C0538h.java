package com.facebook;

/* renamed from: com.facebook.h reason: case insensitive filesystem */
/* compiled from: AccessTokenSource */
public enum C0538h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    
    private final boolean k;

    private C0538h(boolean z) {
        this.k = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.k;
    }
}
