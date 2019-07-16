package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Jvb reason: default package */
/* compiled from: ConsPStack */
final class Jvb<E> implements Iterable<E> {
    private static final Jvb<Object> a = new Jvb<>();
    final E b;
    final Jvb<E> c;
    /* access modifiers changed from: private */
    public final int d;

    /* renamed from: Jvb$a */
    /* compiled from: ConsPStack */
    private static class a<E> implements Iterator<E> {
        private Jvb<E> a;

        public a(Jvb<E> jvb) {
            this.a = jvb;
        }

        public boolean hasNext() {
            return this.a.d > 0;
        }

        public E next() {
            Jvb<E> jvb = this.a;
            E e = jvb.b;
            this.a = jvb.c;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Jvb() {
        this.d = 0;
        this.b = null;
        this.c = null;
    }

    private Jvb<E> b(Object obj) {
        if (this.d == 0) {
            return this;
        }
        if (this.b.equals(obj)) {
            return this.c;
        }
        Jvb<E> b2 = this.c.b(obj);
        if (b2 == this.c) {
            return this;
        }
        return new Jvb<>(this.b, b2);
    }

    public static <E> Jvb<E> f() {
        return a;
    }

    private Iterator<E> m(int i) {
        return new a(n(i));
    }

    private Jvb<E> n(int i) {
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.c.n(i - 1);
        }
    }

    public Jvb<E> c(int i) {
        return b(get(i));
    }

    public E get(int i) {
        if (i < 0 || i > this.d) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return m(i).next();
        } catch (NoSuchElementException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public Iterator<E> iterator() {
        return m(0);
    }

    public int size() {
        return this.d;
    }

    public Jvb<E> a(E e) {
        return new Jvb<>(e, this);
    }

    private Jvb(E e, Jvb<E> jvb) {
        this.b = e;
        this.c = jvb;
        this.d = jvb.d + 1;
    }
}
