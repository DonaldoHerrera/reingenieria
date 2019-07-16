package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.O;
import java.util.Arrays;

/* renamed from: FL reason: default package and case insensitive filesystem */
/* compiled from: DefaultAnalytics.kt */
public class C2031FL implements C3700b {
    private final C2350WH<J> a;
    private final C2168MN b;
    private final C3315vM c;

    public C2031FL(@a C2350WH<J> wh, C2168MN mn, C3315vM vMVar) {
        C7471uYa.b(wh, "trackingEvents");
        C7471uYa.b(mn, "firebaseAnalyticsWrapper");
        C7471uYa.b(vMVar, "screenTracker");
        this.a = wh;
        this.b = mn;
        this.c = vMVar;
    }

    public void a(Yca yca) {
        C7471uYa.b(yca, "screen");
        Zca zca = new Zca(yca, null, null, null, null, 30, null);
        a(zca);
    }

    public void a(Zca zca) {
        C7471uYa.b(zca, "screenData");
        this.c.a(zca);
    }

    public void a(J j) {
        C7471uYa.b(j, "trackingEvent");
        this.a.accept(j);
    }

    public void a(C3702d dVar) {
        C7471uYa.b(dVar, "analyticsEvent");
        C2168MN mn = this.b;
        String b2 = dVar.b();
        HVa[] a2 = dVar.a();
        mn.a(b2, C1687sb.a((HVa[]) Arrays.copyOf(a2, a2.length)));
    }

    public void a(O o, String str) {
        C7471uYa.b(o, "property");
        C7471uYa.b(str, "value");
        StringBuilder sb = new StringBuilder();
        sb.append("Setting user property ");
        sb.append(o);
        sb.append(' ');
        sb.append(str);
        SDb.a(sb.toString(), new Object[0]);
        this.b.a(o.a(), str);
    }
}
