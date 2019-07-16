package com.soundcloud.android.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.soundcloud.android.stream.C6114y;

/* compiled from: InlayAdHelperFactory */
class Rb {
    private final C7054oVa<C5694cGa> a;
    private final C7054oVa<C5327TLa> b;

    Rb(C7054oVa<C5694cGa> ova, C7054oVa<C5327TLa> ova2) {
        a((T) ova, 1);
        this.a = ova;
        a((T) ova2, 2);
        this.b = ova2;
    }

    /* access modifiers changed from: 0000 */
    public Qb a(RecyclerView recyclerView, C6114y yVar) {
        a((T) recyclerView, 1);
        RecyclerView recyclerView2 = recyclerView;
        a((T) yVar, 2);
        C6114y yVar2 = yVar;
        Object obj = this.a.get();
        a((T) obj, 3);
        C5694cGa cga = (C5694cGa) obj;
        Object obj2 = this.b.get();
        a((T) obj2, 4);
        return new Qb(recyclerView2, yVar2, cga, (C5327TLa) obj2);
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
