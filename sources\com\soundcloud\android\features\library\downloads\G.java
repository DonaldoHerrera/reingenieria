package com.soundcloud.android.features.library.downloads;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.features.library.downloads.I.a;
import com.soundcloud.android.features.library.downloads.s.b;

/* compiled from: DownloadsTrackRenderer.kt */
final class G implements OnClickListener {
    final /* synthetic */ a a;
    final /* synthetic */ b b;

    G(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final void onClick(View view) {
        this.a.b.a.accept(Integer.valueOf(this.a.getAdapterPosition()));
    }
}
