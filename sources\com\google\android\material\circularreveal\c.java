package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import com.google.android.material.circularreveal.e.d;

/* compiled from: CircularRevealHelper */
public class c {
    public static final int a;
    private final a b;
    private final View c;
    private final Path d = new Path();
    private final Paint e = new Paint(7);
    private final Paint f = new Paint(1);
    private d g;
    private Drawable h;
    private boolean i;
    private boolean j;

    /* compiled from: CircularRevealHelper */
    interface a {
        void a(Canvas canvas);

        boolean c();
    }

    static {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            a = 2;
        } else if (i2 >= 18) {
            a = 1;
        } else {
            a = 0;
        }
    }

    public c(a aVar) {
        this.b = aVar;
        this.c = (View) aVar;
        this.c.setWillNotDraw(false);
        this.f.setColor(0);
    }

    private void g() {
        if (a == 1) {
            this.d.rewind();
            d dVar = this.g;
            if (dVar != null) {
                this.d.addCircle(dVar.a, dVar.b, dVar.c, Direction.CW);
            }
        }
        this.c.invalidate();
    }

    private boolean h() {
        d dVar = this.g;
        boolean z = false;
        boolean z2 = dVar == null || dVar.a();
        if (a != 0) {
            return !z2;
        }
        if (!z2 && this.j) {
            z = true;
        }
        return z;
    }

    private boolean i() {
        return (this.i || this.h == null || this.g == null) ? false : true;
    }

    private boolean j() {
        return !this.i && Color.alpha(this.f.getColor()) != 0;
    }

    public void a() {
        if (a == 0) {
            this.i = true;
            this.j = false;
            this.c.buildDrawingCache();
            Bitmap drawingCache = this.c.getDrawingCache();
            if (!(drawingCache != null || this.c.getWidth() == 0 || this.c.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.c.getWidth(), this.c.getHeight(), Config.ARGB_8888);
                this.c.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.e;
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.i = false;
            this.j = true;
        }
    }

    public void b() {
        if (a == 0) {
            this.j = false;
            this.c.destroyDrawingCache();
            this.e.setShader(null);
            this.c.invalidate();
        }
    }

    public Drawable c() {
        return this.h;
    }

    public int d() {
        return this.f.getColor();
    }

    public d e() {
        d dVar = this.g;
        if (dVar == null) {
            return null;
        }
        d dVar2 = new d(dVar);
        if (dVar2.a()) {
            dVar2.c = b(dVar2);
        }
        return dVar2;
    }

    public boolean f() {
        return this.b.c() && !h();
    }

    private float b(d dVar) {
        return Tz.a(dVar.a, dVar.b, 0.0f, 0.0f, (float) this.c.getWidth(), (float) this.c.getHeight());
    }

    private void b(Canvas canvas) {
        if (i()) {
            Rect bounds = this.h.getBounds();
            float width = this.g.a - (((float) bounds.width()) / 2.0f);
            float height = this.g.b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.h.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            this.g = null;
        } else {
            d dVar2 = this.g;
            if (dVar2 == null) {
                this.g = new d(dVar);
            } else {
                dVar2.a(dVar);
            }
            if (Tz.a(dVar.c, b(dVar), 1.0E-4f)) {
                this.g.c = Float.MAX_VALUE;
            }
        }
        g();
    }

    public void a(int i2) {
        this.f.setColor(i2);
        this.c.invalidate();
    }

    public void a(Drawable drawable) {
        this.h = drawable;
        this.c.invalidate();
    }

    public void a(Canvas canvas) {
        if (h()) {
            int i2 = a;
            if (i2 == 0) {
                d dVar = this.g;
                canvas.drawCircle(dVar.a, dVar.b, dVar.c, this.e);
                if (j()) {
                    d dVar2 = this.g;
                    canvas.drawCircle(dVar2.a, dVar2.b, dVar2.c, this.f);
                }
            } else if (i2 == 1) {
                int save = canvas.save();
                canvas.clipPath(this.d);
                this.b.a(canvas);
                if (j()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.c.getWidth(), (float) this.c.getHeight(), this.f);
                }
                canvas.restoreToCount(save);
            } else if (i2 == 2) {
                this.b.a(canvas);
                if (j()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.c.getWidth(), (float) this.c.getHeight(), this.f);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported strategy ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.b.a(canvas);
            if (j()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.c.getWidth(), (float) this.c.getHeight(), this.f);
            }
        }
        b(canvas);
    }
}
