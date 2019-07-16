package com.soundcloud.android.discovery.systemplaylist;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.l reason: case insensitive filesystem */
/* compiled from: SystemPlaylistAdapter.kt */
public class C3521l extends C5407WEa<ca> {
    private final C3530v g;
    private final Y h;

    public C3521l(C3530v vVar, Y y) {
        C7471uYa.b(vVar, "systemPlaylistHeaderItemRenderer");
        C7471uYa.b(y, "systemPlaylistTrackItemRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(C3519j.HEADER.ordinal(), vVar), new C5693cFa(C3519j.TRACK.ordinal(), y)});
        this.g = vVar;
        this.h = y;
    }

    public int f(int i) {
        return ((ca) g(i)).a().ordinal();
    }

    public APa<ea> j() {
        APa<ea> b = this.h.a().b((EPa<? extends T>) this.g.a());
        C7471uYa.a((Object) b, "systemPlaylistTrackItemR…ItemRenderer.playClicked)");
        return b;
    }
}
