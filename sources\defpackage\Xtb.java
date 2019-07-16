package defpackage;

import java.util.List;

/* renamed from: Xtb reason: default package */
/* compiled from: TypeSubstitution.kt */
public final class Xtb {
    public static /* synthetic */ C7706xtb a(C7706xtb xtb, List list, C6723jeb jeb, int i, Object obj) {
        if ((i & 1) != 0) {
            list = xtb.ya();
        }
        if ((i & 2) != 0) {
            jeb = xtb.getAnnotations();
        }
        return a(xtb, list, jeb);
    }

    public static final C7706xtb a(C7706xtb xtb, List<? extends Stb> list, C6723jeb jeb) {
        C7706xtb xtb2;
        C7471uYa.b(xtb, "$this$replace");
        C7471uYa.b(list, "newArguments");
        C7471uYa.b(jeb, "newAnnotations");
        if ((list.isEmpty() || list == xtb.ya()) && jeb == xtb.getAnnotations()) {
            return xtb;
        }
        C6405eub Ba = xtb.Ba();
        if (Ba instanceof C7223qtb) {
            C7223qtb qtb = (C7223qtb) Ba;
            xtb2 = C7775ytb.a(a(qtb.Da(), list, jeb), a(qtb.Ea(), list, jeb));
        } else if (Ba instanceof Etb) {
            xtb2 = a((Etb) Ba, list, jeb);
        } else {
            throw new FVa();
        }
        return xtb2;
    }

    public static /* synthetic */ Etb a(Etb etb, List list, C6723jeb jeb, int i, Object obj) {
        if ((i & 1) != 0) {
            list = etb.ya();
        }
        if ((i & 2) != 0) {
            jeb = etb.getAnnotations();
        }
        return a(etb, list, jeb);
    }

    public static final Etb a(Etb etb, List<? extends Stb> list, C6723jeb jeb) {
        C7471uYa.b(etb, "$this$replace");
        C7471uYa.b(list, "newArguments");
        C7471uYa.b(jeb, "newAnnotations");
        if (list.isEmpty() && jeb == etb.getAnnotations()) {
            return etb;
        }
        if (list.isEmpty()) {
            return etb.a(jeb);
        }
        return C7775ytb.a(jeb, etb.za(), list, etb.Aa());
    }

    public static final Etb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$asSimpleType");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof Etb)) {
            Ba = null;
        }
        Etb etb = (Etb) Ba;
        if (etb != null) {
            return etb;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This is should be simple type: ");
        sb.append(xtb);
        throw new IllegalStateException(sb.toString().toString());
    }
}
