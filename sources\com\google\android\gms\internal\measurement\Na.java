package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

final class Na<T> implements Ka<T>, Serializable {
    private final T a;

    Na(T t) {
        this.a = t;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Na)) {
            return false;
        }
        Na na = (Na) obj;
        T t = this.a;
        T t2 = na.a;
        if (t == t2 || (t != null && t.equals(t2))) {
            return true;
        }
        return false;
    }

    public final T get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
