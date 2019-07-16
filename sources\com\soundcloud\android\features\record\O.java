package com.soundcloud.android.features.record;

import com.soundcloud.android.utilities.android.q;

/* compiled from: RecordPresenter_Factory */
public final class O implements C4961HMa<N> {
    private final C7054oVa<S> a;
    private final C7054oVa<q> b;
    private final C7054oVa<ba> c;
    private final C7054oVa<J> d;

    public static N a(S s, q qVar, ba baVar, J j) {
        return new N(s, qVar, baVar, j);
    }

    public N get() {
        return new N((S) this.a.get(), (q) this.b.get(), (ba) this.c.get(), (J) this.d.get());
    }
}
