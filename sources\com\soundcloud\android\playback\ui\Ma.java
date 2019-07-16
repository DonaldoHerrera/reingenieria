package com.soundcloud.android.playback.ui;

import android.graphics.Bitmap;
import com.soundcloud.android.playback.ui.La.a;

/* compiled from: AudioAdPresenter.kt */
final class Ma<T> implements C6776kQa<Bitmap> {
    final /* synthetic */ La a;
    final /* synthetic */ a b;

    Ma(La la, a aVar) {
        this.a = la;
        this.b = aVar;
    }

    /* renamed from: a */
    public final void accept(Bitmap bitmap) {
        La la = this.a;
        a aVar = this.b;
        C7471uYa.a((Object) bitmap, "adImage");
        La.a(la, aVar, bitmap, null, 4, null);
    }
}
