package com.google.android.material.internal;

import android.graphics.Outline;

/* compiled from: CircularBorderDrawableLollipop */
public class d extends c {
    public void getOutline(Outline outline) {
        copyBounds(this.b);
        outline.setOval(this.b);
    }
}
