package defpackage;

/* renamed from: Yg reason: default package */
/* compiled from: AnswersEventsHandler */
class Yg implements Runnable {
    final /* synthetic */ C0307ah a;

    Yg(C0307ah ahVar) {
        this.a = ahVar;
    }

    public void run() {
        try {
            Ch a2 = this.a.d.a();
            C1813wh a3 = this.a.c.a();
            a3.a((C7185qOa) this.a);
            C0307ah ahVar = this.a;
            C1449kh khVar = new C1449kh(this.a.a, this.a.b, this.a.g, a3, this.a.e, a2, this.a.f);
            ahVar.h = khVar;
        } catch (Exception e) {
            C5328TMa.e().e("Answers", "Failed to enable events", e);
        }
    }
}
