package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.C0642j;
import com.google.android.gms.cast.framework.C0643k;
import com.google.android.gms.cast.framework.C0664p;
import com.google.android.gms.cast.framework.C0665q;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.X;
import java.util.ArrayList;
import java.util.List;

public class CastSeekBar extends View {
    public b a;
    private boolean b;
    private Integer c;
    private List<a> d;
    public c e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final Paint k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private int[] p;
    private Point q;
    private Runnable r;

    public static class a {
        public int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.a).hashCode();
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;

        /* access modifiers changed from: private */
        public static b b(b bVar) {
            b bVar2 = new b();
            bVar2.a = bVar.a;
            bVar2.b = bVar.b;
            bVar2.c = bVar.c;
            bVar2.d = bVar.d;
            bVar2.e = bVar.e;
            bVar2.f = bVar.f;
            return bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f));
        }
    }

    public static abstract class c {
        public void a(CastSeekBar castSeekBar) {
            throw null;
        }

        public void a(CastSeekBar castSeekBar, int i, boolean z) {
            throw null;
        }

        public void b(CastSeekBar castSeekBar) {
            throw null;
        }
    }

    private class d extends AccessibilityDelegate {
        private d() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SeekBar.class.getName());
            accessibilityEvent.setItemCount(CastSeekBar.this.a.b);
            accessibilityEvent.setCurrentItemIndex(CastSeekBar.this.getProgress());
        }

        @TargetApi(16)
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            if (PlatformVersion.isAtLeastJellyBean() && view.isEnabled()) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }

        @TargetApi(16)
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!view.isEnabled()) {
                return false;
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (PlatformVersion.isAtLeastJellyBean() && (i == 4096 || i == 8192)) {
                CastSeekBar.this.a();
                int i2 = CastSeekBar.this.a.b / 20;
                if (i == 8192) {
                    i2 = -i2;
                }
                CastSeekBar castSeekBar = CastSeekBar.this;
                castSeekBar.a(castSeekBar.getProgress() + i2);
                CastSeekBar.this.b();
            }
            return false;
        }
    }

    public CastSeekBar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    public final void b() {
        this.b = false;
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    public final void a(List<a> list) {
        List<a> list2;
        if (!Objects.equal(this.d, list)) {
            if (list == null) {
                list2 = null;
            } else {
                list2 = new ArrayList<>(list);
            }
            this.d = list2;
            postInvalidate();
        }
    }

    public int getMaxProgress() {
        return this.a.b;
    }

    public int getProgress() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        return this.a.a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Runnable runnable = this.r;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, (float) (measuredHeight / 2));
        b bVar = this.a;
        if (bVar.f) {
            int i2 = bVar.d;
            if (i2 > 0) {
                a(canvas, 0, i2, measuredWidth, this.n);
            }
            int i3 = this.a.d;
            if (progress > i3) {
                a(canvas, i3, progress, measuredWidth, this.l);
            }
            int i4 = this.a.e;
            if (i4 > progress) {
                a(canvas, progress, i4, measuredWidth, this.m);
            }
            b bVar2 = this.a;
            int i5 = bVar2.b;
            int i6 = bVar2.e;
            if (i5 > i6) {
                a(canvas, i6, i5, measuredWidth, this.n);
            }
        } else {
            int max = Math.max(bVar.c, 0);
            if (max > 0) {
                a(canvas, 0, max, measuredWidth, this.n);
            }
            if (progress > max) {
                a(canvas, max, progress, measuredWidth, this.l);
            }
            int i7 = this.a.b;
            if (i7 > progress) {
                a(canvas, progress, i7, measuredWidth, this.n);
            }
        }
        canvas.restoreToCount(save2);
        List<a> list = this.d;
        if (list != null && !list.isEmpty()) {
            this.k.setColor(this.o);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            for (a aVar : this.d) {
                if (aVar != null) {
                    int i8 = aVar.a;
                    if (i8 >= 0) {
                        canvas.drawCircle((((float) Math.min(i8, this.a.b)) * ((float) measuredWidth2)) / ((float) this.a.b), (float) (measuredHeight2 / 2), this.j, this.k);
                    }
                }
            }
        }
        if (isEnabled() && this.a.f) {
            this.k.setColor(this.l);
            int measuredHeight3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int progress2 = (int) (((((double) getProgress()) * 1.0d) / ((double) this.a.b)) * ((double) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())));
            int save3 = canvas.save();
            canvas.drawCircle((float) progress2, ((float) measuredHeight3) / 2.0f, this.i, this.k);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i2, 0), View.resolveSizeAndState((int) (this.g + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i3, 0));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.a.f) {
            return false;
        }
        if (this.q == null) {
            this.q = new Point();
        }
        if (this.p == null) {
            this.p = new int[2];
        }
        getLocationOnScreen(this.p);
        this.q.set((((int) motionEvent.getRawX()) - this.p[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.p[1]);
        int action = motionEvent.getAction();
        if (action == 0) {
            a();
            a(b(this.q.x));
            return true;
        } else if (action == 1) {
            a(b(this.q.x));
            b();
            return true;
        } else if (action == 2) {
            a(b(this.q.x));
            return true;
        } else if (action != 3) {
            return false;
        } else {
            this.b = false;
            this.c = null;
            c cVar = this.e;
            if (cVar != null) {
                cVar.a(this, getProgress(), true);
                this.e.a(this);
            }
            postInvalidate();
            return true;
        }
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new ArrayList();
        setAccessibilityDelegate(new d());
        this.k = new Paint(1);
        this.k.setStyle(Style.FILL);
        this.f = context.getResources().getDimension(C0643k.cast_seek_bar_minimum_width);
        this.g = context.getResources().getDimension(C0643k.cast_seek_bar_minimum_height);
        this.h = context.getResources().getDimension(C0643k.cast_seek_bar_progress_height) / 2.0f;
        this.i = context.getResources().getDimension(C0643k.cast_seek_bar_thumb_size) / 2.0f;
        this.j = context.getResources().getDimension(C0643k.cast_seek_bar_ad_break_radius);
        this.a = new b();
        this.a.b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0665q.CastExpandedController, C0642j.castExpandedControllerStyle, C0664p.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(C0665q.CastExpandedController_castSeekBarProgressAndThumbColor, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C0665q.CastExpandedController_castSeekBarSecondaryProgressColor, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(C0665q.CastExpandedController_castSeekBarUnseekableProgressColor, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(C0665q.CastExpandedController_castAdBreakMarkerColor, 0);
        this.l = context.getResources().getColor(resourceId);
        this.m = context.getResources().getColor(resourceId2);
        this.n = context.getResources().getColor(resourceId3);
        this.o = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    private final int b(int i2) {
        return (int) (((((double) i2) * 1.0d) / ((double) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) * ((double) this.a.b));
    }

    public final void a(b bVar) {
        if (!this.b) {
            this.a = b.b(bVar);
            this.c = null;
            c cVar = this.e;
            if (cVar != null) {
                cVar.a(this, getProgress(), false);
            }
            postInvalidate();
        }
    }

    private final void a(Canvas canvas, int i2, int i3, int i4, int i5) {
        this.k.setColor(i5);
        float f2 = ((float) i2) * 1.0f;
        int i6 = this.a.b;
        float f3 = (float) i4;
        float f4 = (f2 / ((float) i6)) * f3;
        float f5 = ((((float) i3) * 1.0f) / ((float) i6)) * f3;
        float f6 = this.h;
        canvas.drawRect(f4, -f6, f5, f6, this.k);
    }

    /* access modifiers changed from: private */
    public final void a(int i2) {
        b bVar = this.a;
        if (bVar.f) {
            this.c = Integer.valueOf(X.a(i2, bVar.d, bVar.e));
            c cVar = this.e;
            if (cVar != null) {
                cVar.a(this, getProgress(), true);
            }
            Runnable runnable = this.r;
            if (runnable == null) {
                this.r = new b(this);
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.r, 200);
            postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    public final void a() {
        this.b = true;
        c cVar = this.e;
        if (cVar != null) {
            cVar.b(this);
        }
    }
}
