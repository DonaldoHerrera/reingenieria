package defpackage;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: Xh reason: default package */
/* compiled from: CrashlyticsController */
class Xh implements Callable<Void> {
    final /* synthetic */ Map a;
    final /* synthetic */ C1874yi b;

    Xh(C1874yi yiVar, Map map) {
        this.b = yiVar;
        this.a = map;
    }

    public Void call() throws Exception {
        new _i(this.b.d()).a(this.b.o(), this.a);
        return null;
    }
}
