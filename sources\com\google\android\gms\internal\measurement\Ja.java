package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class Ja {
    public static <T> Ka<T> a(Ka<T> ka) {
        if ((ka instanceof La) || (ka instanceof Ma)) {
            return ka;
        }
        if (ka instanceof Serializable) {
            return new Ma(ka);
        }
        return new La(ka);
    }

    public static <T> Ka<T> a(T t) {
        return new Na(t);
    }
}
