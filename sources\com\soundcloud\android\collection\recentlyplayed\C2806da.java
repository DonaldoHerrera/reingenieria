package com.soundcloud.android.collection.recentlyplayed;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.da reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedPlaylistRenderer.kt */
final class C2806da implements OnClickListener {
    final /* synthetic */ C2810fa a;
    final /* synthetic */ C2804ca b;
    final /* synthetic */ View c;

    C2806da(C2810fa faVar, C2804ca caVar, View view) {
        this.a = faVar;
        this.b = caVar;
        this.c = view;
    }

    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
