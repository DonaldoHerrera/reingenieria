package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;

/* renamed from: YFa reason: default package and case insensitive filesystem */
/* compiled from: AnimUtils */
public final class C5466YFa {

    /* renamed from: YFa$a */
    /* compiled from: AnimUtils */
    public static class a implements AnimationListener {
        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    private C5466YFa() {
    }

    public static Animation a(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), defpackage.C6974nKa.a.ak_spin_clockwise);
        view.startAnimation(loadAnimation);
        return loadAnimation;
    }

    public static void b(Iterable<View> iterable) {
        for (View b : iterable) {
            b(b, true);
        }
    }

    public static void a(Iterable<View> iterable) {
        for (View a2 : iterable) {
            a(a2, true);
        }
    }

    public static void b(View view, boolean z) {
        if (view.getVisibility() != 0) {
            view.clearAnimation();
            view.setVisibility(0);
            if (z) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), defpackage.C6974nKa.a.ak_fade_in));
            }
        }
    }

    public static void a(View view, boolean z) {
        a(view, 8, z);
    }

    public static void a(View view, int i, boolean z) {
        view.clearAnimation();
        if (view.getVisibility() != i) {
            view.clearAnimation();
            if (!z) {
                view.setVisibility(i);
            } else {
                a(view, (AnimationListener) new C5437XFa(view, i));
            }
        }
    }

    public static void a(View view, AnimationListener animationListener) {
        if (view.getVisibility() != 8) {
            view.clearAnimation();
            Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), defpackage.C6974nKa.a.ak_fade_out);
            loadAnimation.setAnimationListener(animationListener);
            view.startAnimation(loadAnimation);
        }
    }
}
