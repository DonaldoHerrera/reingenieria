package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatSeekBar;

class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private final float b;
    private boolean c;
    private Drawable d;
    private int e;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            super.setThumb(this.c ? null : this.d);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.b * 255.0f);
        this.d.setColorFilter(this.e, Mode.SRC_IN);
        this.d.setAlpha(i);
        getProgressDrawable().setColorFilter(this.e, Mode.SRC_IN);
        getProgressDrawable().setAlpha(i);
    }

    public void setThumb(Drawable drawable) {
        this.d = drawable;
        super.setThumb(this.c ? null : this.d);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0294a.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = E.e(context);
    }

    public void a(int i) {
        if (this.e != i) {
            if (Color.alpha(i) != 255) {
                StringBuilder sb = new StringBuilder();
                sb.append("Volume slider color cannot be translucent: #");
                sb.append(Integer.toHexString(i));
                Log.e("MediaRouteVolumeSlider", sb.toString());
            }
            this.e = i;
        }
    }
}
