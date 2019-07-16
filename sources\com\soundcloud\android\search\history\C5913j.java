package com.soundcloud.android.search.history;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.search.history.s.b;

/* renamed from: com.soundcloud.android.search.history.j reason: case insensitive filesystem */
/* compiled from: SearchHistoryCellRenderer.kt */
final class C5913j implements OnClickListener {
    final /* synthetic */ C5911h a;
    final /* synthetic */ b b;

    C5913j(C5911h hVar, b bVar) {
        this.a = hVar;
        this.b = bVar;
    }

    public final void onClick(View view) {
        this.a.b.a(this.b);
    }
}
