package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: Lbb reason: default package and case insensitive filesystem */
/* compiled from: CompanionObjectMapping.kt */
public final class C5090Lbb {
    private static final LinkedHashSet<C7280rnb> a;
    public static final C5090Lbb b = new C5090Lbb();

    static {
        Set<C5331Tbb> set = C5331Tbb.i;
        C7471uYa.a((Object) set, "PrimitiveType.NUMBER_TYPES");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) set, 10));
        for (C5331Tbb b2 : set) {
            arrayList.add(C5301Sbb.b(b2));
        }
        List<C7349snb> a2 = C7676xWa.a((Collection) C7676xWa.a((Collection) C7676xWa.a((Collection) arrayList, (Object) C5301Sbb.h.g.h()), (Object) C5301Sbb.h.i.h()), (Object) C5301Sbb.h.r.h());
        LinkedHashSet<C7280rnb> linkedHashSet = new LinkedHashSet<>();
        for (C7349snb a3 : a2) {
            linkedHashSet.add(C7280rnb.a(a3));
        }
        a = linkedHashSet;
    }

    private C5090Lbb() {
    }

    public final Set<C7280rnb> a() {
        Set<C7280rnb> unmodifiableSet = Collections.unmodifiableSet(a);
        C7471uYa.a((Object) unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    public final boolean a(C5029Jcb jcb) {
        C7471uYa.b(jcb, "classDescriptor");
        if (C6531gpb.k(jcb)) {
            LinkedHashSet<C7280rnb> linkedHashSet = a;
            C7280rnb a2 = C7148pqb.a((C5122Mcb) jcb);
            if (C7676xWa.a((Iterable) linkedHashSet, (Object) a2 != null ? a2.c() : null)) {
                return true;
            }
        }
        return false;
    }
}
