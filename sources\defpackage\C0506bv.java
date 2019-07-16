package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: bv reason: default package and case insensitive filesystem */
final class C0506bv extends WeakReference<Throwable> {
    private final int a;

    public C0506bv(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C0506bv.class) {
            if (this == obj) {
                return true;
            }
            C0506bv bvVar = (C0506bv) obj;
            return this.a == bvVar.a && get() == bvVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
