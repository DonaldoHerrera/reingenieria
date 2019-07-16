package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.profile.P.d;

/* compiled from: ProfileBucketsPlaylistItemRenderer.kt */
final class U implements OnClickListener {
    final /* synthetic */ V a;
    final /* synthetic */ d b;

    U(V v, d dVar) {
        this.a = v;
        this.b = dVar;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.d());
    }
}
