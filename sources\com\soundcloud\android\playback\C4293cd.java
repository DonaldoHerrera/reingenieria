package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.cd reason: case insensitive filesystem */
/* compiled from: PlaylistExploder_Factory */
public final class C4293cd implements C4961HMa<Yc> {
    private final C7054oVa<C4909Fra> a;
    private final C7054oVa<C3814lca> b;

    public C4293cd(C7054oVa<C4909Fra> ova, C7054oVa<C3814lca> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4293cd a(C7054oVa<C4909Fra> ova, C7054oVa<C3814lca> ova2) {
        return new C4293cd(ova, ova2);
    }

    public Yc get() {
        return new Yc((C4909Fra) this.a.get(), (C3814lca) this.b.get());
    }
}
