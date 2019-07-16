package defpackage;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/playlists/LoadCurrentTrackCountCommand;", "Lcom/soundcloud/android/commands/Command;", "Lcom/soundcloud/android/foundation/domain/Urn;", "", "propeller", "Lcom/soundcloud/propeller/PropellerDatabase;", "(Lcom/soundcloud/propeller/PropellerDatabase;)V", "getPropeller", "()Lcom/soundcloud/propeller/PropellerDatabase;", "call", "input", "(Lcom/soundcloud/android/foundation/domain/Urn;)Ljava/lang/Integer;", "getCurrentTrackCount", "playlistUrn", "TrackCountMapper", "base_release"}, mv = {1, 1, 15})
/* renamed from: Spa reason: default package and case insensitive filesystem */
/* compiled from: LoadCurrentTrackCountCommand.kt */
public class C5305Spa extends C1255eT<C3508cda, Integer> {
    private final C5500ZKa a;

    /* renamed from: Spa$a */
    /* compiled from: LoadCurrentTrackCountCommand.kt */
    private static final class a extends C4991ILa<Integer> {
        public Integer a(C5326TKa tKa) {
            C7471uYa.b(tKa, "cursorReader");
            return Integer.valueOf(C5537_pa.c(tKa));
        }
    }

    public C5305Spa(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propeller");
        this.a = zKa;
    }

    public C5500ZKa d() {
        return this.a;
    }

    public Integer a(C3508cda cda) {
        C7471uYa.b(cda, "input");
        return Integer.valueOf(a(d(), cda));
    }

    private int a(C5500ZKa zKa, C3508cda cda) {
        String str = "playlist_id";
        String str2 = "_id";
        String str3 = "_type";
        Object a2 = zKa.a(((C6975nLa) ((C6975nLa) C6975nLa.a(_ea.SoundView.name()).a(C6839lLa.b(k.E).a(c.i.d()), C6703jLa.a(str).a(c.v.d())).d(str2, (Object) Long.valueOf(cda.c()))).d(str3, (Object) Integer.valueOf(1))).b(_ea.PlaylistTracks.name(), str2, str)).a((C6295dLa<T>) new a<T>());
        C7471uYa.a(a2, "propeller.query(\n       …first(TrackCountMapper())");
        return ((Number) a2).intValue();
    }
}
