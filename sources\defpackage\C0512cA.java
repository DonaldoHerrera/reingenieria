package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.e;

/* renamed from: cA reason: default package and case insensitive filesystem */
/* compiled from: MaterialShapeDrawable */
public class C0512cA extends Drawable implements e {
    private final Paint a = new Paint();
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final C1223dA[] d = new C1223dA[4];
    private final Matrix e = new Matrix();
    private final Path f = new Path();
    private final PointF g = new PointF();
    private final C1223dA h = new C1223dA();
    private final Region i = new Region();
    private final Region j = new Region();
    private final float[] k = new float[2];
    private final float[] l = new float[2];
    private C1253eA m = null;
    private boolean n;
    private boolean o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private float u;
    private float v;
    private Style w;
    private PorterDuffColorFilter x;
    private Mode y;
    private ColorStateList z;

    public C0512cA(C1253eA eAVar) {
        this.n = false;
        this.o = false;
        this.p = 1.0f;
        this.q = -16777216;
        this.r = 5;
        this.s = 10;
        this.t = 255;
        this.u = 1.0f;
        this.v = 0.0f;
        this.w = Style.FILL_AND_STROKE;
        this.y = Mode.SRC_IN;
        this.z = null;
        this.m = eAVar;
        for (int i2 = 0; i2 < 4; i2++) {
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
            this.d[i2] = new C1223dA();
        }
    }

    private static int a(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void c(int i2, int i3, int i4) {
        a(i2, i3, i4, this.g);
        a(i2).a(a(i2, i3, i4), this.p, this.d[i2]);
        float b2 = b(((i2 - 1) + 4) % 4, i3, i4) + 1.5707964f;
        this.b[i2].reset();
        Matrix matrix = this.b[i2];
        PointF pointF = this.g;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i2].preRotate((float) Math.toDegrees((double) b2));
    }

    private void d(int i2, int i3, int i4) {
        float[] fArr = this.k;
        C1223dA[] dAVarArr = this.d;
        fArr[0] = dAVarArr[i2].c;
        fArr[1] = dAVarArr[i2].d;
        this.b[i2].mapPoints(fArr);
        float b2 = b(i2, i3, i4);
        this.c[i2].reset();
        Matrix matrix = this.c[i2];
        float[] fArr2 = this.k;
        matrix.setTranslate(fArr2[0], fArr2[1]);
        this.c[i2].preRotate((float) Math.toDegrees((double) b2));
    }

    public void a(boolean z2) {
        this.n = z2;
        invalidateSelf();
    }

    public ColorStateList b() {
        return this.z;
    }

    public void draw(Canvas canvas) {
        this.a.setColorFilter(this.x);
        int alpha = this.a.getAlpha();
        this.a.setAlpha(a(alpha, this.t));
        this.a.setStrokeWidth(this.v);
        this.a.setStyle(this.w);
        int i2 = this.r;
        if (i2 > 0 && this.n) {
            this.a.setShadowLayer((float) this.s, 0.0f, (float) i2, this.q);
        }
        if (this.m != null) {
            b(canvas.getWidth(), canvas.getHeight(), this.f);
            canvas.drawPath(this.f, this.a);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.a);
        }
        this.a.setAlpha(alpha);
    }

    public int getOpacity() {
        return -3;
    }

    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.i.set(bounds);
        b(bounds.width(), bounds.height(), this.f);
        this.j.setPath(this.f, this.i);
        this.i.op(this.j, Op.DIFFERENCE);
        return this.i;
    }

    public void setAlpha(int i2) {
        this.t = i2;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.z = colorStateList;
        c();
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.y = mode;
        c();
        invalidateSelf();
    }

    private void b(int i2, Path path) {
        int i3 = (i2 + 1) % 4;
        float[] fArr = this.k;
        C1223dA[] dAVarArr = this.d;
        fArr[0] = dAVarArr[i2].c;
        fArr[1] = dAVarArr[i2].d;
        this.b[i2].mapPoints(fArr);
        float[] fArr2 = this.l;
        C1223dA[] dAVarArr2 = this.d;
        fArr2[0] = dAVarArr2[i3].a;
        fArr2[1] = dAVarArr2[i3].b;
        this.b[i3].mapPoints(fArr2);
        float[] fArr3 = this.k;
        float f2 = fArr3[0];
        float[] fArr4 = this.l;
        float hypot = (float) Math.hypot((double) (f2 - fArr4[0]), (double) (fArr3[1] - fArr4[1]));
        this.h.b(0.0f, 0.0f);
        b(i2).a(hypot, this.p, this.h);
        this.h.a(this.c[i2], path);
    }

    public float a() {
        return this.p;
    }

    public void a(float f2) {
        this.p = f2;
        invalidateSelf();
    }

    public void a(Style style) {
        this.w = style;
        invalidateSelf();
    }

    private void c() {
        ColorStateList colorStateList = this.z;
        if (colorStateList == null || this.y == null) {
            this.x = null;
            return;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        this.x = new PorterDuffColorFilter(colorForState, this.y);
        if (this.o) {
            this.q = colorForState;
        }
    }

    public void a(int i2, int i3, Path path) {
        path.rewind();
        if (this.m != null) {
            for (int i4 = 0; i4 < 4; i4++) {
                c(i4, i2, i3);
                d(i4, i2, i3);
            }
            for (int i5 = 0; i5 < 4; i5++) {
                a(i5, path);
                b(i5, path);
            }
            path.close();
        }
    }

    private C0481bA b(int i2) {
        if (i2 == 1) {
            return this.m.e();
        }
        if (i2 == 2) {
            return this.m.a();
        }
        if (i2 != 3) {
            return this.m.f();
        }
        return this.m.d();
    }

    private void a(int i2, Path path) {
        float[] fArr = this.k;
        C1223dA[] dAVarArr = this.d;
        fArr[0] = dAVarArr[i2].a;
        fArr[1] = dAVarArr[i2].b;
        this.b[i2].mapPoints(fArr);
        if (i2 == 0) {
            float[] fArr2 = this.k;
            path.moveTo(fArr2[0], fArr2[1]);
        } else {
            float[] fArr3 = this.k;
            path.lineTo(fArr3[0], fArr3[1]);
        }
        this.d[i2].a(this.b[i2], path);
    }

    private float b(int i2, int i3, int i4) {
        int i5 = (i2 + 1) % 4;
        a(i2, i3, i4, this.g);
        PointF pointF = this.g;
        float f2 = pointF.x;
        float f3 = pointF.y;
        a(i5, i3, i4, pointF);
        PointF pointF2 = this.g;
        return (float) Math.atan2((double) (pointF2.y - f3), (double) (pointF2.x - f2));
    }

    private C0295aA a(int i2) {
        if (i2 == 1) {
            return this.m.h();
        }
        if (i2 == 2) {
            return this.m.c();
        }
        if (i2 != 3) {
            return this.m.g();
        }
        return this.m.b();
    }

    private void a(int i2, int i3, int i4, PointF pointF) {
        if (i2 == 1) {
            pointF.set((float) i3, 0.0f);
        } else if (i2 == 2) {
            pointF.set((float) i3, (float) i4);
        } else if (i2 != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i4);
        }
    }

    private void b(int i2, int i3, Path path) {
        a(i2, i3, path);
        if (this.u != 1.0f) {
            this.e.reset();
            Matrix matrix = this.e;
            float f2 = this.u;
            matrix.setScale(f2, f2, (float) (i2 / 2), (float) (i3 / 2));
            path.transform(this.e);
        }
    }

    private float a(int i2, int i3, int i4) {
        a(((i2 - 1) + 4) % 4, i3, i4, this.g);
        PointF pointF = this.g;
        float f2 = pointF.x;
        float f3 = pointF.y;
        a((i2 + 1) % 4, i3, i4, pointF);
        PointF pointF2 = this.g;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        a(i2, i3, i4, pointF2);
        PointF pointF3 = this.g;
        float f6 = pointF3.x;
        float f7 = pointF3.y;
        float atan2 = ((float) Math.atan2((double) (f3 - f7), (double) (f2 - f6))) - ((float) Math.atan2((double) (f5 - f7), (double) (f4 - f6)));
        return atan2 < 0.0f ? (float) (((double) atan2) + 6.283185307179586d) : atan2;
    }
}
