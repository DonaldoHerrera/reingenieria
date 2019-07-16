package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.google.android.gms.internal.cast.Ra;

final class d implements Ra {
    private final /* synthetic */ ExpandedControllerActivity a;

    d(ExpandedControllerActivity expandedControllerActivity) {
        this.a = expandedControllerActivity;
    }

    @TargetApi(23)
    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.a.E != null) {
                this.a.E.setVisibility(8);
            }
            if (this.a.D != null) {
                this.a.D.setVisibility(0);
                this.a.D.setImageBitmap(bitmap);
            }
        }
    }
}
