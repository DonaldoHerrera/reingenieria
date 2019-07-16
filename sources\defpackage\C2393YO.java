package defpackage;

import android.content.res.Resources;

/* renamed from: YO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideMobileApiBaseUrlFactory */
public final class C2393YO implements C4961HMa<String> {
    private final C2264RO a;
    private final C7054oVa<Resources> b;

    public C2393YO(C2264RO ro, C7054oVa<Resources> ova) {
        this.a = ro;
        this.b = ova;
    }

    public static C2393YO a(C2264RO ro, C7054oVa<Resources> ova) {
        return new C2393YO(ro, ova);
    }

    public static String a(C2264RO ro, Resources resources) {
        String b2 = ro.b(resources);
        C5023JMa.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public String get() {
        return a(this.a, (Resources) this.b.get());
    }
}
