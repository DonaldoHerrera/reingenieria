package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import com.soundcloud.android.ia.d;
import com.soundcloud.android.ia.r;

public class IconToggleButton extends AppCompatImageButton implements Checkable {
    private static final int[] c = {d.checked};
    private boolean d;

    public IconToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    public boolean isChecked() {
        return this.d;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            ImageButton.mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setChecked(boolean z) {
        if (this.d != z) {
            this.d = z;
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!this.d);
    }

    public IconToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.IconToggleButton, i, 0);
        setChecked(obtainStyledAttributes.getBoolean(r.IconToggleButton_checked, false));
        obtainStyledAttributes.recycle();
    }
}
