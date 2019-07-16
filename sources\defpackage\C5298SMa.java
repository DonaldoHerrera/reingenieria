package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: SMa reason: default package and case insensitive filesystem */
/* compiled from: Fabric */
class C5298SMa implements C5444XMa {
    final CountDownLatch a = new CountDownLatch(this.b);
    final /* synthetic */ int b;
    final /* synthetic */ C5328TMa c;

    C5298SMa(C5328TMa tMa, int i) {
        this.c = tMa;
        this.b = i;
    }

    public void a(Object obj) {
        this.a.countDown();
        if (this.a.getCount() == 0) {
            this.c.l.set(true);
            this.c.g.a(this.c);
        }
    }

    public void a(Exception exc) {
        this.c.g.a(exc);
    }
}
