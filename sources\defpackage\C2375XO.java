package defpackage;

import android.content.res.Resources;

/* renamed from: XO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideEventgatewayBaseUrlFactory */
public final class C2375XO implements C4961HMa<String> {
    private final C2264RO a;
    private final C7054oVa<Resources> b;

    public C2375XO(C2264RO ro, C7054oVa<Resources> ova) {
        this.a = ro;
        this.b = ova;
    }

    public static C2375XO a(C2264RO ro, C7054oVa<Resources> ova) {
        return new C2375XO(ro, ova);
    }

    public static String a(C2264RO ro, Resources resources) {
        String a2 = ro.a(resources);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public String get() {
        return a(this.a, (Resources) this.b.get());
    }
}
