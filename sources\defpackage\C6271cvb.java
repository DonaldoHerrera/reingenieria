package defpackage;

/* renamed from: cvb reason: default package and case insensitive filesystem */
/* compiled from: modifierChecks.kt */
final class C6271cvb extends C7540vYa implements _Xa<C5582adb, String> {
    public static final C6271cvb a = new C6271cvb();

    C6271cvb() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(C5582adb adb) {
        boolean z;
        C7471uYa.b(adb, "$receiver");
        C7615wdb k = adb.k();
        if (k == null) {
            k = adb.l();
        }
        C6339dvb dvb = C6339dvb.b;
        boolean z2 = false;
        if (k != null) {
            C7706xtb a2 = adb.a();
            if (a2 != null) {
                C7706xtb type = k.getType();
                C7471uYa.a((Object) type, "receiver.type");
                z = Fub.a(a2, type);
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }
}
