package com.soundcloud.android.image;

import com.fasterxml.jackson.annotation.JsonCreator;

/* compiled from: ImageStyle */
public enum W {
    CIRCULAR("circular"),
    SQUARE("square"),
    STATION("station");
    
    private final String e;

    private W(String str) {
        this.e = str;
    }

    @JsonCreator
    public static W a(String str) {
        W[] values;
        if (str != null) {
            for (W w : values()) {
                if (w.e.equals(str)) {
                    return w;
                }
            }
        }
        return null;
    }

    public String a() {
        return this.e;
    }
}
