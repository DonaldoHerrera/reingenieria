package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import com.soundcloud.android.ia.q;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.a;

/* compiled from: SwipeToRemoveStyleAttributes */
public class Q {
    public final int a;
    public final float b;
    public final C4928GKa<String> c;
    public final int d;
    public final float e;
    public final Typeface f;

    Q(int i, float f2, String str, int i2, float f3, Typeface typeface) {
        this.a = i;
        this.b = f2;
        this.c = C4928GKa.b(str);
        this.d = i2;
        this.e = f3;
        this.f = typeface;
    }

    public static Q a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q.PlayQueue_Remove, r.PlayQueueSwipeRemoveItem);
        Q q = new Q(obtainStyledAttributes.getColor(r.PlayQueueSwipeRemoveItem_android_textColor, -65536), (float) obtainStyledAttributes.getDimensionPixelSize(r.PlayQueueSwipeRemoveItem_android_textSize, 40), obtainStyledAttributes.getString(r.PlayQueueSwipeRemoveItem_android_text), obtainStyledAttributes.getColor(r.PlayQueueSwipeRemoveItem_android_background, -16777216), (float) obtainStyledAttributes.getDimensionPixelSize(r.PlayQueueSwipeRemoveItem_android_paddingRight, 40), a.a(context, obtainStyledAttributes.getString(r.PlayQueueSwipeRemoveItem_custom_font)));
        obtainStyledAttributes.recycle();
        return q;
    }
}
