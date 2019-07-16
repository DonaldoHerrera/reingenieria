package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

/* renamed from: ks reason: default package and case insensitive filesystem */
public final class C1460ks extends Drawable implements Callback {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private C1584os j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    public C1460ks(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = C1522ms.a;
        }
        this.k = drawable;
        drawable.setCallback(this);
        C1584os osVar = this.j;
        osVar.b = drawable.getChangingConfigurations() | osVar.b;
        if (drawable2 == null) {
            drawable2 = C1522ms.a;
        }
        this.l = drawable2;
        drawable2.setCallback(this);
        C1584os osVar2 = this.j;
        osVar2.b = drawable2.getChangingConfigurations() | osVar2.b;
    }

    private final boolean b() {
        if (!this.m) {
            this.n = (this.k.getConstantState() == null || this.l.getConstantState() == null) ? false : true;
            this.m = true;
        }
        return this.n;
    }

    public final Drawable a() {
        return this.l;
    }

    public final void draw(Canvas canvas) {
        int i2 = this.a;
        boolean z = true;
        if (i2 == 1) {
            this.b = SystemClock.uptimeMillis();
            this.a = 2;
            z = false;
        } else if (i2 == 2 && this.b >= 0) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / ((float) this.f);
            if (uptimeMillis < 1.0f) {
                z = false;
            }
            if (z) {
                this.a = 0;
            }
            this.g = (int) ((((float) this.d) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
        }
        int i3 = this.g;
        boolean z2 = this.h;
        Drawable drawable = this.k;
        Drawable drawable2 = this.l;
        if (z) {
            if (!z2 || i3 == 0) {
                drawable.draw(canvas);
            }
            int i4 = this.e;
            if (i3 == i4) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.e - i3);
        }
        drawable.draw(canvas);
        if (z2) {
            drawable.setAlpha(this.e);
        }
        if (i3 > 0) {
            drawable2.setAlpha(i3);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.e);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C1584os osVar = this.j;
        return changingConfigurations | osVar.a | osVar.b;
    }

    public final ConstantState getConstantState() {
        if (!b()) {
            return null;
        }
        this.j.a = getChangingConfigurations();
        return this.j;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.k.getIntrinsicHeight(), this.l.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.k.getIntrinsicWidth(), this.l.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.o) {
            this.p = Drawable.resolveOpacity(this.k.getOpacity(), this.l.getOpacity());
            this.o = true;
        }
        return this.p;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            if (b()) {
                this.k.mutate();
                this.l.mutate();
                this.i = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.k.setBounds(rect);
        this.l.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public final void setAlpha(int i2) {
        if (this.g == this.e) {
            this.g = i2;
        }
        this.e = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        this.l.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void a(int i2) {
        this.c = 0;
        this.d = this.e;
        this.g = 0;
        this.f = 250;
        this.a = 1;
        invalidateSelf();
    }

    C1460ks(C1584os osVar) {
        this.a = 0;
        this.e = 255;
        this.g = 0;
        this.h = true;
        this.j = new C1584os(osVar);
    }
}
