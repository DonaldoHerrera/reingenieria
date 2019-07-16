package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Dpb reason: default package */
/* compiled from: CapturedTypeConstructor.kt */
public final class Dpb implements Cpb {
    private C7018nub a;
    private final Stb b;

    public Dpb(Stb stb) {
        C7471uYa.b(stb, "projection");
        this.b = stb;
        boolean z = a().b() != C6473fub.INVARIANT;
        if (TVa.a && !z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Only nontrivial projections can be captured, not: ");
            sb.append(a());
            throw new AssertionError(sb.toString());
        }
    }

    public C5301Sbb E() {
        C5301Sbb E = a().getType().za().E();
        C7471uYa.a((Object) E, "projection.type.constructor.builtIns");
        return E;
    }

    public Stb a() {
        return this.b;
    }

    public Collection<C7706xtb> b() {
        Object obj;
        if (a().b() == C6473fub.OUT_VARIANCE) {
            obj = a().getType();
        } else {
            obj = E().v();
        }
        C7471uYa.a(obj, "if (projection.projectio… builtIns.nullableAnyType");
        return C6850lWa.a(obj);
    }

    public Void c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public final C7018nub e() {
        return this.a;
    }

    public List<C4905Fdb> getParameters() {
        return C6918mWa.a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapturedTypeConstructor(");
        sb.append(a());
        sb.append(')');
        return sb.toString();
    }

    public final void a(C7018nub nub) {
        this.a = nub;
    }
}
