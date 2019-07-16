package com.soundcloud.android.sync;

import com.soundcloud.android.activities.y;
import com.soundcloud.android.ads.C2610pa;
import com.soundcloud.android.collection.playhistory.xa;
import com.soundcloud.android.collection.recentlyplayed.Ia;
import com.soundcloud.android.offline.C4201zc;
import com.soundcloud.android.stations.Ba;
import com.soundcloud.android.stream.C6110w;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u00015B³\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0019\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0019\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0019¢\u0006\u0002\u0010%J\u0013\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020.H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020/H\u0012R(\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020)0\u00190'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/soundcloud/android/sync/SyncerRegistry;", "Lcom/soundcloud/android/backgroundjobs/PeriodicJobsHolder;", "soundStreamSyncProvider", "Lcom/soundcloud/android/stream/SoundStreamSyncProvider;", "activitiesSyncProvider", "Lcom/soundcloud/android/activities/ActivitiesSyncProvider;", "likedStationsSyncProvider", "Lcom/soundcloud/android/stations/LikedStationsSyncProvider;", "trackPostsSyncProvider", "Lcom/soundcloud/android/sync/posts/TrackPostsSyncProvider;", "myPlaylistsSyncProvider", "Lcom/soundcloud/android/sync/playlists/MyPlaylistsSyncProvider;", "myFollowingsSyncProvider", "Lcom/soundcloud/android/associations/MyFollowingsSyncProvider;", "meSyncerProvider", "Lcom/soundcloud/android/sync/me/MeSyncerProvider;", "playHistorySyncProvider", "Lcom/soundcloud/android/collection/playhistory/PlayHistorySyncProvider;", "recentlyPlayedSyncProvider", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedSyncProvider;", "discoveryCardSyncProvider", "Lcom/soundcloud/android/discovery/DiscoveryCardSyncProvider;", "deltaSyncProvider", "Lcom/soundcloud/android/sync/delta/DeltaSyncProvider;", "policySyncerProvider", "Lcom/soundcloud/android/backgroundjobs/SyncerProvider;", "Lcom/soundcloud/android/policies/PolicySyncJob;", "adIdSyncerProvider", "Lcom/soundcloud/android/ads/AdIdSyncer;", "configurationSyncerProvider", "Lcom/soundcloud/android/configuration/ConfigurationSyncJob;", "remoteConfigSyncerProvider", "Lcom/soundcloud/android/appfeatures/RemoteConfigSyncJob;", "databaseCleanupSyncerProvider", "Lcom/soundcloud/android/storage/DatabaseCleanupJob;", "offlineAuditSyncerProvider", "Lcom/soundcloud/android/offline/OfflineAuditJob;", "(Lcom/soundcloud/android/stream/SoundStreamSyncProvider;Lcom/soundcloud/android/activities/ActivitiesSyncProvider;Lcom/soundcloud/android/stations/LikedStationsSyncProvider;Lcom/soundcloud/android/sync/posts/TrackPostsSyncProvider;Lcom/soundcloud/android/sync/playlists/MyPlaylistsSyncProvider;Lcom/soundcloud/android/associations/MyFollowingsSyncProvider;Lcom/soundcloud/android/sync/me/MeSyncerProvider;Lcom/soundcloud/android/collection/playhistory/PlayHistorySyncProvider;Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedSyncProvider;Lcom/soundcloud/android/discovery/DiscoveryCardSyncProvider;Lcom/soundcloud/android/sync/delta/DeltaSyncProvider;Lcom/soundcloud/android/backgroundjobs/SyncerProvider;Lcom/soundcloud/android/backgroundjobs/SyncerProvider;Lcom/soundcloud/android/backgroundjobs/SyncerProvider;Lcom/soundcloud/android/backgroundjobs/SyncerProvider;Lcom/soundcloud/android/backgroundjobs/SyncerProvider;Lcom/soundcloud/android/backgroundjobs/SyncerProvider;)V", "jobs", "", "Lcom/soundcloud/android/backgroundjobs/PeriodicJobType;", "Lcom/soundcloud/android/backgroundjobs/Syncer;", "getJobs", "()Ljava/util/Map;", "legacySyncers", "", "Lcom/soundcloud/android/sync/Syncable;", "Lcom/soundcloud/android/sync/SyncerRegistry$SyncProvider;", "get", "syncable", "registerLegacySyncer", "", "syncProvider", "SyncProvider", "base_release"}, mv = {1, 1, 15})
/* compiled from: SyncerRegistry.kt */
public class oa implements C2360WR {
    private final Map<na, a> a = new HashMap();
    private final Map<C2342VR, C2472bS<? extends C2453aS>> b;

    /* compiled from: SyncerRegistry.kt */
    public static abstract class a {
        private final na a;

        protected a(na naVar) {
            C7471uYa.b(naVar, "syncable");
            this.a = naVar;
        }

        public final na a() {
            return this.a;
        }

        public abstract Callable<Boolean> a(String str, boolean z);

        public abstract boolean b();

        public abstract long c();

        public abstract boolean d();
    }

    public oa(C6110w wVar, y yVar, Ba ba, C7654xCa xca, C7445uBa uba, C1957BR br, C5686cBa cba, xa xaVar, Ia ia, C3754eY eYVar, C7581wAa waa, C2472bS<C7084ota> bSVar, C2472bS<C2610pa> bSVar2, C2472bS<C2379XT> bSVar3, C2472bS<C2171MQ> bSVar4, C2472bS<C6888lya> bSVar5, C2472bS<C4201zc> bSVar6) {
        y yVar2 = yVar;
        Ba ba2 = ba;
        C7654xCa xca2 = xca;
        C7445uBa uba2 = uba;
        C1957BR br2 = br;
        C5686cBa cba2 = cba;
        xa xaVar2 = xaVar;
        Ia ia2 = ia;
        C3754eY eYVar2 = eYVar;
        C7581wAa waa2 = waa;
        C2472bS<C7084ota> bSVar7 = bSVar;
        C2472bS<C2610pa> bSVar8 = bSVar2;
        C2472bS<C2379XT> bSVar9 = bSVar3;
        C2472bS<C2171MQ> bSVar10 = bSVar4;
        C2472bS<C6888lya> bSVar11 = bSVar5;
        C7471uYa.b(wVar, "soundStreamSyncProvider");
        C7471uYa.b(yVar2, "activitiesSyncProvider");
        C7471uYa.b(ba2, "likedStationsSyncProvider");
        C7471uYa.b(xca2, "trackPostsSyncProvider");
        C7471uYa.b(uba2, "myPlaylistsSyncProvider");
        C7471uYa.b(br2, "myFollowingsSyncProvider");
        C7471uYa.b(cba2, "meSyncerProvider");
        C7471uYa.b(xaVar2, "playHistorySyncProvider");
        C7471uYa.b(ia2, "recentlyPlayedSyncProvider");
        C7471uYa.b(eYVar2, "discoveryCardSyncProvider");
        C7471uYa.b(waa2, "deltaSyncProvider");
        C7471uYa.b(bSVar7, "policySyncerProvider");
        C7471uYa.b(bSVar8, "adIdSyncerProvider");
        C7471uYa.b(bSVar9, "configurationSyncerProvider");
        C7471uYa.b(bSVar10, "remoteConfigSyncerProvider");
        C2472bS<C6888lya> bSVar12 = bSVar5;
        C7471uYa.b(bSVar12, "databaseCleanupSyncerProvider");
        C2472bS<C4201zc> bSVar13 = bSVar6;
        C7471uYa.b(bSVar13, "offlineAuditSyncerProvider");
        this.b = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C2342VR.TRACK_POLICIES, bSVar7), NVa.a(C2342VR.REMOTE_CONFIG, bSVar10), NVa.a(C2342VR.CONFIGURATION, bSVar9), NVa.a(C2342VR.AD_ID, bSVar8), NVa.a(C2342VR.DATABASE_CLEANUP, bSVar12), NVa.a(C2342VR.OFFLINE_AUDIT, bSVar13)});
        a((a) waa2);
        a((a) xca2);
        a((a) uba2);
        a((a) wVar);
        a((a) yVar2);
        a((a) ba2);
        a((a) br2);
        a((a) cba2);
        a((a) xaVar2);
        a((a) ia);
        a((a) eYVar);
    }

    public Map<C2342VR, C2472bS<? extends C2453aS>> a() {
        return this.b;
    }

    public a a(na naVar) {
        C7471uYa.b(naVar, "syncable");
        return (a) this.a.get(naVar);
    }

    private void a(a aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
