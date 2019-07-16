package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: Mfb reason: default package */
/* compiled from: specialBuiltinMembers.kt */
public final class Mfb {
    private static final C6793kgb a;
    private static final Map<C6793kgb, C7694xnb> b;
    /* access modifiers changed from: private */
    public static final Map<String, C7694xnb> c;
    private static final List<C7694xnb> d;
    private static final Map<C7694xnb, List<C7694xnb>> e;
    public static final Mfb f = new Mfb();

    static {
        String a2 = C7424tqb.INT.a();
        String str = "JvmPrimitiveType.INT.desc";
        C7471uYa.a((Object) a2, str);
        a = C7135pgb.b("java/util/List", "removeAt", a2, "Ljava/lang/Object;");
        Lkb lkb = Lkb.a;
        String str2 = "Number";
        String b2 = lkb.b(str2);
        String a3 = C7424tqb.BYTE.a();
        C7471uYa.a((Object) a3, "JvmPrimitiveType.BYTE.desc");
        String str3 = "";
        String b3 = lkb.b(str2);
        String a4 = C7424tqb.SHORT.a();
        C7471uYa.a((Object) a4, "JvmPrimitiveType.SHORT.desc");
        String b4 = lkb.b(str2);
        String a5 = C7424tqb.INT.a();
        C7471uYa.a((Object) a5, str);
        String b5 = lkb.b(str2);
        String a6 = C7424tqb.LONG.a();
        C7471uYa.a((Object) a6, "JvmPrimitiveType.LONG.desc");
        String b6 = lkb.b(str2);
        String a7 = C7424tqb.FLOAT.a();
        C7471uYa.a((Object) a7, "JvmPrimitiveType.FLOAT.desc");
        String b7 = lkb.b(str2);
        String a8 = C7424tqb.DOUBLE.a();
        C7471uYa.a((Object) a8, "JvmPrimitiveType.DOUBLE.desc");
        String b8 = lkb.b("CharSequence");
        String a9 = C7424tqb.INT.a();
        C7471uYa.a((Object) a9, str);
        String a10 = C7424tqb.CHAR.a();
        C7471uYa.a((Object) a10, "JvmPrimitiveType.CHAR.desc");
        b = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C7135pgb.b(b2, "toByte", str3, a3), C7694xnb.b("byteValue")), NVa.a(C7135pgb.b(b3, "toShort", str3, a4), C7694xnb.b("shortValue")), NVa.a(C7135pgb.b(b4, "toInt", str3, a5), C7694xnb.b("intValue")), NVa.a(C7135pgb.b(b5, "toLong", str3, a6), C7694xnb.b("longValue")), NVa.a(C7135pgb.b(b6, "toFloat", str3, a7), C7694xnb.b("floatValue")), NVa.a(C7135pgb.b(b7, "toDouble", str3, a8), C7694xnb.b("doubleValue")), NVa.a(a, C7694xnb.b("remove")), NVa.a(C7135pgb.b(b8, "get", a9, a10), C7694xnb.b("charAt"))});
        Map<C6793kgb, C7694xnb> map = b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(LWa.a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((C6793kgb) entry.getKey()).b(), entry.getValue());
        }
        c = linkedHashMap;
        Set<C6793kgb> keySet = b.keySet();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) keySet, 10));
        for (C6793kgb a11 : keySet) {
            arrayList.add(a11.a());
        }
        d = arrayList;
        Set<Entry> entrySet = b.entrySet();
        ArrayList<HVa> arrayList2 = new ArrayList<>(C6986nWa.a((Iterable) entrySet, 10));
        for (Entry entry2 : entrySet) {
            arrayList2.add(new HVa(((C6793kgb) entry2.getKey()).a(), entry2.getValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (HVa hVa : arrayList2) {
            C7694xnb xnb = (C7694xnb) hVa.d();
            Object obj = linkedHashMap2.get(xnb);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(xnb, obj);
            }
            ((List) obj).add((C7694xnb) hVa.c());
        }
        e = linkedHashMap2;
    }

    private Mfb() {
    }

    public final boolean b(C7694xnb xnb) {
        C7471uYa.b(xnb, "$this$sameAsRenamedInJvmBuiltin");
        return d.contains(xnb);
    }

    public final boolean c(C7684xdb xdb) {
        C7471uYa.b(xdb, "$this$isRemoveAtByIndex");
        return C7471uYa.a((Object) xdb.getName().a(), (Object) "removeAt") && C7471uYa.a((Object) Hkb.a((C4904Fcb) xdb), (Object) a.b());
    }

    public final List<C7694xnb> a() {
        return d;
    }

    public final boolean b(C7684xdb xdb) {
        C7471uYa.b(xdb, "functionDescriptor");
        return C5301Sbb.c((C5272Rcb) xdb) && C7148pqb.a(xdb, false, new Lfb(xdb), 1, null) != null;
    }

    public final C7694xnb a(C7684xdb xdb) {
        C7471uYa.b(xdb, "functionDescriptor");
        Map<String, C7694xnb> map = c;
        String a2 = Hkb.a((C4904Fcb) xdb);
        if (a2 != null) {
            return (C7694xnb) map.get(a2);
        }
        return null;
    }

    public final List<C7694xnb> a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        List<C7694xnb> list = (List) e.get(xnb);
        return list != null ? list : C6918mWa.a();
    }
}
