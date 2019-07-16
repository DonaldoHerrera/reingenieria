package defpackage;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: dE reason: default package and case insensitive filesystem */
/* compiled from: TransformedIterator */
abstract class C2950dE<F, T> implements Iterator<T> {
    final Iterator<? extends F> a;

    C2950dE(Iterator<? extends F> it) {
        Preconditions.checkNotNull(it);
        this.a = it;
    }

    /* access modifiers changed from: 0000 */
    public abstract T a(F f);

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final T next() {
        return a(this.a.next());
    }

    public final void remove() {
        this.a.remove();
    }
}
