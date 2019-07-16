package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: Eb reason: default package and case insensitive filesystem */
/* compiled from: SelfDestructiveThread */
class C0202Eb implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ Handler b;
    final /* synthetic */ a c;
    final /* synthetic */ C0208Gb d;

    C0202Eb(C0208Gb gb, Callable callable, Handler handler, a aVar) {
        this.d = gb;
        this.a = callable;
        this.b = handler;
        this.c = aVar;
    }

    public void run() {
        Object obj;
        try {
            obj = this.a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.b.post(new C0199Db(this, obj));
    }
}
