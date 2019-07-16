package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Jwb reason: default package */
/* compiled from: SequenceBuilder.kt */
final class Jwb<T> extends Kwb<T> implements Iterator<T>, C5575aXa<RVa>, MYa {
    private int a;
    private T b;
    private Iterator<? extends T> c;
    private C5575aXa<? super RVa> d;

    private final T b() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void a(C5575aXa<? super RVa> axa) {
        this.d = axa;
    }

    public C5711cXa getContext() {
        return C6307dXa.a;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.c;
                    if (it == null) {
                        C7471uYa.a();
                        throw null;
                    } else if (it.hasNext()) {
                        this.a = 2;
                        return true;
                    } else {
                        this.c = null;
                    }
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
            }
            this.a = 5;
            C5575aXa<? super RVa> axa = this.d;
            if (axa != null) {
                this.d = null;
                RVa rVa = RVa.a;
                a aVar = IVa.a;
                IVa.b(rVa);
                axa.b(rVa);
            } else {
                C7471uYa.a();
                throw null;
            }
        }
    }

    public T next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return b();
        }
        if (i == 2) {
            this.a = 1;
            Iterator<? extends T> it = this.c;
            if (it != null) {
                return it.next();
            }
            C7471uYa.a();
            throw null;
        } else if (i == 3) {
            this.a = 0;
            T t = this.b;
            this.b = null;
            return t;
        } else {
            throw a();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final Throwable a() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected state of the iterator: ");
        sb.append(this.a);
        return new IllegalStateException(sb.toString());
    }

    public void b(Object obj) {
        JVa.a(obj);
        this.a = 4;
    }

    public Object a(T t, C5575aXa<? super RVa> axa) {
        this.b = t;
        this.a = 3;
        a(axa);
        Object a2 = C6715jXa.a();
        if (a2 == C6715jXa.a()) {
            C7194qXa.c(axa);
        }
        return a2;
    }
}
