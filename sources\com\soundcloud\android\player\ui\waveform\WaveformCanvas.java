package com.soundcloud.android.player.ui.waveform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.Set;

@EVa(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0007H\u0013J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014JH\u0010$\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\nH\u0012J4\u0010*\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010.\u001a\u00020\u00192\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0019002\u0006\u00101\u001a\u00020\u0019H\u0012Jh\u00102\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0019H\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/soundcloud/android/player/ui/waveform/WaveformCanvas;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "abovePaint", "Landroid/graphics/Paint;", "barWidth", "belowPaint", "commentPaint", "invertMask", "", "maskPaint", "maskRect", "Landroid/graphics/Rect;", "playedColor", "Landroid/graphics/Color;", "spaceWidth", "unplayableAbovePaint", "unplayableBelowPaint", "unplayableFromPosition", "", "waveformBaseline", "waveformDataWithComments", "Lcom/soundcloud/android/player/ui/waveform/WaveformDataWithComments;", "clearRealPosition", "", "createPaint", "color", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawBar", "x", "y", "paintAbove", "paintBelow", "maxAmplitude", "hasComment", "comments", "", "Lcom/soundcloud/android/foundation/domain/comments/CommentWithAuthor;", "duration", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "fullWidth", "initialize", "baseline", "onDraw", "setUnplayableFromPosition", "show", "showRealPosition", "realPosition", "Companion", "player-ui-components_release"}, mv = {1, 1, 15})
/* compiled from: WaveformCanvas.kt */
public class WaveformCanvas extends View {
    public static final a a = new a(null);
    private Paint b;
    private Paint c;
    private Paint d;
    private Paint e;
    private Paint f;
    private int g;
    private int h;
    private int i;
    private float j;
    private d k;
    private boolean l;
    private Rect m;
    private Paint n;

    /* compiled from: WaveformCanvas.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public WaveformCanvas(Context context) {
        this(context, null, 0, 6, null);
    }

    public WaveformCanvas(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WaveformCanvas(Context context, AttributeSet attributeSet, int i2) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i2);
        this.j = 1.0f;
        setLayerType(2, null);
    }

    public void a(float f2) {
        Rect rect;
        if (this.l) {
            rect = new Rect(0, 0, (int) (f2 * ((float) getWidth())), getHeight());
        } else {
            rect = new Rect((int) (f2 * ((float) getWidth())), 0, getWidth(), getHeight());
        }
        this.m = rect;
        invalidate();
    }

    public void b() {
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Rect rect = this.m;
        if (rect != null) {
            Paint paint = this.n;
            if (paint != null && canvas != null) {
                canvas.drawRect(rect, paint);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C7471uYa.b(canvas2, "canvas");
        canvas2.drawColor(0, Mode.CLEAR);
        d dVar = this.k;
        if (dVar != null) {
            b c2 = dVar.c();
            Set a2 = dVar.a();
            float b2 = (float) dVar.b();
            float width = (float) getWidth();
            int size = c2.b().size();
            int min = (int) Math.min((double) size, Math.ceil((double) (((float) size) * this.j)));
            int i2 = this.g + this.h;
            int i3 = 0;
            int i4 = 0;
            while (i4 < min) {
                float max = (float) Math.max(this.h, ((Number) c2.b().get(i4)).intValue());
                Paint paint = this.b;
                String str = "abovePaint";
                if (paint != null) {
                    Paint paint2 = this.c;
                    if (paint2 != null) {
                        int a3 = c2.a();
                        int i5 = i4;
                        boolean a4 = a(a2, b2, C7127pZa.a((float) i3, (float) (this.g + i3 + this.h)), width);
                        Paint paint3 = this.b;
                        if (paint3 != null) {
                            Paint paint4 = paint3;
                            int i6 = i3;
                            int i7 = i3;
                            int i8 = a3;
                            int i9 = i5;
                            int i10 = min;
                            a(canvas, i6, max, paint, paint2, i8, a4, paint4);
                            i3 = i7 + i2;
                            i4 = i9 + 1;
                            min = i10;
                        } else {
                            C7471uYa.b(str);
                            throw null;
                        }
                    } else {
                        C7471uYa.b("belowPaint");
                        throw null;
                    }
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            }
            int i11 = min;
            int i12 = i3;
            while (min < size) {
                float max2 = (float) Math.max(this.h, ((Number) c2.b().get(min)).intValue());
                Paint paint5 = this.d;
                if (paint5 != null) {
                    Paint paint6 = this.e;
                    if (paint6 != null) {
                        int a5 = c2.a();
                        boolean a6 = a(a2, b2, C7127pZa.a((float) i12, (float) (this.g + i12 + this.h)), width);
                        Paint paint7 = this.f;
                        if (paint7 != null) {
                            Paint paint8 = paint7;
                            int i13 = i12;
                            int i14 = i12;
                            boolean z = a6;
                            int i15 = min;
                            a(canvas, i13, max2, paint5, paint6, a5, z, paint8);
                            i12 = i14 + i2;
                            min = i15 + 1;
                        } else {
                            C7471uYa.b("commentPaint");
                            throw null;
                        }
                    } else {
                        C7471uYa.b("unplayableBelowPaint");
                        throw null;
                    }
                } else {
                    C7471uYa.b("unplayableAbovePaint");
                    throw null;
                }
            }
        }
    }

    public void setUnplayableFromPosition(float f2) {
        boolean z = true;
        boolean z2 = f2 < 0.99f;
        if (this.j >= 0.99f) {
            z = false;
        }
        if (z2 != z) {
            this.j = f2;
            invalidate();
        }
    }

    public /* synthetic */ WaveformCanvas(Context context, AttributeSet attributeSet, int i2, int i3, C7264rYa rya) {
        if ((i3 & 2) != 0) {
            attributeSet = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        this(context, attributeSet, i2);
    }

    public void a() {
        if (this.m != null) {
            this.m = null;
            invalidate();
        }
    }

    private Paint a(int i2) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(Mode.MULTIPLY));
        paint.setColor(i2);
        return paint;
    }

    public void a(d dVar, float f2, Paint paint, Paint paint2, Paint paint3, Paint paint4, int i2, int i3, int i4, Paint paint5, int i5, boolean z) {
        C7471uYa.b(dVar, "waveformDataWithComments");
        C7471uYa.b(paint, "abovePaint");
        C7471uYa.b(paint2, "belowPaint");
        C7471uYa.b(paint3, "unplayableAbovePaint");
        C7471uYa.b(paint4, "unplayableBelowPaint");
        C7471uYa.b(paint5, "commentPaint");
        this.k = dVar;
        this.b = paint;
        this.c = paint2;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.d = paint3;
        this.e = paint4;
        this.j = f2;
        this.f = paint5;
        this.n = a(i5);
        this.l = z;
    }

    private boolean a(Set<C3799jda> set, float f2, C6513gZa<Float> gza, float f3) {
        Object obj;
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (gza.a(Float.valueOf((((float) ((C3799jda) obj).c().d()) / f2) * f3))) {
                break;
            }
        }
        return obj != null;
    }

    private void a(Canvas canvas, int i2, float f2, Paint paint, Paint paint2, int i3, boolean z, Paint paint3) {
        int i4 = i2;
        int i5 = this.i;
        float f3 = (float) i3;
        int i6 = i5 - ((int) ((((float) i5) * f2) / f3));
        int height = i5 + ((int) ((((float) (getHeight() - this.i)) * f2) / f3));
        int i7 = this.h;
        int i8 = height - i7;
        int i9 = z ? i7 * 2 : 0;
        float f4 = (float) i4;
        canvas.drawRect(f4, (float) i6, (float) (this.g + i4), ((float) this.i) - ((float) i9), paint);
        if (z) {
            int i10 = this.i;
            int i11 = this.h;
            canvas.drawRect(f4, (float) (i10 - i11), (float) (this.g + i4), (float) (i10 + i11 + i11), paint3);
        }
        canvas.drawRect(f4, (float) (this.i + this.h + i9), (float) (i4 + this.g), (float) i8, paint2);
    }
}
