package com.soundcloud.android.comments;

/* compiled from: CommentsPageMapper_Factory */
public final class X implements C4961HMa<W> {
    private final C7054oVa<C5141NFa> a;
    private final C7054oVa<Ica> b;

    public X(C7054oVa<C5141NFa> ova, C7054oVa<Ica> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static X a(C7054oVa<C5141NFa> ova, C7054oVa<Ica> ova2) {
        return new X(ova, ova2);
    }

    public W get() {
        return new W((C5141NFa) this.a.get(), (Ica) this.b.get());
    }
}
