package defpackage;

import java.util.List;

/* renamed from: UDa reason: default package and case insensitive filesystem */
/* compiled from: AsyncLoader.kt */
final class C5348UDa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ c a;

    C5348UDa(c cVar) {
        this.a = cVar;
    }

    /* renamed from: a */
    public final APa<List<I>> apply(APa<I> aPa) {
        C7471uYa.b(aPa, "newPage");
        c cVar = this.a;
        int b = cVar.b();
        cVar.a(b + 1);
        return aPa.h(new C5319TDa(this, b));
    }
}
