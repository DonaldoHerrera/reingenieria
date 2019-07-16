package com.soundcloud.android.tracks;

import android.content.res.Resources;

/* renamed from: com.soundcloud.android.tracks.la reason: case insensitive filesystem */
/* compiled from: TrackInfoPresenter_Factory */
public final class C6182la implements C4961HMa<C6179ka> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<C5408WFa> b;
    private final C7054oVa<Va> c;

    public static C6179ka a(Resources resources, C5408WFa wFa, Va va) {
        return new C6179ka(resources, wFa, va);
    }

    public C6179ka get() {
        return new C6179ka((Resources) this.a.get(), (C5408WFa) this.b.get(), (Va) this.c.get());
    }
}
