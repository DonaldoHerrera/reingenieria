package androidx.media;

/* compiled from: MediaBrowserServiceCompat */
class n implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ j b;

    n(j jVar, k kVar) {
        this.b = jVar;
        this.a = kVar;
    }

    public void run() {
        b bVar = (b) MediaBrowserServiceCompat.this.c.remove(this.a.asBinder());
        if (bVar != null) {
            bVar.f.asBinder().unlinkToDeath(bVar, 0);
        }
    }
}
