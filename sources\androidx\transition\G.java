package androidx.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ImageViewUtils */
class G {
    private static Method a;
    private static boolean b;

    static void a(ImageView imageView) {
        if (VERSION.SDK_INT < 21) {
            ScaleType scaleType = imageView.getScaleType();
            imageView.setTag(M.save_scale_type, scaleType);
            ScaleType scaleType2 = ScaleType.MATRIX;
            if (scaleType == scaleType2) {
                imageView.setTag(M.save_image_matrix, imageView.getImageMatrix());
            } else {
                imageView.setScaleType(scaleType2);
            }
            imageView.setImageMatrix(I.a);
        }
    }

    static void a(ImageView imageView, Matrix matrix) {
        if (VERSION.SDK_INT < 21) {
            imageView.setImageMatrix(matrix);
            return;
        }
        a();
        Method method = a;
        if (method != null) {
            try {
                method.invoke(imageView, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    private static void a() {
        if (!b) {
            try {
                a = ImageView.class.getDeclaredMethod("animateTransform", new Class[]{Matrix.class});
                a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ImageViewUtils", "Failed to retrieve animateTransform method", e);
            }
            b = true;
        }
    }

    static void a(ImageView imageView, Animator animator) {
        if (VERSION.SDK_INT < 21) {
            animator.addListener(new F(imageView));
        }
    }
}
