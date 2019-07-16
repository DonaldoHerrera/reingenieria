package com.soundcloud.android.playlist.view;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;

/* renamed from: com.soundcloud.android.playlist.view.l reason: case insensitive filesystem */
/* compiled from: OtherPlaylistsByUserAdapterFactory */
public final class C5741l {
    private final C7054oVa<C5294SIa> a;
    private final C7054oVa<F> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C4655rja> d;

    public C5741l(C7054oVa<C5294SIa> ova, C7054oVa<F> ova2, C7054oVa<C3700b> ova3, C7054oVa<C4655rja> ova4) {
        a(ova, 1);
        this.a = ova;
        a(ova2, 2);
        this.b = ova2;
        a(ova3, 3);
        this.c = ova3;
        a(ova4, 4);
        this.d = ova4;
    }

    public C5740k a() {
        Object obj = this.a.get();
        a(obj, 1);
        C5294SIa sIa = (C5294SIa) obj;
        Object obj2 = this.b.get();
        a(obj2, 2);
        F f = (F) obj2;
        Object obj3 = this.c.get();
        a(obj3, 3);
        C3700b bVar = (C3700b) obj3;
        Object obj4 = this.d.get();
        a(obj4, 4);
        return new C5740k(sIa, f, bVar, (C4655rja) obj4);
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
