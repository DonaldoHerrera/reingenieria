package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: yh reason: default package and case insensitive filesystem */
/* compiled from: SessionAnalyticsManager */
class C1873yh implements a {
    private final long a;
    final C0307ah b;
    final C5208PMa c;
    final C1357hh d;
    final C1234dh e;

    C1873yh(C0307ah ahVar, C5208PMa pMa, C1357hh hhVar, C1234dh dhVar, long j) {
        this.b = ahVar;
        this.c = pMa;
        this.d = hhVar;
        this.e = dhVar;
        this.a = j;
    }

    public static C1873yh a(C5531_Ma _ma, Context context, C4931GNa gNa, String str, String str2, long j) {
        Context context2 = context;
        C4931GNa gNa2 = gNa;
        Eh eh = new Eh(context, gNa, str, str2);
        C5531_Ma _ma2 = _ma;
        C0492bh bhVar = new C0492bh(context, new C5025JOa(_ma));
        C7737yOa yoa = new C7737yOa(C5328TMa.e());
        C5208PMa pMa = new C5208PMa(context);
        ScheduledExecutorService b2 = C4807CNa.b("Answers Events Handler");
        C1357hh hhVar = new C1357hh(b2);
        C0307ah ahVar = new C0307ah(_ma2, context, bhVar, eh, yoa, b2, new C1542nh(context));
        C1873yh yhVar = new C1873yh(ahVar, pMa, hhVar, C1234dh.a(context), j);
        return yhVar;
    }

    public void a(String str) {
    }

    public void b() {
        this.c.a();
        this.b.a();
    }

    public void c() {
        this.b.b();
        this.c.a(new C0523ch(this, this.d));
        this.d.a((a) this);
        if (d()) {
            a(this.a);
            this.e.b();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return !this.e.a();
    }

    public void a(C1387ih ihVar) {
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged custom event: ");
        sb.append(ihVar);
        e2.d("Answers", sb.toString());
        this.b.a(Bh.a(ihVar));
    }

    public void a(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C5328TMa.e().d("Answers", "Logged crash");
            this.b.c(Bh.a(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    public void a(long j) {
        C5328TMa.e().d("Answers", "Logged install");
        this.b.b(Bh.a(j));
    }

    public void a(Activity activity, b bVar) {
        C5701cNa e2 = C5328TMa.e();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged lifecycle event: ");
        sb.append(bVar.name());
        e2.d("Answers", sb.toString());
        this.b.a(Bh.a(bVar, activity));
    }

    public void a() {
        C5328TMa.e().d("Answers", "Flush events when app is backgrounded");
        this.b.c();
    }

    public void a(NOa nOa, String str) {
        this.d.a(nOa.j);
        this.b.a(nOa, str);
    }
}
