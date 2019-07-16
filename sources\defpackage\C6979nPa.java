package defpackage;

import java.util.concurrent.Callable;

/* renamed from: nPa reason: default package and case insensitive filesystem */
/* compiled from: Completable */
public abstract class C6979nPa implements C7255rPa {
    public static C6979nPa a(C7186qPa qpa) {
        AQa.a(qpa, "source is null");
        return WUa.a((C6979nPa) new C5705cRa(qpa));
    }

    public static C6979nPa b(Throwable th) {
        AQa.a(th, "error is null");
        return WUa.a((C6979nPa) new C6369eRa(th));
    }

    private static NullPointerException c(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static C6979nPa e() {
        return WUa.a(C6301dRa.a);
    }

    /* access modifiers changed from: protected */
    public abstract void b(C7117pPa ppa);

    public final C6979nPa d() {
        return WUa.a((C6979nPa) new C5637bRa(this));
    }

    public final C6979nPa f() {
        return a(C7808zQa.a());
    }

    public final VPa g() {
        WQa wQa = new WQa();
        a((C7117pPa) wQa);
        return wQa;
    }

    public final <T> APa<T> h() {
        if (this instanceof DQa) {
            return ((DQa) this).a();
        }
        return WUa.a((APa<T>) new C7119pRa<T>(this));
    }

    public static C6979nPa a(Callable<?> callable) {
        AQa.a(callable, "callable is null");
        return WUa.a((C6979nPa) new C6505gRa(callable));
    }

    public static C6979nPa b(C6368eQa eqa) {
        AQa.a(eqa, "run is null");
        return WUa.a((C6979nPa) new C6437fRa(eqa));
    }

    public static C6979nPa c(C7255rPa rpa) {
        AQa.a(rpa, "source is null");
        if (rpa instanceof C6979nPa) {
            return WUa.a((C6979nPa) rpa);
        }
        return WUa.a((C6979nPa) new C6641iRa(rpa));
    }

    public static C6979nPa a(C7255rPa... rpaArr) {
        AQa.a(rpaArr, "sources is null");
        if (rpaArr.length == 0) {
            return e();
        }
        if (rpaArr.length == 1) {
            return c(rpaArr[0]);
        }
        return WUa.a((C6979nPa) new C6709jRa(rpaArr));
    }

    public final C6979nPa b(C6776kQa<? super VPa> kqa) {
        C6776kQa b = C7808zQa.b();
        C6368eQa eqa = C7808zQa.c;
        return a(kqa, b, eqa, eqa, eqa, eqa);
    }

    public final C6979nPa b(C7255rPa rpa) {
        AQa.a(rpa, "other is null");
        return a(this, rpa);
    }

    public final Throwable c() {
        RQa rQa = new RQa();
        a((C7117pPa) rQa);
        return rQa.b();
    }

    public final C6979nPa b(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((C6979nPa) new C7050oRa(this, hPa));
    }

    public final <T> IPa<T> b(Callable<? extends T> callable) {
        AQa.a(callable, "completionValueSupplier is null");
        return WUa.a((IPa<T>) new C7188qRa<T>(this, callable, null));
    }

    public final <E extends C7117pPa> E c(E e) {
        a((C7117pPa) e);
        return e;
    }

    public static C6979nPa a(Iterable<? extends C7255rPa> iterable) {
        AQa.a(iterable, "sources is null");
        return WUa.a((C6979nPa) new C6777kRa(iterable));
    }

    public final VPa c(C6368eQa eqa) {
        AQa.a(eqa, "onComplete is null");
        SQa sQa = new SQa(eqa);
        a((C7117pPa) sQa);
        return sQa;
    }

    public final <T> APa<T> a(EPa<T> ePa) {
        AQa.a(ePa, "next is null");
        return WUa.a((APa<T>) new C5706cSa<T>(this, ePa));
    }

    public final <T> IPa<T> a(MPa<T> mPa) {
        AQa.a(mPa, "next is null");
        return WUa.a((IPa<T>) new C7742yTa<T>(mPa, this));
    }

    public final <T> C7531vPa<T> a(C7669xPa<T> xpa) {
        AQa.a(xpa, "next is null");
        return WUa.a((C7531vPa<T>) new ERa<T>(xpa, this));
    }

    public final C6979nPa a(C7255rPa rpa) {
        AQa.a(rpa, "next is null");
        return WUa.a((C6979nPa) new C5569aRa(this, rpa));
    }

    public final C6979nPa a(C6368eQa eqa) {
        C6776kQa b = C7808zQa.b();
        C6776kQa b2 = C7808zQa.b();
        C6368eQa eqa2 = C7808zQa.c;
        return a(b, b2, eqa, eqa2, eqa2, eqa2);
    }

    public final C6979nPa a(C6776kQa<? super Throwable> kqa) {
        C6776kQa b = C7808zQa.b();
        C6368eQa eqa = C7808zQa.c;
        return a(b, kqa, eqa, eqa, eqa, eqa);
    }

    private C6979nPa a(C6776kQa<? super VPa> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6368eQa eqa2, C6368eQa eqa3, C6368eQa eqa4) {
        AQa.a(kqa, "onSubscribe is null");
        AQa.a(kqa2, "onError is null");
        AQa.a(eqa, "onComplete is null");
        AQa.a(eqa2, "onTerminate is null");
        AQa.a(eqa3, "onAfterTerminate is null");
        AQa.a(eqa4, "onDispose is null");
        C6981nRa nra = new C6981nRa(this, kqa, kqa2, eqa, eqa2, eqa3, eqa4);
        return WUa.a((C6979nPa) nra);
    }

    public final C6979nPa a(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((C6979nPa) new C6845lRa(this, hPa));
    }

    public final C6979nPa a(C7256rQa<? super Throwable> rqa) {
        AQa.a(rqa, "predicate is null");
        return WUa.a((C6979nPa) new C6913mRa(this, rqa));
    }

    public final void a(C7117pPa ppa) {
        AQa.a(ppa, "observer is null");
        try {
            C7117pPa a = WUa.a(this, ppa);
            AQa.a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
            throw c(th);
        }
    }

    public final VPa a(C6368eQa eqa, C6776kQa<? super Throwable> kqa) {
        AQa.a(kqa, "onError is null");
        AQa.a(eqa, "onComplete is null");
        SQa sQa = new SQa(kqa, eqa);
        a((C7117pPa) sQa);
        return sQa;
    }

    public final <T> IPa<T> a(T t) {
        AQa.a(t, "completionValue is null");
        return WUa.a((IPa<T>) new C7188qRa<T>(this, null, t));
    }
}
