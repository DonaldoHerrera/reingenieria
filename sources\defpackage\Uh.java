package defpackage;

/* renamed from: Uh reason: default package */
/* compiled from: CrashlyticsBackgroundWorker */
class Uh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Wh b;

    Uh(Wh wh, Runnable runnable) {
        this.b = wh;
        this.a = runnable;
    }

    public void run() {
        try {
            this.a.run();
        } catch (Exception e) {
            C5328TMa.e().e("CrashlyticsCore", "Failed to execute task.", e);
        }
    }
}
