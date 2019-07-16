package com.soundcloud.android.payments;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: CheckoutUpdated */
class B {
    static final C7118pQa<B, Ea> a = C4230b.a;
    public final String b;
    public final String c;
    public final String d;

    @JsonCreator
    B(@JsonProperty("state") String str, @JsonProperty("reason") String str2, @JsonProperty("checkout_token") String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    static /* synthetic */ Ea a(B b2) throws Exception {
        char c2;
        String str = b2.b;
        int hashCode = str.hashCode();
        if (hashCode != -1281977283) {
            if (hashCode != -733631846) {
                if (hashCode == -682587753 && str.equals("pending")) {
                    c2 = 0;
                    if (c2 != 0) {
                        return Ea.PENDING;
                    }
                    if (c2 == 1) {
                        return Ea.SUCCESS;
                    }
                    if (c2 != 2) {
                        return Ea.NONE;
                    }
                    return Ea.VERIFY_FAIL;
                }
            } else if (str.equals("successful")) {
                c2 = 1;
                if (c2 != 0) {
                }
            }
        } else if (str.equals("failed")) {
            c2 = 2;
            if (c2 != 0) {
            }
        }
        c2 = 65535;
        if (c2 != 0) {
        }
    }
}
