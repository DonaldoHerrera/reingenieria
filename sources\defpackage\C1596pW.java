package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: pW reason: default package and case insensitive filesystem */
/* compiled from: UserStorage.kt */
final class C1596pW<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    C1596pW(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final Set<C3508cda> apply(Iterable<C3508cda> iterable) {
        C7471uYa.b(iterable, "changedUsers");
        return C7676xWa.b((Iterable) iterable, (Iterable) this.a);
    }
}
