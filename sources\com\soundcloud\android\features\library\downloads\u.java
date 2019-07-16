package com.soundcloud.android.features.library.downloads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.downloads.w.a;

/* compiled from: DownloadsPlaylistRenderer.kt */
final class u implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ s.a b;

    u(a aVar, s.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final void onClick(View view) {
        this.a.j.a.accept(this.b);
    }
}
