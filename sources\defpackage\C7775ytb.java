package defpackage;

import java.util.List;

/* renamed from: ytb reason: default package and case insensitive filesystem */
/* compiled from: KotlinTypeFactory.kt */
public final class C7775ytb {
    public static final C7775ytb a = new C7775ytb();

    private C7775ytb() {
    }

    private final Eqb a(Ptb ptb, List<? extends Stb> list) {
        C5122Mcb c = ptb.c();
        if (c instanceof C4905Fdb) {
            return c.z().ha();
        }
        if (c instanceof C5029Jcb) {
            if (list.isEmpty()) {
                return ((C5029Jcb) c).z().ha();
            }
            Eqb a2 = ((C5029Jcb) c).a(Rtb.c.a(ptb, list));
            C7471uYa.a((Object) a2, "descriptor.getMemberScop…(constructor, arguments))");
            return a2;
        } else if (c instanceof C4874Edb) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scope for abbreviation: ");
            sb.append(((C4874Edb) c).getName());
            Eqb a3 = C7154ptb.a(sb.toString(), true);
            C7471uYa.a((Object) a3, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return a3;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported classifier: ");
            sb2.append(c);
            sb2.append(" for constructor: ");
            sb2.append(ptb);
            throw new IllegalStateException(sb2.toString());
        }
    }

    @NXa
    public static final Etb a(C6723jeb jeb, Ptb ptb, List<? extends Stb> list, boolean z) {
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(ptb, "constructor");
        C7471uYa.b(list, "arguments");
        if (!jeb.isEmpty() || !list.isEmpty() || z || ptb.c() == null) {
            return a(jeb, ptb, list, z, a.a(ptb, list));
        }
        C5122Mcb c = ptb.c();
        if (c != null) {
            C7471uYa.a((Object) c, "constructor.declarationDescriptor!!");
            Etb z2 = c.z();
            C7471uYa.a((Object) z2, "constructor.declarationDescriptor!!.defaultType");
            return z2;
        }
        C7471uYa.a();
        throw null;
    }

    @NXa
    public static final Etb a(C6723jeb jeb, Ptb ptb, List<? extends Stb> list, boolean z, Eqb eqb) {
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(ptb, "constructor");
        C7471uYa.b(list, "arguments");
        C7471uYa.b(eqb, "memberScope");
        Ftb ftb = new Ftb(ptb, list, z, eqb);
        if (jeb.isEmpty()) {
            return ftb;
        }
        return new C6267ctb(ftb, jeb);
    }

    @NXa
    public static final Etb a(C6723jeb jeb, C5029Jcb jcb, List<? extends Stb> list) {
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(jcb, "descriptor");
        C7471uYa.b(list, "arguments");
        Ptb Q = jcb.Q();
        C7471uYa.a((Object) Q, "descriptor.typeConstructor");
        return a(jeb, Q, list, false);
    }

    @NXa
    public static final C6405eub a(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "lowerBound");
        C7471uYa.b(etb2, "upperBound");
        if (C7471uYa.a((Object) etb, (Object) etb2)) {
            return etb;
        }
        return new C7292rtb(etb, etb2);
    }
}
