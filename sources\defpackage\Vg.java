package defpackage;

/* renamed from: Vg reason: default package */
/* compiled from: AnswersEventsHandler */
class Vg implements Runnable {
    final /* synthetic */ NOa a;
    final /* synthetic */ String b;
    final /* synthetic */ C0307ah c;

    Vg(C0307ah ahVar, NOa nOa, String str) {
        this.c = ahVar;
        this.a = nOa;
        this.b = str;
    }

    public void run() {
        try {
            this.c.h.a(this.a, this.b);
        } catch (Exception e) {
            C5328TMa.e().e("Answers", "Failed to set analytics settings data", e);
        }
    }
}
