package defpackage;

import com.soundcloud.android.foundation.ads.C3678e;
import java.util.Set;

/* renamed from: NK reason: default package and case insensitive filesystem */
/* compiled from: AdAnalyticsModule_ProvidesAdViewabilityControllerFactory */
public final class C2184NK implements C4961HMa<C3678e> {
    private final C7054oVa<Set<C3678e>> a;

    public C2184NK(C7054oVa<Set<C3678e>> ova) {
        this.a = ova;
    }

    public static C2184NK a(C7054oVa<Set<C3678e>> ova) {
        return new C2184NK(ova);
    }

    public static C3678e a(Set<C3678e> set) {
        C3678e a2 = C2165MK.a(set);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3678e get() {
        return a((Set) this.a.get());
    }
}
