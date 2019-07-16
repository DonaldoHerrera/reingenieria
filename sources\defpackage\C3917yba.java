package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yba reason: default package and case insensitive filesystem */
/* compiled from: FollowingStorage.kt */
final class C3917yba<T, R> implements C7118pQa<T, R> {
    public static final C3917yba a = new C3917yba();

    C3917yba() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<C3837oba> list) {
        C7471uYa.b(list, "it");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3837oba c : list) {
            arrayList.add(c.c());
        }
        return arrayList;
    }
}
