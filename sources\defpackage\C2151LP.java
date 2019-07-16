package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/* renamed from: LP reason: default package and case insensitive filesystem */
/* compiled from: ChartType */
public enum C2151LP {
    TRENDING("trending"),
    TOP("top"),
    NONE("");
    
    private final String e;

    private C2151LP(String str) {
        this.e = str;
    }

    @JsonValue
    public String a() {
        return this.e;
    }

    @JsonCreator
    public static C2151LP a(String str) {
        C2151LP[] values;
        if (!C5206PKa.a((CharSequence) str)) {
            for (C2151LP lp : values()) {
                if (lp.e.equalsIgnoreCase(str)) {
                    return lp;
                }
            }
        }
        return NONE;
    }
}
