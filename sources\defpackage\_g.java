package defpackage;

/* renamed from: _g reason: default package */
/* compiled from: AnswersEventsHandler */
class _g implements Runnable {
    final /* synthetic */ a a;
    final /* synthetic */ boolean b;
    final /* synthetic */ C0307ah c;

    _g(C0307ah ahVar, a aVar, boolean z) {
        this.c = ahVar;
        this.a = aVar;
        this.b = z;
    }

    public void run() {
        try {
            this.c.h.a(this.a);
            if (this.b) {
                this.c.h.a();
            }
        } catch (Exception e) {
            C5328TMa.e().e("Answers", "Failed to process event", e);
        }
    }
}
