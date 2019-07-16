package com.soundcloud.android.playback.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PlayerWidgetPresenter */
class v extends C5068Kua<Bitmap> {
    final /* synthetic */ Context d;
    final /* synthetic */ w e;

    v(w wVar, Context context) {
        this.e = wVar;
        this.d = context;
    }

    /* renamed from: a */
    public void onSuccess(Bitmap bitmap) {
        super.onSuccess(bitmap);
        this.e.a(this.d, bitmap);
    }

    @SuppressLint({"MissingSuperCall"})
    public void a(Throwable th) {
    }
}
