package com.google.android.gms.internal.firebase-perf;

import java.io.Serializable;

public final class nd {
    public static <T> Ec<T> a(Ec<T> ec) {
        if ((ec instanceof pd) || (ec instanceof md)) {
            return ec;
        }
        if (ec instanceof Serializable) {
            return new md(ec);
        }
        return new pd(ec);
    }
}
