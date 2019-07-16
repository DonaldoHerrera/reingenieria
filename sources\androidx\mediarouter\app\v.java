package androidx.mediarouter.app;

/* compiled from: MediaRouteControllerDialog */
class v implements Runnable {
    final /* synthetic */ e a;

    v(e eVar) {
        this.a = eVar;
    }

    public void run() {
        u uVar = u.this;
        if (uVar.N != null) {
            uVar.N = null;
            if (uVar.da) {
                uVar.c(uVar.ea);
            }
        }
    }
}
