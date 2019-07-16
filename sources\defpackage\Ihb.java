package defpackage;

import java.util.Collection;

/* renamed from: Ihb reason: default package */
/* compiled from: LazyJavaClassMemberScope.kt */
final class Ihb extends C7540vYa implements _Xa<C7694xnb, Collection<? extends C7684xdb>> {
    final /* synthetic */ Mhb a;
    final /* synthetic */ C7684xdb b;

    Ihb(Mhb mhb, C7684xdb xdb) {
        this.a = mhb;
        this.b = xdb;
        super(1);
    }

    /* renamed from: a */
    public final Collection<C7684xdb> invoke(C7694xnb xnb) {
        C7471uYa.b(xnb, "accessorName");
        if (C7471uYa.a((Object) this.b.getName(), (Object) xnb)) {
            return C6850lWa.a(this.b);
        }
        return C7676xWa.c(this.a.c(xnb), (Iterable) this.a.d(xnb));
    }
}
