package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Zh reason: default package */
/* compiled from: CrashlyticsController */
class Zh implements Callable<Boolean> {
    final /* synthetic */ C5635bPa a;
    final /* synthetic */ C1874yi b;

    Zh(C1874yi yiVar, C5635bPa bpa) {
        this.b = yiVar;
        this.a = bpa;
    }

    public Boolean call() throws Exception {
        String str = "CrashlyticsCore";
        if (this.b.g()) {
            C5328TMa.e().d(str, "Skipping session finalization because a crash has already occurred.");
            return Boolean.FALSE;
        }
        C5328TMa.e().d(str, "Finalizing previously open sessions.");
        this.b.a(this.a, true);
        C5328TMa.e().d(str, "Closed all previously open sessions");
        return Boolean.TRUE;
    }
}
