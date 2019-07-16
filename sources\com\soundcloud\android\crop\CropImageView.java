package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.soundcloud.android.crop.ImageViewTouchBase.a;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends ImageViewTouchBase {
    ArrayList<m> l = new ArrayList<>();
    m m;
    Context n;
    private float o;
    private float p;
    private int q;
    private int r;

    public CropImageView(Context context) {
        super(context);
    }

    public /* bridge */ /* synthetic */ void a(Bitmap bitmap, boolean z) {
        super.a(bitmap, z);
    }

    /* access modifiers changed from: protected */
    public void b(float f, float f2) {
        super.b(f, f2);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            mVar.c.postTranslate(f, f2);
            mVar.b();
        }
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ Matrix getUnrotatedMatrix() {
        return super.getUnrotatedMatrix();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(canvas);
        }
    }

    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e.a() != null) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                m mVar = (m) it.next();
                mVar.c.set(getUnrotatedMatrix());
                mVar.b();
                if (mVar.a()) {
                    b(mVar);
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (((CropImageActivity) this.n).a()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            Iterator it = this.l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                int a = mVar.a(motionEvent.getX(), motionEvent.getY());
                if (a != 1) {
                    this.q = a;
                    this.m = mVar;
                    this.o = motionEvent.getX();
                    this.p = motionEvent.getY();
                    this.r = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.m.a(a == 32 ? b.Move : b.Grow);
                }
            }
        } else if (action == 1) {
            m mVar2 = this.m;
            if (mVar2 != null) {
                b(mVar2);
                this.m.a(b.None);
            }
            this.m = null;
            b();
        } else if (action == 2) {
            if (this.m != null && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.r) {
                this.m.a(this.q, motionEvent.getX() - this.o, motionEvent.getY() - this.p);
                this.o = motionEvent.getX();
                this.p = motionEvent.getY();
            }
            if (getScale() == 1.0f) {
                b();
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public /* bridge */ /* synthetic */ void setRecycler(a aVar) {
        super.setRecycler(aVar);
    }

    private void c(m mVar) {
        Rect rect = mVar.b;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 != 0) {
            min2 = max2;
        }
        if (max != 0 || min2 != 0) {
            a((float) max, (float) min2);
        }
    }

    public /* bridge */ /* synthetic */ void a(s sVar, boolean z) {
        super.a(sVar, z);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void a(float f, float f2, float f3) {
        super.a(f, f2, f3);
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            mVar.c.set(getUnrotatedMatrix());
            mVar.b();
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void b(m mVar) {
        Rect rect = mVar.b;
        float width = (float) getWidth();
        float max = Math.max(1.0f, Math.min((width / ((float) rect.width())) * 0.6f, (((float) getHeight()) / ((float) rect.height())) * 0.6f) * getScale());
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {mVar.a.centerX(), mVar.a.centerY()};
            getUnrotatedMatrix().mapPoints(fArr);
            a(max, fArr[0], fArr[1], 300.0f);
        }
        c(mVar);
    }

    public void a(m mVar) {
        this.l.add(mVar);
        invalidate();
    }
}
