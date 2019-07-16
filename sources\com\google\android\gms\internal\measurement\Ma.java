package com.google.android.gms.internal.measurement;

import java.io.Serializable;

final class Ma<T> implements Ka<T>, Serializable {
    private final Ka<T> a;
    private volatile transient boolean b;
    private transient T c;

    Ma(Ka<T> ka) {
        Ha.a(ka);
        this.a = ka;
    }

    public final T get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T t = this.a.get();
                    this.c = t;
                    this.b = true;
                    return t;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
