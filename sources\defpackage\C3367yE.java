package defpackage;

/* renamed from: yE reason: default package and case insensitive filesystem */
/* compiled from: MoreExecutors */
class C3367yE implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ C3387zE b;

    C3367yE(C3387zE zEVar, Runnable runnable) {
        this.b = zEVar;
        this.a = runnable;
    }

    public void run() {
        this.b.a = false;
        this.a.run();
    }
}
