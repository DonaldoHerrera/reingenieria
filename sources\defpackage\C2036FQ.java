package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: FQ reason: default package and case insensitive filesystem */
/* compiled from: AppFeaturesModule_ProvideAppFeaturesFactory */
public final class C2036FQ implements C4961HMa<a> {
    private final C2016EQ a;
    private final C7054oVa<C2114JQ> b;

    public C2036FQ(C2016EQ eq, C7054oVa<C2114JQ> ova) {
        this.a = eq;
        this.b = ova;
    }

    public static C2036FQ a(C2016EQ eq, C7054oVa<C2114JQ> ova) {
        return new C2036FQ(eq, ova);
    }

    public static a a(C2016EQ eq, C2114JQ jq) {
        a a2 = eq.a(jq);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public a get() {
        return a(this.a, (C2114JQ) this.b.get());
    }
}
