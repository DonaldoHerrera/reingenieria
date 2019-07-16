package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.l;
import androidx.legacy.widget.Space;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController */
final class c {
    private final Context a;
    private final TextInputLayout b;
    private LinearLayout c;
    private int d;
    private FrameLayout e;
    private int f;
    /* access modifiers changed from: private */
    public Animator g;
    private final float h = ((float) this.a.getResources().getDimensionPixelSize(C1831wz.design_textinput_caption_translate_y));
    /* access modifiers changed from: private */
    public int i;
    private int j;
    private CharSequence k;
    private boolean l;
    /* access modifiers changed from: private */
    public TextView m;
    private int n;
    private CharSequence o;
    private boolean p;
    private TextView q;
    private int r;
    private Typeface s;

    public c(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.b = textInputLayout;
    }

    private TextView d(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.q;
    }

    private boolean e(int i2) {
        if (i2 != 1 || this.m == null || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return true;
    }

    private boolean m() {
        return (this.c == null || this.b.getEditText() == null) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i2) {
        return i2 == 0 || i2 == 1;
    }

    /* access modifiers changed from: 0000 */
    public void b(CharSequence charSequence) {
        b();
        this.o = charSequence;
        this.q.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        a(this.i, this.j, a(this.q, charSequence));
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return e(this.j);
    }

    /* access modifiers changed from: 0000 */
    public ColorStateList f() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence g() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public int h() {
        TextView textView = this.q;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        this.k = null;
        b();
        if (this.i == 1) {
            if (!this.p || TextUtils.isEmpty(this.o)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        a(this.i, this.j, a(this.m, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        b();
        if (this.i == 2) {
            this.j = 0;
        }
        a(this.i, this.j, a(this.q, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.l;
    }

    /* access modifiers changed from: 0000 */
    public boolean l() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2) {
        this.r = i2;
        TextView textView = this.q;
        if (textView != null) {
            l.d(textView, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public CharSequence d() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public void a(CharSequence charSequence) {
        b();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        a(this.i, this.j, a(this.m, charSequence));
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(TextView textView, int i2) {
        if (this.c != null) {
            if (a(i2)) {
                FrameLayout frameLayout = this.e;
                if (frameLayout != null) {
                    this.f--;
                    a((ViewGroup) frameLayout, this.f);
                    this.e.removeView(textView);
                    this.d--;
                    a((ViewGroup) this.c, this.d);
                }
            }
            this.c.removeView(textView);
            this.d--;
            a((ViewGroup) this.c, this.d);
        }
    }

    private boolean a(TextView textView, CharSequence charSequence) {
        return C1778vc.B(this.b) && this.b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void a(int i2, int i3, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i4 = i2;
            int i5 = i3;
            a(arrayList2, this.p, this.q, 2, i4, i5);
            a(arrayList2, this.l, this.m, 1, i4, i5);
            Fz.a(animatorSet, arrayList);
            b bVar = new b(this, i3, d(i2), i2, d(i3));
            animatorSet.addListener(bVar);
            animatorSet.start();
        } else {
            a(i2, i3);
        }
        this.b.c();
        this.b.b(z);
        this.b.d();
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        if (this.p != z) {
            b();
            if (z) {
                this.q = new AppCompatTextView(this.a);
                this.q.setId(C1891yz.textinput_helper_text);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.q.setTypeface(typeface);
                }
                this.q.setVisibility(4);
                C1778vc.e(this.q, 1);
                c(this.r);
                a(this.q, 1);
            } else {
                j();
                b(this.q, 1);
                this.q = null;
                this.b.c();
                this.b.d();
            }
            this.p = z;
        }
    }

    private void a(int i2, int i3) {
        if (i2 != i3) {
            if (i3 != 0) {
                TextView d2 = d(i3);
                if (d2 != null) {
                    d2.setVisibility(0);
                    d2.setAlpha(1.0f);
                }
            }
            if (i2 != 0) {
                TextView d3 = d(i2);
                if (d3 != null) {
                    d3.setVisibility(4);
                    if (i2 == 1) {
                        d3.setText(null);
                    }
                }
            }
            this.i = i3;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        this.n = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.b.a(textView, i2);
        }
    }

    private void a(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(a(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(a(textView));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(ColorStateList colorStateList) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private ObjectAnimator a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(Ez.a);
        return ofFloat;
    }

    private ObjectAnimator a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.h, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(Ez.d);
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (m()) {
            C1778vc.b(this.c, C1778vc.p(this.b.getEditText()), 0, C1778vc.o(this.b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(TextView textView, int i2) {
        if (this.c == null && this.e == null) {
            this.c = new LinearLayout(this.a);
            this.c.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, -1, new LayoutParams(-2, -2));
            this.c.addView(new Space(this.a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.b.getEditText() != null) {
                a();
            }
        }
        if (a(i2)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.c.addView(textView, i2);
        }
        this.c.setVisibility(0);
        this.d++;
    }

    private void a(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (this.l != z) {
            b();
            if (z) {
                this.m = new AppCompatTextView(this.a);
                this.m.setId(C1891yz.textinput_error);
                Typeface typeface = this.s;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                b(this.n);
                this.m.setVisibility(4);
                C1778vc.e(this.m, 1);
                a(this.m, 0);
            } else {
                i();
                b(this.m, 0);
                this.m = null;
                this.b.c();
                this.b.d();
            }
            this.l = z;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Typeface typeface) {
        if (typeface != this.s) {
            this.s = typeface;
            a(this.m, typeface);
            a(this.q, typeface);
        }
    }

    private void a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ColorStateList colorStateList) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
