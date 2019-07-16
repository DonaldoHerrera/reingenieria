package com.soundcloud.android.accounts;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: Me */
public abstract class E {
    @JsonCreator
    public static E a(@JsonProperty("user") C3776gea gea, @JsonProperty("configuration") C2212OT ot, @JsonProperty("primary_email_confirmed") boolean z) {
        return new C2528i(gea, ot, z);
    }

    public abstract C2212OT a();

    public abstract C3776gea b();

    public abstract boolean c();
}
