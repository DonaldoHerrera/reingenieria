package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Ahb reason: default package */
/* compiled from: LazyJavaClassDescriptor.kt */
final class Ahb extends C7540vYa implements PXa<List<? extends C4905Fdb>> {
    final /* synthetic */ C7757yhb a;

    Ahb(C7757yhb yhb) {
        this.a = yhb;
        super(0);
    }

    public final List<C4905Fdb> d() {
        List<_ib> typeParameters = this.a.a().getTypeParameters();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) typeParameters, 10));
        for (_ib _ib : typeParameters) {
            C4905Fdb a2 = this.a.j.f().a(_ib);
            if (a2 != null) {
                arrayList.add(a2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Parameter ");
                sb.append(_ib);
                sb.append(" surely belongs to class ");
                sb.append(this.a.a());
                sb.append(", so it must be resolved");
                throw new AssertionError(sb.toString());
            }
        }
        return arrayList;
    }
}
