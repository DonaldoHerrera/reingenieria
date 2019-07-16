package com.soundcloud.android.profile;

import com.soundcloud.android.view.r;

/* renamed from: com.soundcloud.android.profile.j reason: case insensitive filesystem */
/* compiled from: BannerProfileScrollHelper_Factory */
public final class C5800j implements C4961HMa<BannerProfileScrollHelper> {
    private final C7054oVa<r> a;

    public C5800j(C7054oVa<r> ova) {
        this.a = ova;
    }

    public static C5800j a(C7054oVa<r> ova) {
        return new C5800j(ova);
    }

    public BannerProfileScrollHelper get() {
        return new BannerProfileScrollHelper((r) this.a.get());
    }
}
