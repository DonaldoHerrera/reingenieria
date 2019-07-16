package defpackage;

import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.foundation.ads.X.b;
import com.soundcloud.android.foundation.ads.ea;
import com.soundcloud.android.foundation.events.J;
import java.util.Collections;
import java.util.List;

/* renamed from: Paa reason: default package */
/* compiled from: PrestitialAdImpressionEvent */
public abstract class Paa extends J {
    public static final String a = Yca.PRESTITIAL.a();

    private static Paa a(C3508cda cda, String str, List<String> list, String str2) {
        C3764faa faa = new C3764faa(J.b(), J.c(), cda, str, list, str2);
        return faa;
    }

    public abstract String h();

    public abstract List<String> i();

    public abstract String j();

    public abstract C3508cda k();

    public static Paa a(X x, Yaa yaa) {
        return a(x.f(), "sponsored_session", yaa.a(x.p().q()), x.k().a());
    }

    public static Paa a(X x, boolean z, Yaa yaa) {
        b n = x.n();
        return a(n.e(), z ? "end_card" : "display", z ? Collections.emptyList() : yaa.a(n.h()), x.k().a());
    }

    public static Paa a(ea eaVar, Yaa yaa) {
        return a(eaVar.f(), "display", yaa.a(eaVar.n()), eaVar.k().a());
    }
}
