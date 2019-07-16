package defpackage;

/* renamed from: mRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableOnErrorComplete */
public final class C6913mRa extends C6979nPa {
    final C7255rPa a;
    final C7256rQa<? super Throwable> b;

    /* renamed from: mRa$a */
    /* compiled from: CompletableOnErrorComplete */
    final class a implements C7117pPa {
        private final C7117pPa a;

        a(C7117pPa ppa) {
            this.a = ppa;
        }

        public void a(Throwable th) {
            try {
                if (C6913mRa.this.b.test(th)) {
                    this.a.onComplete();
                } else {
                    this.a.a(th);
                }
            } catch (Throwable th2) {
                _Pa.b(th2);
                this.a.a((Throwable) new ZPa(th, th2));
            }
        }

        public void onComplete() {
            this.a.onComplete();
        }

        public void a(VPa vPa) {
            this.a.a(vPa);
        }
    }

    public C6913mRa(C7255rPa rpa, C7256rQa<? super Throwable> rqa) {
        this.a = rpa;
        this.b = rqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa));
    }
}
