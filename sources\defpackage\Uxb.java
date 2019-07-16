package defpackage;

import java.io.IOException;

/* renamed from: Uxb reason: default package */
/* compiled from: Cache */
class Uxb extends C7099pAb {
    final /* synthetic */ Vxb b;
    final /* synthetic */ a c;
    final /* synthetic */ a d;

    Uxb(a aVar, GAb gAb, Vxb vxb, a aVar2) {
        this.d = aVar;
        this.b = vxb;
        this.c = aVar2;
        super(gAb);
    }

    public void close() throws IOException {
        synchronized (Vxb.this) {
            if (!this.d.d) {
                this.d.d = true;
                Vxb.this.c++;
                super.close();
                this.c.b();
            }
        }
    }
}
