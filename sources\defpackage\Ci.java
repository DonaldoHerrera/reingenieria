package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Ci reason: default package */
/* compiled from: CrashlyticsCore */
class Ci implements Callable<Void> {
    final /* synthetic */ Ei a;

    Ci(Ei ei) {
        this.a = ei;
    }

    public Void call() throws Exception {
        this.a.i.a();
        C5328TMa.e().d("CrashlyticsCore", "Initialization marker file created.");
        return null;
    }
}
