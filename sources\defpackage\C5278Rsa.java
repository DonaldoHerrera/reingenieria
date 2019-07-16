package defpackage;

import java.util.List;

/* renamed from: Rsa reason: default package and case insensitive filesystem */
/* compiled from: RemoveTrackFromPlaylistCommand */
class C5278Rsa extends a {
    final /* synthetic */ b b;
    final /* synthetic */ List c;
    final /* synthetic */ C5308Ssa d;

    C5278Rsa(C5308Ssa ssa, b bVar, List list) {
        this.d = ssa;
        this.b = bVar;
        this.c = list;
    }

    public void b(C5500ZKa zKa) {
        a(zKa.a((C5116MLa) _ea.PlaylistTracks, C6907mLa.a().d(_ea.PlaylistTracks.a("playlist_id"), (Object) Long.valueOf(this.b.a.c())).a(_ea.PlaylistTracks.a("removed_at"))));
        for (int i = 0; i < this.c.size(); i++) {
            a(zKa.b((C5116MLa) _ea.PlaylistTracks, this.d.a(this.b.a, (C3508cda) this.c.get(i), i)));
        }
        _ea _ea = _ea.PlaylistTracks;
        C5308Ssa ssa = this.d;
        b bVar = this.b;
        a(zKa.a((C5116MLa) _ea, ssa.a(bVar.a, bVar.b)));
    }
}
