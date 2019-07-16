package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: Qs reason: default package */
final class Qs extends WeakReference<Throwable> {
    private final int a;

    public Qs(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Qs.class) {
            if (this == obj) {
                return true;
            }
            Qs qs = (Qs) obj;
            return this.a == qs.a && get() == qs.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
