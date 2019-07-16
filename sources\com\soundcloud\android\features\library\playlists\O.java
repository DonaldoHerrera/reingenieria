package com.soundcloud.android.features.library.playlists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.features.library.playlists.C3635l.d;

/* compiled from: PlaylistRemoveFilterRenderer */
class O extends C5541_ta<d> {
    /* access modifiers changed from: private */
    public a a;
    private final OnClickListener b = new N(this);

    /* compiled from: PlaylistRemoveFilterRenderer */
    interface a {
        void a();
    }

    public void a(int i, View view, d dVar) {
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.collection_kill_filters, viewGroup, false);
        inflate.findViewById(i.btn_remove_filters).setOnClickListener(this.b);
        return inflate;
    }

    public void a(a aVar) {
        this.a = aVar;
    }
}
