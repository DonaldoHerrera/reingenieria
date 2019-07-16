package defpackage;

import java.util.Collection;

/* renamed from: Ieb reason: default package */
/* compiled from: AbstractTypeParameterDescriptor */
class Ieb implements PXa<Eqb> {
    final /* synthetic */ Jeb a;

    Ieb(Jeb jeb) {
        this.a = jeb;
    }

    public Eqb d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Scope for type parameter ");
        sb.append(this.a.b.a());
        return Lqb.a(sb.toString(), (Collection<? extends C7706xtb>) this.a.c.getUpperBounds());
    }
}
