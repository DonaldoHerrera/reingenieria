package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
class v<T> implements C2273SE<T> {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile C2273SE<T> c;

    v(C2273SE<T> se) {
        this.c = se;
    }

    public T get() {
        T t = this.b;
        if (t == a) {
            synchronized (this) {
                t = this.b;
                if (t == a) {
                    t = this.c.get();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }
}
