package defpackage;

/* renamed from: XK reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsEngine.kt */
final class C2371XK implements Runnable {
    final /* synthetic */ C2353WK a;

    C2371XK(C2353WK wk) {
        this.a = wk;
    }

    public final void run() {
        SDb.c("Flushing event data", new Object[0]);
        for (C3254sL flush : this.a.d) {
            flush.flush();
        }
        this.a.b.set(true);
    }
}
