package defpackage;

import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.foundation.events.J;
import java.util.List;

/* renamed from: Taa reason: default package */
/* compiled from: SponsoredSessionStartEvent */
public abstract class Taa extends J {
    public static Taa a(X x, Yca yca) {
        C3804kaa kaa = new C3804kaa(J.b(), J.c(), x.f(), String.valueOf(x.m()), yca, x.k().a(), x.o());
        return kaa;
    }

    public abstract C3508cda h();

    public abstract String i();

    public abstract String j();

    public abstract Yca k();

    public abstract List<String> l();
}
