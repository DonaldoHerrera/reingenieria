package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: Mz reason: default package */
/* compiled from: MotionTiming */
public class Mz {
    private long a = 0;
    private long b = 300;
    private TimeInterpolator c = null;
    private int d = 0;
    private int e = 1;

    public Mz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long b() {
        return this.b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : Ez.b;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Mz.class != obj.getClass()) {
            return false;
        }
        Mz mz = (Mz) obj;
        if (a() == mz.a() && b() == mz.b() && d() == mz.d() && e() == mz.e()) {
            return c().getClass().equals(mz.c().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(Mz.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(a());
        sb.append(" duration: ");
        sb.append(b());
        sb.append(" interpolator: ");
        sb.append(c().getClass());
        sb.append(" repeatCount: ");
        sb.append(d());
        sb.append(" repeatMode: ");
        sb.append(e());
        sb.append("}\n");
        return sb.toString();
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return Ez.b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return Ez.c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            interpolator = Ez.d;
        }
        return interpolator;
    }

    public long a() {
        return this.a;
    }

    static Mz a(ValueAnimator valueAnimator) {
        Mz mz = new Mz(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        mz.d = valueAnimator.getRepeatCount();
        mz.e = valueAnimator.getRepeatMode();
        return mz;
    }

    public Mz(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
