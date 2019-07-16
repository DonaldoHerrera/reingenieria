package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.profile.wb reason: case insensitive filesystem */
/* compiled from: UserFollowRenderer.kt */
final class C5866wb implements OnClickListener {
    final /* synthetic */ C5856ub a;
    final /* synthetic */ Gb b;

    C5866wb(C5856ub ubVar, Gb gb) {
        this.a = ubVar;
        this.b = gb;
    }

    public final void onClick(View view) {
        this.a.c.a(this.b);
    }
}
