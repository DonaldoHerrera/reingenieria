package com.soundcloud.android.profile;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.e.j;

/* renamed from: com.soundcloud.android.profile.wa reason: case insensitive filesystem */
/* compiled from: ProfileHeaderPresenter.kt */
final class C5865wa implements OnClickListener {
    final /* synthetic */ C5850ta a;
    final /* synthetic */ C3784hea b;

    C5865wa(C5850ta taVar, C3784hea hea) {
        this.a = taVar;
        this.b = hea;
    }

    public final void onClick(View view) {
        C6614hxa d = this.a.r;
        Context context = this.a.c().getContext();
        C7471uYa.a((Object) context, "followButton.context");
        d.a(context, Nca.a(this.b));
        this.a.s.a((C3702d) j.c);
    }
}
