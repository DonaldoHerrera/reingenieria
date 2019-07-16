package defpackage;

/* renamed from: Gob reason: default package */
/* compiled from: DescriptorRendererImpl.kt */
final class Gob extends C7540vYa implements _Xa<Stb, CharSequence> {
    final /* synthetic */ Eob a;

    Gob(Eob eob) {
        this.a = eob;
        super(1);
    }

    /* renamed from: a */
    public final CharSequence invoke(Stb stb) {
        C7471uYa.b(stb, "it");
        if (stb.a()) {
            return "*";
        }
        Eob eob = this.a;
        C7706xtb type = stb.getType();
        C7471uYa.a((Object) type, "it.type");
        String a2 = eob.a(type);
        if (stb.b() == C6473fub.INVARIANT) {
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stb.b());
        sb.append(' ');
        sb.append(a2);
        return sb.toString();
    }
}
