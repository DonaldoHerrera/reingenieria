package defpackage;

/* renamed from: Wg reason: default package */
/* compiled from: AnswersEventsHandler */
class Wg implements Runnable {
    final /* synthetic */ C0307ah a;

    Wg(C0307ah ahVar) {
        this.a = ahVar;
    }

    public void run() {
        try {
            C1903zh zhVar = this.a.h;
            this.a.h = new C1418jh();
            zhVar.d();
        } catch (Exception e) {
            C5328TMa.e().e("Answers", "Failed to disable events", e);
        }
    }
}
