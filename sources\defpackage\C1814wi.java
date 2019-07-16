package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wi reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsController */
class C1814wi implements Callable<Void> {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ C1874yi c;

    C1814wi(C1874yi yiVar, long j, String str) {
        this.c = yiVar;
        this.a = j;
        this.b = str;
    }

    public Void call() throws Exception {
        if (!this.c.g()) {
            this.c.r.a(this.a, this.b);
        }
        return null;
    }
}
