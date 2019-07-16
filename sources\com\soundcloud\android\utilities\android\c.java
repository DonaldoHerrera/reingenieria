package com.soundcloud.android.utilities.android;

import java.util.Random;

/* compiled from: ClosedRangeExtensions.kt */
public final class c {
    public static final int a(C6581hZa<Integer> hza) {
        C7471uYa.b(hza, "$this$random");
        return new Random().nextInt((((Number) hza.g()).intValue() + 1) - ((Number) hza.f()).intValue()) + ((Number) hza.f()).intValue();
    }
}
