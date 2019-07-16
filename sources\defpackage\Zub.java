package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: Zub reason: default package */
/* compiled from: modifierChecks.kt */
final class Zub implements Qub {
    private static final String a = a;
    public static final Zub b = new Zub();

    private Zub() {
    }

    public String a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        return a.a(this, adb);
    }

    public boolean b(C5582adb adb) {
        boolean z;
        C7471uYa.b(adb, "functionDescriptor");
        List<C5061Kdb> f = adb.f();
        C7471uYa.a((Object) f, "functionDescriptor.valueParameters");
        if ((f instanceof Collection) && f.isEmpty()) {
            return true;
        }
        for (C5061Kdb kdb : f) {
            C7471uYa.a((Object) kdb, "it");
            if (C7148pqb.a(kdb) || kdb.da() != null) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public String a() {
        return a;
    }
}
