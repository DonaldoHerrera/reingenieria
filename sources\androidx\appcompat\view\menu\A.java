package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: StandardMenuPopup */
class A implements OnGlobalLayoutListener {
    final /* synthetic */ C a;

    A(C c) {
        this.a = c;
    }

    public void onGlobalLayout() {
        if (this.a.d() && !this.a.j.k()) {
            View view = this.a.o;
            if (view == null || !view.isShown()) {
                this.a.dismiss();
            } else {
                this.a.j.c();
            }
        }
    }
}
