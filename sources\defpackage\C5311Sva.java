package defpackage;

import java.util.Comparator;
import java.util.Date;

/* renamed from: Sva reason: default package and case insensitive filesystem */
/* compiled from: Comparisons.kt */
public final class C5311Sva<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        HVa hVa = (HVa) t2;
        HVa hVa2 = (HVa) t;
        return YWa.a(((C3837oba) hVa.c()).a() != null ? ((C3837oba) hVa.c()).a() : new Date(0), ((C3837oba) hVa2.c()).a() != null ? ((C3837oba) hVa2.c()).a() : new Date(0));
    }
}
