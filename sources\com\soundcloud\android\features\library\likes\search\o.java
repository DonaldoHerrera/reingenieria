package com.soundcloud.android.features.library.likes.search;

import android.view.View;

/* compiled from: LikesSearchFragment.kt */
final class o<T> implements CPa<T> {
    final /* synthetic */ LikesSearchFragment a;

    o(LikesSearchFragment likesSearchFragment) {
        this.a = likesSearchFragment;
    }

    public final void a(BPa<RVa> bPa) {
        C7471uYa.b(bPa, "emitter");
        View a2 = this.a.p;
        if (a2 != null) {
            a2.setOnClickListener(new C3617m(bPa));
            bPa.a((C6708jQa) new C3618n(this));
            return;
        }
        C7471uYa.a();
        throw null;
    }
}
