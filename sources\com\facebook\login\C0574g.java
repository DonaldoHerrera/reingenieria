package com.facebook.login;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.facebook.login.g reason: case insensitive filesystem */
/* compiled from: DeviceAuthDialog */
class C0574g implements OnClickListener {
    final /* synthetic */ DeviceAuthDialog a;

    C0574g(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.i.setContentView(this.a.g(false));
        DeviceAuthDialog deviceAuthDialog = this.a;
        deviceAuthDialog.a(deviceAuthDialog.l);
    }
}
