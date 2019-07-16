package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: pe reason: default package and case insensitive filesystem */
/* compiled from: VectorDrawableCompat */
public class C1601pe extends C1539ne {
    static final Mode b = Mode.SRC_IN;
    private g c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g;
    private ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    /* renamed from: pe$a */
    /* compiled from: VectorDrawableCompat */
    private static class a extends e {
        public a() {
        }

        public void a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0286Za.a(xmlPullParser, "pathData")) {
                TypedArray a = C0286Za.a(resources, theme, attributeSet, C1292fe.d);
                a(a);
                a.recycle();
            }
        }

        public boolean b() {
            return true;
        }

        public a(a aVar) {
            super(aVar);
        }

        private void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = C0486bb.a(string2);
            }
        }
    }

    /* renamed from: pe$b */
    /* compiled from: VectorDrawableCompat */
    private static class b extends e {
        private int[] d;
        C0250Ra e;
        float f = 0.0f;
        C0250Ra g;
        float h = 1.0f;
        int i = 0;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Cap n = Cap.BUTT;
        Join o = Join.MITER;
        float p = 4.0f;

        public b() {
        }

        private Cap a(int i2, Cap cap) {
            if (i2 == 0) {
                return Cap.BUTT;
            }
            if (i2 != 1) {
                return i2 != 2 ? cap : Cap.SQUARE;
            }
            return Cap.ROUND;
        }

        /* access modifiers changed from: 0000 */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: 0000 */
        public int getFillColor() {
            return this.g.a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeAlpha() {
            return this.h;
        }

        /* access modifiers changed from: 0000 */
        public int getStrokeColor() {
            return this.e.a();
        }

        /* access modifiers changed from: 0000 */
        public float getStrokeWidth() {
            return this.f;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathEnd() {
            return this.l;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathOffset() {
            return this.m;
        }

        /* access modifiers changed from: 0000 */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: 0000 */
        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        /* access modifiers changed from: 0000 */
        public void setFillColor(int i2) {
            this.g.b(i2);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeAlpha(float f2) {
            this.h = f2;
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeColor(int i2) {
            this.e.b(i2);
        }

        /* access modifiers changed from: 0000 */
        public void setStrokeWidth(float f2) {
            this.f = f2;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        /* access modifiers changed from: 0000 */
        public void setTrimPathStart(float f2) {
            this.k = f2;
        }

        private Join a(int i2, Join join) {
            if (i2 == 0) {
                return Join.MITER;
            }
            if (i2 != 1) {
                return i2 != 2 ? join : Join.BEVEL;
            }
            return Join.ROUND;
        }

        public void a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0286Za.a(resources, theme, attributeSet, C1292fe.c);
            a(a, xmlPullParser, theme);
            a.recycle();
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.d = null;
            if (C0286Za.a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = C0486bb.a(string2);
                }
                Theme theme2 = theme;
                this.g = C0286Za.a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.j = C0286Za.a(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = a(C0286Za.b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = a(C0286Za.b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = C0286Za.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.e = C0286Za.a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.h = C0286Za.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.h);
                this.f = C0286Za.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f);
                this.l = C0286Za.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = C0286Za.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = C0286Za.a(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.i = C0286Za.b(typedArray, xmlPullParser, "fillType", 13, this.i);
            }
        }

        public b(b bVar) {
            super(bVar);
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.h = bVar.h;
            this.g = bVar.g;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
        }

        public boolean a() {
            return this.g.d() || this.e.d();
        }

        public boolean a(int[] iArr) {
            return this.e.a(iArr) | this.g.a(iArr);
        }
    }

    /* renamed from: pe$c */
    /* compiled from: VectorDrawableCompat */
    private static class c extends d {
        final Matrix a = new Matrix();
        final ArrayList<d> b = new ArrayList<>();
        float c = 0.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private float f = 1.0f;
        private float g = 1.0f;
        private float h = 0.0f;
        private float i = 0.0f;
        final Matrix j = new Matrix();
        int k;
        private int[] l;
        private String m = null;

        public c(c cVar, T<String, Object> t) {
            e eVar;
            super();
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.k = cVar.k;
            String str = this.m;
            if (str != null) {
                t.put(str, this);
            }
            this.j.set(cVar.j);
            ArrayList<d> arrayList = cVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = arrayList.get(i2);
                if (obj instanceof c) {
                    this.b.add(new c((c) obj, t));
                } else {
                    if (obj instanceof b) {
                        eVar = new b((b) obj);
                    } else if (obj instanceof a) {
                        eVar = new a((a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(eVar);
                    String str2 = eVar.b;
                    if (str2 != null) {
                        t.put(str2, eVar);
                    }
                }
            }
        }

        private void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public void a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1292fe.b);
            a(a2, xmlPullParser);
            a2.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                b();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                b();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                b();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                b();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                b();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                b();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                b();
            }
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = C0286Za.a(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = C0286Za.a(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = C0286Za.a(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = C0286Za.a(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = C0286Za.a(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            b();
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (((d) this.b.get(i2)).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= ((d) this.b.get(i2)).a(iArr);
            }
            return z;
        }

        public c() {
            super();
        }
    }

    /* renamed from: pe$d */
    /* compiled from: VectorDrawableCompat */
    private static abstract class d {
        private d() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: pe$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class e extends d {
        protected defpackage.C0486bb.b[] a = null;
        String b;
        int c;

        public e() {
            super();
        }

        public void a(Path path) {
            path.reset();
            defpackage.C0486bb.b[] bVarArr = this.a;
            if (bVarArr != null) {
                defpackage.C0486bb.b.a(bVarArr, path);
            }
        }

        public boolean b() {
            return false;
        }

        public defpackage.C0486bb.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(defpackage.C0486bb.b[] bVarArr) {
            if (!C0486bb.a(this.a, bVarArr)) {
                this.a = C0486bb.a(bVarArr);
            } else {
                C0486bb.b(this.a, bVarArr);
            }
        }

        public e(e eVar) {
            super();
            this.b = eVar.b;
            this.c = eVar.c;
            this.a = C0486bb.a(eVar.a);
        }
    }

    /* renamed from: pe$f */
    /* compiled from: VectorDrawableCompat */
    private static class f {
        private static final Matrix a = new Matrix();
        private final Path b;
        private final Path c;
        private final Matrix d;
        Paint e;
        Paint f;
        private PathMeasure g;
        private int h;
        final c i;
        float j;
        float k;
        float l;
        float m;
        int n;
        String o;
        Boolean p;
        final T<String, Object> q;

        public f() {
            this.d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new T<>();
            this.i = new c();
            this.b = new Path();
            this.c = new Path();
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void a(c cVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            cVar.a.set(matrix);
            cVar.a.preConcat(cVar.j);
            canvas.save();
            for (int i4 = 0; i4 < cVar.b.size(); i4++) {
                d dVar = (d) cVar.b.get(i4);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.a, canvas, i2, i3, colorFilter);
                } else if (dVar instanceof e) {
                    a(cVar, (e) dVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.n = i2;
        }

        public void a(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            a(this.i, a, canvas, i2, i3, colorFilter);
        }

        public f(f fVar) {
            this.d = new Matrix();
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.n = 255;
            this.o = null;
            this.p = null;
            this.q = new T<>();
            this.i = new c(fVar.i, this.q);
            this.b = new Path(fVar.b);
            this.c = new Path(fVar.c);
            this.j = fVar.j;
            this.k = fVar.k;
            this.l = fVar.l;
            this.m = fVar.m;
            this.h = fVar.h;
            this.n = fVar.n;
            this.o = fVar.o;
            String str = fVar.o;
            if (str != null) {
                this.q.put(str, this);
            }
            this.p = fVar.p;
        }

        private void a(c cVar, e eVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.l;
            float f3 = ((float) i3) / this.m;
            float min = Math.min(f2, f3);
            Matrix matrix = cVar.a;
            this.d.set(matrix);
            this.d.postScale(f2, f3);
            float a2 = a(matrix);
            if (a2 != 0.0f) {
                eVar.a(this.b);
                Path path = this.b;
                this.c.reset();
                if (eVar.b()) {
                    this.c.addPath(path, this.d);
                    canvas.clipPath(this.c);
                } else {
                    b bVar = (b) eVar;
                    if (!(bVar.k == 0.0f && bVar.l == 1.0f)) {
                        float f4 = bVar.k;
                        float f5 = bVar.m;
                        float f6 = (f4 + f5) % 1.0f;
                        float f7 = (bVar.l + f5) % 1.0f;
                        if (this.g == null) {
                            this.g = new PathMeasure();
                        }
                        this.g.setPath(this.b, false);
                        float length = this.g.getLength();
                        float f8 = f6 * length;
                        float f9 = f7 * length;
                        path.reset();
                        if (f8 > f9) {
                            this.g.getSegment(f8, length, path, true);
                            this.g.getSegment(0.0f, f9, path, true);
                        } else {
                            this.g.getSegment(f8, f9, path, true);
                        }
                        path.rLineTo(0.0f, 0.0f);
                    }
                    this.c.addPath(path, this.d);
                    if (bVar.g.e()) {
                        C0250Ra ra = bVar.g;
                        if (this.f == null) {
                            this.f = new Paint(1);
                            this.f.setStyle(Style.FILL);
                        }
                        Paint paint = this.f;
                        if (ra.c()) {
                            Shader b2 = ra.b();
                            b2.setLocalMatrix(this.d);
                            paint.setShader(b2);
                            paint.setAlpha(Math.round(bVar.j * 255.0f));
                        } else {
                            paint.setShader(null);
                            paint.setAlpha(255);
                            paint.setColor(C1601pe.a(ra.a(), bVar.j));
                        }
                        paint.setColorFilter(colorFilter);
                        this.c.setFillType(bVar.i == 0 ? FillType.WINDING : FillType.EVEN_ODD);
                        canvas.drawPath(this.c, paint);
                    }
                    if (bVar.e.e()) {
                        C0250Ra ra2 = bVar.e;
                        if (this.e == null) {
                            this.e = new Paint(1);
                            this.e.setStyle(Style.STROKE);
                        }
                        Paint paint2 = this.e;
                        Join join = bVar.o;
                        if (join != null) {
                            paint2.setStrokeJoin(join);
                        }
                        Cap cap = bVar.n;
                        if (cap != null) {
                            paint2.setStrokeCap(cap);
                        }
                        paint2.setStrokeMiter(bVar.p);
                        if (ra2.c()) {
                            Shader b3 = ra2.b();
                            b3.setLocalMatrix(this.d);
                            paint2.setShader(b3);
                            paint2.setAlpha(Math.round(bVar.h * 255.0f));
                        } else {
                            paint2.setShader(null);
                            paint2.setAlpha(255);
                            paint2.setColor(C1601pe.a(ra2.a(), bVar.h));
                        }
                        paint2.setColorFilter(colorFilter);
                        paint2.setStrokeWidth(bVar.f * min * a2);
                        canvas.drawPath(this.c, paint2);
                    }
                }
            }
        }

        private float a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a2) / max;
            }
            return 0.0f;
        }

        public boolean a() {
            if (this.p == null) {
                this.p = Boolean.valueOf(this.i.a());
            }
            return this.p.booleanValue();
        }

        public boolean a(int[] iArr) {
            return this.i.a(iArr);
        }
    }

    /* renamed from: pe$g */
    /* compiled from: VectorDrawableCompat */
    private static class g extends ConstantState {
        int a;
        f b;
        ColorStateList c;
        Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public g(g gVar) {
            this.c = null;
            this.d = C1601pe.b;
            if (gVar != null) {
                this.a = gVar.a;
                this.b = new f(gVar.b);
                Paint paint = gVar.b.f;
                if (paint != null) {
                    this.b.f = new Paint(paint);
                }
                Paint paint2 = gVar.b.e;
                if (paint2 != null) {
                    this.b.e = new Paint(paint2);
                }
                this.c = gVar.c;
                this.d = gVar.d;
                this.e = gVar.e;
            }
        }

        public void a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, null, rect, a(colorFilter));
        }

        public boolean b() {
            return this.b.getRootAlpha() < 255;
        }

        public void c(int i2, int i3) {
            this.f.eraseColor(0);
            this.b.a(new Canvas(this.f), i2, i3, (ColorFilter) null);
        }

        public void d() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            return new C1601pe(this);
        }

        public void b(int i2, int i3) {
            if (this.f == null || !a(i2, i3)) {
                this.f = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
                this.k = true;
            }
        }

        public Drawable newDrawable(Resources resources) {
            return new C1601pe(this);
        }

        public Paint a(ColorFilter colorFilter) {
            if (!b() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                this.l = new Paint();
                this.l.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean c() {
            return this.b.a();
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f.getWidth() && i3 == this.f.getHeight();
        }

        public boolean a() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public g() {
            this.c = null;
            this.d = C1601pe.b;
            this.b = new f();
        }

        public boolean a(int[] iArr) {
            boolean a2 = this.b.a(iArr);
            this.k |= a2;
            return a2;
        }
    }

    /* renamed from: pe$h */
    /* compiled from: VectorDrawableCompat */
    private static class h extends ConstantState {
        private final ConstantState a;

        public h(ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1601pe peVar = new C1601pe();
            peVar.a = (VectorDrawable) this.a.newDrawable();
            return peVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1601pe peVar = new C1601pe();
            peVar.a = (VectorDrawable) this.a.newDrawable(resources);
            return peVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1601pe peVar = new C1601pe();
            peVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
            return peVar;
        }
    }

    C1601pe() {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = new g();
    }

    public static C1601pe createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1601pe peVar = new C1601pe();
        peVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return peVar;
    }

    /* access modifiers changed from: 0000 */
    public Object a(String str) {
        return this.c.b.q.get(str);
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.k);
        if (this.k.width() > 0 && this.k.height() > 0) {
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            canvas.getMatrix(this.j);
            this.j.getValues(this.i);
            float abs = Math.abs(this.i[0]);
            float abs2 = Math.abs(this.i[4]);
            float abs3 = Math.abs(this.i[1]);
            float abs4 = Math.abs(this.i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int height = (int) (((float) this.k.height()) * abs2);
            int min = Math.min(2048, (int) (((float) this.k.width()) * abs));
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.k;
                canvas.translate((float) rect.left, (float) rect.top);
                if (a()) {
                    canvas.translate((float) this.k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.k.offsetTo(0, 0);
                this.c.b(min, min2);
                if (!this.g) {
                    this.c.c(min, min2);
                } else if (!this.c.a()) {
                    this.c.c(min, min2);
                    this.c.d();
                }
                this.c.a(canvas, colorFilter, this.k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.c(drawable);
        }
        return this.c.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.a;
        if (drawable != null && VERSION.SDK_INT >= 24) {
            return new h(drawable.getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.c.b.k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.c.b.j;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.f(drawable);
        }
        return this.c.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.isStateful() != false) goto L_0x0028;
     */
    public boolean isStateful() {
        boolean z;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.c;
            if (gVar != null) {
                if (!gVar.c()) {
                    ColorStateList colorStateList = this.c.c;
                    if (colorStateList != null) {
                    }
                }
            }
            z = false;
            return z;
        }
        z = true;
        return z;
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.c = new g(this.c);
            this.f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        g gVar = this.c;
        ColorStateList colorStateList = gVar.c;
        if (colorStateList != null) {
            Mode mode = gVar.d;
            if (mode != null) {
                this.d = a(this.d, colorStateList, mode);
                invalidateSelf();
                z = true;
            }
        }
        if (gVar.c() && gVar.a(iArr)) {
            invalidateSelf();
            z = true;
        }
        return z;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
            return;
        }
        if (this.c.b.getRootAlpha() != i2) {
            this.c.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, z);
        } else {
            this.c.e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i2, Mode mode) {
        super.setColorFilter(i2, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            return;
        }
        g gVar = this.c;
        if (gVar.c != colorStateList) {
            gVar.c = colorStateList;
            this.d = a(this.d, colorStateList, gVar.d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, mode);
            return;
        }
        g gVar = this.c;
        if (gVar.d != mode) {
            gVar.d = mode;
            this.d = a(this.d, gVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    public PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    public static C1601pe a(Resources resources, int i2, Theme theme) {
        int next;
        String str = "parser error";
        String str2 = "VectorDrawableCompat";
        if (VERSION.SDK_INT >= 24) {
            C1601pe peVar = new C1601pe();
            peVar.a = C0277Xa.a(resources, i2, theme);
            peVar.h = new h(peVar.a.getConstantState());
            return peVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    if (next != 2) {
                        return createFromXmlInner(resources, xml, asAttributeSet, theme);
                    }
                    throw new XmlPullParserException("No start tag found");
                }
            }
            if (next != 2) {
            }
        } catch (XmlPullParserException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (IOException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.c;
        gVar.b = new f();
        TypedArray a2 = C0286Za.a(resources, theme, attributeSet, C1292fe.a);
        a(a2, xmlPullParser);
        a2.recycle();
        gVar.a = getChangingConfigurations();
        gVar.k = true;
        a(resources, xmlPullParser, attributeSet, theme);
        this.d = a(this.d, gVar.c, gVar.d);
    }

    C1601pe(g gVar) {
        this.g = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.c = gVar;
        this.d = a(this.d, gVar.c, gVar.d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    private static Mode a(int i2, Mode mode) {
        if (i2 == 3) {
            return Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return Mode.SRC_IN;
        }
        if (i2 == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) throws XmlPullParserException {
        g gVar = this.c;
        f fVar = gVar.b;
        gVar.d = a(C0286Za.b(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            gVar.c = colorStateList;
        }
        gVar.e = C0286Za.a(typedArray, xmlPullParser, "autoMirrored", 5, gVar.e);
        fVar.l = C0286Za.a(typedArray, xmlPullParser, "viewportWidth", 7, fVar.l);
        fVar.m = C0286Za.a(typedArray, xmlPullParser, "viewportHeight", 8, fVar.m);
        if (fVar.l <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (fVar.m > 0.0f) {
            fVar.j = typedArray.getDimension(3, fVar.j);
            fVar.k = typedArray.getDimension(2, fVar.k);
            if (fVar.j <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(typedArray.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (fVar.k > 0.0f) {
                fVar.setAlpha(C0286Za.a(typedArray, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    fVar.o = string;
                    fVar.q.put(string, fVar);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }

    private void a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        g gVar = this.c;
        f fVar = gVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            String str = "group";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    bVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.q.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    gVar.a = bVar.c | gVar.a;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    aVar.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.q.put(aVar.getPathName(), aVar);
                    }
                    gVar.a = aVar.c | gVar.a;
                } else if (str.equals(name)) {
                    c cVar2 = new c();
                    cVar2.a(resources, attributeSet, theme, xmlPullParser);
                    cVar.b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.q.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.a = cVar2.k | gVar.a;
                }
            } else if (eventType == 3 && str.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.g = z;
    }

    private boolean a() {
        if (VERSION.SDK_INT < 17 || !isAutoMirrored() || androidx.core.graphics.drawable.a.e(this) != 1) {
            return false;
        }
        return true;
    }
}
