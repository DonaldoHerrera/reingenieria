package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: XFa reason: default package and case insensitive filesystem */
/* compiled from: AnimUtils */
class C5437XFa extends a {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    C5437XFa(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public void onAnimationEnd(Animation animation) {
        if (animation == this.a.getAnimation()) {
            this.a.setVisibility(this.b);
        }
    }
}
