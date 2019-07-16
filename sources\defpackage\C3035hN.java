package defpackage;

import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.utilities.android.k;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: hN reason: default package and case insensitive filesystem */
/* compiled from: ComScoreAnalyticsProvider */
public class C3035hN extends C2109JL {
    private final Executor a;
    private final C5495ZFa b;
    private final C3054iN c;
    private boolean d;
    private k e;

    public C3035hN(C3054iN iNVar, k kVar, C5495ZFa zFa) {
        this(iNVar, kVar, zFa, Executors.newSingleThreadExecutor());
    }

    private void b() {
        if (!this.d && this.b.a()) {
            this.c.f();
            SDb.c("Starting ComScoreAnalytics", new Object[0]);
            this.d = true;
        }
    }

    public void a(C3699a aVar) {
        a();
        SDb.c("Handling activity lifecycle event %s", aVar);
        b();
        if (!this.d) {
            SDb.d("Ignoring lc events for ComScore. The provider has not started", new Object[0]);
            return;
        }
        this.a.execute(new C2997fN(this, aVar));
    }

    public void flush() {
        if (this.d) {
            SDb.c("Flushing", new Object[0]);
            Executor executor = this.a;
            C3054iN iNVar = this.c;
            iNVar.getClass();
            executor.execute(new C3016gN(iNVar));
        }
    }

    C3035hN(C3054iN iNVar, k kVar, C5495ZFa zFa, Executor executor) {
        this.d = false;
        SDb.c("created ComScore provider", new Object[0]);
        this.c = iNVar;
        this.e = kVar;
        this.b = zFa;
        this.a = executor;
        b();
    }

    public /* synthetic */ void b(C3699a aVar) {
        if (aVar.a() == 0) {
            this.c.b();
        } else if (aVar.a() == 2) {
            this.c.c();
        }
    }

    public void a(J j) {
        a();
        SDb.c("tracking %s", j.getClass());
        if (!this.d) {
            SDb.d("Ignoring tracking events for ComScore. The provider has not started", new Object[0]);
            return;
        }
        if (j instanceof Faa) {
            b((Faa) j);
        }
    }

    private void b(Faa faa) {
        if (!this.d) {
            SDb.d("Ignoring playback session events for ComScore. The provider has not started", new Object[0]);
            return;
        }
        this.a.execute(new C2978eN(this, faa));
    }

    private void a() {
        this.e.b("ComScore expects events to be delivered on a single thread");
    }

    public /* synthetic */ void a(Faa faa) {
        if (faa.n()) {
            this.c.d();
        } else if (faa.p()) {
            this.c.e();
        }
    }
}
