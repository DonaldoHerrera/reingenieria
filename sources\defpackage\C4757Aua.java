package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Aua reason: default package and case insensitive filesystem */
/* compiled from: Operators.kt */
public final class C4757Aua {
    public static final <T> APa<HVa<Integer, T>> a(APa<T> aPa) {
        C7471uYa.b(aPa, "$this$indexed");
        APa<HVa<Integer, T>> h = aPa.h(new C7845zua(new AtomicInteger(0)));
        C7471uYa.a((Object) h, "map { element ->\n       …rement() to element\n    }");
        return h;
    }

    public static final <T> APa<T> a(APa<T> aPa, _Xa<? super T, ? extends T> _xa) {
        C7471uYa.b(aPa, "$this$mapFirstEmission");
        C7471uYa.b(_xa, "mapper");
        APa<T> a = aPa.a((DPa<? extends R, ? super T>) new C7431tua<Object,Object>(_xa));
        C7471uYa.a((Object) a, "lift(MapFirstEmissionOperator(mapper))");
        return a;
    }
}
