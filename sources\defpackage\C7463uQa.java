package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uQa reason: default package and case insensitive filesystem */
/* compiled from: DisposableHelper */
public enum C7463uQa implements VPa {
    DISPOSED;

    public static boolean a(VPa vPa) {
        return vPa == DISPOSED;
    }

    public static boolean b(AtomicReference<VPa> atomicReference, VPa vPa) {
        VPa vPa2;
        do {
            vPa2 = (VPa) atomicReference.get();
            if (vPa2 == DISPOSED) {
                if (vPa != null) {
                    vPa.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(vPa2, vPa));
        if (vPa2 != null) {
            vPa2.dispose();
        }
        return true;
    }

    public static boolean c(AtomicReference<VPa> atomicReference, VPa vPa) {
        AQa.a(vPa, "d is null");
        if (atomicReference.compareAndSet(null, vPa)) {
            return true;
        }
        vPa.dispose();
        if (atomicReference.get() != DISPOSED) {
            b();
        }
        return false;
    }

    public boolean a() {
        return true;
    }

    public void dispose() {
    }

    public static boolean a(AtomicReference<VPa> atomicReference, VPa vPa) {
        VPa vPa2;
        do {
            vPa2 = (VPa) atomicReference.get();
            if (vPa2 == DISPOSED) {
                if (vPa != null) {
                    vPa.dispose();
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(vPa2, vPa));
        return true;
    }

    public static boolean a(AtomicReference<VPa> atomicReference) {
        VPa vPa = (VPa) atomicReference.get();
        C7463uQa uqa = DISPOSED;
        if (vPa != uqa) {
            VPa vPa2 = (VPa) atomicReference.getAndSet(uqa);
            if (vPa2 != uqa) {
                if (vPa2 != null) {
                    vPa2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public static void b() {
        WUa.b((Throwable) new C5704cQa("Disposable already set!"));
    }

    public static boolean a(VPa vPa, VPa vPa2) {
        if (vPa2 == null) {
            WUa.b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (vPa == null) {
            return true;
        } else {
            vPa2.dispose();
            b();
            return false;
        }
    }
}
