package com.soundcloud.android;

import com.soundcloud.android.onboarding.g;

/* renamed from: com.soundcloud.android.r reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideAuthSignatureFactory */
public final class C2939r implements C4961HMa<g> {
    private final C7054oVa<C2041FV> a;

    public C2939r(C7054oVa<C2041FV> ova) {
        this.a = ova;
    }

    public static C2939r a(C7054oVa<C2041FV> ova) {
        return new C2939r(ova);
    }

    public static g a(C2041FV fv) {
        g a2 = C2933l.a(fv);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public g get() {
        return a((C2041FV) this.a.get());
    }
}
