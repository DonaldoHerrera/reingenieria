package com.soundcloud.android.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import com.soundcloud.android.ia.p;

public class OverflowAnchorImageButton extends AppCompatImageButton {
    public OverflowAnchorImageButton(Context context) {
        super(context);
        a();
    }

    private void a() {
        setContentDescription(getResources().getString(p.accessibility_overflow));
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        return false;
    }

    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }

    public OverflowAnchorImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public OverflowAnchorImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
