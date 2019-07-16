package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.CustomFontToggleButton;

public class ProfileToggleButton extends CustomFontToggleButton {
    private int a;
    private int b;
    private final int c;
    private final int d;
    private final boolean e;

    public ProfileToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(boolean z) {
        if (z) {
            int i = this.a;
            if (i > 0) {
                a(Integer.valueOf(i));
                return;
            }
        }
        if (!z) {
            int i2 = this.b;
            if (i2 > 0) {
                a(Integer.valueOf(i2));
                return;
            }
        }
        b();
    }

    private void b() {
        setText(null);
        setPadding(getPaddingLeft(), getPaddingTop(), this.d, getPaddingBottom());
    }

    public void setChecked(boolean z) {
        a(z);
        super.setChecked(z);
    }

    public void setTextOff(int i) {
        this.b = i;
    }

    public void setTextOn(int i) {
        this.a = i;
    }

    public ProfileToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.ProfileToggleButton, i, 0);
        this.a = obtainStyledAttributes.getResourceId(r.ProfileToggleButton_textOn, -1);
        this.b = obtainStyledAttributes.getResourceId(r.ProfileToggleButton_textOff, -1);
        this.c = obtainStyledAttributes.getDimensionPixelSize(r.ProfileToggleButton_textPaddingRight, 0);
        this.e = obtainStyledAttributes.getBoolean(r.ProfileToggleButton_alwaysShowText, false);
        this.d = getPaddingRight();
        obtainStyledAttributes.recycle();
        setChecked(isChecked());
    }

    private void a(Integer num) {
        setText(num.intValue());
        setPadding(getPaddingLeft(), getPaddingTop(), this.d + this.c, getPaddingBottom());
    }

    public boolean a() {
        return this.e;
    }
}
