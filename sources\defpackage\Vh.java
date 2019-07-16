package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Vh reason: default package */
/* compiled from: CrashlyticsBackgroundWorker */
class Vh implements Callable<T> {
    final /* synthetic */ Callable a;
    final /* synthetic */ Wh b;

    Vh(Wh wh, Callable callable) {
        this.b = wh;
        this.a = callable;
    }

    public T call() throws Exception {
        try {
            return this.a.call();
        } catch (Exception e) {
            C5328TMa.e().e("CrashlyticsCore", "Failed to execute task.", e);
            return null;
        }
    }
}
