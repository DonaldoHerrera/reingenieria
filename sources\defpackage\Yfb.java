package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: Yfb reason: default package */
/* compiled from: FakePureImplementationsProvider.kt */
public final class Yfb {
    private static final HashMap<C7349snb, C7349snb> a = new HashMap<>();
    public static final Yfb b;

    static {
        Yfb yfb = new Yfb();
        b = yfb;
        C7349snb snb = C5301Sbb.h.W;
        C7471uYa.a((Object) snb, "FQ_NAMES.mutableList");
        yfb.a(snb, yfb.a("java.util.ArrayList", "java.util.LinkedList"));
        C7349snb snb2 = C5301Sbb.h.Y;
        C7471uYa.a((Object) snb2, "FQ_NAMES.mutableSet");
        yfb.a(snb2, yfb.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        C7349snb snb3 = C5301Sbb.h.Z;
        C7471uYa.a((Object) snb3, "FQ_NAMES.mutableMap");
        yfb.a(snb3, yfb.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        yfb.a(new C7349snb("java.util.function.Function"), yfb.a("java.util.function.UnaryOperator"));
        yfb.a(new C7349snb("java.util.function.BiFunction"), yfb.a("java.util.function.BinaryOperator"));
    }

    private Yfb() {
    }

    public final C7349snb a(C7349snb snb) {
        C7471uYa.b(snb, "classFqName");
        return (C7349snb) a.get(snb);
    }

    private final void a(C7349snb snb, List<C7349snb> list) {
        HashMap<C7349snb, C7349snb> hashMap = a;
        for (C7349snb a2 : list) {
            HVa a3 = NVa.a(a2, snb);
            hashMap.put(a3.c(), a3.d());
        }
    }

    private final List<C7349snb> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String snb : strArr) {
            arrayList.add(new C7349snb(snb));
        }
        return arrayList;
    }
}
