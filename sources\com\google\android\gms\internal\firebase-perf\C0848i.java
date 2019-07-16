package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* renamed from: com.google.android.gms.internal.firebase-perf.i reason: case insensitive filesystem */
public final class C0848i {
    public static int a(long j) {
        if (j > 2147483647L) {
            return BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
