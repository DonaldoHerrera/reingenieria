package androidx.appcompat.app;

/* compiled from: AppCompatDelegateImpl */
class p implements Runnable {
    final /* synthetic */ w a;

    p(w wVar) {
        this.a = wVar;
    }

    public void run() {
        w wVar = this.a;
        if ((wVar.P & 1) != 0) {
            wVar.f(0);
        }
        w wVar2 = this.a;
        if ((wVar2.P & 4096) != 0) {
            wVar2.f(108);
        }
        w wVar3 = this.a;
        wVar3.O = false;
        wVar3.P = 0;
    }
}
