package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;

/* compiled from: RoundedBitmapDrawableFactory */
public final class d {

    /* compiled from: RoundedBitmapDrawableFactory */
    private static class a extends c {
        a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
            C0287Zb.a(i, i2, i3, rect, rect2, 0);
        }
    }

    public static c a(Resources resources, Bitmap bitmap) {
        if (VERSION.SDK_INT >= 21) {
            return new b(resources, bitmap);
        }
        return new a(resources, bitmap);
    }
}
