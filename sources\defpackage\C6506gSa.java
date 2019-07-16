package defpackage;

import java.util.concurrent.Callable;

/* renamed from: gSa reason: default package and case insensitive filesystem */
/* compiled from: ScalarXMapZHelper */
final class C6506gSa {
    static <T> boolean a(Object obj, C7118pQa<? super T, ? extends C7255rPa> pqa, C7117pPa ppa) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C7255rPa rpa = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = pqa.apply(call);
                AQa.a(apply, "The mapper returned a null CompletableSource");
                rpa = (C7255rPa) apply;
            }
            if (rpa == null) {
                C7532vQa.a(ppa);
            } else {
                rpa.a(ppa);
            }
            return true;
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, ppa);
            return true;
        }
    }

    static <T, R> boolean a(Object obj, C7118pQa<? super T, ? extends MPa<? extends R>> pqa, GPa<? super R> gPa) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        MPa mPa = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = pqa.apply(call);
                AQa.a(apply, "The mapper returned a null SingleSource");
                mPa = (MPa) apply;
            }
            if (mPa == null) {
                C7532vQa.a(gPa);
            } else {
                mPa.a(VTa.d(gPa));
            }
            return true;
        } catch (Throwable th) {
            _Pa.b(th);
            C7532vQa.a(th, gPa);
            return true;
        }
    }
}
