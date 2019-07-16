package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.DynamicLayout;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;

@SuppressLint({"ViewConstructor"})
/* renamed from: Nl reason: default package */
/* compiled from: TapTargetView */
public class Nl extends View {
    CharSequence A;
    StaticLayout B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    SpannableStringBuilder I;
    DynamicLayout J;
    TextPaint K;
    Paint L;
    Rect M;
    Rect N;
    Path O;
    float P;
    int Q;
    int[] R;
    int S;
    float T;
    int U;
    float V;
    int W;
    private boolean a = false;
    int aa;
    /* access modifiers changed from: private */
    public boolean b = false;
    int ba;
    /* access modifiers changed from: private */
    public boolean c = true;
    float ca;
    final int d;
    float da;
    final int e;
    int ea;
    final int f;
    int fa;
    final int g;
    Bitmap ga;
    final int h;
    a ha;
    final int i;
    ViewOutlineProvider ia;
    final int j;
    final b ja = new Dl(this);
    final int k;
    final ValueAnimator ka;
    final int l;
    final ValueAnimator la;
    final int m;
    final ValueAnimator ma;
    final int n;
    private final ValueAnimator na;
    final ViewGroup o;
    private ValueAnimator[] oa;
    final ViewManager p;
    private final OnGlobalLayoutListener pa;
    final C1907zl q;
    final Rect r;
    final TextPaint s;
    final TextPaint t;
    final Paint u;
    final Paint v;
    final Paint w;
    final Paint x;
    CharSequence y;
    StaticLayout z;

    /* renamed from: Nl$a */
    /* compiled from: TapTargetView */
    public static class a {
        public void a(Nl nl) {
        }

        public void a(Nl nl, boolean z) {
        }

        public void b(Nl nl) {
            nl.a(false);
        }

        public void c(Nl nl) {
            nl.a(true);
        }

        public void d(Nl nl) {
            c(nl);
        }
    }

    public Nl(Context context, ViewManager viewManager, ViewGroup viewGroup, C1907zl zlVar, a aVar) {
        boolean z2;
        boolean z3;
        super(context);
        boolean z4 = false;
        C1877yl ylVar = new C1877yl();
        ylVar.b(250);
        ylVar.a(250);
        ylVar.a((TimeInterpolator) new AccelerateDecelerateInterpolator());
        ylVar.a((b) new Fl(this));
        ylVar.a((a) new El(this));
        this.ka = ylVar.a();
        C1877yl ylVar2 = new C1877yl();
        ylVar2.b(1000);
        ylVar2.a(-1);
        ylVar2.a((TimeInterpolator) new AccelerateDecelerateInterpolator());
        ylVar2.a((b) new Gl(this));
        this.la = ylVar2.a();
        C1877yl ylVar3 = new C1877yl(true);
        ylVar3.b(250);
        ylVar3.a((TimeInterpolator) new AccelerateDecelerateInterpolator());
        ylVar3.a((b) new Il(this));
        ylVar3.a((a) new Hl(this));
        this.ma = ylVar3.a();
        C1877yl ylVar4 = new C1877yl();
        ylVar4.b(250);
        ylVar4.a((TimeInterpolator) new AccelerateDecelerateInterpolator());
        ylVar4.a((b) new Kl(this));
        ylVar4.a((a) new Jl(this));
        this.na = ylVar4.a();
        this.oa = new ValueAnimator[]{this.ka, this.la, this.na, this.ma};
        if (zlVar != null) {
            this.q = zlVar;
            this.p = viewManager;
            this.o = viewGroup;
            if (aVar == null) {
                aVar = new a();
            }
            this.ha = aVar;
            this.y = zlVar.a;
            this.A = zlVar.b;
            this.d = Ol.a(context, 20);
            this.k = Ol.a(context, 40);
            this.e = Ol.a(context, zlVar.d);
            this.g = Ol.a(context, 40);
            this.h = Ol.a(context, 8);
            this.i = Ol.a(context, 360);
            this.j = Ol.a(context, 20);
            this.l = Ol.a(context, 88);
            this.m = Ol.a(context, 8);
            this.n = Ol.a(context, 1);
            this.f = (int) (((float) this.e) * 0.1f);
            this.O = new Path();
            this.r = new Rect();
            this.M = new Rect();
            this.s = new TextPaint();
            this.s.setTextSize((float) zlVar.g(context));
            this.s.setTypeface(Typeface.create("sans-serif-medium", 0));
            this.s.setAntiAlias(true);
            this.t = new TextPaint();
            this.t.setTextSize((float) zlVar.b(context));
            this.t.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            this.t.setAntiAlias(true);
            this.t.setAlpha(137);
            this.u = new Paint();
            this.u.setAntiAlias(true);
            this.u.setAlpha((int) (zlVar.c * 255.0f));
            this.v = new Paint();
            this.v.setAntiAlias(true);
            this.v.setAlpha(50);
            this.v.setStyle(Style.STROKE);
            this.v.setStrokeWidth((float) this.n);
            this.v.setColor(-16777216);
            this.w = new Paint();
            this.w.setAntiAlias(true);
            this.x = new Paint();
            this.x.setAntiAlias(true);
            a(context);
            if (VERSION.SDK_INT < 19 || !(context instanceof Activity)) {
                z3 = false;
                z2 = false;
            } else {
                int i2 = ((Activity) context).getWindow().getAttributes().flags;
                boolean z5 = (67108864 & i2) != 0;
                if ((i2 & 134217728) != 0) {
                    z4 = true;
                }
                z3 = z5;
                z2 = z4;
            }
            Ml ml = new Ml(this, zlVar, viewGroup, context, z3, z2);
            this.pa = ml;
            getViewTreeObserver().addOnGlobalLayoutListener(this.pa);
            setFocusableInTouchMode(true);
            setClickable(true);
            setOnClickListener(new Al(this));
            setOnLongClickListener(new Bl(this));
            return;
        }
        throw new IllegalArgumentException("Target cannot be null");
    }

    /* access modifiers changed from: private */
    public void f() {
        if (!this.H) {
            this.c = false;
            this.ka.start();
            this.H = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public float a(float f2) {
        return f2 < 0.5f ? f2 / 0.5f : (1.0f - f2) / 0.5f;
    }

    /* access modifiers changed from: 0000 */
    public float a(float f2, float f3) {
        if (f2 < f3) {
            return 0.0f;
        }
        return (f2 - f3) / (1.0f - f3);
    }

    public boolean d() {
        return !this.a && this.H;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        int min = Math.min(getWidth(), this.i) - (this.g * 2);
        if (min > 0) {
            StaticLayout staticLayout = new StaticLayout(this.y, this.s, min, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.z = staticLayout;
            CharSequence charSequence = this.A;
            if (charSequence != null) {
                StaticLayout staticLayout2 = new StaticLayout(charSequence, this.t, min, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.B = staticLayout2;
            } else {
                this.B = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int[] getOuterCircleCenterPoint() {
        int i2;
        if (a(this.r.centerY())) {
            return new int[]{this.r.centerX(), this.r.centerY()};
        }
        int max = (Math.max(this.r.width(), this.r.height()) / 2) + this.d;
        int totalTextHeight = getTotalTextHeight();
        boolean z2 = ((this.r.centerY() - this.e) - this.d) - totalTextHeight > 0;
        int min = Math.min(this.N.left, this.r.left - max);
        int max2 = Math.max(this.N.right, this.r.right + max);
        StaticLayout staticLayout = this.z;
        int height = staticLayout == null ? 0 : staticLayout.getHeight();
        if (z2) {
            i2 = (((this.r.centerY() - this.e) - this.d) - totalTextHeight) + height;
        } else {
            i2 = this.r.centerY() + this.e + this.d + height;
        }
        return new int[]{(min + max2) / 2, i2};
    }

    /* access modifiers changed from: 0000 */
    public Rect getTextBounds() {
        int totalTextHeight = getTotalTextHeight();
        int totalTextWidth = getTotalTextWidth();
        int centerY = ((this.r.centerY() - this.e) - this.d) - totalTextHeight;
        if (centerY <= this.ea) {
            centerY = this.r.centerY() + this.e + this.d;
        }
        int max = Math.max(this.g, (this.r.centerX() - ((getWidth() / 2) - this.r.centerX() < 0 ? -this.j : this.j)) - totalTextWidth);
        return new Rect(max, centerY, Math.min(getWidth() - this.g, totalTextWidth + max), totalTextHeight + centerY);
    }

    /* access modifiers changed from: 0000 */
    public int getTotalTextHeight() {
        int height;
        int i2;
        StaticLayout staticLayout = this.z;
        if (staticLayout == null) {
            return 0;
        }
        if (this.B == null) {
            height = staticLayout.getHeight();
            i2 = this.h;
        } else {
            height = staticLayout.getHeight() + this.B.getHeight();
            i2 = this.h;
        }
        return height + i2;
    }

    /* access modifiers changed from: 0000 */
    public int getTotalTextWidth() {
        StaticLayout staticLayout = this.z;
        if (staticLayout == null) {
            return 0;
        }
        if (this.B == null) {
            return staticLayout.getWidth();
        }
        return Math.max(staticLayout.getWidth(), this.B.getWidth());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.a && this.R != null) {
            int i2 = this.ea;
            if (i2 > 0 && this.fa > 0) {
                canvas.clipRect(0, i2, getWidth(), this.fa);
            }
            int i3 = this.ba;
            if (i3 != -1) {
                canvas.drawColor(i3);
            }
            this.u.setAlpha(this.S);
            if (this.F && this.ia == null) {
                int save = canvas.save();
                canvas.clipPath(this.O, Op.DIFFERENCE);
                b(canvas);
                canvas.restoreToCount(save);
            }
            int[] iArr = this.R;
            canvas.drawCircle((float) iArr[0], (float) iArr[1], this.P, this.u);
            this.w.setAlpha(this.W);
            int i4 = this.U;
            if (i4 > 0) {
                this.x.setAlpha(i4);
                canvas.drawCircle((float) this.r.centerX(), (float) this.r.centerY(), this.T, this.x);
            }
            canvas.drawCircle((float) this.r.centerX(), (float) this.r.centerY(), this.V, this.w);
            int save2 = canvas.save();
            Rect rect = this.N;
            canvas.translate((float) rect.left, (float) rect.top);
            this.s.setAlpha(this.aa);
            StaticLayout staticLayout = this.z;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            if (this.B != null) {
                StaticLayout staticLayout2 = this.z;
                if (staticLayout2 != null) {
                    canvas.translate(0.0f, (float) (staticLayout2.getHeight() + this.h));
                    this.t.setAlpha((int) (this.q.B * ((float) this.aa)));
                    this.B.draw(canvas);
                }
            }
            canvas.restoreToCount(save2);
            int save3 = canvas.save();
            if (this.ga != null) {
                canvas.translate((float) (this.r.centerX() - (this.ga.getWidth() / 2)), (float) (this.r.centerY() - (this.ga.getHeight() / 2)));
                canvas.drawBitmap(this.ga, 0.0f, 0.0f, this.w);
            } else if (this.q.f != null) {
                canvas.translate((float) (this.r.centerX() - (this.q.f.getBounds().width() / 2)), (float) (this.r.centerY() - (this.q.f.getBounds().height() / 2)));
                this.q.f.setAlpha(this.w.getAlpha());
                this.q.f.draw(canvas);
            }
            canvas.restoreToCount(save3);
            if (this.D) {
                a(canvas);
            }
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!d() || !this.G || i2 != 4) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (!d() || !this.c || !this.G || i2 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        this.c = false;
        a aVar = this.ha;
        if (aVar != null) {
            aVar.b(this);
        } else {
            new a().b(this);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.ca = motionEvent.getX();
        this.da = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    public void setDrawDebug(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
            postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    public void c(boolean z2) {
        b(z2);
        Sl.a(this.p, (View) this);
    }

    public static Nl a(Activity activity, C1907zl zlVar, a aVar) {
        if (activity != null) {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            Nl nl = new Nl(activity, viewGroup, (ViewGroup) viewGroup.findViewById(16908290), zlVar, aVar);
            viewGroup.addView(nl, layoutParams);
            return nl;
        }
        throw new IllegalArgumentException("Activity is null");
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2) {
        ValueAnimator[] valueAnimatorArr;
        if (!this.a) {
            this.b = false;
            this.a = true;
            for (ValueAnimator valueAnimator : this.oa) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            Sl.a(getViewTreeObserver(), this.pa);
            this.H = false;
            a aVar = this.ha;
            if (aVar != null) {
                aVar.a(this, z2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        Drawable drawable = this.q.f;
        if (!this.E || drawable == null) {
            this.ga = null;
        } else if (this.ga == null) {
            this.ga = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(this.ga);
            drawable.setColorFilter(new PorterDuffColorFilter(this.u.getColor(), Mode.SRC_ATOP));
            drawable.draw(canvas);
            drawable.setColorFilter(null);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        C1907zl zlVar = this.q;
        this.E = zlVar.z;
        this.F = zlVar.x;
        this.G = zlVar.y;
        if (this.F && VERSION.SDK_INT >= 21 && !zlVar.A) {
            this.ia = new Cl(this);
            setOutlineProvider(this.ia);
            setElevation((float) this.m);
        }
        boolean z2 = true;
        if (!this.F || this.ia != null || VERSION.SDK_INT >= 18) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
        Theme theme = context.getTheme();
        if (Ol.a(context, "isLightTheme") != 0) {
            z2 = false;
        }
        this.C = z2;
        Integer d2 = this.q.d(context);
        if (d2 != null) {
            this.u.setColor(d2.intValue());
        } else if (theme != null) {
            this.u.setColor(Ol.a(context, "colorPrimary"));
        } else {
            this.u.setColor(-1);
        }
        Integer e2 = this.q.e(context);
        int i2 = -16777216;
        if (e2 != null) {
            this.w.setColor(e2.intValue());
        } else {
            this.w.setColor(this.C ? -16777216 : -1);
        }
        if (this.q.A) {
            this.w.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        }
        this.x.setColor(this.w.getColor());
        Integer c2 = this.q.c(context);
        if (c2 != null) {
            this.ba = Ol.a(c2.intValue(), 0.3f);
        } else {
            this.ba = -1;
        }
        Integer f2 = this.q.f(context);
        if (f2 != null) {
            this.s.setColor(f2.intValue());
        } else {
            TextPaint textPaint = this.s;
            if (!this.C) {
                i2 = -1;
            }
            textPaint.setColor(i2);
        }
        Integer a2 = this.q.a(context);
        if (a2 != null) {
            this.t.setColor(a2.intValue());
        } else {
            this.t.setColor(this.s.getColor());
        }
        Typeface typeface = this.q.g;
        if (typeface != null) {
            this.s.setTypeface(typeface);
        }
        Typeface typeface2 = this.q.h;
        if (typeface2 != null) {
            this.t.setTypeface(typeface2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(Canvas canvas) {
        float f2 = ((float) this.S) * 0.2f;
        this.v.setStyle(Style.FILL_AND_STROKE);
        this.v.setAlpha((int) f2);
        int[] iArr = this.R;
        canvas.drawCircle((float) iArr[0], (float) (iArr[1] + this.m), this.P, this.v);
        this.v.setStyle(Style.STROKE);
        for (int i2 = 6; i2 > 0; i2--) {
            this.v.setAlpha((int) ((((float) i2) / 7.0f) * f2));
            int[] iArr2 = this.R;
            canvas.drawCircle((float) iArr2[0], (float) (iArr2[1] + this.m), this.P + ((float) ((7 - i2) * this.n)), this.v);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        int[] iArr = this.R;
        if (iArr != null) {
            this.M.left = (int) Math.max(0.0f, ((float) iArr[0]) - this.P);
            this.M.top = (int) Math.min(0.0f, ((float) this.R[1]) - this.P);
            this.M.right = (int) Math.min((float) getWidth(), ((float) this.R[0]) + this.P + ((float) this.k));
            this.M.bottom = (int) Math.min((float) getHeight(), ((float) this.R[1]) + this.P + ((float) this.k));
        }
    }

    public void a(boolean z2) {
        this.b = true;
        this.la.cancel();
        this.ka.cancel();
        if (!this.H || this.R == null) {
            c(z2);
            return;
        }
        if (z2) {
            this.na.start();
        } else {
            this.ma.start();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Canvas canvas) {
        if (this.L == null) {
            this.L = new Paint();
            this.L.setARGB(255, 255, 0, 0);
            this.L.setStyle(Style.STROKE);
            this.L.setStrokeWidth((float) Ol.a(getContext(), 1));
        }
        if (this.K == null) {
            this.K = new TextPaint();
            this.K.setColor(-65536);
            this.K.setTextSize((float) Ol.b(getContext(), 16));
        }
        this.L.setStyle(Style.STROKE);
        canvas.drawRect(this.N, this.L);
        canvas.drawRect(this.r, this.L);
        int[] iArr = this.R;
        canvas.drawCircle((float) iArr[0], (float) iArr[1], 10.0f, this.L);
        int[] iArr2 = this.R;
        canvas.drawCircle((float) iArr2[0], (float) iArr2[1], (float) (this.Q - this.k), this.L);
        canvas.drawCircle((float) this.r.centerX(), (float) this.r.centerY(), (float) (this.e + this.d), this.L);
        this.L.setStyle(Style.FILL);
        StringBuilder sb = new StringBuilder();
        sb.append("Text bounds: ");
        sb.append(this.N.toShortString());
        String str = "\nTarget bounds: ";
        sb.append(str);
        sb.append(this.r.toShortString());
        sb.append("\nCenter: ");
        sb.append(this.R[0]);
        String str2 = " ";
        sb.append(str2);
        sb.append(this.R[1]);
        sb.append("\nView size: ");
        sb.append(getWidth());
        sb.append(str2);
        sb.append(getHeight());
        sb.append(str);
        sb.append(this.r.toShortString());
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = this.I;
        if (spannableStringBuilder == null) {
            this.I = new SpannableStringBuilder(sb2);
        } else {
            spannableStringBuilder.clear();
            this.I.append(sb2);
        }
        if (this.J == null) {
            DynamicLayout dynamicLayout = new DynamicLayout(sb2, this.K, getWidth(), Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = dynamicLayout;
        }
        int save = canvas.save();
        this.L.setARGB(220, 0, 0, 0);
        canvas.translate(0.0f, (float) this.ea);
        canvas.drawRect(0.0f, 0.0f, (float) this.J.getWidth(), (float) this.J.getHeight(), this.L);
        this.L.setARGB(255, 255, 0, 0);
        this.J.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.N = getTextBounds();
        this.R = getOuterCircleCenterPoint();
        int[] iArr = this.R;
        this.Q = a(iArr[0], iArr[1], this.N, this.r);
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, int i3, Rect rect, Rect rect2) {
        int centerX = rect2.centerX();
        int centerY = rect2.centerY();
        int i4 = (int) (((float) this.e) * 1.1f);
        Rect rect3 = new Rect(centerX, centerY, centerX, centerY);
        int i5 = -i4;
        rect3.inset(i5, i5);
        return Math.max(a(i2, i3, rect), a(i2, i3, rect3)) + this.k;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i2) {
        int i3 = this.fa;
        boolean z2 = false;
        if (i3 > 0) {
            int i4 = this.l;
            if (i2 < i4 || i2 > i3 - i4) {
                z2 = true;
            }
            return z2;
        }
        if (i2 < this.l || i2 > getHeight() - this.l) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, int i3, Rect rect) {
        return (int) Math.max(a(i2, i3, rect.left, rect.top), Math.max(a(i2, i3, rect.right, rect.top), Math.max(a(i2, i3, rect.left, rect.bottom), a(i2, i3, rect.right, rect.bottom))));
    }

    /* access modifiers changed from: 0000 */
    public double a(int i2, int i3, int i4, int i5) {
        return Math.sqrt(Math.pow((double) (i4 - i2), 2.0d) + Math.pow((double) (i5 - i3), 2.0d));
    }

    /* access modifiers changed from: 0000 */
    public void a(Rect rect) {
        invalidate(rect);
        if (this.ia != null && VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }
}
