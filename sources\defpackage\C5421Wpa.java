package defpackage;

import java.util.List;

/* renamed from: Wpa reason: default package and case insensitive filesystem */
/* compiled from: LoadPlaylistTrackUrnsCommand */
public class C5421Wpa extends C1255eT<C3508cda, List<C3508cda>> {
    private final C5500ZKa a;

    public C5421Wpa(C5500ZKa zKa) {
        this.a = zKa;
    }

    public List<C3508cda> a(C3508cda cda) {
        String str = "track_id";
        String str2 = "position";
        return this.a.a(((C6975nLa) ((C6975nLa) C6975nLa.a(_ea.PlaylistTracks.name()).a((C5116MLa) e.c, C6907mLa.a().d(_ea.PlaylistTracks.a(str), (Object) e.d).a(e.e, (Object) Integer.valueOf(0))).a(C6839lLa.b(str).a("_id")).d("playlist_id", (Object) Long.valueOf(cda.c()))).a(_ea.PlaylistTracks.a("removed_at"))).a(str2, b.ASC)).b(new C1564oT());
    }
}
