package com.soundcloud.android.view;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

/* compiled from: NewItemsIndicator */
public class F implements com.soundcloud.android.view.G.a {
    private final G a;
    private final Context b;
    private int c;
    private TextView d;
    private int e = -1;
    private a f;
    private final C6781kVa<RVa> g = C6781kVa.s();

    /* compiled from: NewItemsIndicator */
    public interface a {
        void a();
    }

    public F(Context context, G g2) {
        this.b = context;
        this.a = g2;
        g2.b();
    }

    private void g() {
        this.d.setOnClickListener(new C6220i(this));
    }

    private void h() {
        this.a.a(false);
        TextView textView = this.d;
        if (textView != null && textView.isShown()) {
            this.d.setAnimation(m());
            this.d.setVisibility(8);
        }
    }

    private boolean i() {
        Animation animation = this.d.getAnimation();
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void j() {
        if (this.e != -1) {
            int i = this.c;
            this.d.setText(this.b.getResources().getQuantityString(this.e, this.c, new Object[]{i > 9 ? "9+" : String.valueOf(i)}));
        }
    }

    private void k() {
        this.a.a(true);
        if (this.d != null && this.c > 0) {
            j();
            if (!this.d.isShown()) {
                this.d.setAnimation(l());
                this.d.setVisibility(0);
            }
        }
    }

    private Animation l() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.b, com.soundcloud.android.ia.a.abc_slide_in_top);
        loadAnimation.setDuration(500);
        loadAnimation.setInterpolator(new DecelerateInterpolator(2.0f));
        return loadAnimation;
    }

    private Animation m() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.b, com.soundcloud.android.ia.a.abc_slide_out_top);
        loadAnimation.setDuration(500);
        loadAnimation.setInterpolator(new AccelerateInterpolator(2.0f));
        return loadAnimation;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        boolean z = this.c < i;
        this.c = i;
        if (z) {
            k();
        } else if (i == 0) {
            h();
        }
    }

    public void c() {
        this.a.a();
        this.d = null;
    }

    public G d() {
        return this.a;
    }

    public void e() {
        TextView textView = this.d;
        if (textView != null && (textView.isShown() || i())) {
            h();
        }
        this.c = 0;
    }

    public final APa<RVa> f() {
        return this.g;
    }

    public void a(TextView textView) {
        this.d = textView;
        g();
        this.a.a((com.soundcloud.android.view.G.a) this);
        if (this.c > 0) {
            k();
        }
    }

    public void b() {
        TextView textView = this.d;
        if (textView != null && !textView.isShown() && !i()) {
            k();
        }
    }

    public /* synthetic */ void a(View view) {
        if (this.f != null) {
            this.c = 0;
            h();
            this.f.a();
        }
        this.g.a(RVa.a);
    }

    public void a() {
        TextView textView = this.d;
        if (textView != null && textView.isShown() && !i()) {
            h();
        }
    }
}
