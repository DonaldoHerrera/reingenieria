package defpackage;

import java.util.List;

/* renamed from: KBa reason: default package and case insensitive filesystem */
/* compiled from: ReplacePlaylistTracksCommand */
class C5044KBa extends a {
    final /* synthetic */ List b;
    final /* synthetic */ C5075LBa c;

    C5044KBa(C5075LBa lBa, List list) {
        this.c = lBa;
        this.b = list;
    }

    public void b(C5500ZKa zKa) {
        a(zKa.a((C5116MLa) _ea.PlaylistTracks, C6907mLa.a().d("playlist_id", (Object) Long.valueOf(this.c.b.c()))));
        for (int i = 0; i < this.b.size(); i++) {
            a(zKa.b((C5116MLa) _ea.PlaylistTracks, this.c.a((C3508cda) this.b.get(i), i)));
        }
    }
}
