package defpackage;

import java.util.Date;

/* renamed from: xi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1844xi implements Runnable {
    final /* synthetic */ Date a;
    final /* synthetic */ Thread b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ C1874yi d;

    C1844xi(C1874yi yiVar, Date date, Thread thread, Throwable th) {
        this.d = yiVar;
        this.a = date;
        this.b = thread;
        this.c = th;
    }

    public void run() {
        if (!this.d.g()) {
            this.d.a(this.a, this.b, this.c);
        }
    }
}
