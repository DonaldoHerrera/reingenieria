package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0350q;
import androidx.appcompat.widget.E;
import androidx.appcompat.widget.na;
import androidx.core.widget.l;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.e;
import com.google.android.material.internal.f;
import com.google.android.material.internal.g;
import com.google.android.material.internal.r;
import com.google.android.material.internal.s;

public class TextInputLayout extends LinearLayout {
    private int A;
    private Drawable B;
    private final Rect C;
    private final RectF D;
    private Typeface E;
    private boolean F;
    private Drawable G;
    private CharSequence H;
    private CheckableImageButton I;
    private boolean J;
    private Drawable K;
    private Drawable L;
    private ColorStateList M;
    private boolean N;
    private Mode O;
    private boolean P;
    private ColorStateList Q;
    private ColorStateList R;
    private final int S;
    private final int T;
    private int U;
    private final int V;
    private boolean W;
    private final FrameLayout a;
    final e aa;
    EditText b;
    private boolean ba;
    private CharSequence c;
    private ValueAnimator ca;
    private final c d;
    private boolean da;
    boolean e;
    private boolean ea;
    private int f;
    /* access modifiers changed from: private */
    public boolean fa;
    private boolean g;
    private TextView h;
    private final int i;
    private final int j;
    private boolean k;
    private CharSequence l;
    private boolean m;
    private GradientDrawable n;
    private final int o;
    private final int p;
    private int q;
    private final int r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;
    private final int x;
    private final int y;
    private int z;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new g();
        CharSequence c;
        boolean d;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.d = z;
        }
    }

    public static class a extends C0273Wb {
        private final TextInputLayout d;

        public a(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        public void a(View view, Mc mc) {
            super.a(view, mc);
            EditText editText = this.d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                mc.h((CharSequence) text);
            } else if (z2) {
                mc.h(hint);
            }
            if (z2) {
                mc.e(hint);
                if (!z && z2) {
                    z4 = true;
                }
                mc.p(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                mc.d(error);
                mc.f(true);
            }
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            if (TextUtils.isEmpty(text)) {
                text = this.d.getHint();
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void e() {
        if (this.n != null) {
            q();
            EditText editText = this.b;
            if (editText != null && this.q == 2) {
                if (editText.getBackground() != null) {
                    this.B = this.b.getBackground();
                }
                C1778vc.a((View) this.b, (Drawable) null);
            }
            EditText editText2 = this.b;
            if (editText2 != null && this.q == 1) {
                Drawable drawable = this.B;
                if (drawable != null) {
                    C1778vc.a((View) editText2, drawable);
                }
            }
            int i2 = this.w;
            if (i2 > -1) {
                int i3 = this.z;
                if (i3 != 0) {
                    this.n.setStroke(i2, i3);
                }
            }
            this.n.setCornerRadii(getCornerRadiiAsArray());
            this.n.setColor(this.A);
            invalidate();
        }
    }

    private void f() {
        if (this.G == null) {
            return;
        }
        if (this.N || this.P) {
            this.G = androidx.core.graphics.drawable.a.i(this.G).mutate();
            if (this.N) {
                androidx.core.graphics.drawable.a.a(this.G, this.M);
            }
            if (this.P) {
                androidx.core.graphics.drawable.a.a(this.G, this.O);
            }
            CheckableImageButton checkableImageButton = this.I;
            if (checkableImageButton != null) {
                Drawable drawable = checkableImageButton.getDrawable();
                Drawable drawable2 = this.G;
                if (drawable != drawable2) {
                    this.I.setImageDrawable(drawable2);
                }
            }
        }
    }

    private void g() {
        int i2 = this.q;
        if (i2 == 0) {
            this.n = null;
        } else if (i2 == 2 && this.k && !(this.n instanceof a)) {
            this.n = new a();
        } else if (!(this.n instanceof GradientDrawable)) {
            this.n = new GradientDrawable();
        }
    }

    private Drawable getBoxBackground() {
        int i2 = this.q;
        if (i2 == 1 || i2 == 2) {
            return this.n;
        }
        throw new IllegalStateException();
    }

    private float[] getCornerRadiiAsArray() {
        if (!s.a(this)) {
            float f2 = this.s;
            float f3 = this.t;
            float f4 = this.u;
            float f5 = this.v;
            return new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
        }
        float f6 = this.t;
        float f7 = this.s;
        float f8 = this.v;
        float f9 = this.u;
        return new float[]{f6, f6, f7, f7, f8, f8, f9, f9};
    }

    private int h() {
        EditText editText = this.b;
        if (editText == null) {
            return 0;
        }
        int i2 = this.q;
        if (i2 == 1) {
            return editText.getTop();
        }
        if (i2 != 2) {
            return 0;
        }
        return editText.getTop() + j();
    }

    private int i() {
        int i2 = this.q;
        if (i2 == 1) {
            return getBoxBackground().getBounds().top + this.r;
        }
        if (i2 != 2) {
            return getPaddingTop();
        }
        return getBoxBackground().getBounds().top - j();
    }

    private int j() {
        float d2;
        if (!this.k) {
            return 0;
        }
        int i2 = this.q;
        if (i2 == 0 || i2 == 1) {
            d2 = this.aa.d();
        } else if (i2 != 2) {
            return 0;
        } else {
            d2 = this.aa.d() / 2.0f;
        }
        return (int) d2;
    }

    private void k() {
        if (l()) {
            ((a) this.n).b();
        }
    }

    private boolean l() {
        return this.k && !TextUtils.isEmpty(this.l) && (this.n instanceof a);
    }

    private void m() {
        int i2 = VERSION.SDK_INT;
        if (i2 == 21 || i2 == 22) {
            Drawable background = this.b.getBackground();
            if (background != null && !this.da) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.da = g.a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.da) {
                    C1778vc.a((View) this.b, newDrawable);
                    this.da = true;
                    o();
                }
            }
        }
    }

    private boolean n() {
        EditText editText = this.b;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private void o() {
        g();
        if (this.q != 0) {
            t();
        }
        v();
    }

    private void p() {
        if (l()) {
            RectF rectF = this.D;
            this.aa.a(rectF);
            a(rectF);
            ((a) this.n).a(rectF);
        }
    }

    private void q() {
        int i2 = this.q;
        if (i2 == 1) {
            this.w = 0;
        } else if (i2 == 2 && this.U == 0) {
            this.U = this.R.getColorForState(getDrawableState(), this.R.getDefaultColor());
        }
    }

    private boolean r() {
        return this.F && (n() || this.J);
    }

    private void s() {
        EditText editText = this.b;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                if (E.a(background)) {
                    background = background.mutate();
                }
                f.a((ViewGroup) this, (View) this.b, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.b.getBottom());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.b == null) {
            if (!(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.b = editText;
            o();
            setTextInputAccessibilityDelegate(new a(this));
            if (!n()) {
                this.aa.c(this.b.getTypeface());
            }
            this.aa.a(this.b.getTextSize());
            int gravity = this.b.getGravity();
            this.aa.b((gravity & -113) | 48);
            this.aa.d(gravity);
            this.b.addTextChangedListener(new d(this));
            if (this.Q == null) {
                this.Q = this.b.getHintTextColors();
            }
            if (this.k) {
                if (TextUtils.isEmpty(this.l)) {
                    this.c = this.b.getHint();
                    setHint(this.c);
                    this.b.setHint(null);
                }
                this.m = true;
            }
            if (this.h != null) {
                a(this.b.getText().length());
            }
            this.d.a();
            u();
            a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.l)) {
            this.l = charSequence;
            this.aa.a(charSequence);
            if (!this.W) {
                p();
            }
        }
    }

    private void t() {
        LayoutParams layoutParams = (LayoutParams) this.a.getLayoutParams();
        int j2 = j();
        if (j2 != layoutParams.topMargin) {
            layoutParams.topMargin = j2;
            this.a.requestLayout();
        }
    }

    private void u() {
        if (this.b != null) {
            if (r()) {
                if (this.I == null) {
                    this.I = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(Az.design_text_input_password_icon, this.a, false);
                    this.I.setImageDrawable(this.G);
                    this.I.setContentDescription(this.H);
                    this.a.addView(this.I);
                    this.I.setOnClickListener(new e(this));
                }
                EditText editText = this.b;
                if (editText != null && C1778vc.m(editText) <= 0) {
                    this.b.setMinimumHeight(C1778vc.m(this.I));
                }
                this.I.setVisibility(0);
                this.I.setChecked(this.J);
                if (this.K == null) {
                    this.K = new ColorDrawable();
                }
                this.K.setBounds(0, 0, this.I.getMeasuredWidth(), 1);
                Drawable[] a2 = l.a((TextView) this.b);
                if (a2[2] != this.K) {
                    this.L = a2[2];
                }
                l.a(this.b, a2[0], a2[1], this.K, a2[3]);
                this.I.setPadding(this.b.getPaddingLeft(), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
            } else {
                CheckableImageButton checkableImageButton = this.I;
                if (checkableImageButton != null && checkableImageButton.getVisibility() == 0) {
                    this.I.setVisibility(8);
                }
                if (this.K != null) {
                    Drawable[] a3 = l.a((TextView) this.b);
                    if (a3[2] == this.K) {
                        l.a(this.b, a3[0], a3[1], this.L, a3[3]);
                        this.K = null;
                    }
                }
            }
        }
    }

    private void v() {
        if (this.q != 0 && this.n != null && this.b != null && getRight() != 0) {
            int left = this.b.getLeft();
            int h2 = h();
            int right = this.b.getRight();
            int bottom = this.b.getBottom() + this.o;
            if (this.q == 2) {
                int i2 = this.y;
                left += i2 / 2;
                h2 -= i2 / 2;
                right -= i2 / 2;
                bottom += i2 / 2;
            }
            this.n.setBounds(left, h2, right, bottom);
            e();
            s();
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.a.addView(view, layoutParams2);
            this.a.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2) {
        a(z2, false);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        EditText editText = this.b;
        if (editText != null) {
            Drawable background = editText.getBackground();
            if (background != null) {
                m();
                if (E.a(background)) {
                    background = background.mutate();
                }
                if (this.d.c()) {
                    background.setColorFilter(C0350q.a(this.d.e(), Mode.SRC_IN));
                } else {
                    if (this.g) {
                        TextView textView = this.h;
                        if (textView != null) {
                            background.setColorFilter(C0350q.a(textView.getCurrentTextColor(), Mode.SRC_IN));
                        }
                    }
                    androidx.core.graphics.drawable.a.b(background);
                    this.b.refreshDrawableState();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        if (this.n != null && this.q != 0) {
            EditText editText = this.b;
            boolean z2 = true;
            boolean z3 = editText != null && editText.hasFocus();
            EditText editText2 = this.b;
            if (editText2 == null || !editText2.isHovered()) {
                z2 = false;
            }
            if (this.q == 2) {
                if (!isEnabled()) {
                    this.z = this.V;
                } else if (this.d.c()) {
                    this.z = this.d.e();
                } else {
                    if (this.g) {
                        TextView textView = this.h;
                        if (textView != null) {
                            this.z = textView.getCurrentTextColor();
                        }
                    }
                    if (z3) {
                        this.z = this.U;
                    } else if (z2) {
                        this.z = this.T;
                    } else {
                        this.z = this.S;
                    }
                }
                if ((z2 || z3) && isEnabled()) {
                    this.w = this.y;
                } else {
                    this.w = this.x;
                }
                e();
            }
        }
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        if (this.c != null) {
            EditText editText = this.b;
            if (editText != null) {
                boolean z2 = this.m;
                this.m = false;
                CharSequence hint = editText.getHint();
                this.b.setHint(this.c);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i2);
                    return;
                } finally {
                    this.b.setHint(hint);
                    this.m = z2;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i2);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.fa = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.fa = false;
    }

    public void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.n;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        }
        super.draw(canvas);
        if (this.k) {
            this.aa.a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.ea) {
            boolean z2 = true;
            this.ea = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C1778vc.B(this) || !isEnabled()) {
                z2 = false;
            }
            b(z2);
            c();
            v();
            d();
            e eVar = this.aa;
            if (eVar != null ? eVar.a(drawableState) | false : false) {
                invalidate();
            }
            this.ea = false;
        }
    }

    public int getBoxBackgroundColor() {
        return this.A;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.u;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.v;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.t;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.s;
    }

    public int getBoxStrokeColor() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public CharSequence getCounterOverflowDescription() {
        if (this.e && this.g) {
            TextView textView = this.h;
            if (textView != null) {
                return textView.getContentDescription();
            }
        }
        return null;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.Q;
    }

    public EditText getEditText() {
        return this.b;
    }

    public CharSequence getError() {
        if (this.d.k()) {
            return this.d.d();
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.d.e();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.d.e();
    }

    public CharSequence getHelperText() {
        if (this.d.l()) {
            return this.d.g();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.d.h();
    }

    public CharSequence getHint() {
        if (this.k) {
            return this.l;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.aa.d();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.aa.f();
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.H;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.G;
    }

    public Typeface getTypeface() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.n != null) {
            v();
        }
        if (this.k) {
            EditText editText = this.b;
            if (editText != null) {
                Rect rect = this.C;
                f.a((ViewGroup) this, (View) editText, rect);
                int compoundPaddingLeft = rect.left + this.b.getCompoundPaddingLeft();
                int compoundPaddingRight = rect.right - this.b.getCompoundPaddingRight();
                int i6 = i();
                this.aa.b(compoundPaddingLeft, rect.top + this.b.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.b.getCompoundPaddingBottom());
                this.aa.a(compoundPaddingLeft, i6, compoundPaddingRight, (i5 - i3) - getPaddingBottom());
                this.aa.m();
                if (l() && !this.W) {
                    p();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        u();
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.c);
        if (savedState.d) {
            a(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.d.c()) {
            savedState.c = getError();
        }
        savedState.d = this.J;
        return savedState;
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.A != i2) {
            this.A = i2;
            e();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.a.a(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.q) {
            this.q = i2;
            o();
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.U != i2) {
            this.U = i2;
            d();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.e != z2) {
            if (z2) {
                this.h = new AppCompatTextView(getContext());
                this.h.setId(C1891yz.textinput_counter);
                Typeface typeface = this.E;
                if (typeface != null) {
                    this.h.setTypeface(typeface);
                }
                this.h.setMaxLines(1);
                a(this.h, this.j);
                this.d.a(this.h, 2);
                EditText editText = this.b;
                if (editText == null) {
                    a(0);
                } else {
                    a(editText.getText().length());
                }
            } else {
                this.d.b(this.h, 2);
                this.h = null;
            }
            this.e = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f != i2) {
            if (i2 > 0) {
                this.f = i2;
            } else {
                this.f = -1;
            }
            if (this.e) {
                EditText editText = this.b;
                a(editText == null ? 0 : editText.getText().length());
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        this.R = colorStateList;
        if (this.b != null) {
            b(false);
        }
    }

    public void setEnabled(boolean z2) {
        a((ViewGroup) this, z2);
        super.setEnabled(z2);
    }

    public void setError(CharSequence charSequence) {
        if (!this.d.k()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.d.a(charSequence);
        } else {
            this.d.i();
        }
    }

    public void setErrorEnabled(boolean z2) {
        this.d.a(z2);
    }

    public void setErrorTextAppearance(int i2) {
        this.d.b(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.d.a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!a()) {
                setHelperTextEnabled(true);
            }
            this.d.b(charSequence);
        } else if (a()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.d.b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.d.b(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.d.c(i2);
    }

    public void setHint(CharSequence charSequence) {
        if (this.k) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.ba = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.k) {
            this.k = z2;
            if (!this.k) {
                this.m = false;
                if (!TextUtils.isEmpty(this.l) && TextUtils.isEmpty(this.b.getHint())) {
                    this.b.setHint(this.l);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.b.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.l)) {
                        setHint(hint);
                    }
                    this.b.setHint(null);
                }
                this.m = true;
            }
            if (this.b != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.aa.a(i2);
        this.R = this.aa.b();
        if (this.b != null) {
            b(false);
            t();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? C1437k.b(getContext(), i2) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            if (!z2 && this.J) {
                EditText editText = this.b;
                if (editText != null) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            this.J = false;
            u();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.M = colorStateList;
        this.N = true;
        f();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.O = mode;
        this.P = true;
        f();
    }

    public void setTextInputAccessibilityDelegate(a aVar) {
        EditText editText = this.b;
        if (editText != null) {
            C1778vc.a((View) editText, (C0273Wb) aVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.E) {
            this.E = typeface;
            this.aa.c(typeface);
            this.d.a(typeface);
            TextView textView = this.h;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.textInputStyle);
    }

    private void a(boolean z2, boolean z3) {
        boolean isEnabled = isEnabled();
        EditText editText = this.b;
        boolean z4 = true;
        boolean z5 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.b;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        }
        boolean c2 = this.d.c();
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            this.aa.a(colorStateList);
            this.aa.b(this.Q);
        }
        if (!isEnabled) {
            this.aa.a(ColorStateList.valueOf(this.V));
            this.aa.b(ColorStateList.valueOf(this.V));
        } else if (c2) {
            this.aa.a(this.d.f());
        } else {
            if (this.g) {
                TextView textView = this.h;
                if (textView != null) {
                    this.aa.a(textView.getTextColors());
                }
            }
            if (z4) {
                ColorStateList colorStateList2 = this.R;
                if (colorStateList2 != null) {
                    this.aa.a(colorStateList2);
                }
            }
        }
        if (z5 || (isEnabled() && (z4 || c2))) {
            if (z3 || this.W) {
                c(z2);
            }
        } else if (z3 || !this.W) {
            d(z2);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.m;
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new c(this);
        this.C = new Rect();
        this.D = new RectF();
        this.aa = new e(this);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.a = new FrameLayout(context);
        this.a.setAddStatesFromChildren(true);
        addView(this.a);
        this.aa.b(Ez.a);
        this.aa.a(Ez.a);
        this.aa.b(8388659);
        na b2 = r.b(context, attributeSet, Dz.TextInputLayout, i2, Cz.Widget_Design_TextInputLayout, new int[0]);
        this.k = b2.a(Dz.TextInputLayout_hintEnabled, true);
        setHint(b2.e(Dz.TextInputLayout_android_hint));
        this.ba = b2.a(Dz.TextInputLayout_hintAnimationEnabled, true);
        this.o = context.getResources().getDimensionPixelOffset(C1831wz.mtrl_textinput_box_bottom_offset);
        this.p = context.getResources().getDimensionPixelOffset(C1831wz.mtrl_textinput_box_label_cutout_padding);
        this.r = b2.b(Dz.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.s = b2.a(Dz.TextInputLayout_boxCornerRadiusTopStart, 0.0f);
        this.t = b2.a(Dz.TextInputLayout_boxCornerRadiusTopEnd, 0.0f);
        this.u = b2.a(Dz.TextInputLayout_boxCornerRadiusBottomEnd, 0.0f);
        this.v = b2.a(Dz.TextInputLayout_boxCornerRadiusBottomStart, 0.0f);
        this.A = b2.a(Dz.TextInputLayout_boxBackgroundColor, 0);
        this.U = b2.a(Dz.TextInputLayout_boxStrokeColor, 0);
        this.x = context.getResources().getDimensionPixelSize(C1831wz.mtrl_textinput_box_stroke_width_default);
        this.y = context.getResources().getDimensionPixelSize(C1831wz.mtrl_textinput_box_stroke_width_focused);
        this.w = this.x;
        setBoxBackgroundMode(b2.d(Dz.TextInputLayout_boxBackgroundMode, 0));
        if (b2.g(Dz.TextInputLayout_android_textColorHint)) {
            ColorStateList a2 = b2.a(Dz.TextInputLayout_android_textColorHint);
            this.R = a2;
            this.Q = a2;
        }
        this.S = androidx.core.content.a.a(context, C1801vz.mtrl_textinput_default_box_stroke_color);
        this.V = androidx.core.content.a.a(context, C1801vz.mtrl_textinput_disabled_color);
        this.T = androidx.core.content.a.a(context, C1801vz.mtrl_textinput_hovered_box_stroke_color);
        if (b2.g(Dz.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(b2.g(Dz.TextInputLayout_hintTextAppearance, 0));
        }
        int g2 = b2.g(Dz.TextInputLayout_errorTextAppearance, 0);
        boolean a3 = b2.a(Dz.TextInputLayout_errorEnabled, false);
        int g3 = b2.g(Dz.TextInputLayout_helperTextTextAppearance, 0);
        boolean a4 = b2.a(Dz.TextInputLayout_helperTextEnabled, false);
        CharSequence e2 = b2.e(Dz.TextInputLayout_helperText);
        boolean a5 = b2.a(Dz.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(b2.d(Dz.TextInputLayout_counterMaxLength, -1));
        this.j = b2.g(Dz.TextInputLayout_counterTextAppearance, 0);
        this.i = b2.g(Dz.TextInputLayout_counterOverflowTextAppearance, 0);
        this.F = b2.a(Dz.TextInputLayout_passwordToggleEnabled, false);
        this.G = b2.b(Dz.TextInputLayout_passwordToggleDrawable);
        this.H = b2.e(Dz.TextInputLayout_passwordToggleContentDescription);
        if (b2.g(Dz.TextInputLayout_passwordToggleTint)) {
            this.N = true;
            this.M = b2.a(Dz.TextInputLayout_passwordToggleTint);
        }
        if (b2.g(Dz.TextInputLayout_passwordToggleTintMode)) {
            this.P = true;
            this.O = s.a(b2.d(Dz.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        b2.a();
        setHelperTextEnabled(a4);
        setHelperText(e2);
        setHelperTextTextAppearance(g3);
        setErrorEnabled(a3);
        setErrorTextAppearance(g2);
        setCounterEnabled(a5);
        f();
        C1778vc.f(this, 2);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.H = charSequence;
        CheckableImageButton checkableImageButton = this.I;
        if (checkableImageButton != null) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.G = drawable;
        CheckableImageButton checkableImageButton = this.I;
        if (checkableImageButton != null) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void c(boolean z2) {
        ValueAnimator valueAnimator = this.ca;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.ca.cancel();
        }
        if (!z2 || !this.ba) {
            this.aa.b(1.0f);
        } else {
            a(1.0f);
        }
        this.W = false;
        if (l()) {
            p();
        }
    }

    private void d(boolean z2) {
        ValueAnimator valueAnimator = this.ca;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.ca.cancel();
        }
        if (!z2 || !this.ba) {
            this.aa.b(0.0f);
        } else {
            a(0.0f);
        }
        if (l() && ((a) this.n).a()) {
            k();
        }
        this.W = true;
    }

    public boolean a() {
        return this.d.l();
    }

    private static void a(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2) {
        boolean z2 = this.g;
        if (this.f == -1) {
            this.h.setText(String.valueOf(i2));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            if (C1778vc.b(this.h) == 1) {
                C1778vc.e(this.h, 0);
            }
            this.g = i2 > this.f;
            boolean z3 = this.g;
            if (z2 != z3) {
                a(this.h, z3 ? this.i : this.j);
                if (this.g) {
                    C1778vc.e(this.h, 1);
                }
            }
            this.h.setText(getContext().getString(Bz.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f)}));
            this.h.setContentDescription(getContext().getString(Bz.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f)}));
        }
        if (this.b != null && z2 != this.g) {
            b(false);
            d();
            c();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(TextView textView, int i2) {
        boolean z2 = true;
        try {
            l.d(textView, i2);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            l.d(textView, Cz.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.a.a(getContext(), C1801vz.design_error));
        }
    }

    public void a(boolean z2) {
        if (this.F) {
            int selectionEnd = this.b.getSelectionEnd();
            if (n()) {
                this.b.setTransformationMethod(null);
                this.J = true;
            } else {
                this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.J = false;
            }
            this.I.setChecked(this.J);
            if (z2) {
                this.I.jumpDrawablesToCurrentState();
            }
            this.b.setSelection(selectionEnd);
        }
    }

    private void a(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.p;
        rectF.left = f2 - ((float) i2);
        rectF.top -= (float) i2;
        rectF.right += (float) i2;
        rectF.bottom += (float) i2;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2) {
        if (this.aa.i() != f2) {
            if (this.ca == null) {
                this.ca = new ValueAnimator();
                this.ca.setInterpolator(Ez.b);
                this.ca.setDuration(167);
                this.ca.addUpdateListener(new f(this));
            }
            this.ca.setFloatValues(new float[]{this.aa.i(), f2});
            this.ca.start();
        }
    }
}
