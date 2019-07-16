package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: Rfb reason: default package */
/* compiled from: specialBuiltinMembers.kt */
public final class Rfb {
    private static final Map<C7349snb, C7694xnb> a;
    private static final Map<C7694xnb, List<C7694xnb>> b;
    private static final Set<C7349snb> c = a.keySet();
    private static final Set<C7694xnb> d;
    public static final Rfb e = new Rfb();

    static {
        C7487unb unb = C5301Sbb.h.r;
        String str = "BUILTIN_NAMES._enum";
        C7471uYa.a((Object) unb, str);
        String str2 = "name";
        C7487unb unb2 = C5301Sbb.h.r;
        C7471uYa.a((Object) unb2, str);
        String str3 = "ordinal";
        C7349snb snb = C5301Sbb.h.N;
        C7471uYa.a((Object) snb, "BUILTIN_NAMES.collection");
        String str4 = "size";
        C7349snb snb2 = C5301Sbb.h.R;
        String str5 = "BUILTIN_NAMES.map";
        C7471uYa.a((Object) snb2, str5);
        C7487unb unb3 = C5301Sbb.h.f;
        C7471uYa.a((Object) unb3, "BUILTIN_NAMES.charSequence");
        String str6 = "length";
        C7349snb snb3 = C5301Sbb.h.R;
        C7471uYa.a((Object) snb3, str5);
        C7349snb snb4 = C5301Sbb.h.R;
        C7471uYa.a((Object) snb4, str5);
        String str7 = "values";
        C7349snb snb5 = C5301Sbb.h.R;
        C7471uYa.a((Object) snb5, str5);
        a = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C7135pgb.b(unb, str2), C7694xnb.b(str2)), NVa.a(C7135pgb.b(unb2, str3), C7694xnb.b(str3)), NVa.a(C7135pgb.b(snb, str4), C7694xnb.b(str4)), NVa.a(C7135pgb.b(snb2, str4), C7694xnb.b(str4)), NVa.a(C7135pgb.b(unb3, str6), C7694xnb.b(str6)), NVa.a(C7135pgb.b(snb3, "keys"), C7694xnb.b("keySet")), NVa.a(C7135pgb.b(snb4, str7), C7694xnb.b(str7)), NVa.a(C7135pgb.b(snb5, "entries"), C7694xnb.b("entrySet"))});
        Set<Entry> entrySet = a.entrySet();
        ArrayList<HVa> arrayList = new ArrayList<>(C6986nWa.a((Iterable) entrySet, 10));
        for (Entry entry : entrySet) {
            arrayList.add(new HVa(((C7349snb) entry.getKey()).e(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (HVa hVa : arrayList) {
            C7694xnb xnb = (C7694xnb) hVa.d();
            Object obj = linkedHashMap.get(xnb);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(xnb, obj);
            }
            ((List) obj).add((C7694xnb) hVa.c());
        }
        b = linkedHashMap;
        Set<C7349snb> set = c;
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) set, 10));
        for (C7349snb e2 : set) {
            arrayList2.add(e2.e());
        }
        d = C7676xWa.t(arrayList2);
    }

    private Rfb() {
    }

    private final boolean c(C4935Gcb gcb) {
        if (C7676xWa.a((Iterable) c, (Object) C7148pqb.a((C5272Rcb) gcb)) && gcb.f().isEmpty()) {
            return true;
        }
        boolean z = false;
        if (!C5301Sbb.c((C5272Rcb) gcb)) {
            return false;
        }
        Collection j = gcb.j();
        C7471uYa.a((Object) j, "overriddenDescriptors");
        if (!(j instanceof Collection) || !j.isEmpty()) {
            Iterator it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4935Gcb gcb2 = (C4935Gcb) it.next();
                Rfb rfb = e;
                C7471uYa.a((Object) gcb2, "it");
                if (rfb.b(gcb2)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public final Set<C7694xnb> a() {
        return d;
    }

    public final boolean b(C4935Gcb gcb) {
        C7471uYa.b(gcb, "callableMemberDescriptor");
        if (!d.contains(gcb.getName())) {
            return false;
        }
        return c(gcb);
    }

    public final List<C7694xnb> a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name1");
        List<C7694xnb> list = (List) b.get(xnb);
        return list != null ? list : C6918mWa.a();
    }

    public final String a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "$this$getBuiltinSpecialPropertyGetterName");
        boolean c2 = C5301Sbb.c((C5272Rcb) gcb);
        if (!TVa.a || c2) {
            C4935Gcb a2 = C7148pqb.a(C7148pqb.a(gcb), false, Qfb.a, 1, null);
            if (a2 == null) {
                return null;
            }
            C7694xnb xnb = (C7694xnb) a.get(C7148pqb.c(a2));
            if (xnb != null) {
                return xnb.a();
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This method is defined only for builtin members, but ");
        sb.append(gcb);
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }
}
