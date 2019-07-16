package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnDrawListener;
import android.widget.LinearLayout;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.image.S;
import com.soundcloud.android.image.T;
import com.soundcloud.android.image.V;
import com.soundcloud.android.utilities.android.m;

public class GlassLinearLayout extends LinearLayout {
    private Bitmap a;
    private Bitmap b;
    private Paint c = new Paint();
    private float d;
    private int e;
    /* access modifiers changed from: private */
    public long f = (System.currentTimeMillis() - 16);
    /* access modifiers changed from: private */
    public boolean g;
    private VPa h = C4881Eua.b();
    private a i;
    private S j;
    private C2332VH<Bitmap> k;
    private int l;
    private int m;
    private int n;

    interface a {
    }

    private class b implements a, OnDrawListener {
        private b() {
        }

        public void onDraw() {
            long currentTimeMillis = System.currentTimeMillis();
            if (!GlassLinearLayout.this.g && currentTimeMillis - GlassLinearLayout.this.f >= 16) {
                GlassLinearLayout.this.g = true;
                GlassLinearLayout.this.f = currentTimeMillis;
                GlassLinearLayout.this.c();
            }
        }
    }

    public GlassLinearLayout(Context context) {
        super(context);
        b();
    }

    public boolean isInEditMode() {
        return super.isInEditMode();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        this.g = false;
        this.f = System.currentTimeMillis() - 16;
        this.h = this.k.a(C6645iVa.a()).h(new C6219h(this)).a(RPa.a()).f((C6776kQa<? super T>) new C6218g<Object>(this));
        this.i = new b();
        getViewTreeObserver().addOnDrawListener((b) this.i);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        getViewTreeObserver().removeOnDrawListener((b) this.i);
        this.h.dispose();
        a();
        this.i = null;
        this.j.destroy();
        super.onDetachedFromWindow();
    }

    private void b() {
        if (isInEditMode()) {
            this.j = V.a;
        } else {
            this.j = new T(getContext());
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        View findViewById = ((ViewGroup) getParent()).findViewById(this.e);
        if (findViewById.getHeight() > 0 && findViewById.getWidth() > 0) {
            int i2 = (int) ((this.d / 0.25f) * 0.5f);
            int round = Math.round(((float) getWidth()) * 0.125f);
            int round2 = Math.round(((float) getHeight()) * 0.5f) + i2;
            this.l = a(Math.round(((float) getWidth()) * 0.25f));
            this.m = a(Math.round(((float) getHeight()) * 0.25f));
            this.n = a(this.m + ((int) this.d));
            this.a = a(this.a, round, round2);
            this.b = a(this.b, this.l, this.n);
            C2332VH<Bitmap> vh = this.k;
            Bitmap bitmap = this.a;
            a(findViewById, bitmap);
            vh.accept(bitmap);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        b(context, attributeSet);
        this.k = C2332VH.s();
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.GlassLinearLayout);
        this.d = obtainStyledAttributes.getFloat(r.GlassLinearLayout_blurRadius, 20.0f);
        this.e = obtainStyledAttributes.getResourceId(r.GlassLinearLayout_source, -1);
        obtainStyledAttributes.recycle();
    }

    public GlassLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public /* synthetic */ BitmapDrawable a(Bitmap bitmap) throws Exception {
        m.a("Image scaling must not be done on the UI thread.");
        Bitmap b2 = b(bitmap, this.l, this.n);
        this.j.a(b2, this.b, C4928GKa.c(Float.valueOf(this.d)));
        b2.recycle();
        return new BitmapDrawable(getResources(), Bitmap.createBitmap(this.b, 0, 0, this.l, this.m));
    }

    private Bitmap b(Bitmap bitmap, int i2, int i3) {
        return Bitmap.createScaledBitmap(bitmap, i2, i3, true);
    }

    public GlassLinearLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    public /* synthetic */ void a(BitmapDrawable bitmapDrawable) throws Exception {
        setBackground(bitmapDrawable);
        this.g = false;
    }

    private void a() {
        if (!this.g) {
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                bitmap.recycle();
                this.b = null;
            }
            Bitmap bitmap2 = this.a;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.a = null;
            }
        }
    }

    private int a(int i2) {
        return i2 - (i2 % 4);
    }

    private Bitmap a(View view, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.scale(0.125f, 0.5f);
        view.draw(canvas);
        this.c.setColor(bitmap.getPixel(0, 0));
        canvas.drawRect(0.0f, 0.0f, ((float) canvas.getWidth()) / 0.125f, 4.0f, this.c);
        return bitmap;
    }

    private Bitmap a(Bitmap bitmap, int i2, int i3) {
        if (bitmap != null && i2 == bitmap.getWidth()) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        return Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
    }
}
