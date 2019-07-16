package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.na;

public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        na a2 = na.a(context, attributeSet, Dz.TabItem);
        this.a = a2.e(Dz.TabItem_android_text);
        this.b = a2.b(Dz.TabItem_android_icon);
        this.c = a2.g(Dz.TabItem_android_layout, 0);
        a2.a();
    }
}
