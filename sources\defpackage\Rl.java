package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: Rl reason: default package */
/* compiled from: ViewUtil */
class Rl implements OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ View b;
    final /* synthetic */ Runnable c;

    Rl(ViewTreeObserver viewTreeObserver, View view, Runnable runnable) {
        this.a = viewTreeObserver;
        this.b = view;
        this.c = runnable;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        if (this.a.isAlive()) {
            viewTreeObserver = this.a;
        } else {
            viewTreeObserver = this.b.getViewTreeObserver();
        }
        Sl.a(viewTreeObserver, (OnGlobalLayoutListener) this);
        this.c.run();
    }
}
