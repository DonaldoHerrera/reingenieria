package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: Xbb reason: default package and case insensitive filesystem */
/* compiled from: suspendFunctionTypes.kt */
public final class C5447Xbb {
    private static final C6860lfb a;
    private static final C6860lfb b;

    static {
        C6450fdb b2 = C7154ptb.b();
        String str = "ErrorUtils.getErrorModule()";
        C7471uYa.a((Object) b2, str);
        C7349snb snb = C6531gpb.d;
        C7471uYa.a((Object) snb, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        C6860lfb lfb = new C6860lfb(new Seb(b2, snb), C5060Kcb.INTERFACE, false, false, C6531gpb.f.e(), C7822zdb.a, Jsb.b);
        lfb.a(C6314ddb.ABSTRACT);
        lfb.a(_db.e);
        String str2 = "T";
        lfb.a(C6850lWa.a(C7686xfb.a(lfb, C6723jeb.c.a(), false, C6473fub.IN_VARIANCE, C7694xnb.b(str2), 0)));
        lfb.a();
        a = lfb;
        C6450fdb b3 = C7154ptb.b();
        C7471uYa.a((Object) b3, str);
        C7349snb snb2 = C6531gpb.c;
        C7471uYa.a((Object) snb2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        C6860lfb lfb2 = new C6860lfb(new Seb(b3, snb2), C5060Kcb.INTERFACE, false, false, C6531gpb.g.e(), C7822zdb.a, Jsb.b);
        lfb2.a(C6314ddb.ABSTRACT);
        lfb2.a(_db.e);
        lfb2.a(C6850lWa.a(C7686xfb.a(lfb2, C6723jeb.c.a(), false, C6473fub.IN_VARIANCE, C7694xnb.b(str2), 0)));
        lfb2.a();
        b = lfb2;
    }

    public static final C6860lfb a() {
        return a;
    }

    public static final C6860lfb b() {
        return b;
    }

    public static final Etb a(C7706xtb xtb, boolean z) {
        Ptb ptb;
        C7471uYa.b(xtb, "suspendFunType");
        boolean h = C5181Obb.h(xtb);
        if (!TVa.a || h) {
            C5301Sbb b2 = Fub.b(xtb);
            C6723jeb annotations = xtb.getAnnotations();
            C7706xtb b3 = C5181Obb.b(xtb);
            List<Stb> d = C5181Obb.d(xtb);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
            for (Stb type : d) {
                arrayList.add(type.getType());
            }
            C6723jeb a2 = C6723jeb.c.a();
            if (z) {
                ptb = b.Q();
            } else {
                ptb = a.Q();
            }
            C7471uYa.a((Object) ptb, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
            List a3 = C7676xWa.a((Collection) arrayList, (Object) C7775ytb.a(a2, ptb, C6850lWa.a(Fub.a(C5181Obb.c(xtb))), false));
            Etb v = Fub.b(xtb).v();
            C7471uYa.a((Object) v, "suspendFunType.builtIns.nullableAnyType");
            return C5181Obb.a(b2, annotations, b3, a3, null, v, false, 64, null).a(xtb.Aa());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This type should be suspend function type: ");
        sb.append(xtb);
        throw new AssertionError(sb.toString());
    }

    public static final boolean a(C7349snb snb, boolean z) {
        if (z) {
            return C7471uYa.a((Object) snb, (Object) C6531gpb.g);
        }
        return C7471uYa.a((Object) snb, (Object) C6531gpb.f);
    }
}
