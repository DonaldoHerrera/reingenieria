package defpackage;

import java.util.Collection;

/* renamed from: Apb reason: default package */
/* compiled from: VisibilityUtil.kt */
public final class Apb {
    public static final C4935Gcb a(Collection<? extends C4935Gcb> collection) {
        C7471uYa.b(collection, "descriptors");
        boolean z = !collection.isEmpty();
        if (!TVa.a || z) {
            C4935Gcb gcb = null;
            for (C4935Gcb gcb2 : collection) {
                if (gcb != null) {
                    Integer a = _db.a(gcb.d(), gcb2.d());
                    if (a != null) {
                        if (a.intValue() >= 0) {
                        }
                    }
                }
                gcb = gcb2;
            }
            if (gcb != null) {
                return gcb;
            }
            C7471uYa.a();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }
}
