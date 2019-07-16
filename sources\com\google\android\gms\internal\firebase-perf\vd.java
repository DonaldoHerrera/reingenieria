package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class vd<E> {
    vd() {
    }

    static int a(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            return i3 < 0 ? BaseClientBuilder.API_PRIORITY_OTHER : i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
