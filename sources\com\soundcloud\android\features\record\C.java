package com.soundcloud.android.features.record;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader.TileMode;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.soundcloud.android.features.record.G.f;
import com.soundcloud.android.features.record.G.g;

/* compiled from: CreateWaveView */
public class C extends View {
    private static final Interpolator a = new DecelerateInterpolator();
    private static final Paint b = new Paint();
    private static final Paint c = new Paint();
    private final c A = new c();
    private final b B;
    private final a C;
    private final int D;
    private final int E;
    private J F;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private Paint m;
    private Paint n;
    private final float o;
    private Bitmap p;
    private Bitmap q;
    private int r = -1;
    private float s = -1.0f;
    private int t;
    private boolean u;
    private long v;
    private float[] w;
    private float[] x;
    private float[] y;
    private float[] z;

    /* compiled from: CreateWaveView */
    static class a {
        private float a = -1.0f;
        private float b = 0.0f;
        private float c = -1.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private final float f;
        private int g;

        a(int i, float f2) {
            this.g = i;
            this.f = f2;
        }

        private void d() {
            this.a = e();
            this.e = 0.0f;
            this.d = 0.0f;
        }

        private float e() {
            return this.d / this.e;
        }

        /* access modifiers changed from: 0000 */
        public float a() {
            return this.a;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            this.c = -1.0f;
            this.a = -1.0f;
            this.e = 0.0f;
            this.d = 0.0f;
            this.b = 0.0f;
        }

        /* access modifiers changed from: 0000 */
        public boolean c() {
            return this.c > 0.0f;
        }

        /* access modifiers changed from: 0000 */
        public void a(float f2) {
            this.d += f2;
            this.e += 1.0f;
            float f3 = this.c;
            if (f3 >= 0.0f) {
                if (f3 == 0.0f) {
                    d();
                }
                this.c += 1.0f;
                if (this.c == this.f) {
                    this.c = -1.0f;
                    return;
                }
                return;
            }
            if (this.b == 0.0f && e() > this.a) {
                d();
            }
            this.b += 1.0f;
            if (this.b == ((float) this.g)) {
                this.c = 0.0f;
                this.b = 0.0f;
            }
        }
    }

    /* compiled from: CreateWaveView */
    static class b {
        private final float a;
        private final a b;
        private c c;
        private int d;
        private int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(float f2, a aVar) {
            this.a = f2;
            this.b = aVar;
        }

        public void a(c cVar, float f2, boolean z, boolean z2, int i2, int i3) {
            this.c = cVar;
            this.i = i2;
            int i4 = z2 ? this.c.c : cVar.f;
            if (z) {
                c cVar2 = this.c;
                if (cVar2.e < i3) {
                    float f3 = (float) i4;
                    this.d = (int) (f3 - (f3 * f2));
                } else {
                    int i5 = cVar2.d;
                    if (i5 < i3) {
                        this.d = i4 - ((int) (((float) (i3 - i5)) * f2));
                    } else {
                        this.d = Math.max(0, i4 + ((int) (((float) (i5 - i3)) * f2)));
                    }
                }
            } else {
                int i6 = this.c.e;
                if (i6 < i3) {
                    this.d = Math.max(0, (int) (((float) i4) * f2));
                } else {
                    this.d = (int) Math.max(0.0f, ((float) (i6 - i3)) - (((float) ((i6 - i3) - i4)) * f2));
                }
            }
            this.e = z2 ? this.c.e : cVar.g;
            int i7 = this.e;
            int i8 = this.d;
            this.f = i7 - i8;
            this.g = Math.max(0, this.c.c - i8);
            if (z) {
                int i9 = this.f;
                if (i9 < i3) {
                    i3 = (int) (((float) i3) - (((float) (i3 - i9)) * f2));
                }
                this.h = i3;
                return;
            }
            int i10 = this.f;
            if (i10 < i3) {
                i3 = (int) (((float) i10) + (((float) (i3 - i10)) * f2));
            }
            this.h = i3;
        }

        public float a(int i2) {
            return this.c.a(i2 + this.d);
        }

        public float a(int i2, int i3) {
            int i4 = this.f;
            if (i4 > i3) {
                return a((int) Math.min((float) (i4 - 1), (((float) i2) / ((float) i3)) * ((float) i4)));
            }
            float min = Math.min((float) (i4 - 1), (((float) i4) * ((float) i2)) / ((float) i3));
            double d2 = (double) min;
            float a2 = a((int) Math.floor(d2));
            return a2 + ((a((int) Math.ceil(d2)) - a2) * (min - ((float) ((int) min))));
        }

        /* access modifiers changed from: private */
        public int a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            int i2 = this.i;
            float f2 = (float) i2;
            float f3 = this.a;
            float f4 = f2 * f3;
            float f5 = ((float) i2) - (((float) i2) * f3);
            this.b.b();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = this.h;
                if (i3 < i5 && i4 < fArr.length + 3) {
                    this.b.a(a(i3, i5));
                    float a2 = this.b.a();
                    float[] fArr5 = this.b.c() ? fArr3 : fArr;
                    float[] fArr6 = this.b.c() ? fArr4 : fArr2;
                    float f6 = (float) i3;
                    fArr5[i4] = f6;
                    int i6 = i4 + 1;
                    fArr5[i6] = f4 - (a2 * f4);
                    int i7 = i4 + 2;
                    fArr5[i7] = f6;
                    int i8 = i4 + 3;
                    fArr5[i8] = f4;
                    fArr6[i4] = f6;
                    fArr6[i6] = f4;
                    fArr6[i7] = f6;
                    fArr6[i8] = (a2 * f5) + f4;
                    i4 += 4;
                    i3++;
                }
            }
            return this.h * 4;
        }
    }

    /* compiled from: CreateWaveView */
    static class c {
        private AmplitudeData a;
        private AmplitudeData b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        c() {
        }

        public void a(P p, float[] fArr) {
            this.a = p.e();
            this.b = p.a();
            AmplitudeData amplitudeData = this.a;
            this.c = amplitudeData == null ? 0 : amplitudeData.size();
            AmplitudeData amplitudeData2 = this.b;
            this.d = amplitudeData2 == null ? 0 : amplitudeData2.size();
            int i = this.c;
            int i2 = this.d;
            this.e = i + i2;
            this.f = (int) (((float) i) + (fArr[0] * ((float) i2)));
            this.g = (int) (((double) this.e) - (((double) i2) * (1.0d - ((double) fArr[1]))));
        }

        public float a(int i) {
            if (i < this.a.size()) {
                return this.a.get(i);
            }
            if (i - this.a.size() < this.b.size()) {
                return this.b.get(i - this.a.size());
            }
            return 0.0f;
        }
    }

    static {
        b.setAntiAlias(true);
        c.setXfermode(new PorterDuffXfermode(Mode.SRC));
        c.setColor(0);
    }

    public C(Context context) {
        super(context);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(g.rec_waveform_baseline_ratio, typedValue, true);
        this.o = typedValue.getFloat();
        this.D = context.getResources().getColor(f.amber);
        this.E = context.getResources().getColor(f.scarlet);
        int color = context.getResources().getColor(f.peach);
        int color2 = context.getResources().getColor(f.ash);
        int color3 = context.getResources().getColor(f.platinum);
        int color4 = context.getResources().getColor(f.raven);
        int color5 = context.getResources().getColor(f.charcoal);
        int color6 = context.getResources().getColor(f.black_20);
        this.m = new Paint();
        this.n = new Paint();
        this.d = new Paint();
        this.d.setColor(color);
        this.e = new Paint();
        this.e.setColor(color);
        this.e.setAlpha(40);
        this.f = new Paint();
        this.f.setColor(color2);
        this.g = new Paint();
        this.g.setColor(color2);
        this.g.setAlpha(40);
        this.h = new Paint();
        this.h.setColor(color3);
        this.i = new Paint();
        this.i.setColor(color3);
        this.i.setAlpha(40);
        this.j = new Paint();
        this.j.setColor(color4);
        this.k = new Paint();
        this.k.setColor(color5);
        this.l = new Paint();
        this.l.setColor(color6);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(g.rec_waveform_space_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(g.rec_waveform_bar_width);
        float f2 = (float) dimensionPixelSize;
        this.B = new b(this.o, new a(dimensionPixelSize2, f2));
        this.C = new a(dimensionPixelSize2, f2);
        b();
    }

    private void c() {
        this.r = -1;
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            new Canvas(bitmap).drawRect(0.0f, 0.0f, (float) this.p.getWidth(), (float) this.p.getHeight(), c);
        }
        Bitmap bitmap2 = this.q;
        if (bitmap2 != null) {
            new Canvas(bitmap2).drawRect(0.0f, 0.0f, (float) this.q.getWidth(), (float) this.q.getHeight(), c);
        }
    }

    public void a(int i2, boolean z2) {
        if (this.t != i2) {
            this.t = i2;
            this.s = -1.0f;
            if (z2) {
                this.v = System.currentTimeMillis();
            }
            invalidate();
        }
    }

    public final void b() {
        this.s = -1.0f;
        this.v = -1;
        this.t = 0;
        this.u = false;
        c();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i2;
        Canvas canvas2 = canvas;
        ba a2 = ba.a(getContext(), this.F);
        float[] g2 = a2.g();
        float min = Math.min(1.0f, ((float) (System.currentTimeMillis() - this.v)) / 400.0f);
        float interpolation = a.getInterpolation(min);
        boolean z2 = min < 1.0f;
        this.A.a(a2.d(), g2);
        this.B.a(this.A, interpolation, this.t == 0, this.u, getHeight(), getWidth());
        if (this.B.f > 0) {
            if (this.w == null) {
                int width = canvas.getWidth() * 4;
                this.w = new float[width];
                this.x = new float[width];
                this.y = new float[width];
                this.z = new float[width];
            }
            int a3 = this.B.a(this.w, this.x, this.y, this.z);
            if (z2) {
                if (this.B.g == 0) {
                    canvas2.drawLines(this.w, 0, a3, this.m);
                    canvas2.drawLines(this.x, 0, a3, this.d);
                    canvas2.drawLines(this.y, 0, a3, this.n);
                    canvas2.drawLines(this.z, 0, a3, this.e);
                } else {
                    if (this.A.d >= getWidth()) {
                        i2 = this.B.g;
                    } else {
                        b bVar = this.B;
                        i2 = Math.round((((float) bVar.g) * ((float) bVar.h)) / ((float) bVar.f));
                    }
                    int i3 = i2 * 4;
                    canvas2.drawLines(this.w, 0, i3, this.f);
                    canvas2.drawLines(this.x, 0, i3, this.h);
                    int i4 = a3 - i3;
                    canvas2.drawLines(this.w, i3, i4, this.m);
                    canvas2.drawLines(this.x, i3, i4, this.d);
                    canvas2.drawLines(this.y, 0, i3, this.g);
                    canvas2.drawLines(this.z, 0, i3, this.i);
                    canvas2.drawLines(this.y, i3, i4, this.n);
                    canvas2.drawLines(this.z, i3, i4, this.e);
                }
            } else if (this.t == 0) {
                a(canvas2, this.B);
            } else {
                a(canvas, this.w, this.x, this.y, this.z, a3, g2);
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (i2 != 0 && i3 != 0) {
            a(i2, i3);
            this.r = -1;
            Paint paint = this.m;
            float f2 = (float) i3;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.o * f2, this.D, this.E, TileMode.MIRROR);
            paint.setShader(linearGradient);
            Paint paint2 = this.n;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, this.o * f2, this.D, this.E, TileMode.MIRROR);
            paint2.setShader(linearGradient2);
            this.n.setAlpha(40);
        }
    }

    public void setIsEditing(boolean z2) {
        this.u = z2;
        invalidate();
    }

    public void setPlaybackProgress(float f2) {
        this.s = f2;
        invalidate();
    }

    public void setRecordIntentProvider(J j2) {
        this.F = j2;
    }

    private void a(Canvas canvas, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int i2, float[] fArr5) {
        int width = getWidth();
        if (!this.u) {
            int i3 = (int) (this.s * ((float) width));
            if (i3 < 0) {
                a(canvas, fArr, i2, this.m, 0, -1);
                a(canvas, fArr2, i2, this.d, 0, -1);
                a(canvas, fArr3, i2, this.n, 0, -1);
                a(canvas, fArr4, i2, this.e, 0, -1);
                return;
            }
            Canvas canvas2 = canvas;
            int i4 = i2;
            int i5 = i3;
            a(canvas2, fArr, i4, this.m, 0, i5);
            a(canvas2, fArr2, i4, this.d, 0, i5);
            a(canvas2, fArr3, i4, this.n, 0, i5);
            a(canvas2, fArr4, i4, this.e, 0, i5);
            int i6 = i3;
            a(canvas2, fArr, i4, this.f, i6, -1);
            a(canvas2, fArr2, i4, this.h, i6, -1);
            a(canvas2, fArr3, i4, this.g, i6, -1);
            a(canvas2, fArr4, i4, this.i, i6, -1);
            return;
        }
        float f2 = (float) width;
        int i7 = (int) (fArr5[0] * f2);
        int i8 = (int) (fArr5[1] * f2);
        float f3 = this.s;
        int i9 = f3 == -1.0f ? -1 : (int) (((float) i7) + (((float) (i8 - i7)) * f3));
        int i10 = i7 - 1;
        a(canvas, fArr, i2, this.j, 0, Math.max(i10, 0));
        a(canvas, fArr2, i2, this.k, 0, Math.max(i10, 0));
        if (i9 < 0) {
            int i11 = i8 - 1;
            a(canvas, fArr, i2, this.m, Math.max(i7, 1), i11);
            Canvas canvas3 = canvas;
            int i12 = i2;
            int i13 = i11;
            a(canvas3, fArr2, i12, this.d, Math.max(i7, 1), i13);
            a(canvas3, fArr3, i12, this.n, Math.max(i7, 1), i13);
            a(canvas3, fArr4, i12, this.e, Math.max(i7, 1), i13);
        } else {
            int i14 = i7 + 1;
            int max = Math.max(i14, i9);
            Canvas canvas4 = canvas;
            int i15 = i2;
            int i16 = i14;
            int i17 = max;
            a(canvas4, fArr, i15, this.m, i16, i17);
            a(canvas4, fArr2, i15, this.d, i16, i17);
            a(canvas4, fArr3, i15, this.n, i16, i17);
            a(canvas4, fArr4, i15, this.e, i16, i17);
            int i18 = i8 - 1;
            a(canvas, fArr, i2, this.f, Math.min(i18, Math.max(max, i9)), i18);
            int i19 = i18;
            a(canvas, fArr2, i15, this.h, Math.min(i18, Math.max(max, i9)), i18);
            Canvas canvas5 = canvas;
            a(canvas5, fArr3, i15, this.g, Math.min(i19, Math.max(max, i9)), i18);
            a(canvas5, fArr4, i15, this.i, Math.min(i19, Math.max(max, i9)), i18);
        }
        int i20 = width - 1;
        a(canvas, fArr, i2, this.j, Math.min(i20, i8), -1);
        a(canvas, fArr2, i2, this.k, Math.min(i20, i8), -1);
        canvas.drawRect(0.0f, 0.0f, (float) Math.max(i7, 1), (float) getHeight(), this.l);
        canvas.drawRect((float) Math.max(i8, 0), 0.0f, (float) i20, (float) getHeight(), this.l);
    }

    private void a(Canvas canvas, b bVar) {
        int i2;
        Paint paint;
        Paint paint2;
        int width = getWidth();
        if (this.r == -1) {
            Canvas canvas2 = new Canvas(this.p);
            int min = Math.min(width, bVar.f);
            int i3 = 0;
            while (true) {
                this.r = i3;
                i2 = this.r;
                if (i2 >= min) {
                    break;
                }
                int i4 = (bVar.f - min) + i2;
                this.C.a(bVar.a(i4));
                boolean c2 = this.C.c();
                int i5 = bVar.g;
                if (i5 == -1 || i4 < i5) {
                    paint = c2 ? this.g : this.f;
                    paint2 = c2 ? this.i : this.h;
                } else {
                    paint = c2 ? this.n : this.m;
                    paint2 = c2 ? this.e : this.d;
                }
                a(canvas2, this.r, this.C.a(), paint, paint2);
                i3 = this.r + 1;
            }
            this.r = i2 - 1;
        }
        Matrix matrix = new Matrix();
        if (this.r > getWidth()) {
            matrix.setTranslate((float) (getWidth() - this.r), 0.0f);
            canvas.drawBitmap(this.p, matrix, b);
            matrix.setTranslate((float) ((getWidth() * 2) - this.r), 0.0f);
            canvas.drawBitmap(this.q, matrix, b);
            return;
        }
        matrix.setTranslate(0.0f, 0.0f);
        canvas.drawBitmap(this.p, matrix, b);
    }

    private void a(int i2, int i3) {
        Bitmap bitmap = this.p;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.q;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.p = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
        this.q = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
    }

    public void a(float f2, boolean z2) {
        this.C.a(f2);
        a(z2);
    }

    private void a(boolean z2) {
        Paint paint;
        Paint paint2;
        if (getHeight() != 0) {
            int width = getWidth();
            int i2 = this.r;
            if (!(i2 == -1 || this.p == null || this.q == null)) {
                this.r = i2 + 1;
                boolean c2 = this.C.c();
                if (z2) {
                    paint = c2 ? this.n : this.m;
                    paint2 = c2 ? this.e : this.d;
                } else {
                    paint = c2 ? this.g : this.f;
                    paint2 = c2 ? this.i : this.h;
                }
                Paint paint3 = paint;
                Paint paint4 = paint2;
                float a2 = this.C.a();
                int i3 = this.r;
                if (i3 < width) {
                    a(new Canvas(this.p), this.r, a2, paint3, paint4);
                } else if (i3 < width * 2) {
                    a(new Canvas(this.q), this.r - width, a2, paint3, paint4);
                } else {
                    new Canvas(this.p).drawRect(0.0f, 0.0f, (float) width, (float) getHeight(), c);
                    Bitmap bitmap = this.p;
                    this.p = this.q;
                    this.q = bitmap;
                    this.r = width;
                    a(new Canvas(this.q), this.r - width, a2, paint3, paint4);
                }
            }
            invalidate();
        }
    }

    private static void a(Canvas canvas, float[] fArr, int i2, Paint paint, int i3, int i4) {
        int i5 = i3 * 4;
        if (i4 != -1) {
            i2 = i4 * 4;
        }
        canvas.drawLines(fArr, i5, i2 - i5, paint);
    }

    private void a(Canvas canvas, int i2, float f2, Paint paint, Paint paint2) {
        float height = ((float) getHeight()) * this.o;
        float height2 = ((float) getHeight()) * (1.0f - this.o);
        float f3 = (float) i2;
        Canvas canvas2 = canvas;
        float f4 = f3;
        float f5 = f3;
        canvas2.drawLine(f4, height - (f2 * height), f5, height, paint);
        canvas2.drawLine(f4, height, f5, height + (f2 * height2), paint2);
    }

    public void a() {
        a(this.p);
        a(this.q);
        this.q = null;
        this.p = null;
    }

    private void a(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
