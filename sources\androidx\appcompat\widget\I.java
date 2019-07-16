package androidx.appcompat.widget;

import android.view.View;

/* compiled from: ListPopupWindow */
class I implements Runnable {
    final /* synthetic */ ListPopupWindow a;

    I(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    public void run() {
        View b = this.a.b();
        if (b != null && b.getWindowToken() != null) {
            this.a.c();
        }
    }
}
