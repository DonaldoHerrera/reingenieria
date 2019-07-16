package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Feb reason: default package */
/* compiled from: AbstractTypeAliasDescriptor.kt */
public final class Feb implements Ptb {
    final /* synthetic */ Geb a;

    Feb(Geb geb) {
        this.a = geb;
    }

    public C5301Sbb E() {
        return C7148pqb.b((C5272Rcb) c());
    }

    public Collection<C7706xtb> b() {
        Collection<C7706xtb> b = c().ga().za().b();
        C7471uYa.a((Object) b, "declarationDescriptor.un…pe.constructor.supertypes");
        return b;
    }

    public boolean d() {
        return true;
    }

    public List<C4905Fdb> getParameters() {
        return this.a.wa();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[typealias ");
        sb.append(c().getName().a());
        sb.append(']');
        return sb.toString();
    }

    public C4874Edb c() {
        return this.a;
    }
}
