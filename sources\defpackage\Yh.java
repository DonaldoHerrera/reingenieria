package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Yh reason: default package */
/* compiled from: CrashlyticsController */
class Yh implements Callable<Void> {
    final /* synthetic */ C1874yi a;

    Yh(C1874yi yiVar) {
        this.a = yiVar;
    }

    public Void call() throws Exception {
        this.a.m();
        return null;
    }
}
