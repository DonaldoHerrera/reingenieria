package com.google.android.material.chip;

import android.graphics.Typeface;

/* compiled from: Chip */
class a extends defpackage.C0277Xa.a {
    final /* synthetic */ Chip a;

    a(Chip chip) {
        this.a = chip;
    }

    public void a(int i) {
    }

    public void a(Typeface typeface) {
        Chip chip = this.a;
        chip.setText(chip.getText());
        this.a.requestLayout();
        this.a.invalidate();
    }
}
