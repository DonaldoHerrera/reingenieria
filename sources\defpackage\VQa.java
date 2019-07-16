package defpackage;

/* renamed from: VQa reason: default package */
/* compiled from: DisposableLambdaObserver */
public final class VQa<T> implements GPa<T>, VPa {
    final GPa<? super T> a;
    final C6776kQa<? super VPa> b;
    final C6368eQa c;
    VPa d;

    public VQa(GPa<? super T> gPa, C6776kQa<? super VPa> kqa, C6368eQa eqa) {
        this.a = gPa;
        this.b = kqa;
        this.c = eqa;
    }

    public void a(VPa vPa) {
        try {
            this.b.accept(vPa);
            if (C7463uQa.a(this.d, vPa)) {
                this.d = vPa;
                this.a.a((VPa) this);
            }
        } catch (Throwable th) {
            _Pa.b(th);
            vPa.dispose();
            this.d = C7463uQa.DISPOSED;
            C7532vQa.a(th, this.a);
        }
    }

    public void dispose() {
        VPa vPa = this.d;
        C7463uQa uqa = C7463uQa.DISPOSED;
        if (vPa != uqa) {
            this.d = uqa;
            try {
                this.c.run();
            } catch (Throwable th) {
                _Pa.b(th);
                WUa.b(th);
            }
            vPa.dispose();
        }
    }

    public void onComplete() {
        VPa vPa = this.d;
        C7463uQa uqa = C7463uQa.DISPOSED;
        if (vPa != uqa) {
            this.d = uqa;
            this.a.onComplete();
        }
    }

    public void a(T t) {
        this.a.a(t);
    }

    public void a(Throwable th) {
        VPa vPa = this.d;
        C7463uQa uqa = C7463uQa.DISPOSED;
        if (vPa != uqa) {
            this.d = uqa;
            this.a.a(th);
            return;
        }
        WUa.b(th);
    }

    public boolean a() {
        return this.d.a();
    }
}
