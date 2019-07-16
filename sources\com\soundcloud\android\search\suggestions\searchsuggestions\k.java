package com.soundcloud.android.search.suggestions.searchsuggestions;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: SearchSuggestionsUniflowPresenter_Factory */
public final class k implements C4961HMa<j> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<a> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<C7504uwa> d;

    public k(C7054oVa<HPa> ova, C7054oVa<a> ova2, C7054oVa<C3700b> ova3, C7054oVa<C7504uwa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static k a(C7054oVa<HPa> ova, C7054oVa<a> ova2, C7054oVa<C3700b> ova3, C7054oVa<C7504uwa> ova4) {
        return new k(ova, ova2, ova3, ova4);
    }

    public j get() {
        return new j((HPa) this.a.get(), (a) this.b.get(), (C3700b) this.c.get(), (C7504uwa) this.d.get());
    }
}
