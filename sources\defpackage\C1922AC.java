package defpackage;

import java.util.logging.Level;

/* renamed from: AC reason: default package and case insensitive filesystem */
/* compiled from: LocalCache */
class C1922AC implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ int b;
    final /* synthetic */ k c;
    final /* synthetic */ C3347xE d;
    final /* synthetic */ p e;

    C1922AC(p pVar, Object obj, int i, k kVar, C3347xE xEVar) {
        this.e = pVar;
        this.a = obj;
        this.b = i;
        this.c = kVar;
        this.d = xEVar;
    }

    public void run() {
        try {
            this.e.a(this.a, this.b, this.c, this.d);
        } catch (Throwable th) {
            C3157oC.a.log(Level.WARNING, "Exception thrown during refresh", th);
            this.c.a(th);
        }
    }
}
