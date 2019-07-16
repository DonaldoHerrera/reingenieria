package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.RectF;

/* renamed from: com.google.android.gms.internal.cast.k reason: case insensitive filesystem */
final class C0713k implements Ra {
    private final /* synthetic */ C0709i a;

    C0713k(C0709i iVar) {
        this.a = iVar;
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = (float) width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (float) ((i - height) / 2);
            RectF rectF = new RectF(0.0f, f2, f, ((float) height) + f2);
            Config config = bitmap.getConfig();
            if (config == null) {
                config = Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(createBitmap).drawBitmap(bitmap, null, rectF, null);
            bitmap2 = createBitmap;
        }
        this.a.a(bitmap2, 0);
    }
}
