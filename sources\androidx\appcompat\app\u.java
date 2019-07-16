package androidx.appcompat.app;

/* compiled from: AppCompatDelegateImpl */
class u implements Runnable {
    final /* synthetic */ w a;

    u(w wVar) {
        this.a = wVar;
    }

    public void run() {
        w wVar = this.a;
        wVar.r.showAtLocation(wVar.q, 55, 0, 0);
        this.a.m();
        if (this.a.t()) {
            this.a.q.setAlpha(0.0f);
            w wVar2 = this.a;
            Ec a2 = C1778vc.a(wVar2.q);
            a2.a(1.0f);
            wVar2.t = a2;
            this.a.t.a((Fc) new t(this));
            return;
        }
        this.a.q.setAlpha(1.0f);
        this.a.q.setVisibility(0);
    }
}
