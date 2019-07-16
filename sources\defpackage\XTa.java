package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: XTa reason: default package */
/* compiled from: MpscLinkedQueue */
public final class XTa<T> implements MQa<T> {
    private final AtomicReference<a<T>> a = new AtomicReference<>();
    private final AtomicReference<a<T>> b = new AtomicReference<>();

    /* renamed from: XTa$a */
    /* compiled from: MpscLinkedQueue */
    static final class a<E> extends AtomicReference<a<E>> {
        private E a;

        a() {
        }

        public E a() {
            E b = b();
            a((E) null);
            return b;
        }

        public E b() {
            return this.a;
        }

        public a<E> c() {
            return (a) get();
        }

        a(E e) {
            a(e);
        }

        public void a(E e) {
            this.a = e;
        }

        public void a(a<E> aVar) {
            lazySet(aVar);
        }
    }

    public XTa() {
        a aVar = new a();
        a(aVar);
        b(aVar);
    }

    /* access modifiers changed from: 0000 */
    public a<T> a() {
        return (a) this.b.get();
    }

    /* access modifiers changed from: 0000 */
    public a<T> b(a<T> aVar) {
        return (a) this.a.getAndSet(aVar);
    }

    /* access modifiers changed from: 0000 */
    public a<T> c() {
        return (a) this.a.get();
    }

    public void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return b() == c();
    }

    public boolean offer(T t) {
        if (t != null) {
            a aVar = new a(t);
            b(aVar).a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        a c;
        a a2 = a();
        a c2 = a2.c();
        if (c2 != null) {
            T a3 = c2.a();
            a(c2);
            return a3;
        } else if (a2 == c()) {
            return null;
        } else {
            do {
                c = a2.c();
            } while (c == null);
            T a4 = c.a();
            a(c);
            return a4;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a<T> aVar) {
        this.b.lazySet(aVar);
    }

    /* access modifiers changed from: 0000 */
    public a<T> b() {
        return (a) this.b.get();
    }
}
