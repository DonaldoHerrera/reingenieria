package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class Ac {
    private static final Ac a = new Ac();
    private final Ic b = new C0943dc();
    private final ConcurrentMap<Class<?>, Ec<?>> c = new ConcurrentHashMap();

    private Ac() {
    }

    public static Ac a() {
        return a;
    }

    public final <T> Ec<T> a(Class<T> cls) {
        String str = "messageType";
        Hb.a(cls, str);
        Ec<T> ec = (Ec) this.c.get(cls);
        if (ec != null) {
            return ec;
        }
        Ec<T> a2 = this.b.a(cls);
        Hb.a(cls, str);
        Hb.a(a2, "schema");
        Ec ec2 = (Ec) this.c.putIfAbsent(cls, a2);
        return ec2 != null ? ec2 : a2;
    }

    public final <T> Ec<T> a(T t) {
        return a(t.getClass());
    }
}
