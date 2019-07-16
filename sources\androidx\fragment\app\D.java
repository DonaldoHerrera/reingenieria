package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* compiled from: FragmentTransition */
class D implements Runnable {
    final /* synthetic */ Fragment a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ boolean c;
    final /* synthetic */ T d;
    final /* synthetic */ View e;
    final /* synthetic */ O f;
    final /* synthetic */ Rect g;

    D(Fragment fragment, Fragment fragment2, boolean z, T t, View view, O o, Rect rect) {
        this.a = fragment;
        this.b = fragment2;
        this.c = z;
        this.d = t;
        this.e = view;
        this.f = o;
        this.g = rect;
    }

    public void run() {
        F.a(this.a, this.b, this.c, this.d, false);
        View view = this.e;
        if (view != null) {
            this.f.a(view, this.g);
        }
    }
}
