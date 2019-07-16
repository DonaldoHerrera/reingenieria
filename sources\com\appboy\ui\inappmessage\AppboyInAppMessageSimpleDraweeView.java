package com.appboy.ui.inappmessage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.view.SimpleDraweeView;

public class AppboyInAppMessageSimpleDraweeView extends SimpleDraweeView implements IInAppMessageImageView {
    private static final String TAG = Hg.a(AppboyInAppMessageSimpleDraweeView.class);
    private Path mClipPath = new Path();
    private float[] mInAppRadii;
    private RectF mRect = new RectF();

    public AppboyInAppMessageSimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.mInAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    public void setInAppMessageImageCropType(Qf qf) {
        if (qf.equals(Qf.FIT_CENTER)) {
            getHierarchy().setActualImageScaleType(ScaleType.FIT_CENTER);
        } else if (qf.equals(Qf.CENTER_CROP)) {
            getHierarchy().setActualImageScaleType(ScaleType.CENTER_CROP);
        }
    }
}
