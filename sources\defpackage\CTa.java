package defpackage;

/* renamed from: CTa reason: default package */
/* compiled from: SingleDoOnSubscribe */
public final class CTa<T> extends IPa<T> {
    final MPa<T> a;
    final C6776kQa<? super VPa> b;

    /* renamed from: CTa$a */
    /* compiled from: SingleDoOnSubscribe */
    static final class a<T> implements KPa<T> {
        final KPa<? super T> a;
        final C6776kQa<? super VPa> b;
        boolean c;

        a(KPa<? super T> kPa, C6776kQa<? super VPa> kqa) {
            this.a = kPa;
            this.b = kqa;
        }

        public void a(VPa vPa) {
            try {
                this.b.accept(vPa);
                this.a.a(vPa);
            } catch (Throwable th) {
                _Pa.b(th);
                this.c = true;
                vPa.dispose();
                C7532vQa.a(th, this.a);
            }
        }

        public void onSuccess(T t) {
            if (!this.c) {
                this.a.onSuccess(t);
            }
        }

        public void a(Throwable th) {
            if (this.c) {
                WUa.b(th);
            } else {
                this.a.a(th);
            }
        }
    }

    public CTa(MPa<T> mPa, C6776kQa<? super VPa> kqa) {
        this.a = mPa;
        this.b = kqa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
