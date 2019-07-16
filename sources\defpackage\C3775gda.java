package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gda reason: default package and case insensitive filesystem */
/* compiled from: UserMapper.kt */
public final class C3775gda {
    public static final C3784hea a(C3776gea gea) {
        C7471uYa.b(gea, "$this$toDomainUser");
        C3784hea hea = new C3784hea(gea.l(), gea.j(), gea.m(), gea.f(), gea.i(), gea.d(), gea.c(), gea.b(), gea.g(), gea.h(), gea.e(), gea.a(), gea.n(), a(gea.k()), gea.o());
        return hea;
    }

    public static final C3508cda a(List<String> list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (String cda : list) {
            arrayList.add(new C3508cda(cda));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C3508cda) next).f()) {
                obj = next;
                break;
            }
        }
        return (C3508cda) obj;
    }
}
