package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* compiled from: VectorEnabledTintResources */
public class Aa extends Resources {
    private static boolean a = false;
    private final WeakReference<Context> b;

    public Aa(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.b = new WeakReference<>(context);
    }

    public static boolean b() {
        return a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    public final Drawable a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.b.get();
        if (context != null) {
            return C0350q.a().a(context, this, i);
        }
        return super.getDrawable(i);
    }

    public static boolean a() {
        return a;
    }
}
