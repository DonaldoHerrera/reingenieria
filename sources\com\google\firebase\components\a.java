package com.google.firebase.components;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
abstract class a implements f {
    a() {
    }

    public <T> Set<T> b(Class<T> cls) {
        return (Set) a(cls).get();
    }

    public <T> T get(Class<T> cls) {
        C2273SE c = c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }
}
