package com.soundcloud.android.search;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.search.y reason: case insensitive filesystem */
/* compiled from: SearchPlaylistItemRenderer.kt */
final class C5942y implements OnClickListener {
    final /* synthetic */ C5943z a;
    final /* synthetic */ C5940w b;

    C5942y(C5943z zVar, C5940w wVar) {
        this.a = zVar;
        this.b = wVar;
    }

    public final void onClick(View view) {
        C5941x c = this.b.c();
        if (c != null) {
            this.a.a().a(c);
        }
    }
}
