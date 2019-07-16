package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.bb reason: case insensitive filesystem */
/* compiled from: PlayQueueExtenderOperations_Factory */
public final class C4286bb implements C4961HMa<C4281ab> {
    private final C7054oVa<efa> a;
    private final C7054oVa<C3768fea> b;
    private final C7054oVa<HPa> c;

    public C4286bb(C7054oVa<efa> ova, C7054oVa<C3768fea> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4286bb a(C7054oVa<efa> ova, C7054oVa<C3768fea> ova2, C7054oVa<HPa> ova3) {
        return new C4286bb(ova, ova2, ova3);
    }

    public C4281ab get() {
        return new C4281ab((efa) this.a.get(), (C3768fea) this.b.get(), (HPa) this.c.get());
    }
}
