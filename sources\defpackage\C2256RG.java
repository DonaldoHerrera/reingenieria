package defpackage;

import com.adjust.sdk.Constants;

/* renamed from: RG reason: default package and case insensitive filesystem */
public enum C2256RG {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(Constants.NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");
    
    private final String g;

    private C2256RG(String str) {
        this.g = str;
    }

    public String toString() {
        return this.g;
    }
}
