package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: androidx.appcompat.widget.o reason: case insensitive filesystem */
/* compiled from: AppCompatBackgroundHelper */
class C0348o {
    private final View a;
    private final C0350q b;
    private int c = -1;
    private la d;
    private la e;
    private la f;

    C0348o(View view) {
        this.a = view;
        this.b = C0350q.a();
    }

    private boolean d() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void a(AttributeSet attributeSet, int i) {
        na a2 = na.a(this.a.getContext(), attributeSet, C1406j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.g(C1406j.ViewBackgroundHelper_android_background)) {
                this.c = a2.g(C1406j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.b.b(this.a.getContext(), this.c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.g(C1406j.ViewBackgroundHelper_backgroundTint)) {
                C1778vc.a(this.a, a2.a(C1406j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.g(C1406j.ViewBackgroundHelper_backgroundTintMode)) {
                C1778vc.a(this.a, E.a(a2.d(C1406j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new la();
        }
        la laVar = this.e;
        laVar.a = colorStateList;
        laVar.d = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public Mode c() {
        la laVar = this.e;
        if (laVar != null) {
            return laVar.b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList b() {
        la laVar = this.e;
        if (laVar != null) {
            return laVar.a;
        }
        return null;
    }

    private boolean b(Drawable drawable) {
        if (this.f == null) {
            this.f = new la();
        }
        la laVar = this.f;
        laVar.a();
        ColorStateList d2 = C1778vc.d(this.a);
        if (d2 != null) {
            laVar.d = true;
            laVar.a = d2;
        }
        Mode e2 = C1778vc.e(this.a);
        if (e2 != null) {
            laVar.c = true;
            laVar.b = e2;
        }
        if (!laVar.d && !laVar.c) {
            return false;
        }
        C0350q.a(drawable, laVar, this.a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        this.c = i;
        C0350q qVar = this.b;
        a(qVar != null ? qVar.b(this.a.getContext(), i) : null);
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(Drawable drawable) {
        this.c = -1;
        a((ColorStateList) null);
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(Mode mode) {
        if (this.e == null) {
            this.e = new la();
        }
        la laVar = this.e;
        laVar.b = mode;
        laVar.c = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Drawable background = this.a.getBackground();
        if (background != null && (!d() || !b(background))) {
            la laVar = this.e;
            if (laVar != null) {
                C0350q.a(background, laVar, this.a.getDrawableState());
            } else {
                la laVar2 = this.d;
                if (laVar2 != null) {
                    C0350q.a(background, laVar2, this.a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new la();
            }
            la laVar = this.d;
            laVar.a = colorStateList;
            laVar.d = true;
        } else {
            this.d = null;
        }
        a();
    }
}
