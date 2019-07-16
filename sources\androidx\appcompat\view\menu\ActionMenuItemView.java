package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.va;

public class ActionMenuItemView extends AppCompatTextView implements androidx.appcompat.view.menu.w.a, OnClickListener, androidx.appcompat.widget.ActionMenuView.a {
    p d;
    private CharSequence e;
    private Drawable f;
    androidx.appcompat.view.menu.l.b g;
    private H h;
    b i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    private class a extends H {
        public a() {
            super(ActionMenuItemView.this);
        }

        public z a() {
            b bVar = ActionMenuItemView.this.i;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            androidx.appcompat.view.menu.l.b bVar = actionMenuItemView.g;
            if (bVar == null || !bVar.a(actionMenuItemView.d)) {
                return false;
            }
            z a = a();
            if (a == null || !a.d()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract z a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && (!this.d.n() || (!this.j && !this.k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.e : null);
        CharSequence contentDescription = this.d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.d.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.d.getTitle();
            }
            va.a(this, charSequence2);
            return;
        }
        va.a(this, tooltipText);
    }

    public void a(p pVar, int i2) {
        this.d = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.a((androidx.appcompat.view.menu.w.a) this));
        setId(pVar.getItemId());
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.h == null) {
            this.h = new a();
        }
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return d();
    }

    public boolean c() {
        return d() && this.d.getIcon() == null;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public p getItemData() {
        return this.d;
    }

    public void onClick(View view) {
        androidx.appcompat.view.menu.l.b bVar = this.g;
        if (bVar != null) {
            bVar.a(this.d);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j = e();
        f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean d2 = d();
        if (d2) {
            int i4 = this.m;
            if (i4 >= 0) {
                super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i2, i3);
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.l) : this.l;
        if (mode != 1073741824 && this.l > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!d2 && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d.hasSubMenu()) {
            H h2 = this.h;
            if (h2 != null && h2.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.k != z) {
            this.k = z;
            p pVar = this.d;
            if (pVar != null) {
                pVar.b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.n;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.n;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(androidx.appcompat.view.menu.l.b bVar) {
        this.g = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.m = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.i = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.e = charSequence;
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.j = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1406j.ActionMenuItemView, i2, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(C1406j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.m = -1;
        setSaveEnabled(false);
    }
}
