package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* compiled from: GhostViewApi14 */
class B extends View implements D {
    final View a;
    ViewGroup b;
    View c;
    int d;
    private int e;
    private int f;
    Matrix g;
    private final Matrix h = new Matrix();
    private final OnPreDrawListener i = new A(this);

    B(View view) {
        super(view.getContext());
        this.a = view;
        setLayerType(2, null);
    }

    static D a(View view, ViewGroup viewGroup) {
        B a2 = a(view);
        if (a2 == null) {
            FrameLayout a3 = a(viewGroup);
            if (a3 == null) {
                return null;
            }
            a2 = new B(view);
            a3.addView(a2);
        }
        a2.d++;
        return a2;
    }

    static void b(View view) {
        B a2 = a(view);
        if (a2 != null) {
            a2.d--;
            if (a2.d <= 0) {
                ViewParent parent = a2.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.endViewTransition(a2);
                    viewGroup.removeView(a2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.a, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.a.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (((float) iArr2[0]) - this.a.getTranslationX());
        iArr2[1] = (int) (((float) iArr2[1]) - this.a.getTranslationY());
        this.e = iArr2[0] - iArr[0];
        this.f = iArr2[1] - iArr[1];
        this.a.getViewTreeObserver().addOnPreDrawListener(this.i);
        this.a.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.i);
        this.a.setVisibility(0);
        a(this.a, (B) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.h.set(this.g);
        this.h.postTranslate((float) this.e, (float) this.f);
        canvas.setMatrix(this.h);
        this.a.draw(canvas);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.a.setVisibility(i2 == 0 ? 4 : 0);
    }

    private static FrameLayout a(ViewGroup viewGroup) {
        while (!(viewGroup instanceof FrameLayout)) {
            ViewParent parent = viewGroup.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            viewGroup = (ViewGroup) parent;
        }
        return (FrameLayout) viewGroup;
    }

    public void a(ViewGroup viewGroup, View view) {
        this.b = viewGroup;
        this.c = view;
    }

    private static void a(View view, B b2) {
        view.setTag(M.ghost_view, b2);
    }

    static B a(View view) {
        return (B) view.getTag(M.ghost_view);
    }
}
