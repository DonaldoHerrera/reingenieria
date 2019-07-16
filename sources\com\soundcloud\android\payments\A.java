package com.soundcloud.android.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: CheckoutStarted */
class A {
    public final String a;

    @JsonCreator
    A(@JsonProperty("checkout_token") String str) {
        this.a = str;
    }
}
