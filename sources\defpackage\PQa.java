package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: PQa reason: default package */
/* compiled from: BasicIntQueueDisposable */
public abstract class PQa<T> extends AtomicInteger implements IQa<T> {
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
