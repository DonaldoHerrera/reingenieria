package com.soundcloud.android.stations;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: StationTrackRenderer */
class Ib implements OnClickListener {
    final /* synthetic */ Jb a;

    Ib(Jb jb) {
        this.a = jb;
    }

    public void onClick(View view) {
        this.a.b.b(C6768kIa.a(view.getContext()), view, (C6185ma) ((C7664xKa) view.getTag()).a());
    }
}
