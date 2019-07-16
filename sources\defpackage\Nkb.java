package defpackage;

import java.util.Collection;

/* renamed from: Nkb reason: default package */
/* compiled from: methodSignatureMapping.kt */
public final class Nkb implements Mkb<C7760ykb> {
    public static final Nkb a = new Nkb();

    private Nkb() {
    }

    public Void a(C5029Jcb jcb) {
        C7471uYa.b(jcb, "classDescriptor");
        return null;
    }

    public void a(C7706xtb xtb, C5029Jcb jcb) {
        C7471uYa.b(xtb, "kotlinType");
        C7471uYa.b(jcb, "descriptor");
    }

    public boolean a() {
        return false;
    }

    public String b(C5029Jcb jcb) {
        C7471uYa.b(jcb, "classDescriptor");
        return null;
    }

    public C7706xtb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "kotlinType");
        return a.a(this, xtb);
    }

    public C7706xtb a(Collection<? extends C7706xtb> collection) {
        C7471uYa.b(collection, "types");
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no intersection type in existing descriptors, but found: ");
        sb.append(C7676xWa.a(collection, null, null, null, 0, null, null, 63, null));
        throw new AssertionError(sb.toString());
    }
}
