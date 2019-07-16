package com.facebook.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

/* compiled from: WebDialog */
class ka implements OnCancelListener {
    final /* synthetic */ oa a;

    ka(oa oaVar) {
        this.a = oaVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
