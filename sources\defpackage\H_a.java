package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: H_a reason: default package */
/* compiled from: KClassImpl.kt */
final class H_a extends C7540vYa implements PXa<List<? extends C5210Pab>> {
    final /* synthetic */ a a;

    H_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final List<C5210Pab> d() {
        List<C4905Fdb> B = this.a.h().B();
        C7471uYa.a((Object) B, "descriptor.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) B, 10));
        for (C4905Fdb pab : B) {
            arrayList.add(new C5210Pab(pab));
        }
        return arrayList;
    }
}
