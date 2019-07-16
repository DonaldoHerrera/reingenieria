package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: eTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableScalarXMap */
public final class C6371eTa {

    /* renamed from: eTa$a */
    /* compiled from: ObservableScalarXMap */
    public static final class a<T> extends AtomicInteger implements IQa<T>, Runnable {
        final GPa<? super T> a;
        final T b;

        public a(GPa<? super T> gPa, T t) {
            this.a = gPa;
            this.b = t;
        }

        public boolean a() {
            return get() == 3;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.b;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.a.a(this.b);
                if (get() == 2) {
                    lazySet(3);
                    this.a.onComplete();
                }
            }
        }

        public int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }
    }

    /* renamed from: eTa$b */
    /* compiled from: ObservableScalarXMap */
    static final class b<T, R> extends APa<R> {
        final T a;
        final C7118pQa<? super T, ? extends EPa<? extends R>> b;

        b(T t, C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
            this.a = t;
            this.b = pqa;
        }

        public void b(GPa<? super R> gPa) {
            try {
                Object apply = this.b.apply(this.a);
                AQa.a(apply, "The mapper returned a null ObservableSource");
                EPa ePa = (EPa) apply;
                if (ePa instanceof Callable) {
                    try {
                        Object call = ((Callable) ePa).call();
                        if (call == null) {
                            C7532vQa.a(gPa);
                            return;
                        }
                        a aVar = new a(gPa, call);
                        gPa.a((VPa) aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        _Pa.b(th);
                        C7532vQa.a(th, gPa);
                    }
                } else {
                    ePa.a(gPa);
                }
            } catch (Throwable th2) {
                C7532vQa.a(th2, gPa);
            }
        }
    }

    public static <T, R> boolean a(EPa<T> ePa, GPa<? super R> gPa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        if (!(ePa instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) ePa).call();
            if (call == null) {
                C7532vQa.a(gPa);
                return true;
            }
            try {
                Object apply = pqa.apply(call);
                AQa.a(apply, "The mapper returned a null ObservableSource");
                EPa ePa2 = (EPa) apply;
                if (ePa2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) ePa2).call();
                        if (call2 == null) {
                            C7532vQa.a(gPa);
                            return true;
                        }
                        a aVar = new a(gPa, call2);
                        gPa.a((VPa) aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        _Pa.b(th);
                        C7532vQa.a(th, gPa);
                        return true;
                    }
                } else {
                    ePa2.a(gPa);
                }
                return true;
            } catch (Throwable th2) {
                _Pa.b(th2);
                C7532vQa.a(th2, gPa);
                return true;
            }
        } catch (Throwable th3) {
            _Pa.b(th3);
            C7532vQa.a(th3, gPa);
            return true;
        }
    }

    public static <T, U> APa<U> a(T t, C7118pQa<? super T, ? extends EPa<? extends U>> pqa) {
        return WUa.a((APa<T>) new b<T>(t, pqa));
    }
}
