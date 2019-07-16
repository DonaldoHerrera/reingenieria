package com.google.android.material.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: MaterialCardViewHelper */
class a {
    private final MaterialCardView a;
    private int b;
    private int c;

    public a(MaterialCardView materialCardView) {
        this.a = materialCardView;
    }

    private void d() {
        this.a.a(this.a.getContentPaddingLeft() + this.c, this.a.getContentPaddingTop() + this.c, this.a.getContentPaddingRight() + this.c, this.a.getContentPaddingBottom() + this.c);
    }

    private Drawable e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.a.getRadius());
        int i = this.b;
        if (i != -1) {
            gradientDrawable.setStroke(this.c, i);
        }
        return gradientDrawable;
    }

    public void a(TypedArray typedArray) {
        this.b = typedArray.getColor(Dz.MaterialCardView_strokeColor, -1);
        this.c = typedArray.getDimensionPixelSize(Dz.MaterialCardView_strokeWidth, 0);
        c();
        d();
    }

    /* access modifiers changed from: 0000 */
    public void b(int i) {
        this.c = i;
        c();
        d();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.a.setForeground(e());
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        this.b = i;
        c();
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.b;
    }
}
