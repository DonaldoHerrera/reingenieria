package com.soundcloud.android.profile;

/* compiled from: ProfileModule_ProvideProfileScrollHelperFactory */
public final class Ma implements C4961HMa<ProfileScrollHelper> {
    private final C7054oVa<C5836qa> a;
    private final C7054oVa<ProfileScrollHelper> b;
    private final C7054oVa<BannerProfileScrollHelper> c;

    public static ProfileScrollHelper a(Object obj, C4806CMa<ProfileScrollHelper> cMa, C4806CMa<BannerProfileScrollHelper> cMa2) {
        ProfileScrollHelper a2 = La.a((C5836qa) obj, cMa, cMa2);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public ProfileScrollHelper get() {
        return a(this.a.get(), C4930GMa.a(this.b), C4930GMa.a(this.c));
    }
}
