package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: IPa reason: default package */
/* compiled from: Single */
public abstract class IPa<T> implements MPa<T> {
    public static <T> IPa<T> a(LPa<T> lPa) {
        AQa.a(lPa, "source is null");
        return WUa.a((IPa<T>) new C7535vTa<T>(lPa));
    }

    public static <T> IPa<T> b(Callable<? extends Throwable> callable) {
        AQa.a(callable, "errorSupplier is null");
        return WUa.a((IPa<T>) new ETa<T>(callable));
    }

    public static <T> IPa<T> c(Callable<? extends T> callable) {
        AQa.a(callable, "callable is null");
        return WUa.a((IPa<T>) new ITa<T>(callable));
    }

    public static <T> IPa<T> f() {
        return WUa.a(NTa.a);
    }

    /* access modifiers changed from: protected */
    public abstract void b(KPa<? super T> kPa);

    public final IPa<T> d() {
        return WUa.a((IPa<T>) new JTa<T>(this));
    }

    public final <R> IPa<R> e(C7118pQa<? super T, ? extends R> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((IPa<T>) new MTa<T>(this, pqa));
    }

    public final IPa<T> g(C7118pQa<Throwable, ? extends T> pqa) {
        AQa.a(pqa, "resumeFunction is null");
        return WUa.a((IPa<T>) new PTa<T>(this, pqa, null));
    }

    @Deprecated
    public final C6979nPa h() {
        return WUa.a((C6979nPa) new C6573hRa(this));
    }

    public final C7531vPa<T> i() {
        if (this instanceof CQa) {
            return ((CQa) this).b();
        }
        return WUa.a((C7531vPa<T>) new PRa<T>(this));
    }

    public final APa<T> j() {
        if (this instanceof DQa) {
            return ((DQa) this).a();
        }
        return WUa.a((APa<T>) new VTa<T>(this));
    }

    public final <R> APa<R> d(C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new C6574hSa<T>(this, pqa));
    }

    public final IPa<T> f(C7118pQa<? super Throwable, ? extends MPa<? extends T>> pqa) {
        AQa.a(pqa, "resumeFunctionInCaseOfError is null");
        return WUa.a((IPa<T>) new QTa<T>(this, pqa));
    }

    public static <T> IPa<T> a(Callable<? extends MPa<? extends T>> callable) {
        AQa.a(callable, "singleSupplier is null");
        return WUa.a((IPa<T>) new C7604wTa<T>(callable));
    }

    public static <T> IPa<T> b(Throwable th) {
        AQa.a(th, "exception is null");
        return b(C7808zQa.a(th));
    }

    public static IPa<Long> c(long j, TimeUnit timeUnit, HPa hPa) {
        AQa.a(timeUnit, "unit is null");
        AQa.a(hPa, "scheduler is null");
        return WUa.a((IPa<T>) new TTa<T>(j, timeUnit, hPa));
    }

    public final C6979nPa e() {
        return WUa.a((C6979nPa) new C6573hRa(this));
    }

    public final VPa g() {
        return a(C7808zQa.b(), C7808zQa.f);
    }

    public final VPa d(C6776kQa<? super T> kqa) {
        return a(kqa, C7808zQa.f);
    }

    public static <T> IPa<T> a(T t) {
        AQa.a(t, "item is null");
        return WUa.a((IPa<T>) new LTa<T>(t));
    }

    public final IPa<T> b(C6776kQa<? super VPa> kqa) {
        AQa.a(kqa, "onSubscribe is null");
        return WUa.a((IPa<T>) new CTa<T>(this, kqa));
    }

    public final IPa<T> c() {
        return WUa.a((IPa<T>) new C7466uTa<T>(this));
    }

    public static <T> C7393tPa<T> a(Iterable<? extends MPa<? extends T>> iterable) {
        return a((_Ab<? extends MPa<? extends T>>) C7393tPa.a(iterable));
    }

    public final C6979nPa b(C7118pQa<? super T, ? extends C7255rPa> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C6979nPa) new GTa(this, pqa));
    }

    public final IPa<T> c(C6776kQa<? super T> kqa) {
        AQa.a(kqa, "onSuccess is null");
        return WUa.a((IPa<T>) new DTa<T>(this, kqa));
    }

    public static <T> C7393tPa<T> a(_Ab<? extends MPa<? extends T>> _ab) {
        AQa.a(_ab, "sources is null");
        C7395tRa tra = new C7395tRa(_ab, KTa.a(), false, BaseClientBuilder.API_PRIORITY_OTHER, C7393tPa.a());
        return WUa.a((C7393tPa<T>) tra);
    }

    public final T b() {
        RQa rQa = new RQa();
        a((KPa<? super T>) rQa);
        return rQa.a();
    }

    public final <R> C7531vPa<R> c(C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C7531vPa<T>) new HTa<T>(this, pqa));
    }

    public static <T1, T2, R> IPa<R> a(MPa<? extends T1> mPa, MPa<? extends T2> mPa2, C6504gQa<? super T1, ? super T2, ? extends R> gqa) {
        AQa.a(mPa, "source1 is null");
        AQa.a(mPa2, "source2 is null");
        return a(C7808zQa.a(gqa), (MPa<? extends T>[]) new MPa[]{mPa, mPa2});
    }

    public final <E extends KPa<? super T>> E c(E e) {
        a((KPa<? super T>) e);
        return e;
    }

    public final IPa<T> b(T t) {
        AQa.a(t, "value is null");
        return WUa.a((IPa<T>) new PTa<T>(this, null, t));
    }

    public static <T1, T2, T3, R> IPa<R> a(MPa<? extends T1> mPa, MPa<? extends T2> mPa2, MPa<? extends T3> mPa3, C6844lQa<? super T1, ? super T2, ? super T3, ? extends R> lqa) {
        AQa.a(mPa, "source1 is null");
        AQa.a(mPa2, "source2 is null");
        AQa.a(mPa3, "source3 is null");
        return a(C7808zQa.a(lqa), (MPa<? extends T>[]) new MPa[]{mPa, mPa2, mPa3});
    }

    public final IPa<T> b(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((IPa<T>) new RTa<T>(this, hPa));
    }

    public final IPa<T> b(long j, TimeUnit timeUnit, HPa hPa) {
        return a(j, timeUnit, hPa, null);
    }

    public static <T1, T2, T3, T4, R> IPa<R> a(MPa<? extends T1> mPa, MPa<? extends T2> mPa2, MPa<? extends T3> mPa3, MPa<? extends T4> mPa4, C6912mQa<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> mqa) {
        AQa.a(mPa, "source1 is null");
        AQa.a(mPa2, "source2 is null");
        AQa.a(mPa3, "source3 is null");
        AQa.a(mPa4, "source4 is null");
        return a(C7808zQa.a(mqa), (MPa<? extends T>[]) new MPa[]{mPa, mPa2, mPa3, mPa4});
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> IPa<R> a(MPa<? extends T1> mPa, MPa<? extends T2> mPa2, MPa<? extends T3> mPa3, MPa<? extends T4> mPa4, MPa<? extends T5> mPa5, MPa<? extends T6> mPa6, MPa<? extends T7> mPa7, MPa<? extends T8> mPa8, C7049oQa<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> oqa) {
        AQa.a(mPa, "source1 is null");
        AQa.a(mPa2, "source2 is null");
        AQa.a(mPa3, "source3 is null");
        AQa.a(mPa4, "source4 is null");
        AQa.a(mPa5, "source5 is null");
        AQa.a(mPa6, "source6 is null");
        AQa.a(mPa7, "source7 is null");
        AQa.a(mPa8, "source8 is null");
        return a(C7808zQa.a(oqa), (MPa<? extends T>[]) new MPa[]{mPa, mPa2, mPa3, mPa4, mPa5, mPa6, mPa7, mPa8});
    }

    public static <T, R> IPa<R> a(C7118pQa<? super Object[], ? extends R> pqa, MPa<? extends T>... mPaArr) {
        AQa.a(pqa, "zipper is null");
        AQa.a(mPaArr, "sources is null");
        if (mPaArr.length == 0) {
            return b((Throwable) new NoSuchElementException());
        }
        return WUa.a((IPa<T>) new WTa<T>(mPaArr, pqa));
    }

    public final <U> IPa<U> a(Class<? extends U> cls) {
        AQa.a(cls, "clazz is null");
        return e(C7808zQa.a(cls));
    }

    public final IPa<T> a(long j, TimeUnit timeUnit, HPa hPa) {
        return a(j, timeUnit, hPa, false);
    }

    public final IPa<T> a(long j, TimeUnit timeUnit, HPa hPa, boolean z) {
        AQa.a(timeUnit, "unit is null");
        AQa.a(hPa, "scheduler is null");
        C7673xTa xta = new C7673xTa(this, j, timeUnit, hPa, z);
        return WUa.a((IPa<T>) xta);
    }

    public final IPa<T> a(C6368eQa eqa) {
        AQa.a(eqa, "onFinally is null");
        return WUa.a((IPa<T>) new C7811zTa<T>(this, eqa));
    }

    public final IPa<T> a(C6436fQa<? super T, ? super Throwable> fqa) {
        AQa.a(fqa, "onEvent is null");
        return WUa.a((IPa<T>) new BTa<T>(this, fqa));
    }

    public final IPa<T> a(C6776kQa<? super Throwable> kqa) {
        AQa.a(kqa, "onError is null");
        return WUa.a((IPa<T>) new ATa<T>(this, kqa));
    }

    public final C7531vPa<T> a(C7256rQa<? super T> rqa) {
        AQa.a(rqa, "predicate is null");
        return WUa.a((C7531vPa<T>) new JRa<T>(this, rqa));
    }

    public final <R> IPa<R> a(C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((IPa<T>) new FTa<T>(this, pqa));
    }

    public final IPa<T> a(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((IPa<T>) new OTa<T>(this, hPa));
    }

    public final IPa<T> a(IPa<? extends T> iPa) {
        AQa.a(iPa, "resumeSingleInCaseOfError is null");
        return f(C7808zQa.b(iPa));
    }

    public final VPa a(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2) {
        AQa.a(kqa, "onSuccess is null");
        AQa.a(kqa2, "onError is null");
        TQa tQa = new TQa(kqa, kqa2);
        a((KPa<? super T>) tQa);
        return tQa;
    }

    public final void a(KPa<? super T> kPa) {
        AQa.a(kPa, "observer is null");
        KPa a = WUa.a(this, kPa);
        AQa.a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
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

    public final IPa<T> a(long j, TimeUnit timeUnit, MPa<? extends T> mPa) {
        AQa.a(mPa, "other is null");
        return a(j, timeUnit, C6645iVa.a(), mPa);
    }

    private IPa<T> a(long j, TimeUnit timeUnit, HPa hPa, MPa<? extends T> mPa) {
        AQa.a(timeUnit, "unit is null");
        AQa.a(hPa, "scheduler is null");
        STa sTa = new STa(this, j, timeUnit, hPa, mPa);
        return WUa.a((IPa<T>) sTa);
    }

    public final <U, R> IPa<R> a(MPa<U> mPa, C6504gQa<? super T, ? super U, ? extends R> gqa) {
        return a((MPa<? extends T1>) this, mPa, gqa);
    }
}
