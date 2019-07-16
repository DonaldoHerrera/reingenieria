package androidx.mediarouter.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: MediaRouteControllerDialog */
class r extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ u d;

    r(u uVar, int i, int i2, View view) {
        this.d = uVar;
        this.a = i;
        this.b = i2;
        this.c = view;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int i = this.a;
        u.a(this.c, i - ((int) (((float) (i - this.b)) * f)));
    }
}
