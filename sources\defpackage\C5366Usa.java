package defpackage;

import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/playlists/UpdateTrackListIntent;", "", "()V", "toResult", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/playlists/UpdateTrackListIntent$UpdateTrackListResult;", "updatedTracklist", "", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailTrackItem;", "playlistUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "playlistOperations", "Lcom/soundcloud/android/playlists/PlaylistOperations;", "playlistDetailsMetadataBuilder", "Lcom/soundcloud/android/playlists/PlaylistDetailsMetadataBuilder;", "UpdateTrackListResult", "base_release"}, mv = {1, 1, 15})
/* renamed from: Usa reason: default package and case insensitive filesystem */
/* compiled from: UpdateTrackListIntent.kt */
public final class C5366Usa {
    public static final C5366Usa a = new C5366Usa();

    /* renamed from: Usa$a */
    /* compiled from: UpdateTrackListIntent.kt */
    public static final class a implements C4751Aoa {
        private final List<e> a;
        private final C6600hqa b;

        public a(List<e> list, C6600hqa hqa) {
            C7471uYa.b(list, "tracksList");
            C7471uYa.b(hqa, "playlistDetailsMetadataBuilder");
            this.a = list;
            this.b = hqa;
        }

        public C7218qra a(C7218qra qra) {
            C7471uYa.b(qra, "previous");
            List<e> list = this.a;
            ArrayList<C6185ma> arrayList = new ArrayList<>(C6986nWa.a((Iterable<? extends T>) list, 10));
            for (e i : list) {
                arrayList.add(i.i());
            }
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
            for (C6185ma maVar : arrayList) {
                arrayList2.add(u.a(maVar.a(), C4928GKa.b(maVar.y())));
            }
            C6532gqa a2 = this.b.a(qra.c(), (List<? extends C6185ma>) arrayList);
            List<e> list2 = this.a;
            ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
            int i2 = 0;
            for (Object next : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    e eVar = (e) next;
                    C3508cda a3 = qra.c().a();
                    C3508cda e = qra.c().l().e();
                    C7471uYa.a((Object) e, "previous.metadata.playlistItem.creatorUrn()");
                    PromotedSourceInfo h = eVar.h();
                    C6185ma i4 = eVar.i();
                    boolean q = qra.c().q();
                    com.soundcloud.android.playback.Db.a aVar = new com.soundcloud.android.playback.Db.a(arrayList2, i2, a2.k());
                    e eVar2 = r9;
                    e eVar3 = new e(a3, e, h, i4, q, aVar);
                    arrayList3.add(eVar2);
                    i2 = i3;
                } else {
                    C6782kWa.c();
                    throw null;
                }
            }
            return C7218qra.a(qra, a2, arrayList3, qra.f(), qra.d(), null, 16, null);
        }
    }

    private C5366Usa() {
    }

    public final APa<a> a(APa<List<e>> aPa, C3508cda cda, C4909Fra fra, C6600hqa hqa) {
        C7471uYa.b(aPa, "updatedTracklist");
        C7471uYa.b(cda, "playlistUrn");
        C7471uYa.b(fra, "playlistOperations");
        C7471uYa.b(hqa, "playlistDetailsMetadataBuilder");
        APa<a> g = aPa.g(new C5424Wsa(fra, cda, hqa));
        C7471uYa.a((Object) g, "updatedTracklist\n       …aBuilder) }\n            }");
        return g;
    }
}
