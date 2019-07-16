package defpackage;

import java.util.List;

/* renamed from: rBa reason: default package and case insensitive filesystem */
/* compiled from: LoadPlaylistTracksWithChangesCommand */
class C7238rBa extends C1317gT<C3508cda, List<C4733ABa>, C7238rBa> {
    private final C5500ZKa b;

    /* renamed from: rBa$a */
    /* compiled from: LoadPlaylistTracksWithChangesCommand */
    private class a extends C4991ILa<C4733ABa> {
        private a() {
        }

        public C4733ABa a(C5326TKa tKa) {
            C3508cda d = C3508cda.d(tKa.d("track_id"));
            if (tKa.g("added_at")) {
                return C4733ABa.a(d);
            }
            if (tKa.g("removed_at")) {
                return C4733ABa.c(d);
            }
            return C4733ABa.b(d);
        }
    }

    C7238rBa(C5500ZKa zKa) {
        this.b = zKa;
    }

    public List<C4733ABa> call() throws Exception {
        return this.b.a(((C6975nLa) C6975nLa.a(_ea.PlaylistTracks.name()).a("track_id", "added_at", "removed_at").d("playlist_id", (Object) Long.valueOf(((C3508cda) this.a).c()))).a("position", b.ASC)).b(new a());
    }
}
