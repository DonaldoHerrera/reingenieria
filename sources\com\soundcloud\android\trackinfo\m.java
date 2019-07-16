package com.soundcloud.android.trackinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.trackinfo.x.l;

/* compiled from: NewTrackInfoAdapter.kt */
public final class m implements C6289dFa<B> {
    private final w a;

    public m(w wVar) {
        C7471uYa.b(wVar, "onCommentDialogClickLister");
        this.a = wVar;
    }

    public C5378VEa<B> a(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.new_track_info, viewGroup, false);
        C7471uYa.a((Object) inflate, "view");
        return new l(inflate, this.a);
    }
}
