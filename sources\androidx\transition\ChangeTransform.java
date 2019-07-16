package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    private static final String[] K = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<b, float[]> L = new C0458p(float[].class, "nonTranslations");
    private static final Property<b, PointF> M = new C0459q(PointF.class, "translations");
    private static final boolean N = (VERSION.SDK_INT >= 21);
    boolean O = true;
    private boolean P = true;
    private Matrix Q = new Matrix();

    private static class a extends C0440ba {
        private View a;
        private D b;

        a(View view, D d) {
            this.a = view;
            this.b = d;
        }

        public void a(Transition transition) {
            this.b.setVisibility(0);
        }

        public void c(Transition transition) {
            this.b.setVisibility(4);
        }

        public void d(Transition transition) {
            transition.b((androidx.transition.Transition.c) this);
            E.a(this.a);
            this.a.setTag(M.transition_transform, null);
            this.a.setTag(M.parent_matrix, null);
        }
    }

    private static class b {
        private final Matrix a = new Matrix();
        private final View b;
        private final float[] c;
        private float d;
        private float e;

        b(View view, float[] fArr) {
            this.b = view;
            this.c = (float[]) fArr.clone();
            float[] fArr2 = this.c;
            this.d = fArr2[2];
            this.e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.c;
            fArr[2] = this.d;
            fArr[5] = this.e;
            this.a.setValues(fArr);
            wa.a(this.b, this.a);
        }

        /* access modifiers changed from: 0000 */
        public void a(float[] fArr) {
            System.arraycopy(fArr, 0, this.c, 0, fArr.length);
            b();
        }

        /* access modifiers changed from: 0000 */
        public void a(PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            b();
        }

        /* access modifiers changed from: 0000 */
        public Matrix a() {
            return this.a;
        }
    }

    private static class c {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;

        c(View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = C1778vc.s(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.a(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.a == this.a && cVar.b == this.b && cVar.c == this.c && cVar.d == this.d && cVar.e == this.e && cVar.f == this.f && cVar.g == this.g && cVar.h == this.h) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            float f2 = this.a;
            int i = 0;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.h;
            if (f9 != 0.0f) {
                i = Float.floatToIntBits(f9);
            }
            return floatToIntBits7 + i;
        }
    }

    public ChangeTransform() {
    }

    private void b(ViewGroup viewGroup, ha haVar, ha haVar2) {
        View view = haVar2.b;
        Matrix matrix = new Matrix((Matrix) haVar2.a.get("android:changeTransform:parentMatrix"));
        wa.c(viewGroup, matrix);
        D a2 = E.a(view, viewGroup, matrix);
        if (a2 != null) {
            a2.a((ViewGroup) haVar.a.get("android:changeTransform:parent"), haVar.b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.u;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.a((androidx.transition.Transition.c) new a(view, a2));
            if (N) {
                View view2 = haVar.b;
                if (view2 != haVar2.b) {
                    wa.a(view2, 0.0f);
                }
                wa.a(view, 1.0f);
            }
        }
    }

    private void d(ha haVar) {
        View view = haVar.b;
        if (view.getVisibility() != 8) {
            haVar.a.put("android:changeTransform:parent", view.getParent());
            haVar.a.put("android:changeTransform:transforms", new c(view));
            Matrix matrix = view.getMatrix();
            haVar.a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.P) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                wa.b(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                haVar.a.put("android:changeTransform:parentMatrix", matrix2);
                haVar.a.put("android:changeTransform:intermediateMatrix", view.getTag(M.transition_transform));
                haVar.a.put("android:changeTransform:intermediateParentMatrix", view.getTag(M.parent_matrix));
            }
        }
    }

    static void f(View view) {
        a(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public String[] A() {
        return K;
    }

    public void a(ha haVar) {
        d(haVar);
    }

    public void c(ha haVar) {
        d(haVar);
        if (!N) {
            ((ViewGroup) haVar.b.getParent()).startViewTransition(haVar.b);
        }
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        if (!(haVar == null || haVar2 == null)) {
            String str = "android:changeTransform:parent";
            if (haVar.a.containsKey(str) && haVar2.a.containsKey(str)) {
                ViewGroup viewGroup2 = (ViewGroup) haVar.a.get(str);
                boolean z = this.P && !a(viewGroup2, (ViewGroup) haVar2.a.get(str));
                Matrix matrix = (Matrix) haVar.a.get("android:changeTransform:intermediateMatrix");
                if (matrix != null) {
                    haVar.a.put("android:changeTransform:matrix", matrix);
                }
                Matrix matrix2 = (Matrix) haVar.a.get("android:changeTransform:intermediateParentMatrix");
                if (matrix2 != null) {
                    haVar.a.put("android:changeTransform:parentMatrix", matrix2);
                }
                if (z) {
                    b(haVar, haVar2);
                }
                ObjectAnimator a2 = a(haVar, haVar2, z);
                if (z && a2 != null && this.O) {
                    b(viewGroup, haVar, haVar2);
                } else if (!N) {
                    viewGroup2.endViewTransition(haVar.b);
                }
                return a2;
            }
        }
        return null;
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.O = C0286Za.a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.P = C0286Za.a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    private void b(ha haVar, ha haVar2) {
        String str = "android:changeTransform:parentMatrix";
        Matrix matrix = (Matrix) haVar2.a.get(str);
        haVar2.b.setTag(M.parent_matrix, matrix);
        Matrix matrix2 = this.Q;
        matrix2.reset();
        matrix.invert(matrix2);
        String str2 = "android:changeTransform:matrix";
        Matrix matrix3 = (Matrix) haVar.a.get(str2);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            haVar.a.put(str2, matrix3);
        }
        matrix3.postConcat((Matrix) haVar.a.get(str));
        matrix3.postConcat(matrix2);
    }

    private ObjectAnimator a(ha haVar, ha haVar2, boolean z) {
        String str = "android:changeTransform:matrix";
        Matrix matrix = (Matrix) haVar.a.get(str);
        Matrix matrix2 = (Matrix) haVar2.a.get(str);
        if (matrix == null) {
            matrix = I.a;
        }
        if (matrix2 == null) {
            matrix2 = I.a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        c cVar = (c) haVar2.a.get("android:changeTransform:transforms");
        View view = haVar2.b;
        f(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        b bVar = new b(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(L, new C0462u(new float[9]), new float[][]{fArr, fArr2}), L.a(M, o().a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        r rVar = new r(this, z, matrix3, view, cVar, bVar);
        ofPropertyValuesHolder.addListener(rVar);
        C0437a.a(ofPropertyValuesHolder, rVar);
        return ofPropertyValuesHolder;
    }

    private boolean a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (b((View) viewGroup) && b((View) viewGroup2)) {
            ha a2 = a((View) viewGroup, true);
            if (a2 == null || viewGroup2 != a2.b) {
                return false;
            }
        } else if (viewGroup != viewGroup2) {
            return false;
        }
        return true;
    }

    static void a(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C1778vc.b(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }
}
