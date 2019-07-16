package com.soundcloud.android.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.profile.Rb.a;

/* compiled from: UserListAdapter.kt */
final class Qb implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ C4954HFa b;

    Qb(a aVar, C4954HFa hFa) {
        this.a = aVar;
        this.b = hFa;
    }

    public final void onClick(View view) {
        this.a.a().a(new Hb(this.b.a(), null, 2, null));
    }
}
