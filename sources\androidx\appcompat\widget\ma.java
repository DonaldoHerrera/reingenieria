package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
class ma extends P {
    private final WeakReference<Context> b;

    public ma(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.b.get();
        if (!(drawable == null || context == null)) {
            C0350q.a();
            C0350q.a(context, i, drawable);
        }
        return drawable;
    }
}
