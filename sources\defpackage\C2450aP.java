package defpackage;

import android.content.res.Resources;

/* renamed from: aP reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvidePublicApiBaseUrlFactory */
public final class C2450aP implements C4961HMa<String> {
    private final C2264RO a;
    private final C7054oVa<Resources> b;

    public C2450aP(C2264RO ro, C7054oVa<Resources> ova) {
        this.a = ro;
        this.b = ova;
    }

    public static C2450aP a(C2264RO ro, C7054oVa<Resources> ova) {
        return new C2450aP(ro, ova);
    }

    public static String a(C2264RO ro, Resources resources) {
        String c = ro.c(resources);
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public String get() {
        return a(this.a, (Resources) this.b.get());
    }
}
