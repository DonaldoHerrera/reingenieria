package com.soundcloud.android.foundation.events;

/* compiled from: LinkType.kt */
public enum p {
    ATTRIBUTOR("attributor"),
    OWNER("owner"),
    SELF("self");
    
    private final String e;

    private p(String str) {
        this.e = str;
    }

    public final String a() {
        return this.e;
    }
}
