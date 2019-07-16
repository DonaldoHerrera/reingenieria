package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: Iz reason: default package */
/* compiled from: DrawableAlphaProperty */
public class Iz extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new Iz();
    private final WeakHashMap<Drawable, Integer> b = new WeakHashMap<>();

    private Iz() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.b.containsKey(drawable)) {
            return (Integer) this.b.get(drawable);
        }
        return Integer.valueOf(255);
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.b.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
