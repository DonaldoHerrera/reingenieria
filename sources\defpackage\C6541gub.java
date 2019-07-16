package defpackage;

import java.util.List;

/* renamed from: gub reason: default package and case insensitive filesystem */
/* compiled from: KotlinType.kt */
public abstract class C6541gub extends C7706xtb {
    public C6541gub() {
        super(null);
    }

    public boolean Aa() {
        return Ca().Aa();
    }

    public final C6405eub Ba() {
        C7706xtb Ca = Ca();
        while (Ca instanceof C6541gub) {
            Ca = ((C6541gub) Ca).Ca();
        }
        if (Ca != null) {
            return (C6405eub) Ca;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
    }

    /* access modifiers changed from: protected */
    public abstract C7706xtb Ca();

    public boolean Da() {
        return true;
    }

    public C6723jeb getAnnotations() {
        return Ca().getAnnotations();
    }

    public Eqb ha() {
        return Ca().ha();
    }

    public String toString() {
        return Da() ? Ca().toString() : "<Not computed yet>";
    }

    public List<Stb> ya() {
        return Ca().ya();
    }

    public Ptb za() {
        return Ca().za();
    }
}
