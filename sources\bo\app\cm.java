package bo.app;

import java.net.URI;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cm implements Runnable {
    private static final String a = Hg.a(cm.class);
    private final cr b;
    private final ab c;
    private final ab d;
    private final Map<String, String> e;
    private final d f;
    private final df g;
    private final dj h;
    private final bg i;

    /* renamed from: bo.app.cm$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[w.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            a[w.GET.ordinal()] = 1;
            a[w.POST.ordinal()] = 2;
        }
    }

    public cm(cr crVar, a aVar, d dVar, ab abVar, ab abVar2, df dfVar, bg bgVar, dj djVar) {
        this.b = crVar;
        this.c = abVar;
        this.d = abVar2;
        this.e = aVar.a();
        this.f = dVar;
        this.g = dfVar;
        this.i = bgVar;
        this.h = djVar;
    }

    private bm a() {
        URI a2 = ds.a(this.b.c());
        int i2 = AnonymousClass1.a[this.b.a().ordinal()];
        if (i2 == 1) {
            return new bm(this.f.a(a2, this.e), this.i);
        }
        if (i2 != 2) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Received a request with an unknown Http verb: [");
            sb.append(this.b.a());
            sb.append("]");
            Hg.e(str, sb.toString());
            return null;
        }
        JSONObject h2 = this.b.h();
        if (h2 != null) {
            return new bm(this.f.a(a2, this.e, h2), this.i);
        }
        Hg.b(a, "Could not parse request parameters for put request to [%s], canceling request.");
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void b(bm bmVar) {
        String f2 = this.i.f();
        if (bmVar.a()) {
            try {
                Xf a2 = this.g.a(bmVar.h(), f2);
                if (a2 != null) {
                    this.d.a(a2, Xf.class);
                }
            } catch (JSONException unused) {
                Hg.e(a, "Unable to update/publish feed.");
            }
        }
        if (bmVar.d()) {
            this.h.a(bmVar.k());
            this.c.a(new ai(bmVar.k()), ai.class);
        }
        if (bmVar.b()) {
            for (C0522cg zf : bmVar.i()) {
                this.d.a(new Zf(zf, f2), Zf.class);
            }
        }
        if (bmVar.e()) {
            this.c.a(new ap(bmVar.l()), ap.class);
        }
        if (bmVar.c()) {
            cr crVar = this.b;
            if (crVar instanceof cy) {
                bmVar.j().setExpirationTimestamp(((cy) crVar).k());
                this.d.a(new Zf(bmVar.j(), f2), Zf.class);
            }
        }
        if (bmVar.g()) {
            this.c.a(new af(bmVar.m()), af.class);
        }
    }

    public void run() {
        try {
            bm a2 = a();
            if (a2 != null) {
                a(a2);
                this.c.a(new ad(this.b), ad.class);
                return;
            }
            Hg.e(a, "Api response was null, failing task.");
            this.b.a(this.d, new C1572og("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
            this.c.a(new ac(this.b), ac.class);
        } catch (Exception e2) {
            Hg.d(a, "Experienced exception processing API response. Failing task.", e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(bm bmVar) {
        if (!bmVar.f()) {
            this.b.a(this.d, bmVar);
        } else {
            a(bmVar.n());
            this.b.a(this.d, bmVar.n());
        }
        b(bmVar);
        this.b.a(this.c);
    }

    private void a(C1572og ogVar) {
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Received server error from request: ");
        sb.append(ogVar.a());
        Hg.b(str, sb.toString());
    }
}
