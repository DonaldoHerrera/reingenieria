package defpackage;

import com.soundcloud.android.ads.Ab;
import com.soundcloud.android.ads.Wb;

/* renamed from: OK reason: default package and case insensitive filesystem */
/* compiled from: AdAnalyticsModule_ProvidesKruxSegmentProviderFactory */
public final class C2203OK implements C4961HMa<Wb> {
    private final C7054oVa<C7319sKa> a;
    private final C7054oVa<Ab> b;

    public C2203OK(C7054oVa<C7319sKa> ova, C7054oVa<Ab> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2203OK a(C7054oVa<C7319sKa> ova, C7054oVa<Ab> ova2) {
        return new C2203OK(ova, ova2);
    }

    public static Wb a(C7319sKa ska, C7054oVa<Ab> ova) {
        Wb a2 = C2165MK.a(ska, ova);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Wb get() {
        return a((C7319sKa) this.a.get(), this.b);
    }
}
