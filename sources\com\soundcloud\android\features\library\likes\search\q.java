package com.soundcloud.android.features.library.likes.search;

import android.text.Editable;
import com.soundcloud.android.features.library.likes.search.LikesSearchFragment.c;

/* compiled from: LikesSearchFragment.kt */
public final class q extends c {
    final /* synthetic */ BPa a;

    q(BPa bPa) {
        this.a = bPa;
    }

    public void afterTextChanged(Editable editable) {
        C7471uYa.b(editable, "s");
        this.a.a(editable.toString());
    }
}
