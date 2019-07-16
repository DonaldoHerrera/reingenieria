package com.soundcloud.android.features.library.likes;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.likes.w.a;
import com.soundcloud.android.likes.S;

/* compiled from: TrackLikesHeaderRenderer.kt */
final class r implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ S b;

    r(a aVar, S s) {
        this.a = aVar;
        this.b = s;
    }

    public final void onClick(View view) {
        this.a.e.e.accept(Boolean.valueOf(!this.b.b()));
    }
}
