package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: bvb reason: default package and case insensitive filesystem */
/* compiled from: modifierChecks.kt */
final class C5675bvb extends C7540vYa implements _Xa<C5582adb, String> {
    public static final C5675bvb a = new C5675bvb();

    C5675bvb() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(C5582adb adb) {
        boolean z;
        C7471uYa.b(adb, "$receiver");
        C5607avb avb = C5607avb.a;
        C6339dvb dvb = C6339dvb.b;
        C5272Rcb e = adb.e();
        C7471uYa.a((Object) e, "containingDeclaration");
        boolean a2 = avb.a(e);
        boolean z2 = true;
        if (!a2) {
            Collection j = adb.j();
            C7471uYa.a((Object) j, "overriddenDescriptors");
            if (!(j instanceof Collection) || !j.isEmpty()) {
                Iterator it = j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5582adb adb2 = (C5582adb) it.next();
                    C5607avb avb2 = C5607avb.a;
                    C7471uYa.a((Object) adb2, "it");
                    C5272Rcb e2 = adb2.e();
                    C7471uYa.a((Object) e2, "it.containingDeclaration");
                    if (avb2.a(e2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            return "must override ''equals()'' in Any";
        }
        return null;
    }
}
