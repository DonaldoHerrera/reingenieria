package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior.a;

/* compiled from: BaseTransientBottomBar */
class g implements a {
    final /* synthetic */ BaseTransientBottomBar a;

    g(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void a(View view) {
        view.setVisibility(8);
        this.a.a(0);
    }

    public void a(int i) {
        if (i == 0) {
            q.a().f(this.a.l);
        } else if (i == 1 || i == 2) {
            q.a().e(this.a.l);
        }
    }
}
