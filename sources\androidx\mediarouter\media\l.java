package androidx.mediarouter.media;

import androidx.media.G;

/* compiled from: MediaRouter */
class l extends G {
    final /* synthetic */ b f;

    l(b bVar, int i, int i2, int i3) {
        this.f = bVar;
        super(i, i2, i3);
    }

    public void a(int i) {
        d.this.i.post(new k(this, i));
    }

    public void b(int i) {
        d.this.i.post(new j(this, i));
    }
}
