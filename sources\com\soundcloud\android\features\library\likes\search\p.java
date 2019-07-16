package com.soundcloud.android.features.library.likes.search;

import android.widget.TextView;

/* compiled from: LikesSearchFragment.kt */
final class p implements C6708jQa {
    final /* synthetic */ r a;
    final /* synthetic */ q b;

    p(r rVar, q qVar) {
        this.a = rVar;
        this.b = qVar;
    }

    public final void cancel() {
        TextView b2 = this.a.a.m;
        if (b2 != null) {
            b2.removeTextChangedListener(this.b);
        } else {
            C7471uYa.a();
            throw null;
        }
    }
}
