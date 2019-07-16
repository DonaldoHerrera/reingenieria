package com.soundcloud.android.player.ui.waveform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import java.lang.reflect.Field;

@EVa(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0017\u0018\u0000 32\u00020\u0001:\u0003345B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0012J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0012J(\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0017JP\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0018H\u0014J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010-\u001a\u00020\u0014H\u0012J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\tH\u0016J\u0010\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u000202H\u0016R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/soundcloud/android/player/ui/waveform/WaveformScrollView;", "Landroid/widget/HorizontalScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adjustedMaxOverScrollX", "areaWidth", "listener", "Lcom/soundcloud/android/player/ui/waveform/WaveformScrollView$OnScrollListener;", "scrubViewBounds", "Landroid/graphics/Rect;", "adjustedVelocity", "velocityX", "fling", "", "hideEdgeGlow", "init", "isOutsideBounds", "", "event", "Landroid/view/MotionEvent;", "onScrollChanged", "l", "t", "oldl", "oldt", "onTouchEvent", "overScrollBy", "deltaX", "deltaY", "scrollX", "scrollY", "scrollRangeX", "scrollRangeY", "maxOverScrollX", "maxOverScrollY", "isTouchEvent", "setAreaWidth", "setListener", "setScrollFriction", "setScrollX", "value", "setTranslationX", "translationX", "", "Companion", "NoEdgeEffect", "OnScrollListener", "player-ui-components_release"}, mv = {1, 1, 15})
@SuppressLint({"sc.AndroidLog"})
/* compiled from: WaveformScrollView.kt */
public class WaveformScrollView extends HorizontalScrollView {
    public static final a a = new a(null);
    private c b;
    private int c = -1;
    private final Rect d = new Rect();
    private int e;

    /* compiled from: WaveformScrollView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: WaveformScrollView.kt */
    private static final class b extends EdgeEffect {
        public b(Context context) {
            C7471uYa.b(context, "context");
            super(context);
        }

        public boolean draw(Canvas canvas) {
            C7471uYa.b(canvas, "canvas");
            return false;
        }
    }

    /* compiled from: WaveformScrollView.kt */
    public interface c {
        void a();

        void a(int i, int i2);

        void b();
    }

    public WaveformScrollView(Context context) {
        C7471uYa.b(context, "context");
        super(context);
        b(context);
    }

    private void a() {
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
            C7471uYa.a((Object) declaredField, "scroller");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            C7471uYa.a(obj, "scroller.get(this)");
            if (obj instanceof OverScroller) {
                ((OverScroller) obj).setFriction(ViewConfiguration.getScrollFriction() * ((float) 2));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Input ");
            sb.append(obj);
            sb.append(" not of type ");
            sb.append(OverScroller.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        } catch (Exception e2) {
            Log.e("WaveformScrolLView", "Unable to set scroll friction", e2);
        }
    }

    private void b(Context context) {
        float f = (float) 40;
        Resources resources = context.getResources();
        C7471uYa.a((Object) resources, "context.resources");
        this.e = (int) (f * resources.getDisplayMetrics().density);
        a();
        a(context);
    }

    public void fling(int i) {
        super.fling(a(i));
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        c cVar = this.b;
        if (cVar != null) {
            cVar.a(i, i3);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C7471uYa.b(motionEvent, "event");
        c cVar = this.b;
        if (cVar != null) {
            if (motionEvent.getAction() == 0) {
                cVar.b();
                cVar.a(getScrollX(), getScrollX());
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || a(motionEvent)) {
                cVar.a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, this.e, i8, z);
    }

    public void setAreaWidth(int i) {
        this.c = i;
    }

    public void setListener(c cVar) {
        C7471uYa.b(cVar, CastExtraArgs.LISTENER);
        this.b = cVar;
    }

    public void setScrollX(int i) {
        View childAt = getChildAt(0);
        C7471uYa.a((Object) childAt, "child");
        if (childAt.getWidth() > 0) {
            super.setScrollX(i);
        } else {
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, childAt, i));
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        c cVar = this.b;
        if (cVar != null) {
            cVar.a((int) (((float) getScrollX()) - getTranslationX()), getScrollX());
        }
    }

    public WaveformScrollView(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        b(context);
    }

    public WaveformScrollView(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet, i);
        b(context);
    }

    private void a(Context context) {
        try {
            Field declaredField = HorizontalScrollView.class.getDeclaredField("mEdgeGlowLeft");
            C7471uYa.a((Object) declaredField, "edgeGlowLeft");
            declaredField.setAccessible(true);
            declaredField.set(this, new b(context));
            Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mEdgeGlowRight");
            C7471uYa.a((Object) declaredField2, "edgeGlowRight");
            declaredField2.setAccessible(true);
            declaredField2.set(this, new b(context));
        } catch (Exception e2) {
            Log.e("WaveformScrolLView", "Unable to hide Edge Glow", e2);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        this.d.set(getLeft(), getTop(), getRight(), getBottom());
        return !this.d.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY()));
    }

    private int a(int i) {
        int i2 = this.c;
        return i2 == -1 ? i : (int) (((float) i) / (((float) i2) / ((float) getWidth())));
    }
}
