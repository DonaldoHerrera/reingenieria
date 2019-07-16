package com.soundcloud.android.playlist.view;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c;
import androidx.recyclerview.widget.RecyclerView.m;
import com.soundcloud.android.view.CustomFontTitleToolbar;

/* compiled from: PlaylistDetailsHeaderAnimator */
class M {
    private static final C7664xKa<Float, Float> a = C7664xKa.a(Float.valueOf(0.1f), Float.valueOf(0.3f));
    private static final C7664xKa<Float, Float> b = C7664xKa.a(Float.valueOf(0.2f), Float.valueOf(0.5f));
    private static final C7664xKa<Float, Float> c = C7664xKa.a(Float.valueOf(1.0f), Float.valueOf(0.4f));
    private final CustomFontTitleToolbar d;
    private final View e;
    private final View f;
    private final int g;
    private boolean h;
    /* access modifiers changed from: private */
    public boolean i;
    private boolean j;
    private boolean k = true;
    private m l = new K(this);
    private c m = new L(this);

    /* compiled from: PlaylistDetailsHeaderAnimator */
    private enum a {
        UP,
        DOWN
    }

    M(CustomFontTitleToolbar customFontTitleToolbar, View view, View view2, Resources resources) {
        this.d = customFontTitleToolbar;
        this.e = view;
        this.f = view2;
        this.g = resources.getDimensionPixelSize(g.toolbar_elevation);
    }

    private void c(RecyclerView recyclerView) {
        recyclerView.post(new C5731b(recyclerView));
    }

    /* access modifiers changed from: 0000 */
    public void b(RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.a aVar) {
        recyclerView.b(this.l);
        aVar.b(this.m);
    }

    private void b(RecyclerView recyclerView) {
        this.d.setTitleAlpha(1.0f);
        this.e.setAlpha(0.0f);
        a(true, true);
        a(false);
        recyclerView.setPadding(0, this.d.getBottom(), 0, recyclerView.getPaddingBottom());
    }

    public void a(RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.a aVar) {
        recyclerView.a(this.l);
        aVar.a(this.m);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, RecyclerView recyclerView) {
        if (z != this.h) {
            if (z) {
                b(recyclerView);
            } else {
                c(recyclerView);
            }
        }
        this.h = z;
    }

    private void b(RecyclerView recyclerView, a aVar) {
        boolean z = true;
        a(true, false);
        a(false);
        if (aVar != a.DOWN) {
            z = false;
        }
        b(z);
        if (!this.i) {
            recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, 0);
        }
    }

    static /* synthetic */ void a(RecyclerView recyclerView) {
        recyclerView.j(0);
        recyclerView.setPadding(0, 0, 0, recyclerView.getPaddingBottom());
    }

    /* access modifiers changed from: private */
    public void a(RecyclerView recyclerView, a aVar) {
        if (!this.h) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (a(linearLayoutManager)) {
                a(recyclerView, linearLayoutManager);
            } else {
                b(recyclerView, aVar);
            }
        }
    }

    private void b(boolean z) {
        float f2;
        if (z != this.k) {
            ViewPropertyAnimator animate = this.f.animate();
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = (float) (-this.d.getHeight());
            }
            animate.translationY(f2).setInterpolator(new LinearInterpolator()).setDuration(300);
            this.k = z;
        }
    }

    private void a(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        boolean z = false;
        View view = recyclerView.c(0).itemView;
        View findViewById = view.findViewById(i.scrim);
        if (findViewById != null) {
            int height = findViewById.getHeight();
            int top = view.getTop();
            float f2 = (float) height;
            findViewById.setAlpha(C6768kIa.a(top, f2, b));
            b(true);
            this.d.setTitleAlpha(C6768kIa.a(top, f2, a));
            this.e.setAlpha(C6768kIa.a(top, f2, c));
            a(Math.abs(top) > findViewById.getHeight() - this.d.getBottom(), false);
            if (top > (-((int) (f2 - (((Float) a.b()).floatValue() * f2))))) {
                z = true;
            }
            a(z);
            if (!this.i && b(recyclerView, linearLayoutManager)) {
                a(recyclerView, linearLayoutManager, top);
                this.i = true;
            }
        }
    }

    private void b() {
        b(0, this.g);
    }

    private void b(int i2, int i3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f, "Elevation", new float[]{(float) i2, (float) i3});
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    private boolean b(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.H() == recyclerView.getAdapter().b() - 1;
    }

    private boolean a(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.G() == 0;
    }

    private void a(boolean z) {
        if (z) {
            this.d.l();
        } else {
            this.d.m();
        }
    }

    private void a(boolean z, boolean z2) {
        if (z && !this.j) {
            this.j = true;
            b();
            if (z2) {
                a(0, -1);
            } else {
                this.f.setBackgroundColor(-1);
            }
        } else if (!z && this.j) {
            this.j = false;
            a();
            if (z2) {
                a(-1, 0);
            } else {
                this.f.setBackgroundColor(0);
            }
        }
    }

    private void a() {
        b(this.g, 0);
    }

    private void a(int i2, int i3) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
        ofObject.setDuration(300);
        ofObject.addUpdateListener(new C5730a(this));
        ofObject.start();
    }

    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.f.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private void a(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i2) {
        recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, Math.max(0, ((recyclerView.findViewById(i.playlist_engagement_bar).getBottom() + i2) - this.d.getBottom()) - (recyclerView.c(linearLayoutManager.H()).itemView.getBottom() - recyclerView.getHeight())));
    }
}
