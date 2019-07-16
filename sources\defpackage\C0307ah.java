package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ah reason: default package and case insensitive filesystem */
/* compiled from: AnswersEventsHandler */
class C0307ah implements C7185qOa {
    /* access modifiers changed from: private */
    public final C5531_Ma a;
    /* access modifiers changed from: private */
    public final Context b;
    /* access modifiers changed from: private */
    public final C0492bh c;
    /* access modifiers changed from: private */
    public final Eh d;
    /* access modifiers changed from: private */
    public final C4839DOa e;
    /* access modifiers changed from: private */
    public final C1542nh f;
    final ScheduledExecutorService g;
    C1903zh h = new C1418jh();

    public C0307ah(C5531_Ma _ma, Context context, C0492bh bhVar, Eh eh, C4839DOa dOa, ScheduledExecutorService scheduledExecutorService, C1542nh nhVar) {
        this.a = _ma;
        this.b = context;
        this.c = bhVar;
        this.d = eh;
        this.e = dOa;
        this.g = scheduledExecutorService;
        this.f = nhVar;
    }

    public void a(a aVar) {
        a(aVar, false, false);
    }

    public void b(a aVar) {
        a(aVar, false, true);
    }

    public void c(a aVar) {
        a(aVar, true, false);
    }

    public void a(NOa nOa, String str) {
        a((Runnable) new Vg(this, nOa, str));
    }

    public void b() {
        a((Runnable) new Yg(this));
    }

    public void c() {
        a((Runnable) new Zg(this));
    }

    private void b(Runnable runnable) {
        try {
            this.g.submit(runnable).get();
        } catch (Exception e2) {
            C5328TMa.e().e("Answers", "Failed to run events task", e2);
        }
    }

    public void a() {
        a((Runnable) new Wg(this));
    }

    public void a(String str) {
        a((Runnable) new Xg(this));
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar, boolean z, boolean z2) {
        _g _gVar = new _g(this, aVar, z2);
        if (z) {
            b((Runnable) _gVar);
        } else {
            a((Runnable) _gVar);
        }
    }

    private void a(Runnable runnable) {
        try {
            this.g.submit(runnable);
        } catch (Exception e2) {
            C5328TMa.e().e("Answers", "Failed to submit events task", e2);
        }
    }
}
