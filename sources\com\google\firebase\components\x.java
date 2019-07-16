package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final class x extends a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final f f;

    /* compiled from: com.google.firebase:firebase-common@@17.0.0 */
    private static class a implements C2216PE {
        private final Set<Class<?>> a;
        private final C2216PE b;

        public a(Set<Class<?>> set, C2216PE pe) {
            this.a = set;
            this.b = pe;
        }
    }

    x(e<?> eVar, f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (q qVar : eVar.a()) {
            if (qVar.b()) {
                if (qVar.d()) {
                    hashSet3.add(qVar.a());
                } else {
                    hashSet.add(qVar.a());
                }
            } else if (qVar.d()) {
                hashSet4.add(qVar.a());
            } else {
                hashSet2.add(qVar.a());
            }
        }
        if (!eVar.d().isEmpty()) {
            hashSet.add(C2216PE.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = eVar.d();
        this.f = fVar;
    }

    public <T> C2273SE<Set<T>> a(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.a(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> Set<T> b(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public <T> C2273SE<T> c(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> T get(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = this.f.get(cls);
            if (!cls.equals(C2216PE.class)) {
                return t;
            }
            return new a(this.e, (C2216PE) t);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }
}
