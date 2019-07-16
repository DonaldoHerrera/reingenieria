package defpackage;

/* renamed from: TNa reason: default package and case insensitive filesystem */
/* compiled from: AsyncTask */
class C5329TNa implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ c b;

    C5329TNa(c cVar, Runnable runnable) {
        this.b = cVar;
        this.a = runnable;
    }

    public void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}
