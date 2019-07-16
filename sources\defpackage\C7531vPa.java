package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vPa reason: default package and case insensitive filesystem */
/* compiled from: Maybe */
public abstract class C7531vPa<T> implements C7669xPa<T> {
    public static <T> C7531vPa<T> a(Callable<? extends C7669xPa<? extends T>> callable) {
        AQa.a(callable, "maybeSupplier is null");
        return WUa.a((C7531vPa<T>) new DRa<T>(callable));
    }

    public static <T> C7531vPa<T> b(Callable<? extends T> callable) {
        AQa.a(callable, "callable is null");
        return WUa.a((C7531vPa<T>) new ORa<T>(callable));
    }

    public static <T> C7531vPa<T> c() {
        return WUa.a((C7531vPa<T>) GRa.a);
    }

    /* access modifiers changed from: protected */
    public abstract void b(C7600wPa<? super T> wpa);

    public final <R> IPa<R> d(C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((IPa<T>) new LRa<T>(this, pqa));
    }

    public final <R> C7531vPa<R> e(C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C7531vPa<T>) new MRa<T>(this, pqa));
    }

    public final <R> C7531vPa<R> f(C7118pQa<? super T, ? extends R> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C7531vPa<T>) new TRa<T>(this, pqa));
    }

    public final APa<T> g() {
        if (this instanceof DQa) {
            return ((DQa) this).a();
        }
        return WUa.a((APa<T>) new _Ra<T>(this));
    }

    public final IPa<T> h() {
        return WUa.a((IPa<T>) new C5570aSa<T>(this, null));
    }

    public static <T> C7531vPa<T> c(T t) {
        AQa.a(t, "item is null");
        return WUa.a((C7531vPa<T>) new SRa<T>(t));
    }

    public static <T> C7531vPa<T> a(Throwable th) {
        AQa.a(th, "exception is null");
        return WUa.a((C7531vPa<T>) new HRa<T>(th));
    }

    public final T b() {
        RQa rQa = new RQa();
        a((C7600wPa<? super T>) rQa);
        return rQa.a();
    }

    public final C6979nPa d() {
        return WUa.a((C6979nPa) new RRa(this));
    }

    public final C7531vPa<T> e() {
        return b(C7808zQa.a());
    }

    public final VPa f() {
        return a(C7808zQa.b(), C7808zQa.f, C7808zQa.c);
    }

    public final <R> APa<R> c(C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new C6302dSa<T>(this, pqa));
    }

    public final IPa<T> d(T t) {
        AQa.a(t, "defaultValue is null");
        return WUa.a((IPa<T>) new C5570aSa<T>(this, t));
    }

    public static <T1, T2, R> C7531vPa<R> a(C7669xPa<? extends T1> xpa, C7669xPa<? extends T2> xpa2, C6504gQa<? super T1, ? super T2, ? extends R> gqa) {
        AQa.a(xpa, "source1 is null");
        AQa.a(xpa2, "source2 is null");
        return a(C7808zQa.a(gqa), (C7669xPa<? extends T>[]) new C7669xPa[]{xpa, xpa2});
    }

    public final C7531vPa<T> b(T t) {
        AQa.a(t, "defaultItem is null");
        return a((C7669xPa<? extends T>) c(t));
    }

    public final VPa c(C6776kQa<? super T> kqa) {
        return a(kqa, C7808zQa.f, C7808zQa.c);
    }

    public final <E extends C7600wPa<? super T>> E c(E e) {
        a((C7600wPa<? super T>) e);
        return e;
    }

    public static <T, R> C7531vPa<R> a(C7118pQa<? super Object[], ? extends R> pqa, C7669xPa<? extends T>... xpaArr) {
        AQa.a(xpaArr, "sources is null");
        if (xpaArr.length == 0) {
            return c();
        }
        AQa.a(pqa, "zipper is null");
        return WUa.a((C7531vPa<T>) new C5638bSa<T>(xpaArr, pqa));
    }

    public final C7531vPa<T> b(C6776kQa<? super T> kqa) {
        C6776kQa b = C7808zQa.b();
        AQa.a(kqa, "onSuccess is null");
        C6776kQa kqa2 = kqa;
        C6776kQa b2 = C7808zQa.b();
        C6368eQa eqa = C7808zQa.c;
        WRa wRa = new WRa(this, b, kqa2, b2, eqa, eqa, eqa);
        return WUa.a((C7531vPa<T>) wRa);
    }

    public final T a(T t) {
        AQa.a(t, "defaultValue is null");
        RQa rQa = new RQa();
        a((C7600wPa<? super T>) rQa);
        return rQa.a(t);
    }

    public final C6979nPa b(C7118pQa<? super T, ? extends C7255rPa> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C6979nPa) new KRa(this, pqa));
    }

    public final C7531vPa<T> b(C7256rQa<? super Throwable> rqa) {
        AQa.a(rqa, "predicate is null");
        return WUa.a((C7531vPa<T>) new VRa<T>(this, rqa));
    }

    public final <U> C7531vPa<U> a(Class<? extends U> cls) {
        AQa.a(cls, "clazz is null");
        return f(C7808zQa.a(cls));
    }

    public final C7531vPa<T> b(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((C7531vPa<T>) new XRa<T>(this, hPa));
    }

    public final C7531vPa<T> a(C6436fQa<? super T, ? super Throwable> fqa) {
        AQa.a(fqa, "onEvent is null");
        return WUa.a((C7531vPa<T>) new FRa<T>(this, fqa));
    }

    public final C7531vPa<T> a(C6776kQa<? super VPa> kqa) {
        AQa.a(kqa, "onSubscribe is null");
        C6776kQa kqa2 = kqa;
        C6776kQa b = C7808zQa.b();
        C6776kQa b2 = C7808zQa.b();
        C6368eQa eqa = C7808zQa.c;
        WRa wRa = new WRa(this, kqa2, b, b2, eqa, eqa, eqa);
        return WUa.a((C7531vPa<T>) wRa);
    }

    public final C7531vPa<T> a(C7256rQa<? super T> rqa) {
        AQa.a(rqa, "predicate is null");
        return WUa.a((C7531vPa<T>) new IRa<T>(this, rqa));
    }

    public final <R> C7531vPa<R> a(C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C7531vPa<T>) new NRa<T>(this, pqa));
    }

    public final C7531vPa<T> a(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((C7531vPa<T>) new URa<T>(this, hPa));
    }

    public final VPa a(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa) {
        AQa.a(kqa, "onSuccess is null");
        AQa.a(kqa2, "onError is null");
        AQa.a(eqa, "onComplete is null");
        CRa cRa = new CRa(kqa, kqa2, eqa);
        c((E) cRa);
        return cRa;
    }

    public final void a(C7600wPa<? super T> wpa) {
        AQa.a(wpa, "observer is null");
        C7600wPa a = WUa.a(this, wpa);
        AQa.a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            _Pa.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C7531vPa<T> a(C7669xPa<? extends T> xpa) {
        AQa.a(xpa, "other is null");
        return WUa.a((C7531vPa<T>) new YRa<T>(this, xpa));
    }

    public final IPa<T> a(MPa<? extends T> mPa) {
        AQa.a(mPa, "other is null");
        return WUa.a((IPa<T>) new ZRa<T>(this, mPa));
    }

    public final <U, R> C7531vPa<R> a(C7669xPa<? extends U> xpa, C6504gQa<? super T, ? super U, ? extends R> gqa) {
        AQa.a(xpa, "other is null");
        return a((C7669xPa<? extends T1>) this, xpa, gqa);
    }
}
