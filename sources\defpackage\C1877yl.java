package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: yl reason: default package and case insensitive filesystem */
/* compiled from: FloatValueAnimatorBuilder */
class C1877yl {
    final ValueAnimator a;
    a b;

    /* renamed from: yl$a */
    /* compiled from: FloatValueAnimatorBuilder */
    interface a {
        void a();
    }

    /* renamed from: yl$b */
    /* compiled from: FloatValueAnimatorBuilder */
    interface b {
        void a(float f);
    }

    protected C1877yl() {
        this(false);
    }

    public C1877yl a(long j) {
        this.a.setStartDelay(j);
        return this;
    }

    public C1877yl b(long j) {
        this.a.setDuration(j);
        return this;
    }

    protected C1877yl(boolean z) {
        if (z) {
            this.a = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        } else {
            this.a = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        }
    }

    public C1877yl a(TimeInterpolator timeInterpolator) {
        this.a.setInterpolator(timeInterpolator);
        return this;
    }

    public C1877yl a(int i) {
        this.a.setRepeatCount(i);
        return this;
    }

    public C1877yl a(b bVar) {
        this.a.addUpdateListener(new C1817wl(this, bVar));
        return this;
    }

    public C1877yl a(a aVar) {
        this.b = aVar;
        return this;
    }

    public ValueAnimator a() {
        if (this.b != null) {
            this.a.addListener(new C1847xl(this));
        }
        return this.a;
    }
}
