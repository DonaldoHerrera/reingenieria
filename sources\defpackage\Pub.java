package defpackage;

import java.util.List;

/* renamed from: Pub reason: default package */
/* compiled from: modifierChecks.kt */
public abstract class Pub {
    public final Rub a(C5582adb adb) {
        C7471uYa.b(adb, "functionDescriptor");
        for (Vub vub : a()) {
            if (vub.b(adb)) {
                return vub.a(adb);
            }
        }
        return a.b;
    }

    public abstract List<Vub> a();
}
