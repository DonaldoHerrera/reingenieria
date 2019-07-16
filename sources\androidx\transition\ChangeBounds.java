package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.c;
import org.xmlpull.v1.XmlPullParser;

public class ChangeBounds extends Transition {
    private static final String[] K = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> L = new C0441c(PointF.class, "boundsOrigin");
    private static final Property<a, PointF> M;
    private static final Property<a, PointF> N;
    private static final Property<View, PointF> O;
    private static final Property<View, PointF> P;
    private static final Property<View, PointF> Q = new C0450h(PointF.class, "position");
    private static N R = new N();
    private int[] S = new int[2];
    private boolean T = false;
    private boolean U = false;

    private static class a {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        a(View view) {
            this.e = view;
        }

        /* access modifiers changed from: 0000 */
        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            this.g++;
            if (this.f == this.g) {
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            this.f++;
            if (this.f == this.g) {
                a();
            }
        }

        private void a() {
            wa.a(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }
    }

    static {
        String str = "topLeft";
        M = new C0443d(PointF.class, str);
        String str2 = "bottomRight";
        N = new C0445e(PointF.class, str2);
        O = new C0447f(PointF.class, str2);
        P = new C0449g(PointF.class, str);
    }

    public ChangeBounds() {
    }

    private void d(ha haVar) {
        View view = haVar.b;
        if (C1778vc.B(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            haVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            haVar.a.put("android:changeBounds:parent", haVar.b.getParent());
            if (this.U) {
                haVar.b.getLocationInWindow(this.S);
                haVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.S[0]));
                haVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.S[1]));
            }
            if (this.T) {
                haVar.a.put("android:changeBounds:clip", C1778vc.f(view));
            }
        }
    }

    public String[] A() {
        return K;
    }

    public void a(ha haVar) {
        d(haVar);
    }

    public void b(boolean z) {
        this.T = z;
    }

    public void c(ha haVar) {
        d(haVar);
    }

    private boolean a(View view, View view2) {
        if (!this.U) {
            return true;
        }
        ha a2 = a(view, true);
        if (a2 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a2.b) {
            return true;
        }
        return false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.d);
        boolean a2 = C0286Za.a(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        b(a2);
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        int i;
        View view;
        Animator animator;
        Animator animator2;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        ha haVar3 = haVar;
        ha haVar4 = haVar2;
        if (haVar3 == null || haVar4 == null) {
            return null;
        }
        String str = "android:changeBounds:parent";
        ViewGroup viewGroup2 = (ViewGroup) haVar3.a.get(str);
        ViewGroup viewGroup3 = (ViewGroup) haVar4.a.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = haVar4.b;
        if (a(viewGroup2, viewGroup3)) {
            String str2 = "android:changeBounds:bounds";
            Rect rect2 = (Rect) haVar3.a.get(str2);
            Rect rect3 = (Rect) haVar4.a.get(str2);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            String str3 = "android:changeBounds:clip";
            Rect rect4 = (Rect) haVar3.a.get(str3);
            Rect rect5 = (Rect) haVar4.a.get(str3);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.T) {
                    view = view3;
                    wa.a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = J.a(view, Q, o().a((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            a aVar = new a(view);
                            ObjectAnimator a2 = J.a(aVar, M, o().a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a3 = J.a(aVar, N, o().a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a2, a3});
                            animatorSet.addListener(new C0451i(this, aVar));
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = J.a(view, O, o().a((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = J.a(view, P, o().a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    wa.a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        animator2 = null;
                    } else {
                        animator2 = J.a(view, Q, o().a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        C1778vc.a(view, rect);
                        N n = R;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", n, objArr);
                        C0452j jVar = new C0452j(this, view, rect6, i4, i6, i8, i10);
                        objectAnimator.addListener(jVar);
                    } else {
                        objectAnimator = null;
                    }
                    animator = ga.a(animator2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    na.a(viewGroup4, true);
                    a((c) new C0453k(this, viewGroup4));
                }
                return animator;
            }
        } else {
            String str4 = "android:changeBounds:windowX";
            int intValue = ((Integer) haVar3.a.get(str4)).intValue();
            String str5 = "android:changeBounds:windowY";
            int intValue2 = ((Integer) haVar3.a.get(str5)).intValue();
            int intValue3 = ((Integer) haVar4.a.get(str4)).intValue();
            int intValue4 = ((Integer) haVar4.a.get(str5)).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.S);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = wa.c(view2);
                wa.a(view2, 0.0f);
                wa.b(viewGroup).a(bitmapDrawable);
                PathMotion o = o();
                int[] iArr = this.S;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{L.a(L, o.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
                C0439b bVar = new C0439b(this, viewGroup, bitmapDrawable, view2, c);
                ofPropertyValuesHolder.addListener(bVar);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
