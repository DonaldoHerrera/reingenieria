package com.soundcloud.android.playlist.view;

/* compiled from: PlaylistDetailsHeaderRendererFactory */
public final class Q {
    private final C7054oVa<C5745p> a;
    private final C7054oVa<Y> b;

    public Q(C7054oVa<C5745p> ova, C7054oVa<Y> ova2) {
        a(ova, 1);
        this.a = ova;
        a(ova2, 2);
        this.b = ova2;
    }

    public P a(T t) {
        Object obj = this.a.get();
        a(obj, 1);
        C5745p pVar = (C5745p) obj;
        Object obj2 = this.b.get();
        a(obj2, 2);
        Y y = (Y) obj2;
        a(t, 3);
        return new P(pVar, y, t);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
