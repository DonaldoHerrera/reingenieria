package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: Ppa reason: default package and case insensitive filesystem */
/* compiled from: EditPlaylistCommand */
class C5215Ppa extends a {
    final /* synthetic */ a b;
    final /* synthetic */ C5245Qpa c;

    C5215Ppa(C5245Qpa qpa, a aVar) {
        this.c = qpa;
        this.b = aVar;
    }

    private void c(C5500ZKa zKa) {
        a(zKa.a((C5116MLa) _ea.PlaylistTracks, this.c.d(), C6907mLa.a().d(_ea.PlaylistTracks.a("playlist_id"), (Object) Long.valueOf(this.b.a.c())).a(_ea.PlaylistTracks.a("track_id"), (Collection<?>) C5526_Ha.a(this.b.d)).a(_ea.PlaylistTracks.a("removed_at"))));
    }

    private void d(C5500ZKa zKa) {
        Set a = this.c.b(zKa, this.b);
        for (int i = 0; i < this.b.d.size(); i++) {
            C3508cda cda = (C3508cda) this.b.d.get(i);
            C3508cda cda2 = this.b.a;
            if (a.contains(cda)) {
                a(zKa.a((C5116MLa) _ea.PlaylistTracks, this.c.a(i), C6907mLa.a().d("playlist_id", (Object) Long.valueOf(cda2.c())).d("track_id", (Object) Long.valueOf(cda.c()))));
            } else {
                a(zKa.a((C5116MLa) _ea.PlaylistTracks, this.c.a(cda2.c(), cda.c(), i)));
            }
        }
    }

    public void b(C5500ZKa zKa) {
        if (((C5266RKa) a(zKa.a((C5116MLa) e.c, this.c.a(this.b), C6907mLa.a().a(e.d, (Object) Long.valueOf(this.b.a.c())).a(e.e, (Object) Integer.valueOf(1))))).c() > 0) {
            c(zKa);
            d(zKa);
            this.c.b = this.b.d.size();
        }
    }
}
