package com.soundcloud.android.search;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.soundcloud.android.search.z reason: case insensitive filesystem */
/* compiled from: SearchPlaylistItemRenderer.kt */
public class C5943z extends C5541_ta<C5940w> {
    private final C6781kVa<C5941x> a;
    private final C5498ZIa b;

    public C5943z(C5498ZIa zIa) {
        C7471uYa.b(zIa, "playlistItemRenderer");
        this.b = zIa;
        C6781kVa<C5941x> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create()");
        this.a = s;
    }

    public View b(ViewGroup viewGroup) {
        C7471uYa.b(viewGroup, "parent");
        View b2 = this.b.b(viewGroup);
        C7471uYa.a((Object) b2, "playlistItemRenderer.createItemView(parent)");
        return b2;
    }

    public C6781kVa<C5941x> a() {
        return this.a;
    }

    public void a(int i, View view, C5940w wVar) {
        C7471uYa.b(view, "itemView");
        C7471uYa.b(wVar, "item");
        this.b.a(wVar.d(), view, wVar.e());
        view.setOnClickListener(new C5942y(this, wVar));
    }
}
