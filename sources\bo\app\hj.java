package bo.app;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.Field;

public class hj extends hk {
    public hj(ImageView imageView) {
        super(imageView);
    }

    public int a() {
        int a = super.a();
        if (a > 0) {
            return a;
        }
        ImageView imageView = (ImageView) this.a.get();
        return imageView != null ? a((Object) imageView, "mMaxWidth") : a;
    }

    public int b() {
        int b = super.b();
        if (b > 0) {
            return b;
        }
        ImageView imageView = (ImageView) this.a.get();
        return imageView != null ? a((Object) imageView, "mMaxHeight") : b;
    }

    public gw c() {
        ImageView imageView = (ImageView) this.a.get();
        if (imageView != null) {
            return gw.a(imageView);
        }
        return super.c();
    }

    /* renamed from: g */
    public ImageView d() {
        return (ImageView) super.d();
    }

    /* access modifiers changed from: protected */
    public void a(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    /* access modifiers changed from: protected */
    public void a(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    private static int a(Object obj, String str) {
        try {
            Field declaredField = ImageView.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(obj)).intValue();
            if (intValue <= 0 || intValue >= Integer.MAX_VALUE) {
                return 0;
            }
            return intValue;
        } catch (Exception e) {
            hr.a((Throwable) e);
            return 0;
        }
    }
}
