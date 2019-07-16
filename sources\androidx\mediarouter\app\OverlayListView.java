package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class OverlayListView extends ListView {
    private final List<a> a = new ArrayList();

    public static class a {
        private BitmapDrawable a;
        private float b = 1.0f;
        private Rect c;
        private Interpolator d;
        private long e;
        private Rect f;
        private int g;
        private float h = 1.0f;
        private float i = 1.0f;
        private long j;
        private boolean k;
        private boolean l;
        private C0010a m;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a reason: collision with other inner class name */
        public interface C0010a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            this.c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.a;
            if (bitmapDrawable2 != null && this.c != null) {
                bitmapDrawable2.setAlpha((int) (this.b * 255.0f));
                this.a.setBounds(this.c);
            }
        }

        public BitmapDrawable a() {
            return this.a;
        }

        public boolean b() {
            return this.k;
        }

        public void c() {
            this.k = true;
            this.l = true;
            C0010a aVar = this.m;
            if (aVar != null) {
                aVar.a();
            }
        }

        public a a(float f2, float f3) {
            this.h = f2;
            this.i = f3;
            return this;
        }

        public void b(long j2) {
            this.j = j2;
            this.k = true;
        }

        public a a(int i2) {
            this.g = i2;
            return this;
        }

        public a a(long j2) {
            this.e = j2;
            return this;
        }

        public boolean c(long j2) {
            float f2;
            if (this.l) {
                return false;
            }
            float max = Math.max(0.0f, Math.min(1.0f, ((float) (j2 - this.j)) / ((float) this.e)));
            if (!this.k) {
                max = 0.0f;
            }
            Interpolator interpolator = this.d;
            if (interpolator == null) {
                f2 = max;
            } else {
                f2 = interpolator.getInterpolation(max);
            }
            int i2 = (int) (((float) this.g) * f2);
            Rect rect = this.c;
            Rect rect2 = this.f;
            rect.top = rect2.top + i2;
            rect.bottom = rect2.bottom + i2;
            float f3 = this.h;
            this.b = f3 + ((this.i - f3) * f2);
            BitmapDrawable bitmapDrawable = this.a;
            if (!(bitmapDrawable == null || rect == null)) {
                bitmapDrawable.setAlpha((int) (this.b * 255.0f));
                this.a.setBounds(this.c);
            }
            if (this.k && max >= 1.0f) {
                this.l = true;
                C0010a aVar = this.m;
                if (aVar != null) {
                    aVar.a();
                }
            }
            return !this.l;
        }

        public a a(Interpolator interpolator) {
            this.d = interpolator;
            return this;
        }

        public a a(C0010a aVar) {
            this.m = aVar;
            return this;
        }
    }

    public OverlayListView(Context context) {
        super(context);
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b() {
        for (a c : this.a) {
            c.c();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                BitmapDrawable a2 = aVar.a();
                if (a2 != null) {
                    a2.draw(canvas);
                }
                if (!aVar.c(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public void a() {
        for (a aVar : this.a) {
            if (!aVar.b()) {
                aVar.b(getDrawingTime());
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
