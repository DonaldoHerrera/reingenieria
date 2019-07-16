package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/tracks/TrackPolicyStorage;", "", "propeller", "Lcom/soundcloud/propeller/rx/PropellerRx;", "(Lcom/soundcloud/propeller/rx/PropellerRx;)V", "buildQuery", "Lcom/soundcloud/propeller/query/Query;", "trackUrns", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "staleTime", "Ljava/util/Date;", "filterForStalePolicies", "Lio/reactivex/Single;", "PolicyTrackUrnMapper", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackPolicyStorage.kt */
public final class Pa {
    /* access modifiers changed from: private */
    public final C4898FLa a;

    /* compiled from: TrackPolicyStorage.kt */
    public static final class a extends C4991ILa<C3508cda> {
        public C3508cda a(C5326TKa tKa) {
            C7471uYa.b(tKa, "cursorReader");
            C3508cda d = C3508cda.d(tKa.c(f.d));
            C7471uYa.a((Object) d, "Urn.forTrack(cursorReade….TrackPolicies.TRACK_ID))");
            return d;
        }
    }

    public Pa(C4898FLa fLa) {
        C7471uYa.b(fLa, "propeller");
        this.a = fLa;
    }

    /* access modifiers changed from: private */
    public final C6975nLa b(Set<C3508cda> set, Date date) {
        C6975nLa a2 = C6975nLa.a(f.c).a(f.d);
        C5085LLa lLa = f.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) set, 10));
        for (C3508cda c : set) {
            arrayList.add(Long.valueOf(c.c()));
        }
        C7182qLa d = ((C6975nLa) a2.a(lLa, (Collection<?>) arrayList)).d(f.m, (Object) Long.valueOf(date.getTime()));
        C7471uYa.a((Object) d, "Query.from(Tables.TrackP…_UPDATED, staleTime.time)");
        return (C6975nLa) d;
    }

    public final IPa<Set<C3508cda>> a(Set<C3508cda> set, Date date) {
        C7471uYa.b(set, "trackUrns");
        C7471uYa.b(date, "staleTime");
        IPa<Set<C3508cda>> d = APa.a((Iterable<? extends T>) C7676xWa.b((Iterable) set, 800)).g(new Qa(this, date)).h(Ra.a).a((C6504gQa<T, T, T>) Sa.a).d(SWa.a());
        C7471uYa.a((Object) d, "Observable.fromIterable(…       .toSingle(setOf())");
        return d;
    }
}
