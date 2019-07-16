package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: aB reason: default package and case insensitive filesystem */
final class C0296aB extends WeakReference<Throwable> {
    private final int a;

    public C0296aB(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C0296aB.class) {
            if (this == obj) {
                return true;
            }
            C0296aB aBVar = (C0296aB) obj;
            return this.a == aBVar.a && get() == aBVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
