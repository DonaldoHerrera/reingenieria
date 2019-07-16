package defpackage;

import java.util.List;

/* renamed from: xtb reason: default package and case insensitive filesystem */
/* compiled from: KotlinType.kt */
public abstract class C7706xtb implements C5651beb {
    private C7706xtb() {
    }

    public abstract boolean Aa();

    public abstract C6405eub Ba();

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7706xtb)) {
            return false;
        }
        C7706xtb xtb = (C7706xtb) obj;
        if (Aa() != xtb.Aa() || !C7432tub.a.a(Ba(), xtb.Ba())) {
            z = false;
        }
        return z;
    }

    public abstract Eqb ha();

    public final int hashCode() {
        if (C7844ztb.a(this)) {
            return super.hashCode();
        }
        return (((za().hashCode() * 31) + ya().hashCode()) * 31) + (Aa() ? 1 : 0);
    }

    public abstract List<Stb> ya();

    public abstract Ptb za();

    public /* synthetic */ C7706xtb(C7264rYa rya) {
        this();
    }
}
