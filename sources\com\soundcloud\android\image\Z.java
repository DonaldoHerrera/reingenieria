package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import androidx.core.graphics.drawable.c;
import androidx.core.graphics.drawable.d;

/* compiled from: ImageUtils */
public final class Z {

    /* compiled from: ImageUtils */
    public static abstract class a implements C3736q {
    }

    static boolean a(Resources resources) {
        return (resources.getConfiguration().screenLayout & 15) == 4;
    }

    static TransitionDrawable a(Drawable drawable, Drawable drawable2) {
        Drawable[] drawableArr = new Drawable[2];
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        return new ea(drawableArr);
    }

    public static Bitmap a(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static c a(Bitmap bitmap, Resources resources) {
        c a2 = d.a(resources, bitmap);
        a2.a(true);
        return a2;
    }
}
