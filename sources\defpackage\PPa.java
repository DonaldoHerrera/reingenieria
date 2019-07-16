package defpackage;

import java.util.concurrent.Callable;

/* renamed from: PPa reason: default package */
/* compiled from: RxAndroidPlugins */
public final class PPa {
    private static volatile C7118pQa<Callable<HPa>, HPa> a;
    private static volatile C7118pQa<HPa, HPa> b;

    public static void a(C7118pQa<Callable<HPa>, HPa> pqa) {
        a = pqa;
    }

    public static HPa b(Callable<HPa> callable) {
        if (callable != null) {
            C7118pQa<Callable<HPa>, HPa> pqa = a;
            if (pqa == null) {
                return a(callable);
            }
            return a(pqa, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    public static HPa a(HPa hPa) {
        if (hPa != null) {
            C7118pQa<HPa, HPa> pqa = b;
            if (pqa == null) {
                return hPa;
            }
            return (HPa) a(pqa, (T) hPa);
        }
        throw new NullPointerException("scheduler == null");
    }

    static HPa a(Callable<HPa> callable) {
        try {
            HPa hPa = (HPa) callable.call();
            if (hPa != null) {
                return hPa;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            _Pa.a(th);
            throw null;
        }
    }

    static HPa a(C7118pQa<Callable<HPa>, HPa> pqa, Callable<HPa> callable) {
        HPa hPa = (HPa) a(pqa, (T) callable);
        if (hPa != null) {
            return hPa;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static <T, R> R a(C7118pQa<T, R> pqa, T t) {
        try {
            return pqa.apply(t);
        } catch (Throwable th) {
            _Pa.a(th);
            throw null;
        }
    }
}
