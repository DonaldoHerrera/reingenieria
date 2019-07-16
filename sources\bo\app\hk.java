package bo.app;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class hk implements hi {
    protected Reference<View> a;
    protected boolean b;

    public hk(View view) {
        this(view, true);
    }

    public int a() {
        View view = (View) this.a.get();
        int i = 0;
        if (view == null) {
            return 0;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(!this.b || layoutParams == null || layoutParams.width == -2)) {
            i = view.getWidth();
        }
        return (i > 0 || layoutParams == null) ? i : layoutParams.width;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Bitmap bitmap, View view);

    /* access modifiers changed from: protected */
    public abstract void a(Drawable drawable, View view);

    public int b() {
        View view = (View) this.a.get();
        int i = 0;
        if (view == null) {
            return 0;
        }
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(!this.b || layoutParams == null || layoutParams.height == -2)) {
            i = view.getHeight();
        }
        return (i > 0 || layoutParams == null) ? i : layoutParams.height;
    }

    public gw c() {
        return gw.CROP;
    }

    public View d() {
        return (View) this.a.get();
    }

    public boolean e() {
        return this.a.get() == null;
    }

    public int f() {
        View view = (View) this.a.get();
        return view == null ? super.hashCode() : view.hashCode();
    }

    public hk(View view, boolean z) {
        if (view != null) {
            this.a = new WeakReference(view);
            this.b = z;
            return;
        }
        throw new IllegalArgumentException("view must not be null");
    }

    public boolean a(Drawable drawable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = (View) this.a.get();
            if (view != null) {
                a(drawable, view);
                return true;
            }
        } else {
            hr.c("Can't set a drawable into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }

    public boolean a(Bitmap bitmap) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = (View) this.a.get();
            if (view != null) {
                a(bitmap, view);
                return true;
            }
        } else {
            hr.c("Can't set a bitmap into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }
}
