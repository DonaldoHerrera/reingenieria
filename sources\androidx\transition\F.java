package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* compiled from: ImageViewUtils */
class F extends AnimatorListenerAdapter {
    final /* synthetic */ ImageView a;

    F(ImageView imageView) {
        this.a = imageView;
    }

    public void onAnimationEnd(Animator animator) {
        ScaleType scaleType = (ScaleType) this.a.getTag(M.save_scale_type);
        this.a.setScaleType(scaleType);
        this.a.setTag(M.save_scale_type, null);
        if (scaleType == ScaleType.MATRIX) {
            ImageView imageView = this.a;
            imageView.setImageMatrix((Matrix) imageView.getTag(M.save_image_matrix));
            this.a.setTag(M.save_image_matrix, null);
        }
        animator.removeListener(this);
    }
}
