package com.soundcloud.android.playlist.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PlaylistDetailsHeaderRenderer */
public class P extends C5541_ta<g> {
    private final C5745p a;
    private final Y b;
    private final T c;

    public P(C5745p pVar, Y y, T t) {
        this.a = pVar;
        this.b = y;
        this.c = t;
    }

    public View b(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l.new_playlist_detail_header, viewGroup, false);
    }

    public void a(int i, View view, g gVar) {
        if (gVar.e() != null) {
            view.findViewById(i.artwork_loader).setVisibility(8);
            C6532gqa e = gVar.e();
            this.a.a(view, e, new C5733d(this, e), new C5732c(this, e));
            this.b.a(view, this.c, e);
        }
    }

    public /* synthetic */ void b(C6532gqa gqa) throws Exception {
        this.c.a(gqa);
    }

    public /* synthetic */ void a(C6532gqa gqa) throws Exception {
        this.c.b(gqa);
    }
}
