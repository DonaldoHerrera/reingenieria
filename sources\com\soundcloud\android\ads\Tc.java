package com.soundcloud.android.ads;

import com.soundcloud.android.ads.Zc.a;
import com.soundcloud.android.foundation.ads.X;

/* compiled from: PrestitialAdapterFactory */
class Tc {
    private final C7054oVa<bd> a;

    Tc(C7054oVa<bd> ova) {
        a(ova, 1);
        this.a = ova;
    }

    /* access modifiers changed from: 0000 */
    public Sc a(X x, a aVar, dd ddVar) {
        a(x, 1);
        X x2 = x;
        a(aVar, 2);
        a aVar2 = aVar;
        a(ddVar, 3);
        dd ddVar2 = ddVar;
        Object obj = this.a.get();
        a(obj, 4);
        return new Sc(x2, aVar2, ddVar2, (bd) obj);
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
