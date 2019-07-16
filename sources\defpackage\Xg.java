package defpackage;

/* renamed from: Xg reason: default package */
/* compiled from: AnswersEventsHandler */
class Xg implements Runnable {
    final /* synthetic */ C0307ah a;

    Xg(C0307ah ahVar) {
        this.a = ahVar;
    }

    public void run() {
        try {
            this.a.h.c();
        } catch (Exception e) {
            C5328TMa.e().e("Answers", "Failed to send events files", e);
        }
    }
}
