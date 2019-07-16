package com.soundcloud.android.upgrade;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.C0370l;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.view.LoadingButton;
import com.soundcloud.android.view.pageindicator.CirclePageIndicator;
import com.squareup.picasso.E;
import com.squareup.picasso.E.d;
import com.squareup.picasso.L;
import com.squareup.picasso.S;

/* compiled from: GoOnboardingView */
class k implements e {
    /* access modifiers changed from: private */
    public ImageView a;
    private ViewPager b;
    private CirclePageIndicator c;
    private LoadingButton d;
    private final e e;
    /* access modifiers changed from: private */
    public S f;
    private a g;

    /* compiled from: GoOnboardingView */
    interface a {
        void t();
    }

    /* compiled from: GoOnboardingView */
    static class b implements S {
        b() {
        }

        public void a(Bitmap bitmap, d dVar) {
        }

        public void a(Drawable drawable) {
        }

        public void a(Exception exc, Drawable drawable) {
        }
    }

    k(e eVar) {
        this.e = eVar;
    }

    private void d() {
        this.g.t();
    }

    public void a(int i) {
    }

    public void a(int i, float f2, int i2) {
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.d.setEnabled(false);
        this.d.setLoading(true);
    }

    private boolean d(int i) {
        return i == this.b.getAdapter().a() - 1;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a(true);
        this.d.a();
    }

    private void c(int i) {
        if (d(i)) {
            this.d.setBackgroundResource(h.btn_primary_transition);
            ((TransitionDrawable) this.d.getBackground()).startTransition(200);
            return;
        }
        this.d.setBackgroundResource(h.btn_transparent);
    }

    /* access modifiers changed from: 0000 */
    public void a(Activity activity, a aVar, C2455aV aVVar) {
        this.g = aVar;
        a(activity);
        a(aVVar);
    }

    public void b(int i) {
        c(i);
    }

    private void a(Activity activity) {
        this.a = (ImageView) activity.findViewById(i.go_onboarding_background);
        this.b = (ViewPager) activity.findViewById(i.go_onboarding_pager);
        this.c = (CirclePageIndicator) activity.findViewById(i.go_onboarding_indicator);
        this.d = (LoadingButton) activity.findViewById(i.btn_go_setup_start);
        this.d.setOnClickListener(new b(this));
    }

    public /* synthetic */ void a(View view) {
        d();
    }

    private void a(C2455aV aVVar) {
        this.e.a(aVVar);
        this.b.setOffscreenPageLimit(1);
        this.b.setAdapter(this.e);
        this.c.setViewPager(this.b);
        this.b.a((e) this);
        this.b.a((e) this.e);
        this.e.a((a) new a(this));
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        this.f = new j(this);
        L a2 = E.a().a(bVar.l);
        a2.c();
        a2.d();
        a2.a(this.f);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        a(true);
        this.d.setLoading(false);
    }

    private void a(boolean z) {
        this.d.setEnabled(z);
    }

    /* access modifiers changed from: 0000 */
    public void a(C0370l lVar) {
        n.a(lVar);
    }
}
