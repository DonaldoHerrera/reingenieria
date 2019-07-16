package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: VUa reason: default package */
/* compiled from: TestObserver */
public class VUa<T> extends MUa<T, VUa<T>> implements GPa<T>, VPa, C7600wPa<T>, KPa<T>, C7117pPa {
    private final GPa<? super T> i;
    private final AtomicReference<VPa> j;
    private IQa<T> k;

    /* renamed from: VUa$a */
    /* compiled from: TestObserver */
    enum a implements GPa<Object> {
        INSTANCE;

        public void a(VPa vPa) {
        }

        public void a(Object obj) {
        }

        public void a(Throwable th) {
        }

        public void onComplete() {
        }
    }

    public VUa() {
        this(a.INSTANCE);
    }

    public void a(VPa vPa) {
        this.e = Thread.currentThread();
        if (vPa == null) {
            this.c.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.j.compareAndSet(null, vPa)) {
            vPa.dispose();
            if (this.j.get() != C7463uQa.DISPOSED) {
                List<Throwable> list = this.c;
                StringBuilder sb = new StringBuilder();
                sb.append("onSubscribe received multiple subscriptions: ");
                sb.append(vPa);
                list.add(new IllegalStateException(sb.toString()));
            }
        } else {
            int i2 = this.g;
            if (i2 != 0 && (vPa instanceof IQa)) {
                this.k = (IQa) vPa;
                int a2 = this.k.a(i2);
                this.h = a2;
                if (a2 == 1) {
                    this.f = true;
                    this.e = Thread.currentThread();
                    while (true) {
                        try {
                            Object poll = this.k.poll();
                            if (poll == null) {
                                break;
                            }
                            this.b.add(poll);
                        } catch (Throwable th) {
                            this.c.add(th);
                        }
                    }
                    this.d++;
                    this.j.lazySet(C7463uQa.DISPOSED);
                    return;
                }
            }
            this.i.a(vPa);
        }
    }

    public final void dispose() {
        C7463uQa.a(this.j);
    }

    public void onComplete() {
        if (!this.f) {
            this.f = true;
            if (this.j.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.e = Thread.currentThread();
            this.d++;
            this.i.onComplete();
        } finally {
            this.a.countDown();
        }
    }

    public void onSuccess(T t) {
        a(t);
        onComplete();
    }

    public VUa(GPa<? super T> gPa) {
        this.j = new AtomicReference<>();
        this.i = gPa;
    }

    public void a(T t) {
        if (!this.f) {
            this.f = true;
            if (this.j.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.e = Thread.currentThread();
        if (this.h == 2) {
            while (true) {
                try {
                    Object poll = this.k.poll();
                    if (poll == null) {
                        break;
                    }
                    this.b.add(poll);
                } catch (Throwable th) {
                    this.c.add(th);
                    this.k.dispose();
                }
            }
            return;
        }
        this.b.add(t);
        if (t == null) {
            this.c.add(new NullPointerException("onNext received a null value"));
        }
        this.i.a(t);
    }

    public void a(Throwable th) {
        if (!this.f) {
            this.f = true;
            if (this.j.get() == null) {
                this.c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.e = Thread.currentThread();
            if (th == null) {
                this.c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.c.add(th);
            }
            this.i.a(th);
        } finally {
            this.a.countDown();
        }
    }

    public final boolean a() {
        return C7463uQa.a((VPa) this.j.get());
    }
}
