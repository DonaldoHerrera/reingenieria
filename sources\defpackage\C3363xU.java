package defpackage;

import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.settings.streamingquality.e;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001cBG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\f\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0012J\f\u0010\u001b\u001a\u00020\u0019*\u00020\u001aH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/soundcloud/android/configuration/PlanChangeOperations;", "", "configurationOperations", "Lcom/soundcloud/android/configuration/ConfigurationOperations;", "pendingPlanOperations", "Lcom/soundcloud/android/configuration/PendingPlanOperations;", "policyOperations", "Lcom/soundcloud/android/policies/PolicyOperations;", "playSessionController", "Lcom/soundcloud/android/playback/PlaySessionController;", "offlineContentOperations", "Lcom/soundcloud/android/offline/OfflineContentOperations;", "streamingQualitySettings", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "mediaStreamsRepository", "Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsRepository;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "(Lcom/soundcloud/android/configuration/ConfigurationOperations;Lcom/soundcloud/android/configuration/PendingPlanOperations;Lcom/soundcloud/android/policies/PolicyOperations;Lcom/soundcloud/android/playback/PlaySessionController;Lcom/soundcloud/android/offline/OfflineContentOperations;Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsRepository;Lcom/soundcloud/rx/eventbus/EventBus;)V", "awaitAccountDowngrade", "Lio/reactivex/Observable;", "awaitAccountUpgrade", "plan", "Lcom/soundcloud/android/configuration/plans/Plan;", "isFreeTier", "", "Lcom/soundcloud/android/configuration/Configuration;", "isMidTier", "PlanChangedSteps", "base_release"}, mv = {1, 1, 15})
/* renamed from: xU reason: default package and case insensitive filesystem */
/* compiled from: PlanChangeOperations.kt */
public class C3363xU {
    private final C2325UT a;
    /* access modifiers changed from: private */
    public final C3184oU b;
    /* access modifiers changed from: private */
    public final C6334dta c;
    /* access modifiers changed from: private */
    public final C4412qb d;
    /* access modifiers changed from: private */
    public final C4197yd e;
    /* access modifiers changed from: private */
    public final e f;
    /* access modifiers changed from: private */
    public final C4735ADa g;
    /* access modifiers changed from: private */
    public final C5327TLa h;

    /* renamed from: xU$a */
    /* compiled from: PlanChangeOperations.kt */
    private final class a implements FPa<Object, Object> {
        public a() {
        }

        public APa<Object> a(APa<Object> aPa) {
            C7471uYa.b(aPa, "source");
            APa<Object> a2 = aPa.c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3263sU<Object,Object>(this)).d((C6776kQa<? super T>) new C3283tU<Object>(this)).e((C6776kQa<? super VPa>) new C3303uU<Object>(this)).a((C6368eQa) new C3323vU(this)).c((C6776kQa<? super Throwable>) new C3343wU<Object>(this)).a(Object.class);
            C7471uYa.a((Object) a2, "source.flatMap<List<Urn>…   .cast(Any::class.java)");
            return a2;
        }
    }

    public C3363xU(C2325UT ut, C3184oU oUVar, C6334dta dta, C4412qb qbVar, C4197yd ydVar, e eVar, C4735ADa aDa, C5327TLa tLa) {
        C7471uYa.b(ut, "configurationOperations");
        C7471uYa.b(oUVar, "pendingPlanOperations");
        C7471uYa.b(dta, "policyOperations");
        C7471uYa.b(qbVar, "playSessionController");
        C7471uYa.b(ydVar, "offlineContentOperations");
        C7471uYa.b(eVar, "streamingQualitySettings");
        C7471uYa.b(aDa, "mediaStreamsRepository");
        C7471uYa.b(tLa, "eventBus");
        this.a = ut;
        this.b = oUVar;
        this.c = dta;
        this.d = qbVar;
        this.e = ydVar;
        this.f = eVar;
        this.g = aDa;
        this.h = tLa;
    }

    /* access modifiers changed from: private */
    public boolean b(C2212OT ot) {
        return ot.f().a() == C2455aV.MID_TIER;
    }

    public APa<Object> a() {
        APa<Object> a2 = this.a.a().g().d((C6776kQa<? super T>) new C3383yU<Object>(this)).k(new C3403zU(this)).a((FPa<? super T, ? extends R>) new a<Object,Object>());
        C7471uYa.a((Object) a2, "configurationOperations.…mpose(PlanChangedSteps())");
        return a2;
    }

    public APa<Object> a(C2455aV aVVar) {
        C7471uYa.b(aVVar, "plan");
        APa<Object> a2 = this.a.a(aVVar).g().a((FPa<? super T, ? extends R>) new a<Object,Object>());
        C7471uYa.a((Object) a2, "configurationOperations.…mpose(PlanChangedSteps())");
        return a2;
    }

    /* access modifiers changed from: private */
    public boolean a(C2212OT ot) {
        return ot.f().a() == C2455aV.FREE_TIER;
    }
}
