package com.soundcloud.android.more;

import android.view.View;
import com.soundcloud.android.properties.a;

/* compiled from: MoreViewFactory */
class E {
    private final C7054oVa<C7181qKa> a;
    private final C7054oVa<a> b;

    E(C7054oVa<C7181qKa> ova, C7054oVa<a> ova2) {
        a((T) ova, 1);
        this.a = ova;
        a((T) ova2, 2);
        this.b = ova2;
    }

    /* access modifiers changed from: 0000 */
    public D a(View view, a aVar) {
        a((T) view, 1);
        View view2 = view;
        a((T) aVar, 2);
        a aVar2 = aVar;
        Object obj = this.a.get();
        a((T) obj, 3);
        C7181qKa qka = (C7181qKa) obj;
        Object obj2 = this.b.get();
        a((T) obj2, 4);
        return new D(view2, aVar2, qka, (a) obj2);
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
