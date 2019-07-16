package defpackage;

/* renamed from: NQa reason: default package */
/* compiled from: SimpleQueue */
public interface NQa<T> {
    void clear();

    boolean isEmpty();

    boolean offer(T t);

    T poll() throws Exception;
}
