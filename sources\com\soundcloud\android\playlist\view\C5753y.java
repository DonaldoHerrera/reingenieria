package com.soundcloud.android.playlist.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.soundcloud.android.playlist.view.y reason: case insensitive filesystem */
/* compiled from: PlaylistDetailOtherPlaylistsItemRenderer */
public class C5753y extends C5541_ta<d> {
    private final C5741l a;

    C5753y(C5741l lVar) {
        this.a = lVar;
    }

    public View b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.other_playlists_by_user_bucket, viewGroup, false);
        a(inflate, (RecyclerView) inflate.findViewById(i.other_playlists));
        return inflate;
    }

    private void a(View view, RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C5740k a2 = this.a.a();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(a2);
        view.setTag(a2);
    }

    public void a(int i, View view, d dVar) {
        ((TextView) view.findViewById(i.reason)).setText(view.getResources().getString(dVar.g() ? p.more_albums_by : p.more_playlists_by, new Object[]{dVar.e()}));
        ((C5740k) view.getTag()).a(dVar);
    }
}
