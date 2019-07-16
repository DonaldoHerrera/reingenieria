package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: SQa reason: default package */
/* compiled from: CallbackCompletableObserver */
public final class SQa extends AtomicReference<VPa> implements C7117pPa, VPa, C6776kQa<Throwable>, PUa {
    final C6776kQa<? super Throwable> a;
    final C6368eQa b;

    public SQa(C6368eQa eqa) {
        this.a = this;
        this.b = eqa;
    }

    public void a(Throwable th) {
        try {
            this.a.accept(th);
        } catch (Throwable th2) {
            _Pa.b(th2);
            WUa.b(th2);
        }
        lazySet(C7463uQa.DISPOSED);
    }

    /* renamed from: b */
    public void accept(Throwable th) {
        WUa.b((Throwable) new C5636bQa(th));
    }

    public void dispose() {
        C7463uQa.a((AtomicReference<VPa>) this);
    }

    public void onComplete() {
        try {
            this.b.run();
        } catch (Throwable th) {
            _Pa.b(th);
            WUa.b(th);
        }
        lazySet(C7463uQa.DISPOSED);
    }

    public SQa(C6776kQa<? super Throwable> kqa, C6368eQa eqa) {
        this.a = kqa;
        this.b = eqa;
    }

    public void a(VPa vPa) {
        C7463uQa.c(this, vPa);
    }

    public boolean a() {
        return get() == C7463uQa.DISPOSED;
    }
}
