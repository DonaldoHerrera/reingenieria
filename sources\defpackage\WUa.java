package defpackage;

import java.util.concurrent.Callable;

/* renamed from: WUa reason: default package */
/* compiled from: RxJavaPlugins */
public final class WUa {
    static volatile C6776kQa<? super Throwable> a;
    static volatile C7118pQa<? super Runnable, ? extends Runnable> b;
    static volatile C7118pQa<? super Callable<HPa>, ? extends HPa> c;
    static volatile C7118pQa<? super Callable<HPa>, ? extends HPa> d;
    static volatile C7118pQa<? super Callable<HPa>, ? extends HPa> e;
    static volatile C7118pQa<? super Callable<HPa>, ? extends HPa> f;
    static volatile C7118pQa<? super HPa, ? extends HPa> g;
    static volatile C7118pQa<? super HPa, ? extends HPa> h;
    static volatile C7118pQa<? super HPa, ? extends HPa> i;
    static volatile C7118pQa<? super C7393tPa, ? extends C7393tPa> j;
    static volatile C7118pQa<? super APa, ? extends APa> k;
    static volatile C7118pQa<? super LUa, ? extends LUa> l;
    static volatile C7118pQa<? super C7531vPa, ? extends C7531vPa> m;
    static volatile C7118pQa<? super IPa, ? extends IPa> n;
    static volatile C7118pQa<? super C6979nPa, ? extends C6979nPa> o;
    static volatile C6504gQa<? super C7393tPa, ? super C5551aBb, ? extends C5551aBb> p;
    static volatile C6504gQa<? super C7531vPa, ? super C7600wPa, ? extends C7600wPa> q;
    static volatile C6504gQa<? super APa, ? super GPa, ? extends GPa> r;
    static volatile C6504gQa<? super IPa, ? super KPa, ? extends KPa> s;
    static volatile C6504gQa<? super C6979nPa, ? super C7117pPa, ? extends C7117pPa> t;
    static volatile C6640iQa u;
    static volatile boolean v;
    static volatile boolean w;

    public static boolean a() {
        return w;
    }

    public static HPa b(Callable<HPa> callable) {
        AQa.a(callable, "Scheduler Callable can't be null");
        C7118pQa<? super Callable<HPa>, ? extends HPa> pqa = c;
        if (pqa == null) {
            return a(callable);
        }
        return a(pqa, callable);
    }

    public static HPa c(Callable<HPa> callable) {
        AQa.a(callable, "Scheduler Callable can't be null");
        C7118pQa<? super Callable<HPa>, ? extends HPa> pqa = e;
        if (pqa == null) {
            return a(callable);
        }
        return a(pqa, callable);
    }

    public static HPa d(Callable<HPa> callable) {
        AQa.a(callable, "Scheduler Callable can't be null");
        C7118pQa<? super Callable<HPa>, ? extends HPa> pqa = f;
        if (pqa == null) {
            return a(callable);
        }
        return a(pqa, callable);
    }

    public static HPa e(Callable<HPa> callable) {
        AQa.a(callable, "Scheduler Callable can't be null");
        C7118pQa<? super Callable<HPa>, ? extends HPa> pqa = d;
        if (pqa == null) {
            return a(callable);
        }
        return a(pqa, callable);
    }

    public static HPa a(HPa hPa) {
        C7118pQa<? super HPa, ? extends HPa> pqa = g;
        if (pqa == null) {
            return hPa;
        }
        return (HPa) a(pqa, (T) hPa);
    }

    static boolean a(Throwable th) {
        if (!(th instanceof C5636bQa) && !(th instanceof C5568aQa) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof ZPa)) {
            return false;
        }
        return true;
    }

    public static void b(Throwable th) {
        C6776kQa<? super Throwable> kqa = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!a(th)) {
            th = new C6300dQa(th);
        }
        if (kqa != null) {
            try {
                kqa.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                c(th2);
            }
        }
        th.printStackTrace();
        c(th);
    }

    static void c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static HPa c(HPa hPa) {
        C7118pQa<? super HPa, ? extends HPa> pqa = h;
        if (pqa == null) {
            return hPa;
        }
        return (HPa) a(pqa, (T) hPa);
    }

    public static Runnable a(Runnable runnable) {
        AQa.a(runnable, "run is null");
        C7118pQa<? super Runnable, ? extends Runnable> pqa = b;
        if (pqa == null) {
            return runnable;
        }
        return (Runnable) a(pqa, (T) runnable);
    }

    public static void a(C6776kQa<? super Throwable> kqa) {
        if (!v) {
            a = kqa;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static HPa b(HPa hPa) {
        C7118pQa<? super HPa, ? extends HPa> pqa = i;
        if (pqa == null) {
            return hPa;
        }
        return (HPa) a(pqa, (T) hPa);
    }

    public static <T> C5551aBb<? super T> a(C7393tPa<T> tpa, C5551aBb<? super T> abb) {
        C6504gQa<? super C7393tPa, ? super C5551aBb, ? extends C5551aBb> gqa = p;
        return gqa != null ? (C5551aBb) a(gqa, tpa, abb) : abb;
    }

    public static boolean b() {
        C6640iQa iqa = u;
        if (iqa == null) {
            return false;
        }
        try {
            return iqa.getAsBoolean();
        } catch (Throwable th) {
            throw EUa.a(th);
        }
    }

    public static <T> GPa<? super T> a(APa<T> aPa, GPa<? super T> gPa) {
        C6504gQa<? super APa, ? super GPa, ? extends GPa> gqa = r;
        return gqa != null ? (GPa) a(gqa, aPa, gPa) : gPa;
    }

    public static <T> KPa<? super T> a(IPa<T> iPa, KPa<? super T> kPa) {
        C6504gQa<? super IPa, ? super KPa, ? extends KPa> gqa = s;
        return gqa != null ? (KPa) a(gqa, iPa, kPa) : kPa;
    }

    public static C7117pPa a(C6979nPa npa, C7117pPa ppa) {
        C6504gQa<? super C6979nPa, ? super C7117pPa, ? extends C7117pPa> gqa = t;
        return gqa != null ? (C7117pPa) a(gqa, npa, ppa) : ppa;
    }

    public static <T> C7600wPa<? super T> a(C7531vPa<T> vpa, C7600wPa<? super T> wpa) {
        C6504gQa<? super C7531vPa, ? super C7600wPa, ? extends C7600wPa> gqa = q;
        return gqa != null ? (C7600wPa) a(gqa, vpa, wpa) : wpa;
    }

    public static <T> C7531vPa<T> a(C7531vPa<T> vpa) {
        C7118pQa<? super C7531vPa, ? extends C7531vPa> pqa = m;
        return pqa != null ? (C7531vPa) a(pqa, (T) vpa) : vpa;
    }

    public static <T> C7393tPa<T> a(C7393tPa<T> tpa) {
        C7118pQa<? super C7393tPa, ? extends C7393tPa> pqa = j;
        return pqa != null ? (C7393tPa) a(pqa, (T) tpa) : tpa;
    }

    public static <T> APa<T> a(APa<T> aPa) {
        C7118pQa<? super APa, ? extends APa> pqa = k;
        return pqa != null ? (APa) a(pqa, (T) aPa) : aPa;
    }

    public static <T> LUa<T> a(LUa<T> lUa) {
        C7118pQa<? super LUa, ? extends LUa> pqa = l;
        return pqa != null ? (LUa) a(pqa, (T) lUa) : lUa;
    }

    public static <T> IPa<T> a(IPa<T> iPa) {
        C7118pQa<? super IPa, ? extends IPa> pqa = n;
        return pqa != null ? (IPa) a(pqa, (T) iPa) : iPa;
    }

    public static C6979nPa a(C6979nPa npa) {
        C7118pQa<? super C6979nPa, ? extends C6979nPa> pqa = o;
        return pqa != null ? (C6979nPa) a(pqa, (T) npa) : npa;
    }

    static <T, R> R a(C7118pQa<T, R> pqa, T t2) {
        try {
            return pqa.apply(t2);
        } catch (Throwable th) {
            throw EUa.a(th);
        }
    }

    static <T, U, R> R a(C6504gQa<T, U, R> gqa, T t2, U u2) {
        try {
            return gqa.apply(t2, u2);
        } catch (Throwable th) {
            throw EUa.a(th);
        }
    }

    static HPa a(Callable<HPa> callable) {
        try {
            Object call = callable.call();
            AQa.a(call, "Scheduler Callable result can't be null");
            return (HPa) call;
        } catch (Throwable th) {
            throw EUa.a(th);
        }
    }

    static HPa a(C7118pQa<? super Callable<HPa>, ? extends HPa> pqa, Callable<HPa> callable) {
        Object a2 = a(pqa, (T) callable);
        AQa.a(a2, "Scheduler Callable result can't be null");
        return (HPa) a2;
    }
}
