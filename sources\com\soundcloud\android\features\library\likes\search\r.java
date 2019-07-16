package com.soundcloud.android.features.library.likes.search;

import android.widget.TextView;

/* compiled from: LikesSearchFragment.kt */
final class r<T> implements CPa<T> {
    final /* synthetic */ LikesSearchFragment a;

    r(LikesSearchFragment likesSearchFragment) {
        this.a = likesSearchFragment;
    }

    public final void a(BPa<String> bPa) {
        C7471uYa.b(bPa, "emitter");
        q qVar = new q(bPa);
        TextView b = this.a.m;
        if (b != null) {
            b.addTextChangedListener(qVar);
            bPa.a((C6708jQa) new p(this, qVar));
            return;
        }
        C7471uYa.a();
        throw null;
    }
}
