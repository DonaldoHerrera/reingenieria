package defpackage;

import com.soundcloud.android.foundation.events.E;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.r;
import com.soundcloud.android.properties.j;

@Deprecated
/* renamed from: sN reason: default package and case insensitive filesystem */
/* compiled from: FabricAnalyticsProvider */
public class C3256sN extends C2109JL {
    private final boolean a;
    private final C3824mea b;
    private final C3296uN c;

    C3256sN(j jVar, C3296uN uNVar, C3824mea mea) {
        this.c = uNVar;
        this.b = mea;
        this.a = jVar.i();
    }

    private void b(J j) {
        if (!this.c.b()) {
            return;
        }
        if (this.a) {
            this.c.a(3, "FabricAnalytics", j.toString());
            return;
        }
        this.c.a(j.toString());
    }

    private boolean c(J j) {
        return (j instanceof E) || (j instanceof K);
    }

    public void a(J j) {
        if (this.c.c()) {
            if (c(j)) {
                b(j);
            }
            if (j instanceof r) {
                this.b.a(((r) j).a());
            }
        }
    }
}
