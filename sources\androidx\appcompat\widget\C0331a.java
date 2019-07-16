package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: androidx.appcompat.widget.a reason: case insensitive filesystem */
/* compiled from: AbsActionBarView */
abstract class C0331a extends ViewGroup {
    protected final C0003a a;
    protected final Context b;
    protected ActionMenuView c;
    protected ActionMenuPresenter d;
    protected int e;
    protected Ec f;
    private boolean g;
    private boolean h;

    /* renamed from: androidx.appcompat.widget.a$a reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    protected class C0003a implements Fc {
        private boolean a = false;
        int b;

        protected C0003a() {
        }

        public C0003a a(Ec ec, int i) {
            C0331a.this.f = ec;
            this.b = i;
            return this;
        }

        public void b(View view) {
            if (!this.a) {
                C0331a aVar = C0331a.this;
                aVar.f = null;
                C0331a.super.setVisibility(this.b);
            }
        }

        public void c(View view) {
            C0331a.super.setVisibility(0);
            this.a = false;
        }

        public void a(View view) {
            this.a = true;
        }
    }

    C0331a(Context context) {
        this(context, null);
    }

    protected static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getAnimatedVisibility() {
        if (this.f != null) {
            return this.a.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C1406j.ActionBar, C0294a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1406j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            Ec ec = this.f;
            if (ec != null) {
                ec.a();
            }
            super.setVisibility(i);
        }
    }

    C0331a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Ec a(int i, long j) {
        Ec ec = this.f;
        if (ec != null) {
            ec.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            Ec a2 = C1778vc.a(this);
            a2.a(1.0f);
            a2.a(j);
            C0003a aVar = this.a;
            aVar.a(a2, i);
            a2.a((Fc) aVar);
            return a2;
        }
        Ec a3 = C1778vc.a(this);
        a3.a(0.0f);
        a3.a(j);
        C0003a aVar2 = this.a;
        aVar2.a(a3, i);
        a3.a((Fc) aVar2);
        return a3;
    }

    C0331a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new C0003a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0294a.actionBarPopupTheme, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(context, i2);
                return;
            }
        }
        this.b = context;
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    public int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
