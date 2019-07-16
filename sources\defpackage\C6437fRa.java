package defpackage;

/* renamed from: fRa reason: default package and case insensitive filesystem */
/* compiled from: CompletableFromAction */
public final class C6437fRa extends C6979nPa {
    final C6368eQa a;

    public C6437fRa(C6368eQa eqa) {
        this.a = eqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        VPa b = WPa.b();
        ppa.a(b);
        try {
            this.a.run();
            if (!b.a()) {
                ppa.onComplete();
            }
        } catch (Throwable th) {
            _Pa.b(th);
            if (!b.a()) {
                ppa.a(th);
            } else {
                WUa.b(th);
            }
        }
    }
}
