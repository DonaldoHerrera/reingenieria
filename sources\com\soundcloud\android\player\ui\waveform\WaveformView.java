package com.soundcloud.android.player.ui.waveform;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.soundcloud.android.view.FixedWidthView;
import java.util.HashMap;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 Y2\u00020\u0001:\u0002YZB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0012J\"\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000b2\b\b\u0002\u0010>\u001a\u000204H\u0012J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020AH\u0012J\b\u0010B\u001a\u000208H\u0012J(\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0014J\u0010\u0010H\u001a\u0002082\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010I\u001a\u0002082\u0006\u0010J\u001a\u00020\b2\u0006\u0010>\u001a\u000204H\u0016J \u0010K\u001a\u0002082\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u000204H\u0016J\u0018\u0010P\u001a\u0002082\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0016J\u0018\u0010S\u001a\u0002082\u0006\u0010J\u001a\u00020\b2\u0006\u0010>\u001a\u000204H\u0016J\b\u0010T\u001a\u000208H\u0016J\b\u0010U\u001a\u000208H\u0016J\b\u0010V\u001a\u000208H\u0016J\u0010\u0010W\u001a\u0002082\u0006\u0010X\u001a\u000204H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0010\u0010'\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n +*\u0004\u0018\u00010*0*X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u000204X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006["}, d2 = {"Lcom/soundcloud/android/player/ui/waveform/WaveformView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "barWidth", "", "bline", "commentPlayedPaint", "Landroid/graphics/Paint;", "commentUnplayedPaint", "dragView", "Lcom/soundcloud/android/view/FixedWidthView;", "dragViewHolder", "Lcom/soundcloud/android/player/ui/waveform/WaveformScrollView;", "getDragViewHolder", "()Lcom/soundcloud/android/player/ui/waveform/WaveformScrollView;", "leftLine", "Landroid/widget/ImageView;", "getLeftLine", "()Landroid/widget/ImageView;", "leftWaveform", "Lcom/soundcloud/android/player/ui/waveform/WaveformCanvas;", "getLeftWaveform", "()Lcom/soundcloud/android/player/ui/waveform/WaveformCanvas;", "leftWaveformScaler", "Landroid/animation/ObjectAnimator;", "maskColor", "onWidthChangedListener", "Lcom/soundcloud/android/player/ui/waveform/WaveformView$OnWidthChangedListener;", "progressAboveEnd", "progressAbovePaint", "progressBelowPaint", "rightLine", "getRightLine", "rightWaveform", "getRightWaveform", "rightWaveformScaler", "spaceWidth", "springSystem", "Lcom/facebook/rebound/SpringSystem;", "kotlin.jvm.PlatformType", "springY", "Lcom/facebook/rebound/Spring;", "unplayableAbovePaint", "unplayableBelowPaint", "unplayedAbovePaint", "unplayedBelowPaint", "unplayedColor", "widthRatio", "", "getWidthRatio", "()F", "clearRealPosition", "", "clearScaleAnimations", "createLoadingDrawable", "Landroid/graphics/drawable/Drawable;", "color", "unPlayablePaint", "playableProportion", "createScaleDownAnimator", "animateView", "Landroid/view/View;", "hideIdleLines", "onSizeChanged", "w", "h", "oldw", "oldh", "setOnWidthChangedListener", "setPlayableWidth", "waveformWidth", "setWaveformData", "waveformDataWithComments", "Lcom/soundcloud/android/player/ui/waveform/WaveformDataWithComments;", "adjustedWidth", "unplayableProportion", "setWaveformTranslations", "leftTranslation", "rightTranslation", "setWaveformWidths", "showCollapsedWaveform", "showExpandedWaveform", "showIdleLinesAtWaveformPositions", "showRealPosition", "realPosition", "Companion", "OnWidthChangedListener", "player-ui-components_release"}, mv = {1, 1, 15})
/* compiled from: WaveformView.kt */
public class WaveformView extends FrameLayout {
    public static final a a = new a(null);
    private final int A;
    private HashMap B;
    private final int b;
    private final int c;
    private final int d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final int m;
    private final int n;
    private final float o;
    private final WaveformCanvas p;
    private final WaveformCanvas q;
    private final ImageView r;
    private final ImageView s;
    /* access modifiers changed from: private */
    public final FixedWidthView t;
    private final WaveformScrollView u;
    private final C1727tl v = C1727tl.c();
    private C1577ol w;
    private ObjectAnimator x;
    private ObjectAnimator y;
    private b z;

    /* compiled from: WaveformView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: WaveformView.kt */
    public interface b {
        void a(int i);
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C7471uYa.b(context2, "context");
        C7471uYa.b(attributeSet2, "attrs");
        super(context, attributeSet);
        Resources resources = getResources();
        C7471uYa.a((Object) resources, "resources");
        float f2 = resources.getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, p.WaveformView);
        int color = obtainStyledAttributes.getColor(p.WaveformView_progressAboveStart, -1);
        int color2 = obtainStyledAttributes.getColor(p.WaveformView_progressBelow, -1);
        int color3 = obtainStyledAttributes.getColor(p.WaveformView_unplayedAbove, -1);
        int color4 = obtainStyledAttributes.getColor(p.WaveformView_unplayedBelow, -1);
        int color5 = obtainStyledAttributes.getColor(p.WaveformView_unplayableAbove, -1);
        int color6 = obtainStyledAttributes.getColor(p.WaveformView_unplayableBelow, -1);
        this.n = obtainStyledAttributes.getColor(p.WaveformView_maskPaint, 0);
        this.A = obtainStyledAttributes.getColor(p.WaveformView_progressAboveEnd, -1);
        this.o = obtainStyledAttributes.getFloat(p.WaveformView_widthRatio, 1.5f);
        this.b = obtainStyledAttributes.getDimensionPixelSize(p.WaveformView_barWidth, (int) (((float) 2) * f2));
        this.c = obtainStyledAttributes.getDimensionPixelSize(p.WaveformView_spaceWidth, (int) (((float) 1) * f2));
        this.d = obtainStyledAttributes.getDimensionPixelSize(p.WaveformView_baseline, (int) (((float) 68) * f2));
        obtainStyledAttributes.recycle();
        this.m = color3;
        this.e = new Paint();
        Paint paint = this.e;
        float f3 = (float) this.d;
        int i2 = color6;
        int i3 = this.A;
        int i4 = color5;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f3, color, i3, TileMode.MIRROR);
        paint.setShader(linearGradient);
        this.f = new Paint();
        this.f.setColor(color2);
        this.g = new Paint();
        this.g.setColor(color3);
        this.h = new Paint();
        this.h.setColor(color4);
        this.i = new Paint();
        this.i.setColor(i4);
        this.j = new Paint();
        this.j.setColor(i2);
        this.k = new Paint();
        this.k.setColor(getResources().getColor(f.white_80));
        this.l = new Paint();
        this.l.setColor(getResources().getColor(f.soundcloudOrange));
        FrameLayout.inflate(context2, l.player_progress_layout, this);
        WaveformCanvas waveformCanvas = (WaveformCanvas) a(i.waveform_left);
        C7471uYa.a((Object) waveformCanvas, "waveform_left");
        this.p = waveformCanvas;
        WaveformCanvas waveformCanvas2 = (WaveformCanvas) a(i.waveform_right);
        C7471uYa.a((Object) waveformCanvas2, "waveform_right");
        this.q = waveformCanvas2;
        FixedWidthView fixedWidthView = (FixedWidthView) a(i.drag_view);
        C7471uYa.a((Object) fixedWidthView, "drag_view");
        this.t = fixedWidthView;
        WaveformScrollView waveformScrollView = (WaveformScrollView) a(i.drag_view_holder);
        C7471uYa.a((Object) waveformScrollView, "drag_view_holder");
        if (waveformScrollView instanceof WaveformScrollView) {
            this.u = waveformScrollView;
            getLeftWaveform().setScaleY(0.0f);
            getRightWaveform().setScaleY(0.0f);
            getLeftWaveform().setPivotY((float) this.d);
            getRightWaveform().setPivotY((float) this.d);
            ImageView imageView = (ImageView) a(i.line_left);
            C7471uYa.a((Object) imageView, "line_left");
            this.r = imageView;
            ImageView imageView2 = (ImageView) a(i.line_right);
            C7471uYa.a((Object) imageView2, "line_right");
            this.s = imageView2;
            getLeftLine().setImageDrawable(a(this, this.A, this.i, 0.0f, 4, null));
            getRightLine().setImageDrawable(a(this, color3, this.j, 0.0f, 4, null));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(waveformScrollView);
        sb.append(" not of type ");
        sb.append(WaveformScrollView.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private void e() {
        C1577ol olVar = this.w;
        if (olVar != null) {
            olVar.g();
            olVar.a();
        }
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.y;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    private void f() {
        getLeftLine().clearAnimation();
        getRightLine().clearAnimation();
        getLeftLine().setVisibility(8);
        getRightLine().setVisibility(8);
    }

    public View a(int i2) {
        if (this.B == null) {
            this.B = new HashMap();
        }
        View view = (View) this.B.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.B.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void b() {
        e();
        ObjectAnimator a2 = a((View) getLeftWaveform());
        a2.start();
        this.x = a2;
        ObjectAnimator a3 = a((View) getRightWaveform());
        a3.start();
        this.y = a3;
    }

    public void c() {
        e();
        getLeftWaveform().b();
        getRightWaveform().b();
        C1577ol a2 = this.v.a();
        a2.a(C1608pl.a(180.0d, 10.0d));
        a2.b((double) getLeftWaveform().getScaleY());
        a2.c(1.0d);
        a2.a((C1667rl) new g(a2, this));
        this.w = a2;
        f();
    }

    public void d() {
        getLeftLine().setTranslationX(getLeftWaveform().getTranslationX());
        getRightLine().setTranslationX(getRightWaveform().getTranslationX());
        getLeftLine().setVisibility(0);
        getRightLine().setVisibility(0);
    }

    public WaveformScrollView getDragViewHolder() {
        return this.u;
    }

    public ImageView getLeftLine() {
        return this.r;
    }

    public WaveformCanvas getLeftWaveform() {
        return this.p;
    }

    public ImageView getRightLine() {
        return this.s;
    }

    public WaveformCanvas getRightWaveform() {
        return this.q;
    }

    public float getWidthRatio() {
        return this.o;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        b bVar = this.z;
        if (bVar != null) {
            bVar.a(i2);
        }
    }

    public void setOnWidthChangedListener(b bVar) {
        C7471uYa.b(bVar, "onWidthChangedListener");
        this.z = bVar;
    }

    public void a(int i2, int i3) {
        float f2 = (float) i2;
        getLeftWaveform().setTranslationX(f2);
        float f3 = (float) i3;
        getRightWaveform().setTranslationX(f3);
        getLeftLine().setTranslationX(f2);
        getRightLine().setTranslationX(f3);
    }

    public void b(int i2, float f2) {
        getLeftWaveform().setLayoutParams(new LayoutParams(i2, -1));
        getLeftLine().setLayoutParams(new LayoutParams(i2, -1));
        getRightWaveform().setLayoutParams(new LayoutParams(i2, -1));
        getRightLine().setLayoutParams(new LayoutParams(i2, -1));
        a(i2, f2);
    }

    private ObjectAnimator a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", new float[]{view.getScaleY(), 0.0f});
        ofFloat.setDuration((long) 150);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        C7471uYa.a((Object) ofFloat, "ObjectAnimator.ofFloat(\n…eInterpolator()\n        }");
        return ofFloat;
    }

    public void a(int i2, float f2) {
        this.t.setWidth((int) ((((float) i2) * f2) + ((float) getWidth())));
        getLeftWaveform().setUnplayableFromPosition(f2);
        getLeftLine().setImageDrawable(a(this.A, this.i, f2));
        getRightWaveform().setUnplayableFromPosition(f2);
        getRightLine().setImageDrawable(a(this.m, this.j, f2));
        post(new f(this));
    }

    static /* synthetic */ Drawable a(WaveformView waveformView, int i2, Paint paint, float f2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            return waveformView.a(i2, paint, f2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLoadingDrawable");
    }

    private Drawable a(int i2, Paint paint, float f2) {
        a aVar = new a(i2, paint, this.d, this.c, f2);
        return aVar;
    }

    public void a(d dVar, int i2, float f2) {
        int i3 = i2;
        C7471uYa.b(dVar, "waveformDataWithComments");
        d dVar2 = new d(c.a(dVar.c(), (double) (i3 / (this.b + this.c))), dVar.a(), dVar.b());
        d dVar3 = dVar2;
        float f3 = f2;
        getLeftWaveform().a(dVar3, f3, this.e, this.f, this.i, this.j, this.b, this.c, this.d, this.k, this.n, false);
        getRightWaveform().a(dVar3, f3, this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.l, this.n, true);
        getDragViewHolder().setAreaWidth(i3);
    }

    public void a(float f2) {
        getLeftWaveform().a(f2);
        getRightWaveform().a(f2);
    }

    public void a() {
        getLeftWaveform().a();
        getRightWaveform().a();
    }
}
