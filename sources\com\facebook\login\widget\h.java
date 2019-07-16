package com.facebook.login.widget;

import android.view.ViewTreeObserver.OnScrollChangedListener;

/* compiled from: ToolTipPopup */
class h implements OnScrollChangedListener {
    final /* synthetic */ k a;

    h(k kVar) {
        this.a = kVar;
    }

    public void onScrollChanged() {
        if (this.a.b.get() != null && this.a.e != null && this.a.e.isShowing()) {
            if (this.a.e.isAboveAnchor()) {
                this.a.d.a();
            } else {
                this.a.d.b();
            }
        }
    }
}
