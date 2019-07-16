package defpackage;

import android.content.Context;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.p;

/* renamed from: XM reason: default package and case insensitive filesystem */
/* compiled from: AppboyAnalyticsProvider */
public class C2373XM extends C2109JL {
    private final C1956BQ a;
    private final C2448aN b;

    C2373XM(C1956BQ bq, C2448aN aNVar, Ica ica, Context context) {
        this.a = bq;
        this.b = aNVar;
        bq.a(context.getString(p.com_appboy_server));
        ica.b().c(C5250Qua.a(new C2281SM(this)));
    }

    public void a(C3707i iVar) {
        if (iVar.e()) {
            a(iVar.b());
        }
    }

    public void flush() {
        this.a.b();
    }

    public void a(J j) {
        if (j instanceof K) {
            this.b.a((K) j);
        } else if (j instanceof Faa) {
            this.b.a((Faa) j);
        } else if (j instanceof G) {
            this.b.a((G) j);
        } else if (j instanceof C3446NZ) {
            this.b.a((C3446NZ) j);
        } else if (j instanceof C3924zaa) {
            this.b.a((C3924zaa) j);
        } else if (j instanceof Waa) {
            this.b.a((Waa) j);
        } else if (j instanceof C3908xaa) {
            this.b.a((C3908xaa) j);
        }
    }

    /* access modifiers changed from: private */
    public void a(C3508cda cda) {
        if (cda.J() && !C2526g.a(cda)) {
            this.a.d(cda.toString());
        }
    }
}
