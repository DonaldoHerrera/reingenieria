package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import com.google.android.gms.internal.cast.Ra;

final class G implements Ra {
    private final /* synthetic */ a a;
    private final /* synthetic */ MediaNotificationService b;

    G(MediaNotificationService mediaNotificationService, a aVar) {
        this.b = mediaNotificationService;
        this.a = aVar;
    }

    public final void a(Bitmap bitmap) {
        a aVar = this.a;
        aVar.b = bitmap;
        this.b.o = aVar;
        this.b.b();
    }
}
