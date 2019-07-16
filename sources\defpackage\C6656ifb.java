package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ifb reason: default package and case insensitive filesystem */
/* compiled from: ModuleDescriptorImpl.kt */
final class C6656ifb extends C7540vYa implements PXa<Oeb> {
    final /* synthetic */ C6792kfb a;

    C6656ifb(C6792kfb kfb) {
        this.a = kfb;
        super(0);
    }

    public final Oeb d() {
        C6520gfb a2 = this.a.e;
        if (a2 != null) {
            List<C6792kfb> a3 = a2.a();
            boolean contains = a3.contains(this.a);
            if (!TVa.a || contains) {
                for (C6792kfb kfb : a3) {
                    boolean e = kfb.za();
                    if (TVa.a && !e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Dependency module ");
                        sb.append(kfb.xa());
                        sb.append(" was not initialized by the time contents of dependent module ");
                        sb.append(this.a.xa());
                        sb.append(" were queried");
                        throw new AssertionError(sb.toString());
                    }
                }
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a3, 10));
                for (C6792kfb c : a3) {
                    C6858ldb c2 = c.f;
                    if (c2 != null) {
                        arrayList.add(c2);
                    } else {
                        C7471uYa.a();
                        throw null;
                    }
                }
                return new Oeb(arrayList);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Module ");
            sb2.append(this.a.xa());
            sb2.append(" is not contained in his own dependencies, this is probably a misconfiguration");
            throw new AssertionError(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Dependencies of module ");
        sb3.append(this.a.xa());
        sb3.append(" were not set before querying module content");
        throw new AssertionError(sb3.toString());
    }
}
