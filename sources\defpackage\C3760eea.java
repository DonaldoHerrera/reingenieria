package defpackage;

import java.util.List;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "", "track", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/foundation/domain/repository/SingleItemResponse;", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "loadStrategy", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository$LoadStrategy;", "tracks", "Lcom/soundcloud/android/foundation/domain/repository/ListResponse;", "urns", "", "LoadStrategy", "domain"}, mv = {1, 1, 15})
/* renamed from: eea reason: default package and case insensitive filesystem */
/* compiled from: TrackRepository.kt */
public interface C3760eea {

    /* renamed from: eea$a */
    /* compiled from: TrackRepository.kt */
    public enum a {
        LOCAL_ONLY,
        SYNC_MISSING,
        LOCAL_THEN_SYNCED,
        SYNCED
    }

    APa<Pda<C3509cea>> a(C3508cda cda, a aVar);

    APa<Ida<C3509cea>> a(List<C3508cda> list, a aVar);
}
