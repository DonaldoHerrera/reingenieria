package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: CheckableImageButton */
class a extends C0273Wb {
    final /* synthetic */ CheckableImageButton d;

    a(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    public void a(View view, Mc mc) {
        super.a(view, mc);
        mc.c(true);
        mc.d(this.d.isChecked());
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }
}
