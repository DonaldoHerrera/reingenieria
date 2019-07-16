package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* compiled from: WrappedDrawableApi14 */
class g extends Drawable implements Callback, f, e {
    static final Mode a = Mode.SRC_IN;
    private int b;
    private Mode c;
    private boolean d;
    i e;
    private boolean f;
    Drawable g;

    g(i iVar, Resources resources) {
        this.e = iVar;
        a(resources);
    }

    private void a(Resources resources) {
        i iVar = this.e;
        if (iVar != null) {
            ConstantState constantState = iVar.b;
            if (constantState != null) {
                a(constantState.newDrawable(resources));
            }
        }
    }

    private i c() {
        return new i(this.e);
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        i iVar = this.e;
        return changingConfigurations | (iVar != null ? iVar.getChangingConfigurations() : 0) | this.g.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        i iVar = this.e;
        if (iVar == null || !iVar.a()) {
            return null;
        }
        this.e.a = getChangingConfigurations();
        return this.e;
    }

    public Drawable getCurrent() {
        return this.g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.g.getPadding(rect);
    }

    public int[] getState() {
        return this.g.getState();
    }

    public Region getTransparentRegion() {
        return this.g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.g.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (b()) {
            i iVar = this.e;
            if (iVar != null) {
                colorStateList = iVar.c;
                return (colorStateList == null && colorStateList.isStateful()) || this.g.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.e = c();
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.mutate();
            }
            i iVar = this.e;
            if (iVar != null) {
                Drawable drawable2 = this.g;
                iVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.g.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.g.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.g.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.g.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.g.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.g.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.e.c = colorStateList;
        a(getState());
    }

    public void setTintMode(Mode mode) {
        this.e.d = mode;
        a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.g.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    private boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        i iVar = this.e;
        ColorStateList colorStateList = iVar.c;
        Mode mode = iVar.d;
        if (colorStateList == null || mode == null) {
            this.d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.d && colorForState == this.b && mode == this.c)) {
                setColorFilter(colorForState, mode);
                this.b = colorForState;
                this.c = mode;
                this.d = true;
                return true;
            }
        }
        return false;
    }

    g(Drawable drawable) {
        this.e = c();
        a(drawable);
    }

    public final Drawable a() {
        return this.g;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            i iVar = this.e;
            if (iVar != null) {
                iVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
