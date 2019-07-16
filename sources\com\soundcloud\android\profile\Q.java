package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.profile.P.d;

/* compiled from: ProfileBucketsPlaylistCardRenderer.kt */
final class Q implements OnClickListener {
    final /* synthetic */ S a;
    final /* synthetic */ d b;

    Q(S s, d dVar) {
        this.a = s;
        this.b = dVar;
    }

    public final void onClick(View view) {
        this.a.a().a(this.b.d());
    }
}
