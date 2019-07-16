package defpackage;

/* renamed from: nRa reason: default package and case insensitive filesystem */
/* compiled from: CompletablePeek */
public final class C6981nRa extends C6979nPa {
    final C7255rPa a;
    final C6776kQa<? super VPa> b;
    final C6776kQa<? super Throwable> c;
    final C6368eQa d;
    final C6368eQa e;
    final C6368eQa f;
    final C6368eQa g;

    /* renamed from: nRa$a */
    /* compiled from: CompletablePeek */
    final class a implements C7117pPa, VPa {
        final C7117pPa a;
        VPa b;

        a(C7117pPa ppa) {
            this.a = ppa;
        }

        public void a(VPa vPa) {
            try {
                C6981nRa.this.b.accept(vPa);
                if (C7463uQa.a(this.b, vPa)) {
                    this.b = vPa;
                    this.a.a((VPa) this);
                }
            } catch (Throwable th) {
                _Pa.b(th);
                vPa.dispose();
                this.b = C7463uQa.DISPOSED;
                C7532vQa.a(th, this.a);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            try {
                C6981nRa.this.f.run();
            } catch (Throwable th) {
                _Pa.b(th);
                WUa.b(th);
            }
        }

        public void dispose() {
            try {
                C6981nRa.this.g.run();
            } catch (Throwable th) {
                _Pa.b(th);
                WUa.b(th);
            }
            this.b.dispose();
        }

        public void onComplete() {
            if (this.b != C7463uQa.DISPOSED) {
                try {
                    C6981nRa.this.d.run();
                    C6981nRa.this.e.run();
                    this.a.onComplete();
                    b();
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.a.a(th);
                }
            }
        }

        public void a(Throwable th) {
            if (this.b == C7463uQa.DISPOSED) {
                WUa.b(th);
                return;
            }
            try {
                C6981nRa.this.c.accept(th);
                C6981nRa.this.e.run();
            } catch (Throwable th2) {
                _Pa.b(th2);
                th = new ZPa(th, th2);
            }
            this.a.a(th);
            b();
        }

        public boolean a() {
            return this.b.a();
        }
    }

    public C6981nRa(C7255rPa rpa, C6776kQa<? super VPa> kqa, C6776kQa<? super Throwable> kqa2, C6368eQa eqa, C6368eQa eqa2, C6368eQa eqa3, C6368eQa eqa4) {
        this.a = rpa;
        this.b = kqa;
        this.c = kqa2;
        this.d = eqa;
        this.e = eqa2;
        this.f = eqa3;
        this.g = eqa4;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa));
    }
}
