package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: MFa reason: default package and case insensitive filesystem */
/* compiled from: UserItemRepository.kt */
final class C5110MFa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C5141NFa a;
    final /* synthetic */ Iterable b;

    /* renamed from: a */
    public final List<C4954HFa> apply(C3400zR zRVar) {
        C7471uYa.b(zRVar, "followingStatuses");
        Iterable<C3776gea> iterable = this.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
        for (C3776gea a2 : iterable) {
            arrayList.add(this.a.a().a(a2, zRVar));
        }
        return arrayList;
    }
}
