package defpackage;

import java.util.Iterator;

/* renamed from: KSa reason: default package */
/* compiled from: ObservableFromIterable */
public final class KSa<T> extends APa<T> {
    final Iterable<? extends T> a;

    /* renamed from: KSa$a */
    /* compiled from: ObservableFromIterable */
    static final class a<T> extends QQa<T> {
        final GPa<? super T> a;
        final Iterator<? extends T> b;
        volatile boolean c;
        boolean d;
        boolean e;
        boolean f;

        a(GPa<? super T> gPa, Iterator<? extends T> it) {
            this.a = gPa;
            this.b = it;
        }

        public int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.d = true;
            return 1;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            while (!a()) {
                try {
                    Object next = this.b.next();
                    AQa.a(next, "The iterator returned a null value");
                    this.a.a(next);
                    if (!a()) {
                        try {
                            if (!this.b.hasNext()) {
                                if (!a()) {
                                    this.a.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            _Pa.b(th);
                            this.a.a(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    _Pa.b(th2);
                    this.a.a(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.e = true;
        }

        public void dispose() {
            this.c = true;
        }

        public boolean isEmpty() {
            return this.e;
        }

        public T poll() {
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            T next = this.b.next();
            AQa.a(next, "The iterator returned a null value");
            return next;
        }

        public boolean a() {
            return this.c;
        }
    }

    public KSa(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    public void b(GPa<? super T> gPa) {
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    C7532vQa.a(gPa);
                    return;
                }
                a aVar = new a(gPa, it);
                gPa.a((VPa) aVar);
                if (!aVar.d) {
                    aVar.b();
                }
            } catch (Throwable th) {
                _Pa.b(th);
                C7532vQa.a(th, gPa);
            }
        } catch (Throwable th2) {
            _Pa.b(th2);
            C7532vQa.a(th2, gPa);
        }
    }
}
