package com.google.android.material.snackbar;

import android.os.Handler;

/* compiled from: BaseTransientBottomBar */
class f implements a {
    final /* synthetic */ BaseTransientBottomBar a;

    f(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void a(int i) {
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, this.a));
    }

    public void c() {
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(0, this.a));
    }
}
