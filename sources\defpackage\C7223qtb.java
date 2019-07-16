package defpackage;

import java.util.List;

/* renamed from: qtb reason: default package and case insensitive filesystem */
/* compiled from: KotlinType.kt */
public abstract class C7223qtb extends C6405eub implements Mtb {
    private final Etb a;
    private final Etb b;

    public C7223qtb(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "lowerBound");
        C7471uYa.b(etb2, "upperBound");
        super(null);
        this.a = etb;
        this.b = etb2;
    }

    public boolean Aa() {
        return Ca().Aa();
    }

    public abstract Etb Ca();

    public final Etb Da() {
        return this.a;
    }

    public final Etb Ea() {
        return this.b;
    }

    public abstract String a(Cob cob, Pob pob);

    public boolean b(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        return false;
    }

    public C6723jeb getAnnotations() {
        return Ca().getAnnotations();
    }

    public Eqb ha() {
        return Ca().ha();
    }

    public String toString() {
        return Cob.h.a((C7706xtb) this);
    }

    public C7706xtb va() {
        return this.b;
    }

    public C7706xtb xa() {
        return this.a;
    }

    public List<Stb> ya() {
        return Ca().ya();
    }

    public Ptb za() {
        return Ca().za();
    }
}
