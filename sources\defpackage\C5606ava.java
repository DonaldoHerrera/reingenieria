package defpackage;

/* renamed from: ava reason: default package and case insensitive filesystem */
/* compiled from: ObserverFactory.kt */
public class C5606ava {
    private final C3472WY a;

    public C5606ava(C3472WY wy) {
        C7471uYa.b(wy, "legacyThrowableHandler");
        this.a = wy;
    }

    public static /* synthetic */ QUa a(C5606ava ava, PXa pXa, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                pXa = C5280Rua.a;
            }
            return ava.a(pXa);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completableObserver");
    }

    public QUa a() {
        return a(this, (PXa) null, 1, (Object) null);
    }

    public C3472WY b() {
        return this.a;
    }

    public <T> TUa<T> c(_Xa<? super T, RVa> _xa) {
        C7471uYa.b(_xa, "consumer");
        return new C5542_ua(this, _xa, new C3466UY());
    }

    public static /* synthetic */ TUa b(C5606ava ava, _Xa _xa, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                _xa = C5513Zua.a;
            }
            return ava.c(_xa);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: singleObserver");
    }

    public QUa a(PXa<RVa> pXa) {
        C7471uYa.b(pXa, "action");
        return new C5310Sua(this, new C3466UY(), pXa);
    }

    public <T> SUa<T> b(_Xa<? super T, RVa> _xa) {
        C7471uYa.b(_xa, "consumer");
        return new C5484Yua(this, new C3466UY(), _xa);
    }

    public <T> RUa<T> a(_Xa<? super T, RVa> _xa) {
        C7471uYa.b(_xa, "consumer");
        return new C5426Wua(this, new C3466UY(), _xa);
    }

    public static /* synthetic */ SUa a(C5606ava ava, _Xa _xa, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                _xa = C5455Xua.a;
            }
            return ava.b(_xa);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observer");
    }
}
