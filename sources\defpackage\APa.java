package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: APa reason: default package */
/* compiled from: Observable */
public abstract class APa<T> implements EPa<T> {
    public static <T, R> APa<R> a(C7118pQa<? super Object[], ? extends R> pqa, int i, EPa<? extends T>... ePaArr) {
        return a(ePaArr, pqa, i);
    }

    public static int b() {
        return C7393tPa.a();
    }

    public static <T> APa<T> c(Callable<? extends T> callable) {
        AQa.a(callable, "supplier is null");
        return WUa.a((APa<T>) new JSa<T>(callable));
    }

    public static <T> APa<T> e() {
        return WUa.a(C7810zSa.a);
    }

    public static <T> APa<T> f(EPa<T> ePa) {
        AQa.a(ePa, "source is null");
        if (ePa instanceof APa) {
            return WUa.a((APa) ePa);
        }
        return WUa.a((APa<T>) new MSa<T>(ePa));
    }

    public static <T> APa<T> l() {
        return WUa.a(WSa.a);
    }

    /* access modifiers changed from: protected */
    public abstract void b(GPa<? super T> gPa);

    public final APa<T> d() {
        return b(C7808zQa.c());
    }

    public final IPa<T> g() {
        return b(0);
    }

    public final APa<T> h() {
        return WUa.a((APa<T>) new NSa<T>(this));
    }

    public final C6979nPa i() {
        return WUa.a((C6979nPa) new PSa(this));
    }

    public final IPa<T> j() {
        return WUa.a((IPa<T>) new SSa<T>(this, null));
    }

    public final APa<C7738yPa<T>> k() {
        return WUa.a((APa<T>) new VSa<T>(this));
    }

    public final LUa<T> m() {
        return _Sa.g((EPa<T>) this);
    }

    public final APa<T> n() {
        return m().t();
    }

    public final C7531vPa<T> o() {
        return WUa.a((C7531vPa<T>) new C6575hTa<T>(this));
    }

    public final IPa<T> p() {
        return WUa.a((IPa<T>) new C6643iTa<T>(this, null));
    }

    public final VPa q() {
        return a(C7808zQa.b(), C7808zQa.f, C7808zQa.c, C7808zQa.b());
    }

    public final IPa<List<T>> r() {
        return c(16);
    }

    public static <T, R> APa<R> a(EPa<? extends T>[] ePaArr, C7118pQa<? super Object[], ? extends R> pqa, int i) {
        AQa.a(ePaArr, "sources is null");
        if (ePaArr.length == 0) {
            return e();
        }
        AQa.a(pqa, "combiner is null");
        AQa.a(i, "bufferSize");
        C6914mSa msa = new C6914mSa(ePaArr, null, pqa, i << 1, false);
        return WUa.a((APa<T>) msa);
    }

    public static <T> APa<T> b(EPa<? extends T>... ePaArr) {
        return a(b(), b(), ePaArr);
    }

    public final APa<T> d(C6776kQa<? super T> kqa) {
        C6776kQa b = C7808zQa.b();
        C6368eQa eqa = C7808zQa.c;
        return a(kqa, b, eqa, eqa);
    }

    public final APa<T> e(C6776kQa<? super VPa> kqa) {
        return a(kqa, C7808zQa.c);
    }

    public final <R> APa<R> g(C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        return d(pqa, false);
    }

    public final <R> APa<R> h(C7118pQa<? super T, ? extends R> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new USa<T>(this, pqa));
    }

    public final APa<T> i(C7118pQa<? super Throwable, ? extends EPa<? extends T>> pqa) {
        AQa.a(pqa, "resumeFunction is null");
        return WUa.a((APa<T>) new YSa<T>(this, pqa, false));
    }

    public final APa<T> j(C7118pQa<? super Throwable, ? extends T> pqa) {
        AQa.a(pqa, "valueSupplier is null");
        return WUa.a((APa<T>) new ZSa<T>(this, pqa));
    }

    public final <R> APa<R> k(C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        return b(pqa, b());
    }

    public final C6979nPa l(C7118pQa<? super T, ? extends C7255rPa> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C6979nPa) new C6370eSa(this, pqa, false));
    }

    public final <R> APa<R> m(C7118pQa<? super T, ? extends MPa<? extends R>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new C6438fSa<T>(this, pqa, false));
    }

    public final <R> R n(C7118pQa<? super APa<T>, R> pqa) {
        try {
            AQa.a(pqa, "converter is null");
            return pqa.apply(this);
        } catch (Throwable th) {
            _Pa.b(th);
            throw EUa.a(th);
        }
    }

    public static <T> APa<T> b(Callable<? extends Throwable> callable) {
        AQa.a(callable, "errorSupplier is null");
        return WUa.a((APa<T>) new ASa<T>(callable));
    }

    public static <T> APa<T> c(T t) {
        AQa.a(t, "item is null");
        return WUa.a((APa<T>) new RSa<T>(t));
    }

    public final C6979nPa d(C7118pQa<? super T, ? extends C7255rPa> pqa) {
        return b(pqa, false);
    }

    public final <U> APa<U> e(C7118pQa<? super T, ? extends Iterable<? extends U>> pqa) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new HSa<T>(this, pqa));
    }

    public final <R> APa<R> d(C7118pQa<? super T, ? extends MPa<? extends R>> pqa, boolean z) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new GSa<T>(this, pqa, z));
    }

    public static <T> APa<T> b(Throwable th) {
        AQa.a(th, "exception is null");
        return b(C7808zQa.a(th));
    }

    public final APa<T> c() {
        return a(16);
    }

    public final APa<T> e(T t) {
        AQa.a(t, "item is null");
        return a((EPa<? extends T>[]) new EPa[]{c(t), this});
    }

    public final C7531vPa<T> f() {
        return a(0);
    }

    public final APa<T> c(C6776kQa<? super Throwable> kqa) {
        C6776kQa b = C7808zQa.b();
        C6368eQa eqa = C7808zQa.c;
        return a(b, kqa, eqa, eqa);
    }

    public final APa<T> d(T t) {
        AQa.a(t, "item is null");
        return j(C7808zQa.b(t));
    }

    public final <R> APa<R> f(C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa) {
        return c(pqa, false);
    }

    public static APa<Long> b(long j, TimeUnit timeUnit, HPa hPa) {
        return a(j, j, timeUnit, hPa);
    }

    public final <R> APa<R> c(C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        return a(pqa, false);
    }

    public final APa<T> e(EPa<? extends T> ePa) {
        AQa.a(ePa, "other is null");
        return WUa.a((APa<T>) new C6847lTa<T>(this, ePa));
    }

    public final VPa f(C6776kQa<? super T> kqa) {
        return a(kqa, C7808zQa.f, C7808zQa.c, C7808zQa.b());
    }

    public static <T1, T2, R> APa<R> a(EPa<? extends T1> ePa, EPa<? extends T2> ePa2, C6504gQa<? super T1, ? super T2, ? extends R> gqa) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        return a(C7808zQa.a(gqa), b(), (EPa<? extends T>[]) new EPa[]{ePa, ePa2});
    }

    public static <T> APa<T> b(Iterable<? extends EPa<? extends T>> iterable) {
        return a(iterable).c(C7808zQa.c());
    }

    public final <R> APa<R> c(C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa, boolean z) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((APa<T>) new FSa<T>(this, pqa, z));
    }

    public final APa<T> d(EPa<? extends T> ePa) {
        AQa.a(ePa, "other is null");
        return a((EPa<? extends T>[]) new EPa[]{ePa, this});
    }

    public static <T> APa<T> b(EPa<? extends T> ePa, EPa<? extends T> ePa2) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        return a((T[]) new EPa[]{ePa, ePa2}).a(C7808zQa.c(), false, 2);
    }

    public final APa<T> c(EPa<? extends T> ePa) {
        AQa.a(ePa, "next is null");
        return i(C7808zQa.b(ePa));
    }

    public final APa<T> d(long j) {
        if (j >= 0) {
            return WUa.a((APa<T>) new C6983nTa<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("count >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T1, T2, T3, R> APa<R> a(EPa<? extends T1> ePa, EPa<? extends T2> ePa2, EPa<? extends T3> ePa3, C6844lQa<? super T1, ? super T2, ? super T3, ? extends R> lqa) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        AQa.a(ePa3, "source3 is null");
        return a(C7808zQa.a(lqa), b(), (EPa<? extends T>[]) new EPa[]{ePa, ePa2, ePa3});
    }

    public static <T1, T2, R> APa<R> b(EPa<? extends T1> ePa, EPa<? extends T2> ePa2, C6504gQa<? super T1, ? super T2, ? extends R> gqa) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        return a(C7808zQa.a(gqa), false, b(), (EPa<? extends T>[]) new EPa[]{ePa, ePa2});
    }

    public final APa<T> c(long j) {
        if (j <= 0) {
            return WUa.a(this);
        }
        return WUa.a((APa<T>) new C6711jTa<T>(this, j));
    }

    public final <E extends GPa<? super T>> E c(E e) {
        a((GPa<? super T>) e);
        return e;
    }

    public static <T1, T2, T3, T4, R> APa<R> a(EPa<? extends T1> ePa, EPa<? extends T2> ePa2, EPa<? extends T3> ePa3, EPa<? extends T4> ePa4, C6912mQa<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> mqa) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        AQa.a(ePa3, "source3 is null");
        AQa.a(ePa4, "source4 is null");
        return a(C7808zQa.a(mqa), b(), (EPa<? extends T>[]) new EPa[]{ePa, ePa2, ePa3, ePa4});
    }

    public final <K> APa<T> b(C7118pQa<? super T, K> pqa) {
        AQa.a(pqa, "keySelector is null");
        return WUa.a((APa<T>) new C7327sSa<T>(this, pqa, AQa.a()));
    }

    public final IPa<List<T>> c(int i) {
        AQa.a(i, "capacityHint");
        return WUa.a((IPa<T>) new C7190qTa<T>(this, i));
    }

    public final APa<T> b(C6368eQa eqa) {
        return a(C7808zQa.b(), eqa);
    }

    public final APa<T> c(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((APa<T>) new C7259rTa<T>(this, hPa));
    }

    public final APa<T> b(C6776kQa<? super C7738yPa<T>> kqa) {
        AQa.a(kqa, "onNotification is null");
        return a(C7808zQa.c(kqa), C7808zQa.b(kqa), C7808zQa.a(kqa), C7808zQa.c);
    }

    public static <T1, T2, T3, T4, T5, R> APa<R> a(EPa<? extends T1> ePa, EPa<? extends T2> ePa2, EPa<? extends T3> ePa3, EPa<? extends T4> ePa4, EPa<? extends T5> ePa5, C6980nQa<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> nqa) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        AQa.a(ePa3, "source3 is null");
        AQa.a(ePa4, "source4 is null");
        AQa.a(ePa5, "source5 is null");
        return a(C7808zQa.a(nqa), b(), (EPa<? extends T>[]) new EPa[]{ePa, ePa2, ePa3, ePa4, ePa5});
    }

    public final IPa<T> b(long j) {
        if (j >= 0) {
            return WUa.a((IPa<T>) new C7741ySa<T>(this, j, null));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final IPa<T> b(T t) {
        return a(0, t);
    }

    public static <T> APa<T> a(EPa<? extends T> ePa, EPa<? extends T> ePa2) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        return a((EPa<? extends T>[]) new EPa[]{ePa, ePa2});
    }

    public final C6979nPa b(C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
        AQa.a(pqa, "mapper is null");
        return WUa.a((C6979nPa) new ESa(this, pqa, z));
    }

    public final APa<T> b(EPa<? extends T> ePa) {
        AQa.a(ePa, "other is null");
        return b((EPa<? extends T>) this, ePa);
    }

    public static <T> APa<T> a(EPa<? extends T>... ePaArr) {
        if (ePaArr.length == 0) {
            return e();
        }
        if (ePaArr.length == 1) {
            return f(ePaArr[0]);
        }
        return WUa.a((APa<T>) new C6982nSa<T>(a((T[]) ePaArr), C7808zQa.c(), b(), DUa.BOUNDARY));
    }

    public final <U> APa<U> b(Class<U> cls) {
        AQa.a(cls, "clazz is null");
        return a(C7808zQa.b(cls)).a(cls);
    }

    public final LUa<T> b(int i) {
        AQa.a(i, "bufferSize");
        return C6303dTa.a((EPa<T>) this, i);
    }

    public static <T> APa<T> a(int i, int i2, EPa<? extends T>... ePaArr) {
        return a((T[]) ePaArr).a(C7808zQa.c(), i, i2, false);
    }

    public final APa<T> b(C6504gQa<T, T, T> gqa) {
        AQa.a(gqa, "accumulator is null");
        return WUa.a((APa<T>) new C6439fTa<T>(this, gqa));
    }

    public static <T> APa<T> a(CPa<T> cPa) {
        AQa.a(cPa, "source is null");
        return WUa.a((APa<T>) new C7120pSa<T>(cPa));
    }

    public final <R> APa<R> b(R r, C6504gQa<R, ? super T, R> gqa) {
        AQa.a(r, "initialValue is null");
        return a(C7808zQa.a(r), gqa);
    }

    public static <T> APa<T> a(Callable<? extends EPa<? extends T>> callable) {
        AQa.a(callable, "supplier is null");
        return WUa.a((APa<T>) new C7258rSa<T>(callable));
    }

    public final APa<T> b(HPa hPa) {
        AQa.a(hPa, "scheduler is null");
        return WUa.a((APa<T>) new C6779kTa<T>(this, hPa));
    }

    public static <T> APa<T> a(T... tArr) {
        AQa.a(tArr, "items is null");
        if (tArr.length == 0) {
            return e();
        }
        if (tArr.length == 1) {
            return c(tArr[0]);
        }
        return WUa.a((APa<T>) new ISa<T>(tArr));
    }

    public final <R> APa<R> b(C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i) {
        AQa.a(pqa, "mapper is null");
        AQa.a(i, "bufferSize");
        if (!(this instanceof LQa)) {
            return WUa.a((APa<T>) new C6915mTa<T>(this, pqa, i, false));
        }
        Object call = ((LQa) this).call();
        if (call == null) {
            return e();
        }
        return C6371eTa.a(call, pqa);
    }

    public static <T> APa<T> a(Iterable<? extends T> iterable) {
        AQa.a(iterable, "source is null");
        return WUa.a((APa<T>) new KSa<T>(iterable));
    }

    public static APa<Long> a(long j, long j2, TimeUnit timeUnit, HPa hPa) {
        AQa.a(timeUnit, "unit is null");
        AQa.a(hPa, "scheduler is null");
        QSa qSa = new QSa(Math.max(0, j), Math.max(0, j2), timeUnit, hPa);
        return WUa.a((APa<T>) qSa);
    }

    public final APa<T> b(C7256rQa<? super T> rqa) {
        AQa.a(rqa, "stopPredicate is null");
        return WUa.a((APa<T>) new C7052oTa<T>(this, rqa));
    }

    public static <T> APa<T> a(EPa<? extends T> ePa, EPa<? extends T> ePa2, EPa<? extends T> ePa3) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        AQa.a(ePa3, "source3 is null");
        return a((T[]) new EPa[]{ePa, ePa2, ePa3}).a(C7808zQa.c(), false, 3);
    }

    public static <T> APa<T> a(EPa<? extends T> ePa, EPa<? extends T> ePa2, EPa<? extends T> ePa3, EPa<? extends T> ePa4) {
        AQa.a(ePa, "source1 is null");
        AQa.a(ePa2, "source2 is null");
        AQa.a(ePa3, "source3 is null");
        AQa.a(ePa4, "source4 is null");
        return a((T[]) new EPa[]{ePa, ePa2, ePa3, ePa4}).a(C7808zQa.c(), false, 4);
    }

    public static <T, R> APa<R> a(C7118pQa<? super Object[], ? extends R> pqa, boolean z, int i, EPa<? extends T>... ePaArr) {
        if (ePaArr.length == 0) {
            return e();
        }
        AQa.a(pqa, "zipper is null");
        AQa.a(i, "bufferSize");
        C7397tTa tta = new C7397tTa(ePaArr, null, pqa, i, z);
        return WUa.a((APa<T>) tta);
    }

    public final T a() {
        T b = o().b();
        if (b != null) {
            return b;
        }
        throw new NoSuchElementException();
    }

    public final APa<T> a(int i) {
        AQa.a(i, "initialCapacity");
        return WUa.a((APa<T>) new C6710jSa<T>(this, i));
    }

    public final <U> APa<U> a(Class<U> cls) {
        AQa.a(cls, "clazz is null");
        return h(C7808zQa.a(cls));
    }

    public final <U> IPa<U> a(Callable<? extends U> callable, C6436fQa<? super U, ? super T> fqa) {
        AQa.a(callable, "initialValueSupplier is null");
        AQa.a(fqa, "collector is null");
        return WUa.a((IPa<T>) new C6846lSa<T>(this, callable, fqa));
    }

    public final <R> APa<R> a(FPa<? super T, ? extends R> fPa) {
        AQa.a(fPa, "composer is null");
        return f(fPa.a(this));
    }

    public final <R> APa<R> a(C7118pQa<? super T, ? extends EPa<? extends R>> pqa) {
        return a(pqa, 2);
    }

    public final <R> APa<R> a(C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i) {
        AQa.a(pqa, "mapper is null");
        AQa.a(i, "prefetch");
        if (!(this instanceof LQa)) {
            return WUa.a((APa<T>) new C6982nSa<T>(this, pqa, i, DUa.IMMEDIATE));
        }
        Object call = ((LQa) this).call();
        if (call == null) {
            return e();
        }
        return C6371eTa.a(call, pqa);
    }

    public final <R> APa<R> a(C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i, int i2, boolean z) {
        AQa.a(pqa, "mapper is null");
        AQa.a(i, "maxConcurrency");
        AQa.a(i2, "prefetch");
        C7051oSa osa = new C7051oSa(this, pqa, z ? DUa.END : DUa.BOUNDARY, i, i2);
        return WUa.a((APa<T>) osa);
    }

    public final APa<T> a(EPa<? extends T> ePa) {
        AQa.a(ePa, "other is null");
        return a((EPa<? extends T>) this, ePa);
    }

    public final APa<T> a(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, C6645iVa.a());
    }

    public final APa<T> a(long j, TimeUnit timeUnit, HPa hPa) {
        AQa.a(timeUnit, "unit is null");
        AQa.a(hPa, "scheduler is null");
        C7189qSa qsa = new C7189qSa(this, j, timeUnit, hPa);
        return WUa.a((APa<T>) qsa);
    }

    public final APa<T> a(C6572hQa<? super T, ? super T> hqa) {
        AQa.a(hqa, "comparer is null");
        return WUa.a((APa<T>) new C7327sSa<T>(this, C7808zQa.c(), hqa));
    }

    public final APa<T> a(C6776kQa<? super T> kqa) {
        AQa.a(kqa, "onAfterNext is null");
        return WUa.a((APa<T>) new C7396tSa<T>(this, kqa));
    }

    public final APa<T> a(C6368eQa eqa) {
        return a(C7808zQa.b(), C7808zQa.b(), eqa, C7808zQa.c);
    }

    private APa<T> a(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6368eQa eqa2) {
        AQa.a(kqa, "onNext is null");
        AQa.a(kqa2, "onError is null");
        AQa.a(eqa, "onComplete is null");
        AQa.a(eqa2, "onAfterTerminate is null");
        C7465uSa usa = new C7465uSa(this, kqa, kqa2, eqa, eqa2);
        return WUa.a((APa<T>) usa);
    }

    public final APa<T> a(C6776kQa<? super VPa> kqa, C6368eQa eqa) {
        AQa.a(kqa, "onSubscribe is null");
        AQa.a(eqa, "onDispose is null");
        return WUa.a((APa<T>) new C7534vSa<T>(this, kqa, eqa));
    }

    public final C7531vPa<T> a(long j) {
        if (j >= 0) {
            return WUa.a((C7531vPa<T>) new C7672xSa<T>(this, j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final IPa<T> a(long j, T t) {
        if (j >= 0) {
            AQa.a(t, "defaultItem is null");
            return WUa.a((IPa<T>) new C7741ySa<T>(this, j, t));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index >= 0 required but it was ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final APa<T> a(C7256rQa<? super T> rqa) {
        AQa.a(rqa, "predicate is null");
        return WUa.a((APa<T>) new BSa<T>(this, rqa));
    }

    public final <R> APa<R> a(C7118pQa<? super T, ? extends EPa<? extends R>> pqa, boolean z) {
        return a(pqa, z, (int) BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final <R> APa<R> a(C7118pQa<? super T, ? extends EPa<? extends R>> pqa, boolean z, int i) {
        return a(pqa, z, i, b());
    }

    public final <R> APa<R> a(C7118pQa<? super T, ? extends EPa<? extends R>> pqa, boolean z, int i, int i2) {
        AQa.a(pqa, "mapper is null");
        AQa.a(i, "maxConcurrency");
        AQa.a(i2, "bufferSize");
        if (this instanceof LQa) {
            Object call = ((LQa) this).call();
            if (call == null) {
                return e();
            }
            return C6371eTa.a(call, pqa);
        }
        CSa cSa = new CSa(this, pqa, z, i, i2);
        return WUa.a((APa<T>) cSa);
    }

    public final <R> APa<R> a(DPa<? extends R, ? super T> dPa) {
        AQa.a(dPa, "lifter is null");
        return WUa.a((APa<T>) new TSa<T>(this, dPa));
    }

    public final APa<T> a(HPa hPa) {
        return a(hPa, false, b());
    }

    public final APa<T> a(HPa hPa, boolean z, int i) {
        AQa.a(hPa, "scheduler is null");
        AQa.a(i, "bufferSize");
        return WUa.a((APa<T>) new XSa<T>(this, hPa, z, i));
    }

    public final C7531vPa<T> a(C6504gQa<T, T, T> gqa) {
        AQa.a(gqa, "reducer is null");
        return WUa.a((C7531vPa<T>) new C5571aTa<T>(this, gqa));
    }

    public final <R> IPa<R> a(R r, C6504gQa<R, ? super T, R> gqa) {
        AQa.a(r, "seed is null");
        AQa.a(gqa, "reducer is null");
        return WUa.a((IPa<T>) new C5639bTa<T>(this, r, gqa));
    }

    public final <R> APa<R> a(Callable<R> callable, C6504gQa<R, ? super T, R> gqa) {
        AQa.a(callable, "seedSupplier is null");
        AQa.a(gqa, "accumulator is null");
        return WUa.a((APa<T>) new C6507gTa<T>(this, callable, gqa));
    }

    public final VPa a(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa) {
        return a(kqa, kqa2, eqa, C7808zQa.b());
    }

    public final VPa a(C6776kQa<? super T> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6776kQa<? super VPa> kqa3) {
        AQa.a(kqa, "onNext is null");
        AQa.a(kqa2, "onError is null");
        AQa.a(eqa, "onComplete is null");
        AQa.a(kqa3, "onSubscribe is null");
        ZQa zQa = new ZQa(kqa, kqa2, eqa, kqa3);
        a((GPa<? super T>) zQa);
        return zQa;
    }

    public final void a(GPa<? super T> gPa) {
        AQa.a(gPa, "observer is null");
        try {
            GPa a = WUa.a(this, gPa);
            AQa.a(a, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C7393tPa<T> a(C6911mPa mpa) {
        C7533vRa vra = new C7533vRa(this);
        int i = C7807zPa.a[mpa.ordinal()];
        if (i == 1) {
            return vra.c();
        }
        if (i == 2) {
            return vra.d();
        }
        if (i == 3) {
            return vra;
        }
        if (i != 4) {
            return vra.b();
        }
        return WUa.a((C7393tPa<T>) new C7740yRa<T>(vra));
    }

    public final <U, R> APa<R> a(EPa<? extends U> ePa, C6504gQa<? super T, ? super U, ? extends R> gqa) {
        AQa.a(ePa, "other is null");
        AQa.a(gqa, "combiner is null");
        return WUa.a((APa<T>) new C7328sTa<T>(this, gqa, ePa));
    }
}
