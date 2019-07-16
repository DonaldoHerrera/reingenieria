package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.c;
import com.soundcloud.android.foundation.events.F;

/* renamed from: pua reason: default package and case insensitive filesystem */
/* compiled from: OutOfMemoryReporter.kt */
public class C7155pua {
    private final C3236rN a;
    private final C3700b b;
    private final F c;

    public C7155pua(C3236rN rNVar, C3700b bVar, F f) {
        C7471uYa.b(rNVar, "crashReportingHelper");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(f, "screenProvider");
        this.a = rNVar;
        this.b = bVar;
        this.c = f;
    }

    public void a() {
        if (this.a.c()) {
            C3700b bVar = this.b;
            String a2 = this.c.b().a();
            C7471uYa.a((Object) a2, "screenProvider.lastScreen.get()");
            bVar.a((C3702d) new c(a2));
        }
    }
}
