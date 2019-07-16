package androidx.mediarouter.media;

import androidx.mediarouter.media.h.g;

/* compiled from: MediaRouter */
class k implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ l b;

    k(l lVar, int i) {
        this.b = lVar;
        this.a = i;
    }

    public void run() {
        g gVar = d.this.p;
        if (gVar != null) {
            gVar.b(this.a);
        }
    }
}
