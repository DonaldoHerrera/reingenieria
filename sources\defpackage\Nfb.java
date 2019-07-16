package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: Nfb reason: default package */
/* compiled from: specialBuiltinMembers.kt */
public final class Nfb {
    private static final List<C6793kgb> a;
    private static final List<String> b;
    private static final List<String> c;
    private static final Map<C6793kgb, b> d;
    private static final Map<String, b> e;
    private static final Set<C7694xnb> f;
    private static final Set<String> g;
    public static final Nfb h = new Nfb();

    /* renamed from: Nfb$a */
    /* compiled from: specialBuiltinMembers.kt */
    public enum a {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final String e;
        private final boolean f;

        private a(String str, boolean z) {
            this.e = str;
            this.f = z;
        }
    }

    /* renamed from: Nfb$b */
    /* compiled from: specialBuiltinMembers.kt */
    public enum b {
        NULL(null),
        INDEX(Integer.valueOf(-1)),
        FALSE(Boolean.valueOf(false));
        
        private final Object f;

        /* renamed from: Nfb$b$a */
        /* compiled from: specialBuiltinMembers.kt */
        static final class a extends b {
            a(String str, int i) {
                super(str, i, null, null);
            }
        }

        private b(Object obj) {
            this.f = obj;
        }
    }

    static {
        String str;
        Set c2 = SWa.c("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) c2, 10));
        Iterator it = c2.iterator();
        while (true) {
            str = "JvmPrimitiveType.BOOLEAN.desc";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            String a2 = C7424tqb.BOOLEAN.a();
            C7471uYa.a((Object) a2, str);
            arrayList.add(C7135pgb.b("java/util/Collection", str2, "Ljava/util/Collection;", a2));
        }
        a = arrayList;
        List<C6793kgb> list = a;
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C6793kgb b2 : list) {
            arrayList2.add(b2.b());
        }
        b = arrayList2;
        List<C6793kgb> list2 = a;
        ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) list2, 10));
        for (C6793kgb a3 : list2) {
            arrayList3.add(a3.a().a());
        }
        c = arrayList3;
        Lkb lkb = Lkb.a;
        String str3 = "Collection";
        String c3 = lkb.c(str3);
        String a4 = C7424tqb.BOOLEAN.a();
        C7471uYa.a((Object) a4, str);
        String str4 = "Ljava/lang/Object;";
        String c4 = lkb.c(str3);
        String a5 = C7424tqb.BOOLEAN.a();
        C7471uYa.a((Object) a5, str);
        String str5 = "remove";
        String str6 = "Map";
        String c5 = lkb.c(str6);
        String a6 = C7424tqb.BOOLEAN.a();
        C7471uYa.a((Object) a6, str);
        String c6 = lkb.c(str6);
        String a7 = C7424tqb.BOOLEAN.a();
        C7471uYa.a((Object) a7, str);
        String c7 = lkb.c(str6);
        String a8 = C7424tqb.BOOLEAN.a();
        C7471uYa.a((Object) a8, str);
        String str7 = "Ljava/lang/Object;Ljava/lang/Object;";
        String str8 = "List";
        String c8 = lkb.c(str8);
        String a9 = C7424tqb.INT.a();
        String str9 = "JvmPrimitiveType.INT.desc";
        C7471uYa.a((Object) a9, str9);
        String c9 = lkb.c(str8);
        String a10 = C7424tqb.INT.a();
        C7471uYa.a((Object) a10, str9);
        d = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C7135pgb.b(c3, "contains", str4, a4), b.FALSE), NVa.a(C7135pgb.b(c4, str5, str4, a5), b.FALSE), NVa.a(C7135pgb.b(c5, "containsKey", str4, a6), b.FALSE), NVa.a(C7135pgb.b(c6, "containsValue", str4, a7), b.FALSE), NVa.a(C7135pgb.b(c7, str5, str7, a8), b.FALSE), NVa.a(C7135pgb.b(lkb.c(str6), "getOrDefault", str7, str4), b.d), NVa.a(C7135pgb.b(lkb.c(str6), "get", str4, str4), b.NULL), NVa.a(C7135pgb.b(lkb.c(str6), str5, str4, str4), b.NULL), NVa.a(C7135pgb.b(c8, "indexOf", str4, a9), b.INDEX), NVa.a(C7135pgb.b(c9, "lastIndexOf", str4, a10), b.INDEX)});
        Map<C6793kgb, b> map = d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(LWa.a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((C6793kgb) entry.getKey()).b(), entry.getValue());
        }
        e = linkedHashMap;
        Set<C6793kgb> b3 = TWa.b(d.keySet(), (Iterable) a);
        ArrayList arrayList4 = new ArrayList(C6986nWa.a((Iterable) b3, 10));
        for (C6793kgb a11 : b3) {
            arrayList4.add(a11.a());
        }
        f = C7676xWa.t(arrayList4);
        ArrayList arrayList5 = new ArrayList(C6986nWa.a((Iterable) b3, 10));
        for (C6793kgb b4 : b3) {
            arrayList5.add(b4.b());
        }
        g = C7676xWa.t(arrayList5);
    }

    private Nfb() {
    }

    /* access modifiers changed from: private */
    public final boolean b(C4935Gcb gcb) {
        return C7676xWa.a((Iterable) g, (Object) Hkb.a((C4904Fcb) gcb));
    }

    @NXa
    public static final C5582adb a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        Nfb nfb = h;
        C7694xnb name = adb.getName();
        C7471uYa.a((Object) name, "functionDescriptor.name");
        if (!nfb.a(name)) {
            return null;
        }
        return (C5582adb) C7148pqb.a(adb, false, Ofb.a, 1, null);
    }

    public final boolean a(C7694xnb xnb) {
        C7471uYa.b(xnb, "$this$sameAsBuiltinMethodWithErasedValueParameters");
        return f.contains(xnb);
    }

    @NXa
    public static final a a(C4935Gcb gcb) {
        a aVar;
        C7471uYa.b(gcb, "$this$getSpecialSignatureInfo");
        if (!f.contains(gcb.getName())) {
            return null;
        }
        C4935Gcb a2 = C7148pqb.a(gcb, false, Pfb.a, 1, null);
        if (a2 != null) {
            String a3 = Hkb.a((C4904Fcb) a2);
            if (a3 != null) {
                if (b.contains(a3)) {
                    return a.ONE_COLLECTION_PARAMETER;
                }
                Object obj = e.get(a3);
                if (obj != null) {
                    if (((b) obj) == b.NULL) {
                        aVar = a.OBJECT_PARAMETER_GENERIC;
                    } else {
                        aVar = a.OBJECT_PARAMETER_NON_GENERIC;
                    }
                    return aVar;
                }
                C7471uYa.a();
                throw null;
            }
        }
        return null;
    }
}
