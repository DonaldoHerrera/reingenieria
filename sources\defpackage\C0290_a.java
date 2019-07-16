package defpackage;

import android.graphics.Bitmap;
import android.os.Build.VERSION;

/* renamed from: _a reason: default package and case insensitive filesystem */
/* compiled from: BitmapCompat */
public final class C0290_a {
    public static int a(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }
}
