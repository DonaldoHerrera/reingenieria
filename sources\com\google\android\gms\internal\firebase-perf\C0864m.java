package com.google.android.gms.internal.firebase-perf;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.firebase-perf.m reason: case insensitive filesystem */
final class C0864m extends WeakReference<Throwable> {
    private final int a;

    public C0864m(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C0864m.class) {
            if (this == obj) {
                return true;
            }
            C0864m mVar = (C0864m) obj;
            return this.a == mVar.a && get() == mVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
