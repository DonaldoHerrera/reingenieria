package defpackage;

/* renamed from: Zg reason: default package */
/* compiled from: AnswersEventsHandler */
class Zg implements Runnable {
    final /* synthetic */ C0307ah a;

    Zg(C0307ah ahVar) {
        this.a = ahVar;
    }

    public void run() {
        try {
            this.a.h.a();
        } catch (Exception e) {
            C5328TMa.e().e("Answers", "Failed to flush events", e);
        }
    }
}
