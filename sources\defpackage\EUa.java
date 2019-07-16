package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: EUa reason: default package */
/* compiled from: ExceptionHelper */
public final class EUa {
    public static final Throwable a = new a();

    /* renamed from: EUa$a */
    /* compiled from: ExceptionHelper */
    static final class a extends Throwable {
        a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static <T> boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new ZPa(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    public static <T> Throwable a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static String a(long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder();
        sb.append("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }
}
