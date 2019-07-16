package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.c;
import com.google.android.material.circularreveal.e;
import com.google.android.material.circularreveal.e.d;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements e {
    private final c y = new c(this);

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        this.y.a();
    }

    public void b() {
        this.y.b();
    }

    public boolean c() {
        return super.isOpaque();
    }

    public void draw(Canvas canvas) {
        c cVar = this.y;
        if (cVar != null) {
            cVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.y.c();
    }

    public int getCircularRevealScrimColor() {
        return this.y.d();
    }

    public d getRevealInfo() {
        return this.y.e();
    }

    public boolean isOpaque() {
        c cVar = this.y;
        if (cVar != null) {
            return cVar.f();
        }
        return super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.y.a(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.y.a(i);
    }

    public void setRevealInfo(d dVar) {
        this.y.a(dVar);
    }

    public void a(Canvas canvas) {
        super.draw(canvas);
    }
}
