package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21 */
class h extends g {
    private static Method h;

    h(Drawable drawable) {
        super(drawable);
        d();
    }

    private void d() {
        if (h == null) {
            try {
                h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.g.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.g.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.g.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (b()) {
            super.setTint(i);
        } else {
            this.g.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (b()) {
            super.setTintList(colorStateList);
        } else {
            this.g.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (b()) {
            super.setTintMode(mode);
        } else {
            this.g.setTintMode(mode);
        }
    }

    h(i iVar, Resources resources) {
        super(iVar, resources);
        d();
    }
}
