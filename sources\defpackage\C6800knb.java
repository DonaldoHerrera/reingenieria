package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: knb reason: default package and case insensitive filesystem */
/* compiled from: JvmNameResolver.kt */
public final class C6800knb implements Emb {
    private static final List<String> a = C6918mWa.b((T[]) new String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});
    private static final Map<String, Integer> b;
    public static final a c = new a(null);
    private final Set<Integer> d;
    private final List<b> e;
    private final g f;
    private final String[] g;

    /* renamed from: knb$a */
    /* compiled from: JvmNameResolver.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        Iterable<CWa> u = C7676xWa.u(a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a(u, 10)), 16));
        for (CWa cWa : u) {
            linkedHashMap.put((String) cWa.d(), Integer.valueOf(cWa.c()));
        }
        b = linkedHashMap;
    }

    public C6800knb(g gVar, String[] strArr) {
        C7471uYa.b(gVar, "types");
        C7471uYa.b(strArr, "strings");
        this.f = gVar;
        this.g = strArr;
        List j = this.f.j();
        this.d = j.isEmpty() ? SWa.a() : C7676xWa.t(j);
        ArrayList arrayList = new ArrayList();
        List<b> k = this.f.k();
        arrayList.ensureCapacity(k.size());
        for (b bVar : k) {
            C7471uYa.a((Object) bVar, "record");
            int l = bVar.l();
            for (int i = 0; i < l; i++) {
                arrayList.add(bVar);
            }
        }
        arrayList.trimToSize();
        this.e = arrayList;
    }

    public boolean a(int i) {
        return this.d.contains(Integer.valueOf(i));
    }

    public String b(int i) {
        return getString(i);
    }

    public String getString(int i) {
        String str;
        int i2 = i;
        b bVar = (b) this.e.get(i2);
        if (bVar.v()) {
            str = bVar.o();
        } else {
            if (bVar.t()) {
                int size = a.size();
                int k = bVar.k();
                if (k >= 0 && size > k) {
                    str = (String) a.get(bVar.k());
                }
            }
            str = this.g[i2];
        }
        String str2 = "null cannot be cast to non-null type java.lang.String";
        String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        String str4 = "string";
        if (bVar.q() >= 2) {
            List r = bVar.r();
            Integer num = (Integer) r.get(0);
            Integer num2 = (Integer) r.get(1);
            C7471uYa.a((Object) num, "begin");
            if (C7471uYa.a(0, num.intValue()) <= 0) {
                int intValue = num.intValue();
                C7471uYa.a((Object) num2, "end");
                if (C7471uYa.a(intValue, num2.intValue()) <= 0 && C7471uYa.a(num2.intValue(), str.length()) <= 0) {
                    C7471uYa.a((Object) str, str4);
                    int intValue2 = num.intValue();
                    int intValue3 = num2.intValue();
                    if (str != null) {
                        str = str.substring(intValue2, intValue3);
                        C7471uYa.a((Object) str, str3);
                    } else {
                        throw new OVa(str2);
                    }
                }
            }
        }
        String str5 = str;
        if (bVar.m() >= 2) {
            List n = bVar.n();
            Integer num3 = (Integer) n.get(0);
            Integer num4 = (Integer) n.get(1);
            C7471uYa.a((Object) str5, str4);
            str5 = Cxb.a(str5, (char) num3.intValue(), (char) num4.intValue(), false, 4, (Object) null);
        }
        String str6 = str5;
        C0157b j = bVar.j();
        if (j == null) {
            j = C0157b.NONE;
        }
        int i3 = C6868lnb.a[j.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                C7471uYa.a((Object) str6, str4);
                str6 = Cxb.a(str6, '$', '.', false, 4, (Object) null);
            } else if (i3 == 3) {
                if (str6.length() >= 2) {
                    C7471uYa.a((Object) str6, str4);
                    int length = str6.length() - 1;
                    if (str6 != null) {
                        str6 = str6.substring(1, length);
                        C7471uYa.a((Object) str6, str3);
                    } else {
                        throw new OVa(str2);
                    }
                }
                String str7 = str6;
                C7471uYa.a((Object) str7, str4);
                str6 = Cxb.a(str7, '$', '.', false, 4, (Object) null);
            }
        }
        C7471uYa.a((Object) str6, str4);
        return str6;
    }
}
