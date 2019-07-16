package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.g;

/* renamed from: androidx.appcompat.widget.s reason: case insensitive filesystem */
/* compiled from: AppCompatImageHelper */
public class C0351s {
    private final ImageView a;
    private la b;
    private la c;
    private la d;

    public C0351s(ImageView imageView) {
        this.a = imageView;
    }

    private boolean e() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.b == null) {
            z = false;
        }
        return z;
    }

    public void a(AttributeSet attributeSet, int i) {
        na a2 = na.a(this.a.getContext(), attributeSet, C1406j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null) {
                int g = a2.g(C1406j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C1437k.b(this.a.getContext(), g);
                    if (drawable != null) {
                        this.a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                E.b(drawable);
            }
            if (a2.g(C1406j.AppCompatImageView_tint)) {
                g.a(this.a, a2.a(C1406j.AppCompatImageView_tint));
            }
            if (a2.g(C1406j.AppCompatImageView_tintMode)) {
                g.a(this.a, E.a(a2.d(C1406j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList b() {
        la laVar = this.c;
        if (laVar != null) {
            return laVar.a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public Mode c() {
        la laVar = this.c;
        if (laVar != null) {
            return laVar.b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void a(int i) {
        if (i != 0) {
            Drawable b2 = C1437k.b(this.a.getContext(), i);
            if (b2 != null) {
                E.b(b2);
            }
            this.a.setImageDrawable(b2);
        } else {
            this.a.setImageDrawable(null);
        }
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new la();
        }
        la laVar = this.c;
        laVar.a = colorStateList;
        laVar.d = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(Mode mode) {
        if (this.c == null) {
            this.c = new la();
        }
        la laVar = this.c;
        laVar.b = mode;
        laVar.c = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            E.b(drawable);
        }
        if (drawable != null && (!e() || !a(drawable))) {
            la laVar = this.c;
            if (laVar != null) {
                C0350q.a(drawable, laVar, this.a.getDrawableState());
            } else {
                la laVar2 = this.b;
                if (laVar2 != null) {
                    C0350q.a(drawable, laVar2, this.a.getDrawableState());
                }
            }
        }
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new la();
        }
        la laVar = this.d;
        laVar.a();
        ColorStateList a2 = g.a(this.a);
        if (a2 != null) {
            laVar.d = true;
            laVar.a = a2;
        }
        Mode b2 = g.b(this.a);
        if (b2 != null) {
            laVar.c = true;
            laVar.b = b2;
        }
        if (!laVar.d && !laVar.c) {
            return false;
        }
        C0350q.a(drawable, laVar, this.a.getDrawableState());
        return true;
    }
}
