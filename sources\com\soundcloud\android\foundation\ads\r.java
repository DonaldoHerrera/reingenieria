package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: ApiDisplayProperties.kt */
public final class r {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    @JsonCreator
    public r(@JsonProperty("color.learn_more.default.text") String str, @JsonProperty("color.learn_more.default.background") String str2, @JsonProperty("color.learn_more.pressed.text") String str3, @JsonProperty("color.learn_more.pressed.background") String str4, @JsonProperty("color.learn_more.focused.text") String str5, @JsonProperty("color.learn_more.focused.background") String str6) {
        C7471uYa.b(str, "defaultTextColor");
        C7471uYa.b(str2, "defaultBackgroundColor");
        C7471uYa.b(str3, "pressedTextColor");
        C7471uYa.b(str4, "pressedBackgroundColor");
        C7471uYa.b(str5, "focusedTextColor");
        C7471uYa.b(str6, "focusedBackgroundColor");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @JsonProperty("color.learn_more.default.background")
    public final String a() {
        return this.b;
    }

    @JsonProperty("color.learn_more.default.text")
    public final String b() {
        return this.a;
    }

    @JsonProperty("color.learn_more.focused.background")
    public final String c() {
        return this.f;
    }

    @JsonProperty("color.learn_more.focused.text")
    public final String d() {
        return this.e;
    }

    @JsonProperty("color.learn_more.pressed.background")
    public final String e() {
        return this.d;
    }

    @JsonProperty("color.learn_more.pressed.text")
    public final String f() {
        return this.c;
    }
}
