package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ARa reason: default package */
/* compiled from: FlowableScalarXMap */
public final class ARa {
    public static <T, R> boolean a(_Ab<T> _ab, C5551aBb<? super R> abb, C7118pQa<? super T, ? extends _Ab<? extends R>> pqa) {
        if (!(_ab instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) _ab).call();
            if (call == null) {
                C7467uUa.a(abb);
                return true;
            }
            try {
                Object apply = pqa.apply(call);
                AQa.a(apply, "The mapper returned a null Publisher");
                _Ab _ab2 = (_Ab) apply;
                if (_ab2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) _ab2).call();
                        if (call2 == null) {
                            C7467uUa.a(abb);
                            return true;
                        }
                        abb.a((C5619bBb) new C7536vUa(abb, call2));
                    } catch (Throwable th) {
                        _Pa.b(th);
                        C7467uUa.a(th, abb);
                        return true;
                    }
                } else {
                    _ab2.a(abb);
                }
                return true;
            } catch (Throwable th2) {
                _Pa.b(th2);
                C7467uUa.a(th2, abb);
                return true;
            }
        } catch (Throwable th3) {
            _Pa.b(th3);
            C7467uUa.a(th3, abb);
            return true;
        }
    }
}
