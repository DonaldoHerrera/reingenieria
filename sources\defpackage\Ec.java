package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: Ec reason: default package */
/* compiled from: ViewPropertyAnimatorCompat */
public final class Ec {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    /* renamed from: Ec$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class a implements Fc {
        Ec a;
        boolean b;

        a(Ec ec) {
            this.a = ec;
        }

        public void a(View view) {
            Object tag = view.getTag(2113929216);
            Fc fc = tag instanceof Fc ? (Fc) tag : null;
            if (fc != null) {
                fc.a(view);
            }
        }

        public void b(View view) {
            int i = this.a.d;
            Fc fc = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.a.d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.b) {
                Ec ec = this.a;
                Runnable runnable = ec.c;
                if (runnable != null) {
                    ec.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof Fc) {
                    fc = (Fc) tag;
                }
                if (fc != null) {
                    fc.b(view);
                }
                this.b = true;
            }
        }

        public void c(View view) {
            this.b = false;
            Fc fc = null;
            if (this.a.d > -1) {
                view.setLayerType(2, null);
            }
            Ec ec = this.a;
            Runnable runnable = ec.b;
            if (runnable != null) {
                ec.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof Fc) {
                fc = (Fc) tag;
            }
            if (fc != null) {
                fc.c(view);
            }
        }
    }

    Ec(View view) {
        this.a = new WeakReference<>(view);
    }

    public Ec a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public Ec b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public Ec a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public long b() {
        View view = (View) this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public Ec a(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public Ec b(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public Ec a(Fc fc) {
        View view = (View) this.a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                a(view, fc);
            } else {
                view.setTag(2113929216, fc);
                a(view, new a(this));
            }
        }
        return this;
    }

    private void a(View view, Fc fc) {
        if (fc != null) {
            view.animate().setListener(new Cc(this, fc, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public Ec a(Hc hc) {
        View view = (View) this.a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            Dc dc = null;
            if (hc != null) {
                dc = new Dc(this, hc, view);
            }
            view.animate().setUpdateListener(dc);
        }
        return this;
    }
}
