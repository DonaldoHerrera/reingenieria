package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bB reason: default package and case insensitive filesystem */
final class C0482bB {
    private final ConcurrentHashMap<C0296aB, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    C0482bB() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference poll = this.b.poll();
            if (poll == null) {
                break;
            }
            this.a.remove(poll);
        }
        List<Throwable> list = (List) this.a.get(new C0296aB(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.a.putIfAbsent(new C0296aB(th, this.b), vector);
        return list2 == null ? vector : list2;
    }
}
