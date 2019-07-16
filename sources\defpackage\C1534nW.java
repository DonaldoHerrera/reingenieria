package defpackage;

import java.util.ArrayList;

/* renamed from: nW reason: default package and case insensitive filesystem */
/* compiled from: UserStorage.kt */
final class C1534nW<T> implements C6776kQa<C6499gLa> {
    final /* synthetic */ Iterable a;

    C1534nW(Iterable iterable) {
        this.a = iterable;
    }

    /* renamed from: a */
    public final void accept(C6499gLa gla) {
        C6713jVa a2 = C1472lW.b.a();
        Iterable<C3776gea> iterable = this.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
        for (C3776gea l : iterable) {
            arrayList.add(l.l());
        }
        a2.a(arrayList);
    }
}
