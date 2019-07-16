package com.soundcloud.android.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: StartCheckout.kt */
public final class La {
    private final String a;

    @JsonCreator
    public La(@JsonProperty("product_id") String str) {
        C7471uYa.b(str, "productId");
        this.a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.payments.La) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof La) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StartCheckout(productId=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
