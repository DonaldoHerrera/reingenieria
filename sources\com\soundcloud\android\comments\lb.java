package com.soundcloud.android.comments;

/* compiled from: TrackCommentOperations_Factory */
public final class lb implements C4961HMa<gb> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C3800jea> c;
    private final C7054oVa<C3760eea> d;

    public lb(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C3800jea> ova3, C7054oVa<C3760eea> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static lb a(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C3800jea> ova3, C7054oVa<C3760eea> ova4) {
        return new lb(ova, ova2, ova3, ova4);
    }

    public gb get() {
        return new gb((efa) this.a.get(), (HPa) this.b.get(), (C3800jea) this.c.get(), (C3760eea) this.d.get());
    }
}
