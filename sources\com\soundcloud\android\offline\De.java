package com.soundcloud.android.offline;

import com.soundcloud.android.offline.Ce.b;
import com.soundcloud.android.offline.Ce.c;
import com.soundcloud.android.offline.Ce.d;
import com.soundcloud.android.offline.Ce.f;
import com.soundcloud.android.offline.Ce.g;
import com.soundcloud.android.offline.Ce.h;
import com.soundcloud.android.offline.Ce.i;
import com.soundcloud.android.offline.Ce.j;
import com.soundcloud.android.offline.Ce.k;
import com.soundcloud.android.offline.Ce.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\b\u0016\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b`\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\tH\u0012JV\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b`\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\t2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b`\u001cH\u0012J\b\u0010!\u001a\u00020\"H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010$\u001a\u00020\nH\u0016J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0012J*\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u001e0\u001e0\t0\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0012J(\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0+0\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0-H\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\nH\u0016J\u001a\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0+0\bH\u0016J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0012J\u0010\u00104\u001a\u00020/2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000209H\u0016J\u0012\u0010:\u001a\u00020&*\b\u0012\u0004\u0012\u00020\n0;H\u0012J\u0012\u0010<\u001a\u00020&*\b\u0012\u0004\u0012\u00020\n0\tH\u0012J\u0012\u0010=\u001a\u00020&*\b\u0012\u0004\u0012\u00020\n0\tH\u0012J\u0012\u0010>\u001a\u00020&*\b\u0012\u0004\u0012\u00020\n0\tH\u0012J\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u001e0\tH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\f¨\u0006A"}, d2 = {"Lcom/soundcloud/android/offline/TrackDownloadsStorage;", "", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "offlineDatabase", "Lcom/soundcloud/android/offline/OfflineDatabase;", "(Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/offline/OfflineDatabase;)V", "downloadedTracks", "Lio/reactivex/Single;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "getDownloadedTracks", "()Lio/reactivex/Single;", "requestedTracks", "getRequestedTracks", "resetTracksToRequested", "Lio/reactivex/Completable;", "getResetTracksToRequested", "()Lio/reactivex/Completable;", "tracksDownloadedPendingRemoval", "getTracksDownloadedPendingRemoval", "tracksToRemove", "getTracksToRemove", "unavailableTracks", "getUnavailableTracks", "dbModelsToOfflineStates", "Ljava/util/HashMap;", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "Lkotlin/collections/HashMap;", "it", "Lcom/soundcloud/android/offline/TrackDownloadsDbModel;", "modelList", "map", "deleteAllDownloads", "", "deleteWithUrn", "urn", "failFastOnMissingItem", "", "updateOrDelete", "getOfflineStateBatch", "kotlin.jvm.PlatformType", "getOfflineStates", "", "tracks", "", "markTrackAsUnavailable", "", "track", "offlineStates", "onlyOfflineTracks", "queryOfflineTracksBatch", "storeCompletedDownload", "downloadState", "Lcom/soundcloud/android/offline/DownloadState;", "writeUpdates", "offlineContentUpdates", "Lcom/soundcloud/android/offline/OfflineContentUpdates;", "markForDownload", "", "markForRestoration", "markTracksAsUnavailable", "markTracksToRemove", "toUrns", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackDownloadsStorage.kt */
public class De {
    private static final long a = TimeUnit.MINUTES.toMillis(3);
    private static final int b = 500;
    public static final a c = new a(null);
    private final C5694cGa d;
    private final Jd e;

    /* compiled from: TrackDownloadsStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final C3823mda a(boolean z, Date date, Date date2, Date date3, Date date4) {
            if (a(date, date2, date3, date4)) {
                return C3823mda.REQUESTED;
            }
            if (a(date3, date, date2, date4)) {
                return C3823mda.DOWNLOADED;
            }
            if (z) {
                if (a(date4, date, date2, date3)) {
                    return C3823mda.UNAVAILABLE;
                }
            }
            return C3823mda.NOT_OFFLINE;
        }

        private final boolean a(Date date, Date... dateArr) {
            int length = dateArr.length;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    return true;
                }
                Date date2 = dateArr[i];
                if (!date2.after(date) && !C7471uYa.a((Object) date2, (Object) date)) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                i++;
            }
        }
    }

    public De(C5694cGa cga, Jd jd) {
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(jd, "offlineDatabase");
        this.d = cga;
        this.e = jd;
    }

    public IPa<Map<C3508cda, C3823mda>> h() {
        Jd jd = this.e;
        C6840lMa a2 = Be.a.a();
        C7471uYa.a((Object) a2, "FACTORY.selectAll()");
        g c2 = Be.a.c();
        C7471uYa.a((Object) c2, "FACTORY.selectAllMapper()");
        IPa<Map<C3508cda, C3823mda>> e2 = jd.a((Xd) a2, (C6772kMa<T>) c2).e(new Le(new Je(this)));
        C7471uYa.a((Object) e2, "offlineDatabase.executeA…:dbModelsToOfflineStates)");
        return e2;
    }

    /* access modifiers changed from: private */
    public IPa<List<Be>> b(List<C3508cda> list) {
        Jd jd = this.e;
        d<Be> dVar = Be.a;
        if (list != null) {
            Object[] array = list.toArray(new C3508cda[0]);
            if (array != null) {
                C6840lMa a2 = dVar.a((C3508cda[]) array);
                C7471uYa.a((Object) a2, "FACTORY.selectBatch(it.toTypedArray())");
                g d2 = Be.a.d();
                C7471uYa.a((Object) d2, "FACTORY.selectBatchMapper()");
                return jd.a((Xd) a2, (C6772kMa<T>) d2);
            }
            throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new OVa("null cannot be cast to non-null type java.util.Collection<T>");
    }

    /* access modifiers changed from: private */
    public void c(List<C3508cda> list) {
        String str;
        f fVar = new f(this.e.a(), Be.a);
        Iterator it = list.iterator();
        while (true) {
            str = "track_downloads";
            if (!it.hasNext()) {
                break;
            }
            fVar.a((C3508cda) it.next(), Long.valueOf(this.d.a()));
            this.e.a(str, (Yd) fVar);
        }
        j jVar = new j(this.e.a(), Be.a);
        for (C3508cda a2 : list) {
            jVar.a(a2);
            this.e.b(str, (Yd) jVar);
        }
    }

    /* access modifiers changed from: private */
    public void d(List<C3508cda> list) {
        h hVar = new h(this.e.a(), Be.a);
        for (C3508cda cda : list) {
            hVar.a(Long.valueOf(this.d.a()), cda);
            a(this.e.c("track_downloads", (Yd) hVar), cda);
        }
    }

    /* access modifiers changed from: private */
    public void e(List<C3508cda> list) {
        k kVar = new k(this.e.a(), Be.a);
        for (C3508cda a2 : list) {
            kVar.a(a2, Long.valueOf(this.d.a()));
            this.e.a("track_downloads", (Yd) kVar);
        }
    }

    /* access modifiers changed from: private */
    public void f(List<C3508cda> list) {
        i iVar = new i(this.e.a(), Be.a);
        for (C3508cda cda : list) {
            iVar.a(Long.valueOf(this.d.a()), cda);
            a(this.e.c("track_downloads", (Yd) iVar), cda);
        }
    }

    public IPa<List<C3508cda>> g() {
        Jd jd = this.e;
        C6840lMa g = Be.a.g();
        C7471uYa.a((Object) g, "FACTORY.selectUnavailable()");
        g h = Be.a.h();
        C7471uYa.a((Object) h, "FACTORY.selectWithRemovalDateBeforeMapper()");
        IPa<List<C3508cda>> e2 = jd.a((Xd) g, (C6772kMa<T>) h).e(new Oe(this));
        C7471uYa.a((Object) e2, "offlineDatabase.executeA…     .map { it.toUrns() }");
        return e2;
    }

    public C6979nPa a(Id id) {
        C7471uYa.b(id, "offlineContentUpdates");
        return this.e.b(new Pe(this, id));
    }

    public IPa<Long> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        c cVar = new c(this.e.a(), Be.a);
        cVar.a(cda);
        return this.e.d("track_downloads", (Yd) cVar);
    }

    /* access modifiers changed from: private */
    public List<C3508cda> g(List<? extends Be> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (Be c2 : list) {
            arrayList.add(c2.c());
        }
        return arrayList;
    }

    public C6979nPa d() {
        l lVar = new l(this.e.a());
        lVar.a(Long.valueOf(this.d.a()));
        C6979nPa h = this.e.d("track_downloads", (Yd) lVar).h();
        C7471uYa.a((Object) h, "offlineDatabase.updateOr…         .toCompletable()");
        return h;
    }

    public IPa<List<C3508cda>> e() {
        Jd jd = this.e;
        C6840lMa e2 = Be.a.e();
        C7471uYa.a((Object) e2, "FACTORY.selectDownloadedPendingRemoval()");
        g c2 = Be.a.c();
        C7471uYa.a((Object) c2, "FACTORY.selectAllMapper()");
        IPa<List<C3508cda>> e3 = jd.a((Xd) e2, (C6772kMa<T>) c2).e(new Me(this));
        C7471uYa.a((Object) e3, "offlineDatabase.executeA…     .map { it.toUrns() }");
        return e3;
    }

    public IPa<List<C3508cda>> f() {
        long a2 = this.d.a() - a;
        Jd jd = this.e;
        C6840lMa a3 = Be.a.a(Long.valueOf(a2));
        C7471uYa.a((Object) a3, "FACTORY.selectWithRemova…(removalDelayedTimestamp)");
        g h = Be.a.h();
        C7471uYa.a((Object) h, "FACTORY.selectWithRemovalDateBeforeMapper()");
        IPa<List<C3508cda>> e2 = jd.a((Xd) a3, (C6772kMa<T>) h).e(new Ne(this));
        C7471uYa.a((Object) e2, "offlineDatabase.executeA…     .map { it.toUrns() }");
        return e2;
    }

    public long a() {
        return this.e.c("track_downloads", (Yd) new b(this.e.a()));
    }

    public IPa<List<C3508cda>> b() {
        Jd jd = this.e;
        C6840lMa b2 = Be.a.b();
        C7471uYa.a((Object) b2, "FACTORY.selectAllDownloaded()");
        g h = Be.a.h();
        C7471uYa.a((Object) h, "FACTORY.selectWithRemovalDateBeforeMapper()");
        IPa<List<C3508cda>> e2 = jd.a((Xd) b2, (C6772kMa<T>) h).e(new Ee(this));
        C7471uYa.a((Object) e2, "offlineDatabase.executeA…     .map { it.toUrns() }");
        return e2;
    }

    private void a(long j, C3508cda cda) {
        if (j < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to commit updates, item not present in downloads table: ");
            sb.append(cda);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public IPa<Map<C3508cda, C3823mda>> a(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "tracks");
        IPa<Map<C3508cda, C3823mda>> e2 = APa.a((Iterable<? extends T>) C7110pIa.a(new ArrayList(collection), b)).g(new Le(new Fe(this))).a((Callable<? extends U>) Ge.a, (C6436fQa<? super U, ? super T>) new He<Object,Object>(this)).e(Ie.a);
        C7471uYa.a((Object) e2, "Observable.fromIterable(…              .map { it }");
        return e2;
    }

    public IPa<List<C3508cda>> c() {
        Jd jd = this.e;
        C6840lMa f = Be.a.f();
        C7471uYa.a((Object) f, "FACTORY.selectRequested()");
        g h = Be.a.h();
        C7471uYa.a((Object) h, "FACTORY.selectWithRemovalDateBeforeMapper()");
        IPa<List<C3508cda>> e2 = jd.a((Xd) f, (C6772kMa<T>) h).e(new Ke(this));
        C7471uYa.a((Object) e2, "offlineDatabase.executeA…     .map { it.toUrns() }");
        return e2;
    }

    public boolean b(C3508cda cda) {
        C7471uYa.b(cda, "track");
        k kVar = new k(this.e.a(), Be.a);
        kVar.a(cda, Long.valueOf(this.d.a()));
        return kVar.v() > 0;
    }

    public boolean a(C4152qc qcVar) {
        C7471uYa.b(qcVar, "downloadState");
        h hVar = new h(this.e.a(), Be.a);
        hVar.a(Long.valueOf(qcVar.b), qcVar.c());
        return hVar.v() > 0;
    }

    /* access modifiers changed from: private */
    public HashMap<C3508cda, C3823mda> a(List<? extends Be> list) {
        HashMap<C3508cda, C3823mda> hashMap = new HashMap<>();
        a(list, hashMap);
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r7 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r8 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r4 != null) goto L_0x002f;
     */
    public HashMap<C3508cda, C3823mda> a(List<? extends Be> list, HashMap<C3508cda, C3823mda> hashMap) {
        Date date;
        Date date2;
        Date date3;
        Date date4;
        for (Be be : list) {
            C3508cda c2 = be.c();
            a aVar = c;
            Long d2 = be.d();
            if (d2 != null) {
                date = C7179qIa.d(d2.longValue());
            }
            date = new Date(0);
            Long b2 = be.b();
            if (b2 != null) {
                date2 = C7179qIa.d(b2.longValue());
            }
            date2 = new Date(0);
            Long f = be.f();
            if (f != null) {
                date3 = C7179qIa.d(f.longValue());
            }
            date3 = new Date(0);
            Long e2 = be.e();
            if (e2 != null) {
                date4 = C7179qIa.d(e2.longValue());
                if (date4 != null) {
                    hashMap.put(c2, aVar.a(true, date, date2, date3, date4));
                }
            }
            date4 = new Date(0);
            hashMap.put(c2, aVar.a(true, date, date2, date3, date4));
        }
        return hashMap;
    }
}
