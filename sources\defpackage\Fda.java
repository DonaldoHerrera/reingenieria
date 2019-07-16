package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@EVa(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001 J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H&J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH&J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H&J0\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0018H&J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cH&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H&¨\u0006!"}, d2 = {"Lcom/soundcloud/android/foundation/domain/playlists/PlaylistRepository;", "", "createNewPlaylist", "Lio/reactivex/Single;", "Lcom/soundcloud/android/foundation/domain/Urn;", "title", "", "isPrivate", "", "firstTrackUrn", "creatorUrn", "localPlaylistsContainingTrack", "", "posts", "", "playlist", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse;", "Lcom/soundcloud/android/foundation/domain/playlists/Playlist;", "urn", "loadStrategy", "Lcom/soundcloud/android/foundation/domain/playlists/PlaylistRepository$LoadStrategy;", "playlistSyncedIf", "syncIf", "Lkotlin/Function1;", "playlists", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "urns", "", "secretToken", "Lcom/soundcloud/java/optional/Optional;", "playlistUrn", "LoadStrategy", "domain"}, mv = {1, 1, 15})
/* renamed from: Fda reason: default package */
/* compiled from: PlaylistRepository.kt */
public interface Fda {

    /* renamed from: Fda$a */
    /* compiled from: PlaylistRepository.kt */
    public enum a {
        SYNC_MISSING,
        SYNCED
    }

    APa<Pda<Eda>> a(C3508cda cda, a aVar);

    APa<Pda<Eda>> a(C3508cda cda, _Xa<? super Eda, Boolean> _xa);

    APa<Ida<Eda>> a(List<C3508cda> list);

    C4928GKa<String> a(C3508cda cda);

    IPa<C3508cda> a(String str, boolean z, C3508cda cda, C3508cda cda2);

    IPa<Set<C3508cda>> a(Collection<C3508cda> collection);
}
