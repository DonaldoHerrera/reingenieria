package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.j;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u0000 %2\u00020\u0001:\u0001%B9\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016J(\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u00140\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0016J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0012J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0012J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00170\u0010H\u0016J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019H\u0016J\b\u0010$\u001a\u00020\u0015H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/soundcloud/android/policies/PolicyOperations;", "Lcom/soundcloud/android/foundation/playqueue/BlockedEntitiesProvider;", "clearTableCommand", "Lcom/soundcloud/android/commands/ClearTableCommand;", "updatePoliciesCommand", "Lcom/soundcloud/android/policies/UpdatePoliciesCommand;", "loadPolicyUpdateTimeCommand", "Lcom/soundcloud/android/policies/LoadPolicyUpdateTimeCommand;", "scheduler", "Lio/reactivex/Scheduler;", "policyStorage", "Lcom/soundcloud/android/policies/PolicyStorage;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "(Lcom/soundcloud/android/commands/ClearTableCommand;Lcom/soundcloud/android/policies/UpdatePoliciesCommand;Lcom/soundcloud/android/policies/LoadPolicyUpdateTimeCommand;Lio/reactivex/Scheduler;Lcom/soundcloud/android/policies/PolicyStorage;Lcom/soundcloud/android/foundation/events/Analytics;)V", "blockedEntities", "Lio/reactivex/Single;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "blockedStatuses", "", "", "urns", "", "fetchAndStorePolicies", "", "Lcom/soundcloud/android/foundation/policies/ApiPolicyInfoAndMedia;", "getMostRecentPolicyUpdateTimestamp", "", "handlePolicyUpdateFailure", "", "error", "", "isBackgroundUpdate", "refreshedTrackPolicies", "updatePolicies", "updateTrackPolicies", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: dta reason: default package and case insensitive filesystem */
/* compiled from: PolicyOperations.kt */
public class C6334dta implements j {
    public static final long a = TimeUnit.HOURS.toMillis(24);
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public final C0514cT c;
    /* access modifiers changed from: private */
    public final C7636wta d;
    private final C5670bta e;
    private final HPa f;
    private final C6946mta g;
    private final C3700b h;

    /* renamed from: dta$a */
    /* compiled from: PolicyOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6334dta(C0514cT cTVar, C7636wta wta, C5670bta bta, HPa hPa, C6946mta mta, C3700b bVar) {
        C7471uYa.b(cTVar, "clearTableCommand");
        C7471uYa.b(wta, "updatePoliciesCommand");
        C7471uYa.b(bta, "loadPolicyUpdateTimeCommand");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(mta, "policyStorage");
        C7471uYa.b(bVar, "analytics");
        this.c = cTVar;
        this.d = wta;
        this.e = bta;
        this.f = hPa;
        this.g = mta;
        this.h = bVar;
    }

    public IPa<List<C3508cda>> c() {
        IPa<List<C3508cda>> b2 = this.g.c().d((C6776kQa<? super T>) new C6402eta<Object>(this)).g(new C6470fta(this)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) C6538gta.a).h(C6606hta.a).r().a((C6776kQa<? super Throwable>) new C6674ita<Object>(this)).b(this.f);
        C7471uYa.a((Object) b2, "policyStorage.tracksForP…  .subscribeOn(scheduler)");
        return b2;
    }

    public boolean d() {
        try {
            List b2 = this.g.b();
            C7636wta wta = this.d;
            C7471uYa.a((Object) b2, "urns");
            return true ^ wta.a((Collection<C3508cda>) b2).isEmpty();
        } catch (Exception e2) {
            a(e2, true);
            return false;
        }
    }

    public IPa<Long> b() {
        IPa<Long> b2 = this.e.c(RVa.a).b(this.f);
        C7471uYa.a((Object) b2, "loadPolicyUpdateTimeComm…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<Map<C3508cda, Boolean>> a(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        IPa<Map<C3508cda, Boolean>> b2 = this.g.a(list).b(this.f);
        C7471uYa.a((Object) b2, "policyStorage.loadBlocke…s).subscribeOn(scheduler)");
        return b2;
    }

    private IPa<Collection<C3912xea>> b(Collection<C3508cda> collection) {
        IPa<Collection<C3912xea>> b2 = this.d.c(collection).b(this.f);
        C7471uYa.a((Object) b2, "updatePoliciesCommand.to…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<Set<C3508cda>> a() {
        IPa<Set<C3508cda>> b2 = this.g.a().b(this.f);
        C7471uYa.a((Object) b2, "policyStorage.loadBlocke…().subscribeOn(scheduler)");
        return b2;
    }

    public IPa<Collection<C3912xea>> a(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "urns");
        return b(collection);
    }

    /* access modifiers changed from: private */
    public void a(Throwable th, boolean z) {
        Oaa oaa;
        if (th instanceof C7360sta) {
            th = th.getCause();
        }
        if (th instanceof C5529_Ka) {
            oaa = Oaa.b(z);
        } else {
            oaa = Oaa.a(z);
        }
        C3700b bVar = this.h;
        C7471uYa.a((Object) oaa, "failureEvent");
        bVar.a((J) oaa);
    }
}
