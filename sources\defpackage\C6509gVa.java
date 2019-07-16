package defpackage;

/* renamed from: gVa reason: default package and case insensitive filesystem */
/* compiled from: subscribers.kt */
public final class C6509gVa {
    private static final _Xa<Object, RVa> a = C6305dVa.a;
    private static final _Xa<Throwable, RVa> b = C5709cVa.a;
    private static final PXa<RVa> c = C5641bVa.a;

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [fVa] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    private static final <T> C6776kQa<T> a(_Xa<? super T, RVa> _xa) {
        if (_xa == a) {
            C6776kQa<T> b2 = C7808zQa.b();
            C7471uYa.a((Object) b2, "Functions.emptyConsumer()");
            return b2;
        }
        if (_xa != 0) {
            _xa = new C6441fVa<>(_xa);
        }
        return (C6776kQa) _xa;
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [fVa] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    private static final C6776kQa<Throwable> b(_Xa<? super Throwable, RVa> _xa) {
        if (_xa == b) {
            C6776kQa<Throwable> kqa = C7808zQa.f;
            C7471uYa.a((Object) kqa, "Functions.ON_ERROR_MISSING");
            return kqa;
        }
        if (_xa != 0) {
            _xa = new C6441fVa<>(_xa);
        }
        return (C6776kQa) _xa;
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v1, types: [eVa] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    private static final C6368eQa a(PXa<RVa> pXa) {
        if (pXa == c) {
            C6368eQa eqa = C7808zQa.c;
            C7471uYa.a((Object) eqa, "Functions.EMPTY_ACTION");
            return eqa;
        }
        if (pXa != null) {
            pXa = new C6373eVa<>(pXa);
        }
        return (C6368eQa) pXa;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=PXa, code=PXa<RVa>, for r2v0, types: [PXa] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=_Xa, code=_Xa<java.lang.Object, RVa>, for r3v0, types: [_Xa] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=_Xa, code=_Xa<java.lang.Throwable, RVa>, for r1v0, types: [_Xa] */
    public static /* bridge */ /* synthetic */ VPa a(APa aPa, _Xa<Throwable, RVa> _xa, PXa<RVa> pXa, _Xa<Object, RVa> _xa2, int i, Object obj) {
        if ((i & 1) != 0) {
            _xa = b;
        }
        if ((i & 2) != 0) {
            pXa = c;
        }
        if ((i & 4) != 0) {
            _xa2 = a;
        }
        return a(aPa, _xa, pXa, _xa2);
    }

    public static final <T> VPa a(APa<T> aPa, _Xa<? super Throwable, RVa> _xa, PXa<RVa> pXa, _Xa<? super T, RVa> _xa2) {
        C7471uYa.b(aPa, "$receiver");
        C7471uYa.b(_xa, "onError");
        C7471uYa.b(pXa, "onComplete");
        C7471uYa.b(_xa2, "onNext");
        VPa a2 = aPa.a(a(_xa2), b(_xa), a(pXa));
        C7471uYa.a((Object) a2, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return a2;
    }
}
