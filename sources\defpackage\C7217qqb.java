package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: qqb reason: default package and case insensitive filesystem */
/* compiled from: inlineClassManglingRules.kt */
public final class C7217qqb {
    public static final boolean a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "descriptor");
        if (!(gcb instanceof C4997Icb)) {
            gcb = null;
        }
        C4997Icb icb = (C4997Icb) gcb;
        boolean z = false;
        if (icb != null) {
            if (_db.a(icb.d())) {
                return false;
            }
            C5029Jcb T = icb.T();
            C7471uYa.a((Object) T, "constructorDescriptor.constructedClass");
            if (T.isInline() || C6531gpb.q(icb.T())) {
                return false;
            }
            List f = icb.f();
            C7471uYa.a((Object) f, "constructorDescriptor.valueParameters");
            if (!(f instanceof Collection) || !f.isEmpty()) {
                Iterator it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5061Kdb kdb = (C5061Kdb) it.next();
                    C7471uYa.a((Object) kdb, "it");
                    C7706xtb type = kdb.getType();
                    C7471uYa.a((Object) type, "it.type");
                    if (c(type)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    private static final boolean b(C7706xtb xtb) {
        C5122Mcb c = xtb.za().c();
        if (!(c instanceof C4905Fdb)) {
            c = null;
        }
        C4905Fdb fdb = (C4905Fdb) c;
        if (fdb != null) {
            return c(Fub.a(fdb));
        }
        return false;
    }

    private static final boolean c(C7706xtb xtb) {
        return a(xtb) || b(xtb);
    }

    public static final boolean a(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$isInlineClassThatRequiresMangling");
        return C6667ipb.a(rcb) && !a((C5029Jcb) rcb);
    }

    public static final boolean a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isInlineClassThatRequiresMangling");
        C5122Mcb c = xtb.za().c();
        return c != null && a((C5272Rcb) c);
    }

    private static final boolean a(C5029Jcb jcb) {
        return C7471uYa.a((Object) C7148pqb.c(jcb), (Object) C6531gpb.h);
    }
}
