package com.soundcloud.android.profile;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: UserPlaylistsItemRenderer.kt */
public final class Bc extends C5541_ta<C5877yc> {
    private final C6781kVa<C5882zc> a;
    private final C5498ZIa b;

    public Bc(C5498ZIa zIa) {
        C7471uYa.b(zIa, "playlistItemRenderer");
        this.b = zIa;
        C6781kVa<C5882zc> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Us…aylistsItemClickParams>()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View b2 = this.b.b(viewGroup);
        C7471uYa.a((Object) b2, "playlistItemRenderer.createItemView(parent)");
        return b2;
    }

    public final C6781kVa<C5882zc> a() {
        return this.a;
    }

    public void a(int i, View view, C5877yc ycVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(ycVar, "item");
        this.b.a(ycVar.c(), view, C4928GKa.a(), C4928GKa.a(), C5512Zta.a.b(), C4928GKa.b(ycVar.d()));
        view.setClickable(true);
        view.setOnClickListener(new Ac(this, ycVar));
    }
}
