package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: wtb reason: default package and case insensitive filesystem */
/* compiled from: IntersectionTypeConstructor.kt */
public final class C7637wtb implements Ptb {
    private final LinkedHashSet<C7706xtb> a;
    private final int b;

    public C7637wtb(Collection<? extends C7706xtb> collection) {
        C7471uYa.b(collection, "typesToIntersect");
        boolean z = !collection.isEmpty();
        if (!TVa.a || z) {
            this.a = new LinkedHashSet<>(collection);
            this.b = this.a.hashCode();
            return;
        }
        throw new AssertionError("Attempt to create an empty intersection");
    }

    private final String a(Iterable<? extends C7706xtb> iterable) {
        return C7676xWa.a(C7676xWa.a(iterable, (Comparator<? super T>) new C7568vtb<Object>()), " & ", "{", "}", 0, null, null, 56, null);
    }

    public C5301Sbb E() {
        C5301Sbb E = ((C7706xtb) this.a.iterator().next()).za().E();
        C7471uYa.a((Object) E, "intersectedTypes.iterato…xt().constructor.builtIns");
        return E;
    }

    public Collection<C7706xtb> b() {
        return this.a;
    }

    public C5122Mcb c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public final Eqb e() {
        a aVar = Lqb.a;
        StringBuilder sb = new StringBuilder();
        sb.append("member scope for intersection type ");
        sb.append(this);
        return aVar.a(sb.toString(), this.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7637wtb)) {
            return false;
        }
        return C7471uYa.a((Object) this.a, (Object) ((C7637wtb) obj).a);
    }

    public List<C4905Fdb> getParameters() {
        return C6918mWa.a();
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return a(this.a);
    }
}
