package com.google.android.gms.internal.measurement;

final class La<T> implements Ka<T> {
    private volatile Ka<T> a;
    private volatile boolean b;
    private T c;

    La(Ka<T> ka) {
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
                    this.a = null;
                    return t;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
