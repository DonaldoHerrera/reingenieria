package com.soundcloud.android.view.pageindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.soundcloud.android.ia;
import com.soundcloud.android.ia.d;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.j;
import com.soundcloud.android.ia.r;

public class CirclePageIndicator extends View implements c {
    private float a;
    private float b;
    private final Paint c;
    private final Paint d;
    private final Paint e;
    private ViewPager f;
    private e g;
    private int h;
    private int i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private float p;
    private int q;
    private boolean r;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new b();
        int a;

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private int c(int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        ViewPager viewPager = this.f;
        if (viewPager == null) {
            return size;
        }
        int a2 = viewPager.getAdapter().a();
        float paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
        float f2 = (float) (a2 * 2);
        float f3 = this.a;
        int i3 = (int) (paddingLeft + (f2 * f3) + (((float) (a2 - 1)) * f3) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i3, size) : i3;
    }

    private int d(int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.a * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public void a(int i2) {
        this.k = i2;
        e eVar = this.g;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void b(int i2) {
        if (this.n || this.k == 0) {
            this.h = i2;
            this.i = i2;
            invalidate();
        }
        e eVar = this.g;
        if (eVar != null) {
            eVar.b(i2);
        }
    }

    public int getFillColor() {
        return this.e.getColor();
    }

    public int getOrientation() {
        return this.l;
    }

    public int getPageColor() {
        return this.c.getColor();
    }

    public float getRadius() {
        return this.a;
    }

    public int getStrokeColor() {
        return this.d.getColor();
    }

    public float getStrokeWidth() {
        return this.d.getStrokeWidth();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        float f3;
        super.onDraw(canvas);
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            int a2 = viewPager.getAdapter().a();
            if (a2 != 0) {
                if (this.h >= a2) {
                    setCurrentItem(a2 - 1);
                    return;
                }
                if (this.l == 0) {
                    i5 = getWidth();
                    i4 = getPaddingLeft();
                    i3 = getPaddingRight();
                    i2 = getPaddingTop();
                } else {
                    i5 = getHeight();
                    i4 = getPaddingTop();
                    i3 = getPaddingBottom();
                    i2 = getPaddingLeft();
                }
                float f4 = this.a;
                float f5 = (f4 * 2.0f) + this.b;
                float f6 = ((float) i2) + f4;
                float f7 = ((float) i4) + (f4 * 2.0f);
                if (this.m) {
                    f7 += (((float) ((i5 - i4) - i3)) / 2.0f) - ((((float) a2) * f5) / 2.0f);
                }
                float f8 = this.a;
                if (this.d.getStrokeWidth() > 0.0f) {
                    f8 -= this.d.getStrokeWidth() / 2.0f;
                }
                for (int i6 = 0; i6 < a2; i6++) {
                    float f9 = (((float) i6) * f5) + f7;
                    if (this.l == 0) {
                        f3 = f6;
                    } else {
                        f3 = f9;
                        f9 = f6;
                    }
                    if (this.c.getAlpha() > 0) {
                        canvas.drawCircle(f9, f3, f8, this.c);
                    }
                    float f10 = this.a;
                    if (f8 != f10) {
                        canvas.drawCircle(f9, f3, f10, this.d);
                    }
                }
                float f11 = ((float) (this.n ? this.i : this.h)) * f5;
                if (!this.n) {
                    f11 += this.j * f5;
                }
                if (this.l == 0) {
                    f2 = f11 + f7;
                } else {
                    float f12 = f6;
                    f6 = f11 + f7;
                    f2 = f12;
                }
                canvas.drawCircle(f2, f6, this.a, this.e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.l == 0) {
            setMeasuredDimension(c(i2), d(i3));
        } else {
            setMeasuredDimension(d(i2), c(i3));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.a;
        this.h = i2;
        this.i = i2;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.h;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f;
        int i2 = 0;
        if (viewPager == null || viewPager.getAdapter().a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float c2 = C1229dc.c(motionEvent, C1229dc.a(motionEvent, this.q));
                    float f2 = c2 - this.p;
                    if (!this.r && Math.abs(f2) > ((float) this.o)) {
                        this.r = true;
                    }
                    if (this.r) {
                        this.p = c2;
                        if (this.f.e() || this.f.a()) {
                            this.f.b(f2);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a2 = C1229dc.a(motionEvent);
                        this.p = C1229dc.c(motionEvent, a2);
                        this.q = C1229dc.b(motionEvent, a2);
                    } else if (action == 6) {
                        int a3 = C1229dc.a(motionEvent);
                        if (C1229dc.b(motionEvent, a3) == this.q) {
                            if (a3 == 0) {
                                i2 = 1;
                            }
                            this.q = C1229dc.b(motionEvent, i2);
                        }
                        this.p = C1229dc.c(motionEvent, C1229dc.a(motionEvent, this.q));
                    }
                }
            }
            if (!this.r) {
                int a4 = this.f.getAdapter().a();
                float width = (float) getWidth();
                float f3 = width / 2.0f;
                float f4 = width / 6.0f;
                if (this.h > 0 && motionEvent.getX() < f3 - f4) {
                    if (action != 3) {
                        this.f.setCurrentItem(this.h - 1);
                    }
                    return true;
                } else if (this.h < a4 - 1 && motionEvent.getX() > f3 + f4) {
                    if (action != 3) {
                        this.f.setCurrentItem(this.h + 1);
                    }
                    return true;
                }
            }
            this.r = false;
            this.q = -1;
            if (this.f.e()) {
                this.f.c();
            }
        } else {
            this.q = C1229dc.b(motionEvent, 0);
            this.p = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.m = z;
        invalidate();
    }

    public void setCurrentItem(int i2) {
        ViewPager viewPager = this.f;
        if (viewPager != null) {
            viewPager.setCurrentItem(i2);
            this.h = i2;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i2) {
        this.e.setColor(i2);
        invalidate();
    }

    public void setOnPageChangeListener(e eVar) {
        this.g = eVar;
    }

    public void setOrientation(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.l = i2;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i2) {
        this.c.setColor(i2);
        invalidate();
    }

    public void setRadius(float f2) {
        this.a = f2;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setStrokeColor(int i2) {
        this.d.setColor(i2);
        invalidate();
    }

    public void setStrokeWidth(float f2) {
        this.d.setStrokeWidth(f2);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f = viewPager;
                this.f.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.p = -1.0f;
        this.q = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(f.default_circle_indicator_page_color);
            int color2 = resources.getColor(f.default_circle_indicator_fill_color);
            int integer = resources.getInteger(j.default_circle_indicator_orientation);
            int color3 = resources.getColor(f.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(g.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(g.default_circle_indicator_radius);
            boolean z = resources.getBoolean(ia.e.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(ia.e.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.CirclePageIndicator, i2, 0);
            this.m = obtainStyledAttributes.getBoolean(r.CirclePageIndicator_centered, z);
            this.l = obtainStyledAttributes.getInt(r.CirclePageIndicator_android_orientation, integer);
            this.c.setStyle(Style.FILL);
            this.c.setColor(obtainStyledAttributes.getColor(r.CirclePageIndicator_pageColor, color));
            this.d.setStyle(Style.STROKE);
            this.d.setColor(obtainStyledAttributes.getColor(r.CirclePageIndicator_strokeColor, color3));
            this.d.setStrokeWidth(obtainStyledAttributes.getDimension(r.CirclePageIndicator_strokeWidth, dimension));
            this.e.setStyle(Style.FILL);
            this.e.setColor(obtainStyledAttributes.getColor(r.CirclePageIndicator_fillColor, color2));
            this.a = obtainStyledAttributes.getDimension(r.CirclePageIndicator_radius, dimension2);
            this.b = obtainStyledAttributes.getDimension(r.CirclePageIndicator_spacing, dimension2);
            this.n = obtainStyledAttributes.getBoolean(r.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(r.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.o = C1808wc.b(ViewConfiguration.get(context));
        }
    }

    public void a(int i2, float f2, int i3) {
        this.h = i2;
        this.j = f2;
        invalidate();
        e eVar = this.g;
        if (eVar != null) {
            eVar.a(i2, f2, i3);
        }
    }
}
