package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import com.google.android.material.circularreveal.e.d;

public class CircularRevealGridLayout extends GridLayout implements e {
    private final c a = new c(this);

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.a.a();
    }

    public void b() {
        this.a.b();
    }

    public boolean c() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.a.c();
    }

    public int getCircularRevealScrimColor() {
        return this.a.d();
    }

    public d getRevealInfo() {
        return this.a.e();
    }

    public boolean isOpaque() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar.f();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.a.a(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.a.a(i);
    }

    public void setRevealInfo(d dVar) {
        this.a.a(dVar);
    }

    public void a(Canvas canvas) {
        super.draw(canvas);
    }
}
