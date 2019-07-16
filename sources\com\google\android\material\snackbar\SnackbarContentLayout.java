package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements n {
    private TextView a;
    private Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        a((View) this.a, i2, i3);
        return true;
    }

    public void b(int i, int i2) {
        this.a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(C1891yz.snackbar_text);
        this.b = (Button) findViewById(C1891yz.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0062;
     */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.c > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.c;
            if (measuredWidth > i3) {
                i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1831wz.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C1831wz.design_snackbar_padding_vertical);
        boolean z = true;
        boolean z2 = this.a.getLayout().getLineCount() > 1;
        if (!z2 || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        z = false;
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dz.SnackbarLayout);
        this.c = obtainStyledAttributes.getDimensionPixelSize(Dz.SnackbarLayout_android_maxWidth, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(Dz.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i, int i2) {
        if (C1778vc.D(view)) {
            C1778vc.b(view, C1778vc.p(view), i, C1778vc.o(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    public void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
