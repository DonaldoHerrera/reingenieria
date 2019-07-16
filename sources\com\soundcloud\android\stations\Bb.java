package com.soundcloud.android.stations;

import android.view.View;

/* compiled from: StationMenuRendererFactory */
class Bb {
    private final C7054oVa<a> a;

    Bb(C7054oVa<a> ova) {
        a((T) ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public Ab a(a aVar, View view) {
        a((T) aVar, 1);
        a aVar2 = aVar;
        a((T) view, 2);
        View view2 = view;
        Object obj = this.a.get();
        a((T) obj, 3);
        return new Ab(aVar2, view2, (a) obj);
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
