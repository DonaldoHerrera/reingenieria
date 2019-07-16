package com.facebook.internal;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: WebDialog */
class la implements OnClickListener {
    final /* synthetic */ oa a;

    la(oa oaVar) {
        this.a = oaVar;
    }

    public void onClick(View view) {
        this.a.cancel();
    }
}
