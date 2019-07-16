package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: gsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage.kt */
final class C6536gsa<T1, T2, R> implements C6504gQa<R, T, R> {
    public static final C6536gsa a = new C6536gsa();

    C6536gsa() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<C3508cda> list, List<C3508cda> list2) {
        C7471uYa.b(list, "list");
        C7471uYa.b(list2, "batch");
        return C7676xWa.c((Collection) list, (Iterable) list2);
    }
}
