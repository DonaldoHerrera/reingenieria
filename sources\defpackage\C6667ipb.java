package defpackage;

import java.util.List;

/* renamed from: ipb reason: default package and case insensitive filesystem */
/* compiled from: inlineClassesUtils.kt */
public final class C6667ipb {
    public static final C5061Kdb a(C5029Jcb jcb) {
        C7471uYa.b(jcb, "$this$underlyingRepresentation");
        C5061Kdb kdb = null;
        if (!jcb.isInline()) {
            return null;
        }
        C4997Icb F = jcb.F();
        if (F != null) {
            List f = F.f();
            if (f != null) {
                kdb = (C5061Kdb) C7676xWa.k(f);
            }
        }
        return kdb;
    }

    public static final C7706xtb b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$substitutedUnderlyingType");
        C5061Kdb c = c(xtb);
        if (c == null) {
            return null;
        }
        Eqb ha = xtb.ha();
        C7694xnb name = c.getName();
        C7471uYa.a((Object) name, "parameter.name");
        C7408tdb tdb = (C7408tdb) C7676xWa.n(ha.c(name, Ffb.FOR_ALREADY_TRACKED));
        if (tdb != null) {
            return tdb.getType();
        }
        return null;
    }

    public static final C5061Kdb c(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$unsubstitutedUnderlyingParameter");
        C5122Mcb c = xtb.za().c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        C5029Jcb jcb = (C5029Jcb) c;
        if (jcb != null) {
            return a(jcb);
        }
        return null;
    }

    public static final boolean a(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$isInlineClass");
        return (rcb instanceof C5029Jcb) && ((C5029Jcb) rcb).isInline();
    }

    public static final boolean a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isInlineClassType");
        C5122Mcb c = xtb.za().c();
        if (c != null) {
            return a((C5272Rcb) c);
        }
        return false;
    }

    public static final boolean a(C4904Fcb fcb) {
        C7471uYa.b(fcb, "$this$isGetterOfUnderlyingPropertyOfInlineClass");
        if (fcb instanceof C7477udb) {
            C7408tdb I = ((C7477udb) fcb).I();
            C7471uYa.a((Object) I, "correspondingProperty");
            if (a((C5123Mdb) I)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(C5123Mdb mdb) {
        C7471uYa.b(mdb, "$this$isUnderlyingPropertyOfInlineClass");
        C5272Rcb e = mdb.e();
        C7471uYa.a((Object) e, "this.containingDeclaration");
        if (!a(e)) {
            return false;
        }
        if (e != null) {
            C5061Kdb a = a((C5029Jcb) e);
            return C7471uYa.a((Object) a != null ? a.getName() : null, (Object) mdb.getName());
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }
}
