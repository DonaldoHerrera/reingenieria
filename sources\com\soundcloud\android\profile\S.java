package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.profile.P.d;

/* compiled from: ProfileBucketsPlaylistCardRenderer.kt */
public final class S extends C5541_ta<d> {
    private final C6781kVa<C4621nja> a;
    private final C5440XIa b;

    public S(C5440XIa xIa) {
        C7471uYa.b(xIa, "playlistCardRenderer");
        this.b = xIa;
        C6781kVa<C4621nja> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
        this.b.a(l.profile_user_sounds_playlist_card);
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View b2 = this.b.b(viewGroup);
        C7471uYa.a((Object) b2, "playlistCardRenderer.createItemView(parent)");
        return b2;
    }

    public final C6781kVa<C4621nja> a() {
        return this.a;
    }

    public void a(int i, View view, d dVar) {
        C5512Zta zta;
        C7471uYa.b(view, "itemView");
        C7471uYa.b(dVar, "item");
        C3863rda e = dVar.e();
        view.setBackgroundColor(view.getResources().getColor(f.white));
        view.setOnClickListener(new Q(this, dVar));
        C5440XIa xIa = this.b;
        C4928GKa c = C4928GKa.c(dVar.c());
        if (dVar.b()) {
            zta = C5512Zta.a.c();
        } else {
            zta = C5512Zta.a.b();
        }
        xIa.a(e, view, c, zta);
    }
}
