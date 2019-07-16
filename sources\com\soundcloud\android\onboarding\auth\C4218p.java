package com.soundcloud.android.onboarding.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.soundcloud.android.onboarding.auth.p reason: case insensitive filesystem */
/* compiled from: AgeRestrictionError */
abstract class C4218p {
    C4218p() {
    }

    @JsonCreator
    public static C4218p a(@JsonProperty("minimum_age") String str) {
        return new I(str);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("minimum_age")
    public abstract String a();
}
