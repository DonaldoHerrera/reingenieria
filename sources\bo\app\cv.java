package bo.app;

import java.net.URI;
import java.util.Map;

public final class cv implements Runnable {
    private static final String a = Hg.a(cv.class);
    private final ch b;
    private final ab c;
    private final ab d;
    private final Map<String, String> e;
    private final d f;

    /* renamed from: bo.app.cv$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[w.values().length];

        static {
            try {
                a[w.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public cv(ch chVar, e eVar, d dVar, ab abVar, ab abVar2) {
        this.b = chVar;
        this.c = abVar;
        this.d = abVar2;
        this.e = eVar.a();
        this.f = dVar;
    }

    private cj a() {
        URI a2 = ds.a(this.b.c());
        if (AnonymousClass1.a[this.b.a().ordinal()] == 1) {
            return new cj(this.f.a(a2, this.e));
        }
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received a PlaceIQ request with an unknown Http verb: [");
        sb.append(this.b.a());
        sb.append("]");
        Hg.e(str, sb.toString());
        return null;
    }

    public void run() {
        try {
            cj a2 = a();
            if (a2 != null) {
                this.b.a(this.d, (bm) null);
                this.c.a(new cf(this.b, a2), cf.class);
                this.b.a(this.c);
                return;
            }
            Hg.e(a, "Request response was null, failing task.");
            this.b.a(this.d, new C1572og("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
            this.c.a(new ce(this.b), ce.class);
        } catch (Exception e2) {
            Hg.d(a, "Experienced exception processing request response. Failing task.", e2);
        }
    }
}
