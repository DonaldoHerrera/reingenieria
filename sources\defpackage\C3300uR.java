package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: uR reason: default package and case insensitive filesystem */
/* compiled from: FollowingStateProvider.kt */
final class C3300uR<T, R> implements C7118pQa<T, R> {
    public static final C3300uR a = new C3300uR();

    C3300uR() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<C3837oba> list) {
        C7471uYa.b(list, "userAssociations");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3837oba c : list) {
            arrayList.add(c.c());
        }
        return arrayList;
    }
}
