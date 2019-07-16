package com.soundcloud.android.stream;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.b;

/* compiled from: StreamSwipeRefreshAttacher */
public class nb extends C7663xJa {
    private b a;

    nb() {
    }

    public void a() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.onRefresh();
        }
    }
}
