package com.facebook.share.internal;

/* renamed from: com.facebook.share.internal.c reason: case insensitive filesystem */
/* compiled from: DeviceShareDialogFragment */
class C0591c implements Runnable {
    final /* synthetic */ DeviceShareDialogFragment a;

    C0591c(DeviceShareDialogFragment deviceShareDialogFragment) {
        this.a = deviceShareDialogFragment;
    }

    public void run() {
        this.a.d.dismiss();
    }
}
