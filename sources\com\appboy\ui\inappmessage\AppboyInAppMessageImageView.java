package com.appboy.ui.inappmessage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

@SuppressLint({"AppCompatCustomView"})
public class AppboyInAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private static final String TAG = Hg.a(AppboyInAppMessageImageView.class);
    private Path mClipPath = new Path();
    private float[] mInAppRadii;
    private RectF mRect = new RectF();

    public AppboyInAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        if (this.mInAppRadii != null) {
            try {
                this.mClipPath.reset();
                this.mRect.set(0.0f, 0.0f, (float) i, (float) i2);
                this.mClipPath.addRoundRect(this.mRect, this.mInAppRadii, Direction.CW);
                canvas.clipPath(this.mClipPath);
                return true;
            } catch (Exception e) {
                Hg.b(TAG, "Encountered exception while trying to clip in-app message image", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Path getClipPath() {
        return this.mClipPath;
    }

    /* access modifiers changed from: 0000 */
    public float[] getInAppRadii() {
        return this.mInAppRadii;
    }

    /* access modifiers changed from: 0000 */
    public RectF getRectf() {
        return this.mRect;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    /* access modifiers changed from: 0000 */
    public void setClipPath(Path path) {
        this.mClipPath = path;
    }

    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.mInAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    public void setInAppMessageImageCropType(Qf qf) {
        if (qf.equals(Qf.FIT_CENTER)) {
            setScaleType(ScaleType.FIT_CENTER);
        } else if (qf.equals(Qf.CENTER_CROP)) {
            setScaleType(ScaleType.CENTER_CROP);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setRectf(RectF rectF) {
        this.mRect = rectF;
    }
}
