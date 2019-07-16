package defpackage;

import com.google.common.base.Function;
import com.soundcloud.android.tracks.Ya;
import com.soundcloud.android.tracks.Ya.a;
import java.util.List;

/* renamed from: Ypa reason: default package and case insensitive filesystem */
/* compiled from: LoadPlaylistTracksCommand */
public class C5479Ypa extends C1255eT<C3508cda, List<C3509cea>> {
    private final C5500ZKa a;

    public C5479Ypa(C5500ZKa zKa) {
        this.a = zKa;
    }

    private C6975nLa b(C3508cda cda) {
        return (C6975nLa) ((C6975nLa) C6975nLa.a(_ea.PlaylistTracks.name()).a("TrackView.*").a(g.c.name(), _ea.PlaylistTracks.a("track_id"), g.d.e()).d(_ea.PlaylistTracks.a("playlist_id"), (Object) Long.valueOf(cda.c()))).a(_ea.PlaylistTracks.a("position"), b.ASC).a(_ea.PlaylistTracks.a("removed_at"));
    }

    public List<C3509cea> a(C3508cda cda) {
        C5631bLa a2 = this.a.a(b(cda));
        a aVar = Ya.c;
        aVar.getClass();
        return C2063HD.a(C1943BD.a(C1943BD.b(a2.b(new C7143poa(aVar)), C7833zoa.a), (Function<? super F, ? extends T>) C7074ooa.a));
    }
}
