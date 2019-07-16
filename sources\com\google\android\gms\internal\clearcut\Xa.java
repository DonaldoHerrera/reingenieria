package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class Xa {
    private static final Xa a = new Xa();
    private final C0744cb b;
    private final ConcurrentMap<Class<?>, C0741bb<?>> c = new ConcurrentHashMap();

    private Xa() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        C0744cb cbVar = null;
        for (int i = 0; i <= 0; i++) {
            cbVar = a(strArr[0]);
            if (cbVar != null) {
                break;
            }
        }
        if (cbVar == null) {
            cbVar = new Ba();
        }
        this.b = cbVar;
    }

    public static Xa a() {
        return a;
    }

    private static C0744cb a(String str) {
        try {
            return (C0744cb) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> C0741bb<T> a(Class<T> cls) {
        String str = "messageType";
        C0761ia.a(cls, str);
        C0741bb<T> bbVar = (C0741bb) this.c.get(cls);
        if (bbVar != null) {
            return bbVar;
        }
        C0741bb<T> a2 = this.b.a(cls);
        C0761ia.a(cls, str);
        C0761ia.a(a2, "schema");
        C0741bb bbVar2 = (C0741bb) this.c.putIfAbsent(cls, a2);
        return bbVar2 != null ? bbVar2 : a2;
    }

    public final <T> C0741bb<T> a(T t) {
        return a(t.getClass());
    }
}
