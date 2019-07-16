package com.soundcloud.android.tracks;

/* renamed from: com.soundcloud.android.tracks.p reason: case insensitive filesystem */
/* compiled from: DefaultTrackEngagements_Factory */
public final class C6191p implements C4961HMa<C6189o> {
    private final C7054oVa<C6614hxa> a;
    private final C7054oVa<C5052KJa> b;

    public C6191p(C7054oVa<C6614hxa> ova, C7054oVa<C5052KJa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6191p a(C7054oVa<C6614hxa> ova, C7054oVa<C5052KJa> ova2) {
        return new C6191p(ova, ova2);
    }

    public C6189o get() {
        return new C6189o((C6614hxa) this.a.get(), (C5052KJa) this.b.get());
    }
}
