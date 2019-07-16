package defpackage;

import java.util.Date;
import java.util.concurrent.Callable;

/* renamed from: vi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1784vi implements Callable<Void> {
    final /* synthetic */ Date a;
    final /* synthetic */ Thread b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ b d;
    final /* synthetic */ boolean e;
    final /* synthetic */ C1874yi f;

    C1784vi(C1874yi yiVar, Date date, Thread thread, Throwable th, b bVar, boolean z) {
        this.f = yiVar;
        this.a = date;
        this.b = thread;
        this.c = th;
        this.d = bVar;
        this.e = z;
    }

    public Void call() throws Exception {
        ZOa zOa;
        C5635bPa bpa;
        this.f.j.L();
        this.f.b(this.a, this.b, this.c);
        C6503gPa a2 = this.d.a();
        if (a2 != null) {
            bpa = a2.b;
            zOa = a2.d;
        } else {
            bpa = null;
            zOa = null;
        }
        boolean z = false;
        if ((zOa == null || zOa.e) || this.e) {
            this.f.a(this.a.getTime());
        }
        this.f.a(bpa);
        this.f.m();
        if (bpa != null) {
            this.f.a(bpa.g);
        }
        if (C7598wNa.a(this.f.j.e()).a() && !this.f.c(a2)) {
            z = true;
        }
        if (z) {
            this.f.b(a2);
        }
        return null;
    }
}
