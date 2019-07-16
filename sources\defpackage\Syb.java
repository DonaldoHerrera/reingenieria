package defpackage;

import java.io.IOException;

/* renamed from: Syb reason: default package */
/* compiled from: DiskLruCache */
class Syb extends Uyb {
    final /* synthetic */ a c;

    Syb(a aVar, GAb gAb) {
        this.c = aVar;
        super(gAb);
    }

    /* access modifiers changed from: protected */
    public void a(IOException iOException) {
        synchronized (Tyb.this) {
            this.c.c();
        }
    }
}
