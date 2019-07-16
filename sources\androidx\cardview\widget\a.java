package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: CardView */
class a implements g {
    private Drawable a;
    final /* synthetic */ CardView b;

    a(CardView cardView) {
        this.b = cardView;
    }

    public void a(Drawable drawable) {
        this.a = drawable;
        this.b.setBackgroundDrawable(drawable);
    }

    public Drawable b() {
        return this.a;
    }

    public boolean c() {
        return this.b.getPreventCornerOverlap();
    }

    public View d() {
        return this.b;
    }

    public boolean a() {
        return this.b.getUseCompatPadding();
    }

    public void a(int i, int i2, int i3, int i4) {
        this.b.h.set(i, i2, i3, i4);
        CardView cardView = this.b;
        Rect rect = cardView.g;
        a.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void a(int i, int i2) {
        CardView cardView = this.b;
        if (i > cardView.e) {
            a.super.setMinimumWidth(i);
        }
        CardView cardView2 = this.b;
        if (i2 > cardView2.f) {
            a.super.setMinimumHeight(i2);
        }
    }
}
