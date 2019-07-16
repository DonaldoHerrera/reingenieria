package com.soundcloud.android.playback;

import java.util.List;

/* compiled from: PlaylistExploder */
class Xc extends C5068Kua<List<C3508cda>> {
    final /* synthetic */ C3508cda d;
    final /* synthetic */ Yc e;

    Xc(Yc yc, C3508cda cda) {
        this.e = yc;
        this.d = cda;
    }

    /* renamed from: a */
    public void onSuccess(List<C3508cda> list) {
        super.onSuccess(list);
        this.e.b.a(this.d, list);
    }
}
