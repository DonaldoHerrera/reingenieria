package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cfb reason: default package and case insensitive filesystem */
/* compiled from: LazyPackageViewDescriptorImpl.kt */
final class C5720cfb extends C7540vYa implements PXa<Eqb> {
    final /* synthetic */ C6316dfb a;

    C5720cfb(C6316dfb dfb) {
        this.a = dfb;
        super(0);
    }

    public final Eqb d() {
        if (this.a.ra().isEmpty()) {
            return b.a;
        }
        List<C6790kdb> ra = this.a.ra();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) ra, 10));
        for (C6790kdb ha : ra) {
            arrayList.add(ha.ha());
        }
        List a2 = C7676xWa.a((Collection) arrayList, (Object) new C7410tfb(this.a.sa(), this.a.q()));
        StringBuilder sb = new StringBuilder();
        sb.append("package view scope for ");
        sb.append(this.a.q());
        sb.append(" in ");
        sb.append(this.a.sa().getName());
        return new C7562vqb(sb.toString(), a2);
    }
}
