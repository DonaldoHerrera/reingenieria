package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: czb reason: default package and case insensitive filesystem */
/* compiled from: RouteDatabase */
final class C6279czb {
    private final Set<Dyb> a = new LinkedHashSet();

    C6279czb() {
    }

    public synchronized void a(Dyb dyb) {
        this.a.remove(dyb);
    }

    public synchronized void b(Dyb dyb) {
        this.a.add(dyb);
    }

    public synchronized boolean c(Dyb dyb) {
        return this.a.contains(dyb);
    }
}
