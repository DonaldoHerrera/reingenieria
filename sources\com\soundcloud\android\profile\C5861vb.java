package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.profile.vb reason: case insensitive filesystem */
/* compiled from: UserFollowRenderer.kt */
final class C5861vb implements OnClickListener {
    final /* synthetic */ C5856ub a;
    final /* synthetic */ Gb b;

    C5861vb(C5856ub ubVar, Gb gb) {
        this.a = ubVar;
        this.b = gb;
    }

    public final void onClick(View view) {
        this.a.b.a(this.b);
    }
}
