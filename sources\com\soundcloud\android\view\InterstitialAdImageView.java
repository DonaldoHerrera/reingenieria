package com.soundcloud.android.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0014¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/view/InterstitialAdImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onSizeChanged", "", "width", "", "height", "oldWidth", "oldHeight", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: InterstitialAdImageView.kt */
public final class InterstitialAdImageView extends AppCompatImageView {
    public static final a c = new a(null);

    /* compiled from: InterstitialAdImageView.kt */
    public static final class a {
        private a() {
        }

        public final Matrix a(int i, int i2, int i3) {
            float f = (float) i;
            float f2 = (float) i2;
            float f3 = f / f2 < 0.7050781f ? f / (((float) i3) * 0.7050781f) : f2 / ((float) i3);
            Matrix matrix = new Matrix();
            matrix.setScale(f3, f3);
            matrix.postTranslate((-((((float) i3) * f3) - f)) / ((float) 2), 0.0f);
            return matrix;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public InterstitialAdImageView(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        setScaleType(ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getDrawable() != null) {
            Drawable drawable = getDrawable();
            String str = "drawable";
            C7471uYa.a((Object) drawable, str);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Drawable drawable2 = getDrawable();
            C7471uYa.a((Object) drawable2, str);
            if (intrinsicHeight == drawable2.getIntrinsicWidth()) {
                a aVar = c;
                int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
                int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
                Drawable drawable3 = getDrawable();
                C7471uYa.a((Object) drawable3, str);
                setImageMatrix(aVar.a(paddingLeft, paddingTop, drawable3.getIntrinsicHeight()));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected interstitial image size: ");
            Drawable drawable4 = getDrawable();
            C7471uYa.a((Object) drawable4, str);
            sb.append(drawable4.getIntrinsicWidth());
            sb.append(" x ");
            Drawable drawable5 = getDrawable();
            C7471uYa.a((Object) drawable5, str);
            sb.append(drawable5.getIntrinsicHeight());
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
