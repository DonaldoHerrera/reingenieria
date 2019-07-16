package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: RK reason: default package and case insensitive filesystem */
/* compiled from: AdErrorsAnalyticsProvider.kt */
public class C2260RK extends C2109JL {
    private final C2428_L a;
    private final C3356xN b;

    public C2260RK(C2428_L _l, C3356xN xNVar) {
        C7471uYa.b(_l, "eventTrackingManager");
        C7471uYa.b(xNVar, "adErrorAnalyticsToaster");
        this.a = _l;
        this.b = xNVar;
    }

    public void a(J j) {
        C7471uYa.b(j, "event");
        if (j instanceof C3413CZ) {
            C3413CZ cz = (C3413CZ) j;
            for (String a2 : cz.i()) {
                this.a.a(C2110JM.a.a(cz.e(), "ad_errors", a2));
            }
            flush();
            this.b.a(cz);
        }
    }

    public void flush() {
        this.a.a("ad_errors");
    }
}
