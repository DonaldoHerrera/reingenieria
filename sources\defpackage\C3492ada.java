package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/* renamed from: ada reason: default package and case insensitive filesystem */
/* compiled from: Sharing */
public enum C3492ada {
    UNDEFINED(""),
    PUBLIC("public"),
    PRIVATE("private");
    
    public final String e;

    private C3492ada(String str) {
        this.e = str;
    }

    @JsonCreator
    public static C3492ada a(String str) {
        C3492ada[] values;
        if (!C5206PKa.a((CharSequence) str)) {
            for (C3492ada ada : values()) {
                if (ada.e.equalsIgnoreCase(str)) {
                    return ada;
                }
            }
        }
        return UNDEFINED;
    }

    @JsonValue
    public String b() {
        return this.e;
    }

    public boolean a() {
        return PRIVATE == this;
    }
}
