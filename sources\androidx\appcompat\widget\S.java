package androidx.appcompat.widget;

import android.view.View;

/* compiled from: ScrollingTabContainerView */
class S implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ T b;

    S(T t, View view) {
        this.b = t;
        this.a = view;
    }

    public void run() {
        this.b.smoothScrollTo(this.a.getLeft() - ((this.b.getWidth() - this.a.getWidth()) / 2), 0);
        this.b.b = null;
    }
}
