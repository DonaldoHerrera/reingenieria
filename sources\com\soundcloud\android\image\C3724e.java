package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.soundcloud.android.image.sa.g;

/* renamed from: com.soundcloud.android.image.e reason: case insensitive filesystem */
/* compiled from: CircularPlaceholderGenerator */
public class C3724e extends qa {
    C3724e(Resources resources) {
        super(resources);
    }

    /* access modifiers changed from: protected */
    public Drawable a() {
        return this.b.getDrawable(g.circular_placeholder);
    }

    public GradientDrawable a(String str) {
        GradientDrawable a = super.a(str);
        a.setShape(1);
        return a;
    }
}
