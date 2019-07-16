package com.facebook.share.internal;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.facebook.share.internal.a reason: case insensitive filesystem */
/* compiled from: DeviceShareDialogFragment */
class C0589a implements OnClickListener {
    final /* synthetic */ DeviceShareDialogFragment a;

    C0589a(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.a = deviceShareDialogFragment;
    }

    public void onClick(View view) {
        this.a.d.dismiss();
    }
}
