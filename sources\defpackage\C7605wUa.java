package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wUa reason: default package and case insensitive filesystem */
/* compiled from: SubscriptionHelper */
public enum C7605wUa implements C5619bBb {
    CANCELLED;

    public static boolean a(C5619bBb bbb, C5619bBb bbb2) {
        if (bbb2 == null) {
            WUa.b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (bbb == null) {
            return true;
        } else {
            bbb2.cancel();
            a();
            return false;
        }
    }

    public static boolean b(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("n > 0 required but it was ");
        sb.append(j);
        WUa.b((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    public void a(long j) {
    }

    public void cancel() {
    }

    public static void a() {
        WUa.b((Throwable) new C5704cQa("Subscription already set!"));
    }

    public static boolean a(AtomicReference<C5619bBb> atomicReference, C5619bBb bbb) {
        AQa.a(bbb, "s is null");
        if (atomicReference.compareAndSet(null, bbb)) {
            return true;
        }
        bbb.cancel();
        if (atomicReference.get() != CANCELLED) {
            a();
        }
        return false;
    }

    public static boolean a(AtomicReference<C5619bBb> atomicReference) {
        C5619bBb bbb = (C5619bBb) atomicReference.get();
        C7605wUa wua = CANCELLED;
        if (bbb != wua) {
            C5619bBb bbb2 = (C5619bBb) atomicReference.getAndSet(wua);
            if (bbb2 != CANCELLED) {
                if (bbb2 != null) {
                    bbb2.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(AtomicReference<C5619bBb> atomicReference, AtomicLong atomicLong, C5619bBb bbb) {
        if (!a(atomicReference, bbb)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            bbb.a(andSet);
        }
        return true;
    }

    public static void a(AtomicReference<C5619bBb> atomicReference, AtomicLong atomicLong, long j) {
        C5619bBb bbb = (C5619bBb) atomicReference.get();
        if (bbb != null) {
            bbb.a(j);
        } else if (b(j)) {
            C7812zUa.a(atomicLong, j);
            C5619bBb bbb2 = (C5619bBb) atomicReference.get();
            if (bbb2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    bbb2.a(andSet);
                }
            }
        }
    }
}
