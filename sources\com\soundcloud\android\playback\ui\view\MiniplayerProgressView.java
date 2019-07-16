package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.soundcloud.android.ia.f;

@EVa(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fJ\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u000fH\u0002J\f\u0010*\u001a\u00020\u000f*\u00020$H\u0002R\u0010\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/soundcloud/android/playback/ui/view/MiniplayerProgressView;", "Landroid/view/View;", "Lcom/soundcloud/android/player/ui/PlayStateAware;", "Lcom/soundcloud/android/player/ui/progress/ScrubController$OnScrubListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "fadeInAnimationDuration", "", "lastSlideOffset", "", "progressRatio", "clearProgress", "", "displayScrubPosition", "scrubPosition", "boundedScrubPosition", "fadeInWhenSlideIsComplete", "slideOffset", "isSlidingDown", "", "currentSlideOffset", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSlide", "scrubStateChanged", "newScrubState", "Lcom/soundcloud/android/player/ui/ScrubState;", "setProgress", "playbackProgressState", "Lcom/soundcloud/android/player/ui/PlayerViewProgressState;", "setState", "trackPageState", "Lcom/soundcloud/android/player/ui/ViewPlaybackState;", "setWidthRatio", "ratio", "getRatio", "base_release"}, mv = {1, 1, 15})
/* compiled from: MiniplayerProgressView.kt */
public final class MiniplayerProgressView extends View implements Hna, d {
    private final int a;
    private final long b;
    private float c;
    private float d;

    public MiniplayerProgressView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MiniplayerProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MiniplayerProgressView(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private final void b(float f) {
        if (f <= ((float) 0)) {
            setAlpha(0.0f);
            setVisibility(0);
            animate().alpha(1.0f).setDuration(this.b).start();
        }
    }

    private final boolean c(float f) {
        return f < this.d;
    }

    private final void setWidthRatio(float f) {
        this.c = f;
        invalidate();
    }

    public final void a() {
        setWidthRatio(0.0f);
    }

    public void a(Mna mna) {
        C7471uYa.b(mna, "newScrubState");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.clipRect(0.0f, 0.0f, ((float) canvas.getWidth()) * this.c, (float) canvas.getHeight());
        }
        if (canvas != null) {
            canvas.drawColor(this.a);
        }
    }

    public final void setProgress(Kna kna) {
        C7471uYa.b(kna, "playbackProgressState");
        setWidthRatio(a(kna));
    }

    public void setState(Nna nna) {
        C7471uYa.b(nna, "trackPageState");
        setProgress(nna.c());
    }

    public MiniplayerProgressView(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        this.a = a.a(context, f.soundcloudOrange);
        this.b = (long) getResources().getInteger(17694721);
    }

    public void a(float f, float f2) {
        setWidthRatio(f2);
    }

    public final void a(float f) {
        if (f > 0.01f) {
            setVisibility(8);
        } else if (c(f)) {
            b(f);
        } else {
            setAlpha(((float) 1) - (f / 0.01f));
            setVisibility(0);
        }
        this.d = f;
    }

    private final float a(Kna kna) {
        return ((float) kna.e()) / ((float) kna.c());
    }
}
