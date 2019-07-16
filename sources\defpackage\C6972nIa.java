package defpackage;

import java.io.InterruptedIOException;

/* renamed from: nIa reason: default package and case insensitive filesystem */
/* compiled from: ErrorExtensions.kt */
public final class C6972nIa {
    public static final boolean a(Throwable th) {
        C7471uYa.b(th, "$this$isApiRequestValidationError");
        return (th instanceof ifa) && ((ifa) th).h();
    }

    public static final boolean b(Throwable th) {
        C7471uYa.b(th, "$this$isAuthError");
        return ((th instanceof ifa) && ((ifa) th).b()) || ((th instanceof Oda) && b(((Oda) th).getCause()));
    }

    public static final boolean c(Throwable th) {
        C7471uYa.b(th, "$this$isCausedByOutOfMemoryError");
        return C7316sHa.g(th);
    }

    public static final boolean d(Throwable th) {
        C7471uYa.b(th, "$this$isCommonRequestError");
        return f(th) || b(th) || j(th) || h(th) || i(th);
    }

    public static final boolean e(Throwable th) {
        C7471uYa.b(th, "$this$isInterruptedCause");
        if (th.getCause() != null) {
            Throwable cause = th.getCause();
            Throwable th2 = null;
            if ((cause != null ? cause.getCause() : null) != null) {
                Throwable cause2 = th.getCause();
                if (cause2 != null) {
                    th2 = cause2.getCause();
                }
                if (th2 instanceof InterruptedIOException) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean f(Throwable th) {
        C7471uYa.b(th, "$this$isNetworkError");
        return ((th instanceof ifa) && ((ifa) th).c()) || ((th instanceof Jda) && f(((Jda) th).getCause()));
    }

    public static final boolean g(Throwable th) {
        C7471uYa.b(th, "$this$isNotAllowedError");
        return ((th instanceof ifa) && ((ifa) th).d()) || ((th instanceof Oda) && g(((Oda) th).getCause()));
    }

    public static final boolean h(Throwable th) {
        C7471uYa.b(th, "$this$isNotFoundError");
        return ((th instanceof ifa) && ((ifa) th).e()) || ((th instanceof Oda) && h(((Oda) th).getCause()));
    }

    public static final boolean i(Throwable th) {
        C7471uYa.b(th, "$this$isRateLimitedError");
        return ((th instanceof ifa) && ((ifa) th).f()) || ((th instanceof Oda) && i(((Oda) th).getCause()));
    }

    public static final boolean j(Throwable th) {
        C7471uYa.b(th, "$this$isServerError");
        return ((th instanceof ifa) && ((ifa) th).g()) || ((th instanceof Oda) && j(((Oda) th).getCause()));
    }

    public static final boolean k(Throwable th) {
        C7471uYa.b(th, "$this$isUndeliverableException");
        return th instanceof C6300dQa;
    }
}
