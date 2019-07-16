package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class ActionBarContainer extends FrameLayout {
    private boolean a;
    private View b;
    private View c;
    private View d;
    Drawable e;
    Drawable f;
    Drawable g;
    boolean h;
    boolean i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful()) {
            this.e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f.setState(getDrawableState());
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = findViewById(C1283f.action_bar);
        this.d = findViewById(C1283f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i4, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.h) {
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.e != null) {
                if (this.c.getVisibility() == 0) {
                    this.e.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                } else {
                    View view2 = this.d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.e.setBounds(0, 0, 0, 0);
                    } else {
                        this.e.setBounds(this.d.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom());
                    }
                }
                z3 = true;
            }
            this.i = z4;
            if (z4) {
                Drawable drawable2 = this.f;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i2, int i3) {
        if (this.c == null && MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            int i4 = this.j;
            if (i4 >= 0) {
                i3 = MeasureSpec.makeMeasureSpec(Math.min(i4, MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i2, i3);
        if (this.c != null) {
            int mode = MeasureSpec.getMode(i3);
            View view = this.b;
            if (!(view == null || view.getVisibility() == 8 || mode == 1073741824)) {
                int i5 = !b(this.c) ? a(this.c) : !b(this.d) ? a(this.d) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i5 + a(this.b), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i3) : BaseClientBuilder.API_PRIORITY_OTHER));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.e);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.c;
            if (view != null) {
                this.e.setBounds(view.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
            }
        }
        boolean z = true;
        if (!this.h ? !(this.e == null && this.f == null) : this.g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.g);
        }
        this.g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h) {
                Drawable drawable3 = this.g;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.h ? this.e == null && this.f == null : this.g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.i) {
                Drawable drawable3 = this.f;
                if (drawable3 != null) {
                    drawable3.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.h ? !(this.e == null && this.f == null) : this.g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(T t) {
        View view = this.b;
        if (view != null) {
            removeView(view);
        }
        this.b = t;
        if (t != null) {
            addView(t);
            ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.e && !this.h) || (drawable == this.f && this.i) || ((drawable == this.g && this.h) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1778vc.a((View) this, (Drawable) new C0333b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1406j.ActionBar);
        this.e = obtainStyledAttributes.getDrawable(C1406j.ActionBar_background);
        this.f = obtainStyledAttributes.getDrawable(C1406j.ActionBar_backgroundStacked);
        this.j = obtainStyledAttributes.getDimensionPixelSize(C1406j.ActionBar_height, -1);
        if (getId() == C1283f.split_action_bar) {
            this.h = true;
            this.g = obtainStyledAttributes.getDrawable(C1406j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.h ? this.e == null && this.f == null : this.g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
