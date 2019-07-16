package androidx.appcompat.app;

import android.view.View;

/* compiled from: WindowDecorActionBar */
class K implements Hc {
    final /* synthetic */ L a;

    K(L l) {
        this.a = l;
    }

    public void a(View view) {
        ((View) this.a.h.getParent()).invalidate();
    }
}
