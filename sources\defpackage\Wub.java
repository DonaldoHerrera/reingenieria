package defpackage;

/* renamed from: Wub reason: default package */
/* compiled from: modifierChecks.kt */
final class Wub implements Qub {
    private static final String a = a;
    public static final Wub b = new Wub();

    private Wub() {
    }

    public String a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        return a.a(this, adb);
    }

    public boolean b(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        C5061Kdb kdb = (C5061Kdb) adb.f().get(1);
        b bVar = C5360Ubb.b;
        C7471uYa.a((Object) kdb, "secondParameter");
        C7706xtb a2 = bVar.a(C7148pqb.e(kdb));
        if (a2 == null) {
            return false;
        }
        C7706xtb type = kdb.getType();
        C7471uYa.a((Object) type, "secondParameter.type");
        return Fub.a(a2, Fub.e(type));
    }

    public String a() {
        return a;
    }
}
