package com.soundcloud.android.features.library.likes;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.likes.w.a;
import com.soundcloud.android.likes.S;

/* renamed from: com.soundcloud.android.features.library.likes.t reason: case insensitive filesystem */
/* compiled from: TrackLikesHeaderRenderer.kt */
final class C3619t implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ S b;

    C3619t(a aVar, S s) {
        this.a = aVar;
        this.b = s;
    }

    public final void onClick(View view) {
        this.a.e.b.accept(RVa.a);
    }
}
