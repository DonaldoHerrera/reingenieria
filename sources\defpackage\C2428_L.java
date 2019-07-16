package defpackage;

import android.os.HandlerThread;
import java.lang.Thread.State;
import java.util.concurrent.TimeUnit;

/* renamed from: _L reason: default package and case insensitive filesystem */
/* compiled from: EventTrackingManager */
public class C2428_L {
    static final String a = "_L";
    private static final long b = TimeUnit.SECONDS.toMillis(30);
    private final C2052GM c;
    private C2032FM d;

    public C2428_L(C2052GM gm) {
        this.c = gm;
    }

    private boolean b() {
        C2032FM fm = this.d;
        return fm == null || fm.getLooper().getThread().getState() == State.TERMINATED;
    }

    public void a(C2110JM jm) {
        SDb.a(a).a("New tracking event: %s", jm.toString());
        a();
        this.d.removeMessages(-559038737);
        this.d.sendMessage(this.d.obtainMessage(0, jm));
        this.d.sendMessageDelayed(this.d.obtainMessage(-559038737), b);
    }

    public void a(String str) {
        SDb.a(a).a("Requesting FLUSH for %s", str);
        a();
        this.d.obtainMessage(1, str).sendToTarget();
    }

    private void a() {
        if (b()) {
            SDb.a(a).a("Handler was dead, recreating", new Object[0]);
            HandlerThread handlerThread = new HandlerThread(a, 19);
            handlerThread.start();
            this.d = this.c.a(handlerThread.getLooper());
        }
    }
}
