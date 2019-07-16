package defpackage;

import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: Oz reason: default package */
/* compiled from: CanvasCompat */
public class Oz {
    public static int a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
