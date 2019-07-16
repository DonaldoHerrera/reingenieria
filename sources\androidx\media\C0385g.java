package androidx.media;

/* renamed from: androidx.media.g reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0385g implements Runnable {
    final /* synthetic */ b a;

    C0385g(b bVar) {
        this.a = bVar;
    }

    public void run() {
        b bVar = this.a;
        MediaBrowserServiceCompat.this.c.remove(bVar.f.asBinder());
    }
}
