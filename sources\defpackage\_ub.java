package defpackage;

import java.util.List;

/* renamed from: _ub reason: default package */
/* compiled from: modifierChecks.kt */
final class _ub extends C7540vYa implements _Xa<C5582adb, String> {
    public static final _ub a = new _ub();

    _ub() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(C5582adb adb) {
        C7471uYa.b(adb, "$receiver");
        List f = adb.f();
        C7471uYa.a((Object) f, "valueParameters");
        C5061Kdb kdb = (C5061Kdb) C7676xWa.i(f);
        boolean z = false;
        if (kdb != null) {
            if (!C7148pqb.a(kdb) && kdb.da() == null) {
                z = true;
            }
        }
        C6339dvb dvb = C6339dvb.b;
        if (!z) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
