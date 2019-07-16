package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public class ChangeImageTransform extends Transition {
    private static final String[] K = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> L = new C0455m();
    private static final Property<ImageView, Matrix> M = new C0456n(Matrix.class, "animatedTransform");

    public ChangeImageTransform() {
    }

    private static Matrix b(ImageView imageView) {
        int i = C0457o.a[imageView.getScaleType().ordinal()];
        if (i == 1) {
            return d(imageView);
        }
        if (i != 2) {
            return new Matrix(imageView.getImageMatrix());
        }
        return a(imageView);
    }

    private void d(ha haVar) {
        View view = haVar.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = haVar.a;
                map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put("android:changeImageTransform:matrix", b(imageView));
            }
        }
    }

    public String[] A() {
        return K;
    }

    public void a(ha haVar) {
        d(haVar);
    }

    public void c(ha haVar) {
        d(haVar);
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ObjectAnimator c(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, M, L, new Matrix[]{null, null});
    }

    public Animator a(ViewGroup viewGroup, ha haVar, ha haVar2) {
        ObjectAnimator objectAnimator;
        if (!(haVar == null || haVar2 == null)) {
            String str = "android:changeImageTransform:bounds";
            Rect rect = (Rect) haVar.a.get(str);
            Rect rect2 = (Rect) haVar2.a.get(str);
            if (!(rect == null || rect2 == null)) {
                String str2 = "android:changeImageTransform:matrix";
                Matrix matrix = (Matrix) haVar.a.get(str2);
                Matrix matrix2 = (Matrix) haVar2.a.get(str2);
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) haVar2.b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                G.a(imageView);
                if (intrinsicWidth == 0 || intrinsicHeight == 0) {
                    objectAnimator = c(imageView);
                } else {
                    if (matrix == null) {
                        matrix = I.a;
                    }
                    if (matrix2 == null) {
                        matrix2 = I.a;
                    }
                    M.set(imageView, matrix);
                    objectAnimator = a(imageView, matrix, matrix2);
                }
                G.a(imageView, (Animator) objectAnimator);
                return objectAnimator;
            }
        }
        return null;
    }

    private static Matrix d(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    private ObjectAnimator a(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, M, new a(), new Matrix[]{matrix, matrix2});
    }

    private static Matrix a(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        float width = (float) imageView.getWidth();
        float intrinsicWidth = (float) drawable.getIntrinsicWidth();
        float f = width / intrinsicWidth;
        float height = (float) imageView.getHeight();
        float intrinsicHeight = (float) drawable.getIntrinsicHeight();
        float max = Math.max(f, height / intrinsicHeight);
        float f2 = intrinsicHeight * max;
        int round = Math.round((width - (intrinsicWidth * max)) / 2.0f);
        int round2 = Math.round((height - f2) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }
}
