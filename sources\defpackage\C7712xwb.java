package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xwb reason: default package and case insensitive filesystem */
/* compiled from: SequencesJVM.kt */
public final class C7712xwb<T> implements Iwb<T> {
    private final AtomicReference<Iwb<T>> a;

    public C7712xwb(Iwb<? extends T> iwb) {
        C7471uYa.b(iwb, "sequence");
        this.a = new AtomicReference<>(iwb);
    }

    public Iterator<T> iterator() {
        Iwb iwb = (Iwb) this.a.getAndSet(null);
        if (iwb != null) {
            return iwb.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
