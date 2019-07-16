package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: fIa reason: default package and case insensitive filesystem */
/* compiled from: ViewExtensions.kt */
public final class C6428fIa {
    public static final void a(ImageView imageView, int i) {
        C7471uYa.b(imageView, "$this$extendTouchArea");
        C6768kIa.a((View) imageView, i);
    }

    public static final void b(View view) {
        C7471uYa.b(view, "$this$animateVisible");
        b(view, true);
    }

    public static final void a(ImageView imageView) {
        C7471uYa.b(imageView, "$this$extendTouchArea");
        C6768kIa.b((View) imageView);
    }

    public static final void b(View view, boolean z) {
        C7471uYa.b(view, "$this$visible");
        if (z) {
            view.animate().alpha(1.0f).setDuration(300).setListener(new C6360eIa(view));
        } else {
            view.setVisibility(0);
        }
    }

    public static final void a(AppBarLayout appBarLayout, float f) {
        C7471uYa.b(appBarLayout, "$this$addElevation");
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", new float[]{f}));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final void a(View view) {
        C7471uYa.b(view, "$this$animateGone");
        a(view, true);
    }

    public static final void a(View view, boolean z) {
        C7471uYa.b(view, "$this$gone");
        a(view, 8, z);
    }

    private static final void a(View view, int i, boolean z) {
        if (z) {
            view.animate().alpha(0.0f).setDuration(300).setListener(new C6292dIa(view, i));
        } else {
            view.setVisibility(i);
        }
    }
}
