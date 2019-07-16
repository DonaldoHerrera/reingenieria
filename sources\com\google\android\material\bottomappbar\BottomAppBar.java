package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.r;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements a {
    private final int P;
    /* access modifiers changed from: private */
    public final C0512cA Q;
    /* access modifiers changed from: private */
    public final i R;
    /* access modifiers changed from: private */
    public Animator S;
    /* access modifiers changed from: private */
    public Animator T;
    /* access modifiers changed from: private */
    public Animator U;
    /* access modifiers changed from: private */
    public int V;
    private boolean W;
    /* access modifiers changed from: private */
    public boolean aa;
    AnimatorListenerAdapter ba;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((d) floatingActionButton.getLayoutParams()).d = 17;
            bottomAppBar.a(floatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        public void b(BottomAppBar bottomAppBar) {
            super.b(bottomAppBar);
            FloatingActionButton b = bottomAppBar.t();
            if (b != null) {
                b.clearAnimation();
                b.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(Ez.d).setDuration(225);
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton b = bottomAppBar.t();
            if (b != null) {
                a(b, bottomAppBar);
                b.b(this.d);
                bottomAppBar.setFabDiameter(this.d.height());
            }
            if (!bottomAppBar.u()) {
                bottomAppBar.w();
            }
            coordinatorLayout.c((View) bottomAppBar, i);
            return super.a(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        /* access modifiers changed from: protected */
        public void a(BottomAppBar bottomAppBar) {
            super.a(bottomAppBar);
            FloatingActionButton b = bottomAppBar.t();
            if (b != null) {
                b.a(this.d);
                float measuredHeight = (float) (b.getMeasuredHeight() - this.d.height());
                b.clearAnimation();
                b.animate().translationY(((float) (-b.getPaddingBottom())) + measuredHeight).setInterpolator(Ez.c).setDuration(175);
            }
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new h();
        int c;
        boolean d;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1771uz.bottomAppBarStyle);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) c(this.V);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return a(this.aa);
    }

    private void s() {
        Animator animator = this.S;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.U;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.T;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton t() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public boolean u() {
        Animator animator = this.S;
        if (animator == null || !animator.isRunning()) {
            Animator animator2 = this.U;
            if (animator2 == null || !animator2.isRunning()) {
                Animator animator3 = this.T;
                if (animator3 == null || !animator3.isRunning()) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean v() {
        FloatingActionButton t = t();
        return t != null && t.b();
    }

    /* access modifiers changed from: private */
    public void w() {
        this.R.e(getFabTranslationX());
        FloatingActionButton t = t();
        this.Q.a((!this.aa || !v()) ? 0.0f : 1.0f);
        if (t != null) {
            t.setTranslationY(getFabTranslationY());
            t.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!v()) {
                a(actionMenuView, 0, false);
            } else {
                a(actionMenuView, this.V, this.aa);
            }
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.Q.b();
    }

    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        return this.R.a();
    }

    public int getFabAlignmentMode() {
        return this.V;
    }

    public float getFabCradleMargin() {
        return this.R.b();
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.R.c();
    }

    public boolean getHideOnScroll() {
        return this.W;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s();
        w();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.V = savedState.c;
        this.aa = savedState.d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.V;
        savedState.d = this.aa;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.a((Drawable) this.Q, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.R.a(f);
            this.Q.invalidateSelf();
        }
    }

    public void setFabAlignmentMode(int i) {
        d(i);
        a(i, this.aa);
        this.V = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.R.b(f);
            this.Q.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.R.c(f);
            this.Q.invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setFabDiameter(int i) {
        float f = (float) i;
        if (f != this.R.d()) {
            this.R.d(f);
            this.Q.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.W = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aa = true;
        this.ba = new g(this);
        TypedArray a = r.a(context, attributeSet, Dz.BottomAppBar, i, Cz.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList a2 = Uz.a(context, a, Dz.BottomAppBar_backgroundTint);
        float dimensionPixelOffset = (float) a.getDimensionPixelOffset(Dz.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = (float) a.getDimensionPixelOffset(Dz.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = (float) a.getDimensionPixelOffset(Dz.BottomAppBar_fabCradleVerticalOffset, 0);
        this.V = a.getInt(Dz.BottomAppBar_fabAlignmentMode, 0);
        this.W = a.getBoolean(Dz.BottomAppBar_hideOnScroll, false);
        a.recycle();
        this.P = getResources().getDimensionPixelOffset(C1831wz.mtrl_bottomappbar_fabOffsetEndMode);
        this.R = new i(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1253eA eAVar = new C1253eA();
        eAVar.a(this.R);
        this.Q = new C0512cA(eAVar);
        this.Q.a(true);
        this.Q.a(Style.FILL);
        androidx.core.graphics.drawable.a.a((Drawable) this.Q, a2);
        C1778vc.a((View) this, (Drawable) this.Q);
    }

    private void d(int i) {
        if (this.V != i && C1778vc.B(this)) {
            Animator animator = this.T;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            a(i, (List<Animator>) arrayList);
            b(i, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.T = animatorSet;
            this.T.addListener(new a(this));
            this.T.start();
        }
    }

    private void b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t(), "translationX", new float[]{(float) c(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private int c(int i) {
        int i2 = 1;
        boolean z = C1778vc.l(this) == 1;
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.P;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        if (C1778vc.B(this)) {
            Animator animator = this.S;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            a(z && v(), (List<Animator>) arrayList);
            b(z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.S = animatorSet;
            this.S.addListener(new e(this));
            this.S.start();
        }
    }

    private void a(int i, List<Animator> list) {
        if (this.aa) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.R.e(), (float) c(i)});
            ofFloat.addUpdateListener(new b(this));
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i, boolean z) {
        if (C1778vc.B(this)) {
            Animator animator = this.U;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!v()) {
                i = 0;
                z = false;
            }
            a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.U = animatorSet;
            this.U.addListener(new c(this));
            this.U.start();
        }
    }

    private void b(boolean z, List<Animator> list) {
        FloatingActionButton t = t();
        if (t != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t, "translationY", new float[]{a(z)});
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    private void b(FloatingActionButton floatingActionButton) {
        floatingActionButton.c((AnimatorListener) this.ba);
        floatingActionButton.d(this.ba);
    }

    private void a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if ((this.aa || (z && v())) && (this.V == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new d(this, actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    private void a(boolean z, List<Animator> list) {
        if (z) {
            this.R.e(getFabTranslationX());
        }
        float[] fArr = new float[2];
        fArr[0] = this.Q.a();
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new f(this));
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private float a(boolean z) {
        FloatingActionButton t = t();
        if (t == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        t.a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) t.getMeasuredHeight();
        }
        float height2 = (float) (t.getHeight() - rect.bottom);
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float height3 = ((float) (t.getHeight() - rect.height())) - ((float) t.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return f2 + height3;
    }

    /* access modifiers changed from: private */
    public void a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C1778vc.l(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof LayoutParams) && (((LayoutParams) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    /* access modifiers changed from: private */
    public void a(FloatingActionButton floatingActionButton) {
        b(floatingActionButton);
        floatingActionButton.a((AnimatorListener) this.ba);
        floatingActionButton.b((AnimatorListener) this.ba);
    }
}
