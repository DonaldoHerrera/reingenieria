package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;

/* renamed from: com.google.android.gms.internal.cast.t reason: case insensitive filesystem */
final class C0729t implements Ra {
    private final /* synthetic */ C0728s a;

    C0729t(C0728s sVar) {
        this.a = sVar;
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.a.e != null) {
                this.a.e.setVisibility(4);
            }
            this.a.b.setVisibility(0);
            this.a.b.setImageBitmap(bitmap);
        }
    }
}
