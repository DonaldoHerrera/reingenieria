package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.C0633a;

final class H implements C0633a {
    private final /* synthetic */ MediaNotificationService a;

    H(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void g() {
        this.a.stopForeground(true);
    }

    public final void h() {
        if (this.a.p != null) {
            MediaNotificationService mediaNotificationService = this.a;
            mediaNotificationService.startForeground(1, mediaNotificationService.p);
            return;
        }
        this.a.stopForeground(true);
    }
}
