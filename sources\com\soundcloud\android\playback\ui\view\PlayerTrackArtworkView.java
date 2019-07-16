package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;

public class PlayerTrackArtworkView extends FrameLayout {
    private a a;
    private final ImageView b;
    private final ImageView c;
    private final View d;
    private Boolean e = null;

    public interface a {
        void a();
    }

    public PlayerTrackArtworkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(l.player_track_artwork_view, this);
        this.b = (ImageView) findViewById(i.artwork_image_view);
        this.c = (ImageView) findViewById(i.artwork_overlay_image);
        this.d = findViewById(i.artwork_holder);
        this.b.setScaleX(1.03f);
        this.b.setScaleY(1.03f);
    }

    public View getArtworkHolder() {
        return this.d;
    }

    public ImageView getImageOverlay() {
        return this.c;
    }

    public ImageView getWrappedImageView() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setArtworkActive(boolean z) {
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z) {
            if (z) {
                this.b.animate().setDuration(100).setInterpolator(new DecelerateInterpolator()).scaleX(1.03f).scaleY(1.03f).start();
            } else {
                this.b.animate().setDuration(100).scaleX(1.0f).scaleY(1.0f).start();
            }
            this.e = Boolean.valueOf(z);
        }
    }

    public void setOnWidthChangedListener(a aVar) {
        this.a = aVar;
    }
}
