package com.soundcloud.android.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.P.d;

/* compiled from: ProfileBucketsPlaylistItemRenderer.kt */
public final class V extends C5541_ta<d> {
    private final C6781kVa<C4621nja> a;
    private final C5498ZIa b;

    public V(C5498ZIa zIa) {
        C7471uYa.b(zIa, "playlistItemRenderer");
        this.b = zIa;
        C6781kVa<C4621nja> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.profile_user_sounds_playlist_row, viewGroup, false);
        C7471uYa.a((Object) inflate, "LayoutInflater.from(pare…  parent, false\n        )");
        return inflate;
    }

    public final C6781kVa<C4621nja> a() {
        return this.a;
    }

    public void a(int i, View view, d dVar) {
        C5512Zta zta;
        C7471uYa.b(view, "itemView");
        C7471uYa.b(dVar, "item");
        C3863rda e = dVar.e();
        view.setOnClickListener(new U(this, dVar));
        view.setBackgroundColor(view.getResources().getColor(f.white));
        C5498ZIa zIa = this.b;
        C4928GKa c = C4928GKa.c(dVar.c());
        if (dVar.b()) {
            zta = C5512Zta.a.c();
        } else {
            zta = C5512Zta.a.b();
        }
        zIa.a(e, view, c, zta);
    }
}
