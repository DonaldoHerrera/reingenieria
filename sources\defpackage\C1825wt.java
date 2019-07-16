package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* renamed from: wt reason: default package and case insensitive filesystem */
public final class C1825wt {
    final C1646qt a;
    Collection<String> b = new HashSet();

    public C1825wt(C1646qt qtVar) {
        Pu.a(qtVar);
        this.a = qtVar;
    }

    public final C1705st a() {
        return new C1705st(this);
    }

    public final C1825wt a(Collection<String> collection) {
        this.b = collection;
        return this;
    }
}
