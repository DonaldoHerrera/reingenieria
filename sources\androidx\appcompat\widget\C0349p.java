package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* renamed from: androidx.appcompat.widget.p reason: case insensitive filesystem */
/* compiled from: AppCompatCompoundButtonHelper */
class C0349p {
    private final CompoundButton a;
    private ColorStateList b = null;
    private Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    C0349p(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    public void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, C1406j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C1406j.CompoundButton_android_button)) {
                int resourceId = obtainStyledAttributes.getResourceId(C1406j.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.a.setButtonDrawable(C1437k.b(this.a.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(C1406j.CompoundButton_buttonTint)) {
                c.a(this.a, obtainStyledAttributes.getColorStateList(C1406j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C1406j.CompoundButton_buttonTintMode)) {
                c.a(this.a, E.a(obtainStyledAttributes.getInt(C1406j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList b() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public Mode c() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a(Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Drawable a2 = c.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = a.i(a2).mutate();
            if (this.d) {
                a.a(mutate, this.b);
            }
            if (this.e) {
                a.a(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a2 = c.a(this.a);
        return a2 != null ? i + a2.getIntrinsicWidth() : i;
    }
}
