package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: RoundedBitmapDrawable21 */
class b extends c {
    protected b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public void getOutline(Outline outline) {
        c();
        outline.setRoundRect(this.h, b());
    }
}
