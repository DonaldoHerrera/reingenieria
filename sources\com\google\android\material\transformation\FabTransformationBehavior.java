package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.e;
import com.google.android.material.circularreveal.e.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private final Rect c = new Rect();
    private final RectF d = new RectF();
    private final RectF e = new RectF();
    private final int[] f = new int[2];

    protected static class a {
        public Lz a;
        public Nz b;

        protected a() {
        }
    }

    public FabTransformationBehavior() {
    }

    @TargetApi(21)
    private void c(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float h = C1778vc.h(view2) - C1778vc.h(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-h);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-h});
        }
        aVar.a.a("elevation").a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    private void d(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof e) && (view instanceof ImageView)) {
            e eVar = (e) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, Iz.a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, Iz.a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new d(this, view2));
                aVar.a.a("iconFade").a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new e(this, eVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract a a(Context context, boolean z);

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        a a2 = a(view2.getContext(), z3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            c(view, view2, z, z2, a2, arrayList, arrayList2);
        }
        RectF rectF = this.d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        boolean z5 = z2;
        a aVar = a2;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        a(view3, view4, z4, z5, aVar, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        d(view3, view4, z4, z5, aVar, arrayList3, arrayList4);
        a(view3, view4, z4, z5, aVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        b(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        a(view3, view4, z4, z5, aVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        Fz.a(animatorSet, arrayList);
        animatorSet.addListener(new c(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    private float c(View view, View view2, Nz nz) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        a(view2, rectF2);
        int i = nz.a & 7;
        if (i == 1) {
            f4 = rectF2.centerX();
            f3 = rectF.centerX();
        } else if (i == 3) {
            f4 = rectF2.left;
            f3 = rectF.left;
        } else if (i != 5) {
            f2 = 0.0f;
            return f2 + nz.b;
        } else {
            f4 = rectF2.right;
            f3 = rectF.right;
        }
        f2 = f4 - f3;
        return f2 + nz.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    private void a(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2, RectF rectF) {
        Mz mz;
        Mz mz2;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        a aVar2 = aVar;
        List<Animator> list3 = list;
        float c2 = c(view3, view4, aVar2.b);
        float d2 = d(view3, view4, aVar2.b);
        if (c2 != 0.0f) {
            int i = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
            if (i != 0) {
                if ((!z || d2 >= 0.0f) && (z || i <= 0)) {
                    mz2 = aVar2.a.a("translationXCurveDownwards");
                    mz = aVar2.a.a("translationYCurveDownwards");
                } else {
                    mz2 = aVar2.a.a("translationXCurveUpwards");
                    mz = aVar2.a.a("translationYCurveUpwards");
                }
                Mz mz3 = mz2;
                Mz mz4 = mz;
                if (!z) {
                    if (!z2) {
                        view4.setTranslationX(-c2);
                        view4.setTranslationY(-d2);
                    }
                    objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
                    objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
                    a(view2, aVar, mz3, mz4, -c2, -d2, 0.0f, 0.0f, rectF);
                } else {
                    objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-c2});
                    objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-d2});
                }
                mz3.a((Animator) objectAnimator2);
                mz4.a((Animator) objectAnimator);
                list3.add(objectAnimator2);
                list3.add(objectAnimator);
            }
        }
        mz2 = aVar2.a.a("translationXLinear");
        mz = aVar2.a.a("translationYLinear");
        Mz mz32 = mz2;
        Mz mz42 = mz;
        if (!z) {
        }
        mz32.a((Animator) objectAnimator2);
        mz42.a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private float d(View view, View view2, Nz nz) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        a(view2, rectF2);
        int i = nz.a & 112;
        if (i == 16) {
            f4 = rectF2.centerY();
            f3 = rectF.centerY();
        } else if (i == 48) {
            f4 = rectF2.top;
            f3 = rectF.top;
        } else if (i != 80) {
            f2 = 0.0f;
            return f2 + nz.c;
        } else {
            f4 = rectF2.bottom;
            f3 = rectF.bottom;
        }
        f2 = f4 - f3;
        return f2 + nz.c;
    }

    private ViewGroup c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private void b(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof e) {
            e eVar = (e) view2;
            int b = b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    eVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(eVar, c.a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(eVar, c.a, new int[]{b});
            }
            objectAnimator.setEvaluator(Gz.a());
            aVar.a.a("color").a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    private void a(View view, View view2, boolean z, boolean z2, a aVar, float f2, float f3, List<Animator> list, List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        a aVar2 = aVar;
        if (view4 instanceof e) {
            e eVar = (e) view4;
            float a2 = a(view3, view4, aVar2.b);
            float b = b(view3, view4, aVar2.b);
            ((FloatingActionButton) view3).a(this.c);
            float width = ((float) this.c.width()) / 2.0f;
            Mz a3 = aVar2.a.a("expansion");
            if (z) {
                if (!z2) {
                    eVar.setRevealInfo(new e.d(a2, b, width));
                }
                if (z2) {
                    width = eVar.getRevealInfo().c;
                }
                animator = b.a(eVar, a2, b, Tz.a(a2, b, 0.0f, 0.0f, f2, f3));
                animator.addListener(new f(this, eVar));
                a(view2, a3.a(), (int) a2, (int) b, width, list);
            } else {
                float f4 = eVar.getRevealInfo().c;
                Animator a4 = b.a(eVar, a2, b, width);
                int i = (int) a2;
                int i2 = (int) b;
                View view5 = view2;
                int i3 = i;
                a(view5, a3.a(), i, i2, f4, list);
                a(view5, a3.a(), a3.b(), aVar2.a.a(), i3, i2, width, list);
                animator = a4;
            }
            a3.a(animator);
            list.add(animator);
            list2.add(b.a(eVar));
        }
    }

    private float b(View view, View view2, Nz nz) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        a(view2, rectF2);
        rectF2.offset(0.0f, -d(view, view2, nz));
        return rectF.centerY() - rectF2.top;
    }

    private int b(View view) {
        ColorStateList d2 = C1778vc.d(view);
        if (d2 != null) {
            return d2.getColorForState(view.getDrawableState(), d2.getDefaultColor());
        }
        return 0;
    }

    private void a(View view, View view2, boolean z, boolean z2, a aVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof e) || com.google.android.material.circularreveal.c.a != 0) {
                ViewGroup a2 = a(view2);
                if (a2 != null) {
                    if (z) {
                        if (!z2) {
                            Hz.a.set(a2, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(a2, Hz.a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(a2, Hz.a, new float[]{0.0f});
                    }
                    aVar.a.a("contentFade").a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    private void a(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private float a(View view, View view2, Nz nz) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        a(view, rectF);
        a(view2, rectF2);
        rectF2.offset(-c(view, view2, nz), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private void a(View view, a aVar, Mz mz, Mz mz2, float f2, float f3, float f4, float f5, RectF rectF) {
        float a2 = a(aVar, mz, f2, f4);
        float a3 = a(aVar, mz2, f3, f5);
        Rect rect = this.c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.d;
        rectF2.set(rect);
        RectF rectF3 = this.e;
        a(view, rectF3);
        rectF3.offset(a2, a3);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float a(a aVar, Mz mz, float f2, float f3) {
        long a2 = mz.a();
        long b = mz.b();
        Mz a3 = aVar.a.a("expansion");
        return Ez.a(f2, f3, mz.c().getInterpolation(((float) (((a3.a() + a3.b()) + 17) - a2)) / ((float) b)));
    }

    private ViewGroup a(View view) {
        View findViewById = view.findViewById(C1891yz.mtrl_child_content_container);
        if (findViewById != null) {
            return c(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return c(((ViewGroup) view).getChildAt(0));
        }
        return c(view);
    }

    private void a(View view, long j, int i, int i2, float f2, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    private void a(View view, long j, long j2, long j3, int i, int i2, float f2, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f2);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
