package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: BNa reason: default package and case insensitive filesystem */
/* compiled from: ExecutorUtils */
class C4776BNa extends C7253rNa {
    final /* synthetic */ String a;
    final /* synthetic */ ExecutorService b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    C4776BNa(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.a = str;
        this.b = executorService;
        this.c = j;
        this.d = timeUnit;
    }

    public void a() {
        String str = "Fabric";
        try {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Executing shutdown hook for ");
            sb.append(this.a);
            e.d(str, sb.toString());
            this.b.shutdown();
            if (!this.b.awaitTermination(this.c, this.d)) {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.a);
                sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                e2.d(str, sb2.toString());
                this.b.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C5328TMa.e().d(str, String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.a}));
            this.b.shutdownNow();
        }
    }
}
