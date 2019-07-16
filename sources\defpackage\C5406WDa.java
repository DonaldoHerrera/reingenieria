package defpackage;

import java.util.List;

/* renamed from: WDa reason: default package and case insensitive filesystem */
/* compiled from: AsyncLoader.kt */
final class C5406WDa extends C7540vYa implements _Xa<List<? extends e>, C6832lEa<PageData, ErrorType>> {
    final /* synthetic */ C5289SDa a;

    C5406WDa(C5289SDa sDa) {
        this.a = sDa;
        super(1);
    }

    /* renamed from: a */
    public final C6832lEa<PageData, ErrorType> invoke(List<e> list) {
        C7471uYa.b(list, "it");
        return new C6832lEa<>(this.a.b(list), this.a.a(list));
    }
}
