package defpackage;

/* renamed from: hRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableFromSingle */
public final class C6573hRa<T> extends C6979nPa {
    final MPa<T> a;

    /* renamed from: hRa$a */
    /* compiled from: CompletableFromSingle */
    static final class a<T> implements KPa<T> {
        final C7117pPa a;

        a(C7117pPa ppa) {
            this.a = ppa;
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        public void onSuccess(T t) {
            this.a.onComplete();
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }
    }

    public C6573hRa(MPa<T> mPa) {
        this.a = mPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa));
    }
}
