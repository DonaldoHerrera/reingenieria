package defpackage;

import java.util.concurrent.Callable;

/* renamed from: Di reason: default package */
/* compiled from: CrashlyticsCore */
class Di implements Callable<Boolean> {
    final /* synthetic */ Ei a;

    Di(Ei ei) {
        this.a = ei;
    }

    public Boolean call() throws Exception {
        String str = "CrashlyticsCore";
        try {
            boolean c = this.a.i.c();
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Initialization marker file removed: ");
            sb.append(c);
            e.d(str, sb.toString());
            return Boolean.valueOf(c);
        } catch (Exception e2) {
            C5328TMa.e().e(str, "Problem encountered deleting Crashlytics initialization marker.", e2);
            return Boolean.valueOf(false);
        }
    }
}
