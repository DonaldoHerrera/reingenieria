package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.v reason: case insensitive filesystem */
/* compiled from: PostsCleanupHelper_Factory */
public final class C5859v implements C4961HMa<C5854u> {
    private final C7054oVa<C5500ZKa> a;

    public C5859v(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C5859v a(C7054oVa<C5500ZKa> ova) {
        return new C5859v(ova);
    }

    public C5854u get() {
        return new C5854u((C5500ZKa) this.a.get());
    }
}
