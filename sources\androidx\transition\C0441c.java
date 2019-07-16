package androidx.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: androidx.transition.c reason: case insensitive filesystem */
/* compiled from: ChangeBounds */
class C0441c extends Property<Drawable, PointF> {
    private Rect a = new Rect();

    C0441c(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public void set(Drawable drawable, PointF pointF) {
        drawable.copyBounds(this.a);
        this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.a);
    }

    /* renamed from: a */
    public PointF get(Drawable drawable) {
        drawable.copyBounds(this.a);
        Rect rect = this.a;
        return new PointF((float) rect.left, (float) rect.top);
    }
}
