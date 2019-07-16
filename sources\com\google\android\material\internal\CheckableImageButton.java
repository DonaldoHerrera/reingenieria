package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] c = {16842912};
    private boolean d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isChecked() {
        return this.d;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.d) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + c.length), c);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.d != z) {
            this.d = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1778vc.a((View) this, (C0273Wb) new a(this));
    }
}
