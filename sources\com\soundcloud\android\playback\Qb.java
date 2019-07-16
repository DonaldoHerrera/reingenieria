package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.Vd;
import com.soundcloud.android.playback.core.PlaybackItem;

@EVa(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J \u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J \u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/soundcloud/android/playback/PlaybackItemOperations;", "", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "offlinePlaybackOperations", "Lcom/soundcloud/android/offline/OfflinePlaybackOperations;", "playbackItemRepository", "Lcom/soundcloud/android/playback/PlaybackItemRepository;", "offlineSettingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "(Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/offline/OfflinePlaybackOperations;Lcom/soundcloud/android/playback/PlaybackItemRepository;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/view/snackbar/FeedbackController;)V", "getPlaybackItemForVideoAd", "Lcom/soundcloud/android/playback/VideoAdPlaybackItem;", "uuid", "", "handleOfflineTrackPlayback", "Lio/reactivex/Maybe;", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "track", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "position", "", "handleTrack", "playbackItemForAd", "Lio/reactivex/Single;", "currentPlayQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "playbackItemForQueueItem", "playbackItemForTrack", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlaybackItemOperations.kt */
public class Qb {
    public static final a a = new a(null);
    private final C3760eea b;
    private final Vd c;
    private final Ub d;
    private final C4088fe e;
    private final C5052KJa f;

    /* compiled from: PlaybackItemOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Qb(C3760eea eea, Vd vd, Ub ub, C4088fe feVar, C5052KJa kJa) {
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(vd, "offlinePlaybackOperations");
        C7471uYa.b(ub, "playbackItemRepository");
        C7471uYa.b(feVar, "offlineSettingsStorage");
        C7471uYa.b(kJa, "feedbackController");
        this.b = eea;
        this.c = vd;
        this.d = ub;
        this.e = feVar;
        this.f = kJa;
    }

    /* access modifiers changed from: private */
    public C7531vPa<? extends PlaybackItem> b(C3509cea cea, long j) {
        C3508cda y = cea.y();
        if (cea.a()) {
            C7531vPa<? extends PlaybackItem> a2 = C7531vPa.a((Throwable) new J(y));
            C7471uYa.a((Object) a2, "Maybe.error<PlaybackItem…TrackException(trackUrn))");
            return a2;
        } else if (this.c.a(cea.y())) {
            return a(cea, j);
        } else {
            if (cea.s()) {
                return this.d.c(cea, j);
            }
            return this.d.a(cea, j);
        }
    }

    public C7531vPa<PlaybackItem> a(q qVar, long j) {
        C7471uYa.b(qVar, "currentPlayQueueItem");
        b a2 = SDb.a("PlaybackItemOperations");
        StringBuilder sb = new StringBuilder();
        sb.append("playbackItemForQueueItem(");
        sb.append(qVar.b());
        sb.append(": ");
        sb.append(qVar.d());
        sb.append(", ");
        sb.append(j);
        sb.append(')');
        a2.d(sb.toString(), new Object[0]);
        if (qVar.j()) {
            C3508cda c2 = qVar.c();
            C7471uYa.a((Object) c2, "currentPlayQueueItem.urn");
            C7531vPa<PlaybackItem> a3 = a(c2, j).a(PlaybackItem.class);
            C7471uYa.a((Object) a3, "playbackItemForTrack(cur…PlaybackItem::class.java)");
            return a3;
        } else if (qVar.e()) {
            C7531vPa<PlaybackItem> i = b(qVar, j).a(PlaybackItem.class).i();
            C7471uYa.a((Object) i, "playbackItemForAd(curren…em::class.java).toMaybe()");
            return i;
        } else {
            C7531vPa<PlaybackItem> a4 = C7531vPa.a((Throwable) new Aa(qVar));
            C7471uYa.a((Object) a4, "Maybe.error(IllegalUrnTo…on(currentPlayQueueItem))");
            return a4;
        }
    }

    private IPa<? extends PlaybackItem> b(q qVar, long j) {
        C3676c cVar = (C3676c) qVar.a().b();
        String str = " not of type ";
        String str2 = "Input ";
        String str3 = "adData";
        if (qVar.k()) {
            Ub ub = this.d;
            C7471uYa.a((Object) cVar, str3);
            if (cVar instanceof aa) {
                return Ub.a(ub, (aa) cVar, j, 0.0f, 4, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(cVar);
            sb.append(str);
            sb.append(aa.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
        Ub ub2 = this.d;
        C7471uYa.a((Object) cVar, str3);
        if (cVar instanceof C3693u) {
            return ub2.a((C3693u) cVar, j);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(cVar);
        sb2.append(str);
        sb2.append(C3693u.class.getSimpleName());
        throw new IllegalArgumentException(sb2.toString());
    }

    public VideoAdPlaybackItem a(String str) {
        C7471uYa.b(str, "uuid");
        return this.d.a(str);
    }

    private C7531vPa<? extends PlaybackItem> a(C3508cda cda, long j) {
        C7531vPa<? extends PlaybackItem> c2 = this.b.a(cda, defpackage.C3760eea.a.SYNC_MISSING).g().c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new Rb<Object,Object>(this, j, cda));
        C7471uYa.a((Object) c2, "trackRepository.track(ur…          }\n            }");
        return c2;
    }

    private C7531vPa<? extends PlaybackItem> a(C3509cea cea, long j) {
        if (this.e.k()) {
            return this.d.b(cea, j);
        }
        C5052KJa kJa = this.f;
        Fca fca = new Fca(p.sd_card_cannot_be_found, 0, 0, null, null, null, 62, null);
        kJa.a(fca);
        return this.d.a(cea, j);
    }
}
