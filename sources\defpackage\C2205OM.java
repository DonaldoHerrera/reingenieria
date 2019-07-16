package defpackage;

import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.J;

/* renamed from: OM reason: default package and case insensitive filesystem */
/* compiled from: AdjustAnalyticsProvider */
public class C2205OM extends C2109JL {
    private final C2243QM a;

    C2205OM(C2243QM qm) {
        this.a = qm;
    }

    public void a(C3699a aVar) {
        if (aVar.a() == 0) {
            this.a.b();
        } else if (aVar.a() == 2) {
            this.a.a();
        }
    }

    public void a(J j) {
        if (j instanceof Raa) {
            a((Raa) j);
        } else if (j instanceof Waa) {
            a((Waa) j);
        }
    }

    private void a(Raa raa) {
        this.a.a(raa.h(), raa.j(), raa.i());
    }

    private void a(Waa waa) {
        if (waa.h().c()) {
            this.a.a(((a) waa.h().b()).k);
        }
    }
}
