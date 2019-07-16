package com.soundcloud.android.features.library.likes.search;

import android.view.View;

/* renamed from: com.soundcloud.android.features.library.likes.search.n reason: case insensitive filesystem */
/* compiled from: LikesSearchFragment.kt */
final class C3618n implements C6708jQa {
    final /* synthetic */ o a;

    C3618n(o oVar) {
        this.a = oVar;
    }

    public final void cancel() {
        View a2 = this.a.a.p;
        if (a2 != null) {
            a2.setOnClickListener(null);
        } else {
            C7471uYa.a();
            throw null;
        }
    }
}
