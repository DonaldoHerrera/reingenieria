package defpackage;

/* renamed from: Arb reason: default package */
/* compiled from: MemberDeserializer.kt */
final class Arb extends C7540vYa implements PXa<Npb<?>> {
    final /* synthetic */ Crb a;
    final /* synthetic */ Olb b;
    final /* synthetic */ C7842zsb c;

    Arb(Crb crb, Olb olb, C7842zsb zsb) {
        this.a = crb;
        this.b = olb;
        this.c = zsb;
        super(0);
    }

    public final Npb<?> d() {
        Crb crb = this.a;
        Frb a2 = crb.a(crb.b.c());
        if (a2 != null) {
            Zqb b2 = this.a.b.a().b();
            Olb olb = this.b;
            C7706xtb a3 = this.c.a();
            C7471uYa.a((Object) a3, "property.returnType");
            return (Npb) b2.a(a2, olb, a3);
        }
        C7471uYa.a();
        throw null;
    }
}
