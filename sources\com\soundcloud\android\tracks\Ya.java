package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 52\u00020\u0001:\u00015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0012J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0012J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0012J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0012J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0012J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0012J\u0016\u0010\u001f\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0012J\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100!0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0012J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u000e2\u0006\u0010%\u001a\u00020\u0010H\u0016J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0#0\u000e2\u0006\u0010%\u001a\u00020\u0010H\u0016J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020$0*2\u0006\u0010%\u001a\u00020\u0010H\u0012J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020'0*2\u0006\u0010%\u001a\u00020\u0010H\u0012J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0*2\u0006\u0010%\u001a\u00020\u0010H\u0012J(\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020'0.0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017J\u0016\u0010/\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0012J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u00104\u001a\b\u0012\u0004\u0012\u00020'0\u000f*\u00020\u0015H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/soundcloud/android/tracks/TrackStorage;", "", "propellerRx", "Lcom/soundcloud/propeller/rx/PropellerRx;", "storeTracksCommand", "Lcom/soundcloud/android/commands/StoreTracksCommand;", "(Lcom/soundcloud/propeller/rx/PropellerRx;Lcom/soundcloud/android/commands/StoreTracksCommand;)V", "asyncStoreTracks", "Lio/reactivex/Single;", "Lcom/soundcloud/propeller/WriteResult;", "tracks", "", "Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack;", "availableTracks", "Lio/reactivex/Observable;", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "requestedTracks", "batchedAvailableTracks", "urns", "batchedTracks", "Lcom/soundcloud/propeller/QueryResult;", "buildAvailableTracksQuery", "Lcom/soundcloud/propeller/query/Query;", "trackUrns", "buildPermalinkQuery", "permalink", "", "buildTrackDescriptionQuery", "trackUrn", "buildTrackQuery", "buildTracksQuery", "changedTracks", "", "liveFullTrack", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/foundation/domain/tracks/FullTrack;", "urn", "liveTrack", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "liveTracks", "loadFullTrack", "Lio/reactivex/Maybe;", "loadTrack", "loadTrackDescription", "loadTracks", "", "storeTracks", "tracksChanged", "", "writeResult", "urnForPermalink", "toListOfTracks", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackStorage.kt */
public class Ya {
    /* access modifiers changed from: private */
    public static final C1564oT a = new C1564oT();
    /* access modifiers changed from: private */
    public static final C7744yVa b = BVa.a(Xa.a);
    public static final a c = new a(null);
    /* access modifiers changed from: private */
    public final C4898FLa d;
    private final C1502mT e;

    /* compiled from: TrackStorage.kt */
    public static final class a {
        static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(a.class), "trackChangeSubject", "getTrackChangeSubject()Lio/reactivex/subjects/BehaviorSubject;"))};

        private a() {
        }

        /* access modifiers changed from: private */
        public final C3509cea b(C5326TKa tKa) {
            C5326TKa tKa2 = tKa;
            long d = tKa2.d(g.h.d());
            C3508cda d2 = C3508cda.d(tKa2.d(g.d.d()));
            C7471uYa.a((Object) d2, "Urn.forTrack(cursorReader.getLong(ID.name()))");
            String e = tKa2.e(g.f.d());
            C7471uYa.a((Object) e, "cursorReader.getString(TITLE.name())");
            Date b = tKa2.b(g.e.d());
            C7471uYa.a((Object) b, "cursorReader.getDateFrom…estamp(CREATED_AT.name())");
            long d3 = tKa2.d(g.l.d());
            long d4 = tKa2.d(g.m.d());
            boolean c = Cxb.c("private", tKa2.e(g.u.d()), true);
            int c2 = tKa2.c(g.n.d());
            int c3 = tKa2.c(g.q.d());
            int c4 = tKa2.c(g.o.d());
            int c5 = tKa2.c(g.p.d());
            boolean a2 = tKa2.a(g.F.d());
            boolean a3 = tKa2.a(g.r.d());
            boolean a4 = tKa2.a(g.x.d());
            boolean a5 = tKa2.a(g.z.d());
            boolean a6 = tKa2.a(g.B.d());
            boolean a7 = tKa2.a(g.C.d());
            boolean a8 = tKa2.a(g.D.d());
            String e2 = tKa2.e(g.y.d());
            int i = c5;
            C7471uYa.a((Object) e2, "cursorReader.getString(MONETIZATION_MODEL.name())");
            String e3 = tKa2.e(g.j.d());
            String str = e2;
            C7471uYa.a((Object) e3, "cursorReader.getString(PERMALINK_URL.name())");
            String e4 = tKa2.e(g.E.d());
            String str2 = e3;
            String e5 = tKa2.e(g.v.d());
            int i2 = c4;
            C7471uYa.a((Object) e5, "cursorReader.getString(POLICY.name())");
            String d5 = g.w.d();
            int i3 = c3;
            C7471uYa.a((Object) d5, "POLICY_LAST_UPDATED_AT.name()");
            boolean z = c;
            int i4 = c2;
            C3752dea dea = new C3752dea(e5, a(tKa2, d5, new Date(0)));
            String e6 = tKa2.e(g.k.d());
            C7471uYa.a((Object) e6, "cursorReader.getString(WAVEFORM_URL.name())");
            String e7 = tKa2.e(g.g.d());
            C7471uYa.a((Object) e7, "cursorReader.getString(CREATOR_NAME.name())");
            C3508cda f = d == ((long) -1) ? C3508cda.a : C3508cda.f(d);
            C7471uYa.a((Object) f, "if (creatorId == Consts.…se Urn.forUser(creatorId)");
            int i5 = i3;
            String str3 = str2;
            String str4 = e6;
            C3509cea cea = new C3509cea(d2, e, b, d3, d4, z, i4, i5, i2, i, a2, a3, a4, a5, a6, a7, a8, str, str3, e4, dea, str4, e7, f, tKa2.a(g.i.d()), tKa2.e(g.s.d()), tKa2.e(g.G.d()), tKa2.a(g.A.d()));
            return cea;
        }

        public final C6713jVa<List<C3508cda>> a() {
            C7744yVa b = Ya.b;
            a aVar = Ya.c;
            DZa dZa = a[0];
            return (C6713jVa) b.getValue();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final C4928GKa<C3509cea> a(C5326TKa tKa) {
            C7471uYa.b(tKa, "cursorReader");
            C4928GKa<C3509cea> b = C4928GKa.b(b(tKa));
            C7471uYa.a((Object) b, "Optional.fromNullable(tr…rsorReader(cursorReader))");
            return b;
        }

        private final Date a(C5326TKa tKa, String str, Date date) {
            if (!tKa.g(str)) {
                return date;
            }
            Date b = tKa.b(str);
            C7471uYa.a((Object) b, "cursorReader.getDateFromTimestamp(columnName)");
            return b;
        }
    }

    public Ya(C4898FLa fLa, C1502mT mTVar) {
        C7471uYa.b(fLa, "propellerRx");
        C7471uYa.b(mTVar, "storeTracksCommand");
        this.d = fLa;
        this.e = mTVar;
    }

    /* access modifiers changed from: private */
    public C7531vPa<C3493aea> e(C3508cda cda) {
        C7531vPa<C3493aea> a2 = f(cda).a((C7669xPa<? extends U>) g(cda), (C6504gQa<? super T, ? super U, ? extends R>) new C6180kb<Object,Object,Object>());
        C7471uYa.a((Object) a2, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return a2;
    }

    /* access modifiers changed from: private */
    public C7531vPa<C3509cea> f(C3508cda cda) {
        C7531vPa<C3509cea> f = this.d.a(d(cda)).h(C6186mb.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) nb.a).f();
        C7471uYa.a((Object) f, "propellerRx.query(buildT…          .firstElement()");
        return f;
    }

    private C7531vPa<String> g(C3508cda cda) {
        C7531vPa<String> f = this.d.a(c(cda)).h(pb.a).k(qb.a).f();
        C7471uYa.a((Object) f, "propellerRx.query(buildT…          .firstElement()");
        return f;
    }

    private APa<Set<C3508cda>> h(List<C3508cda> list) {
        APa<Set<C3508cda>> d2 = c.a().h(new C6159db(list)).d();
        C7471uYa.a((Object) d2, "trackChangeSubject\n     …  .distinctUntilChanged()");
        return d2;
    }

    /* access modifiers changed from: private */
    public APa<C3508cda> d(List<C3508cda> list) {
        APa<C3508cda> c2 = APa.a((Iterable<? extends T>) C2063HD.a(list, 200)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6153bb<Object,Object>(this));
        C7471uYa.a((Object) c2, "Observable.fromIterable(…_URN_MAPPER)) }\n        }");
        return c2;
    }

    public IPa<Map<C3508cda, C3509cea>> c(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        IPa<Map<C3508cda, C3509cea>> e2 = b(list).g().e(rb.a);
        C7471uYa.a((Object) e2, "liveTracks(urns).firstOr….associateBy { it.urn } }");
        return e2;
    }

    private C6975nLa c(C3508cda cda) {
        String str = "_type";
        C7182qLa d2 = ((C6975nLa) C6975nLa.a(_ea.SoundView.name()).a(k.F).d("_id", (Object) Long.valueOf(cda.c()))).d(str, (Object) Integer.valueOf(0));
        C7471uYa.a((Object) d2, "Query.from(Table.SoundVi…hereEq(_TYPE, TYPE_TRACK)");
        return (C6975nLa) d2;
    }

    private C6975nLa d(C3508cda cda) {
        C7182qLa d2 = C6975nLa.a(g.c).a("*").d(g.d.d(), (Object) Long.valueOf(cda.c()));
        C7471uYa.a((Object) d2, "Query.from(Tables.TrackV…me(), trackUrn.numericId)");
        return (C6975nLa) d2;
    }

    /* access modifiers changed from: private */
    public APa<C5631bLa> e(List<C3508cda> list) {
        APa<C5631bLa> c2 = APa.a((Iterable<? extends T>) C2063HD.a(list, 200)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6156cb<Object,Object>(this));
        C7471uYa.a((Object) c2, "Observable.fromIterable(…y(buildTracksQuery(it)) }");
        return c2;
    }

    public APa<List<C3509cea>> b(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        APa<List<C3509cea>> g = h(list).g(new C6177jb(this, list));
        C7471uYa.a((Object) g, "changedTracks(urns).flat…              }\n        }");
        return g;
    }

    /* access modifiers changed from: private */
    public C6975nLa f(List<C3508cda> list) {
        C6975nLa nla = (C6975nLa) C6975nLa.a(e.c).a(e.d.a("_id")).a(e.e, (Object) Integer.valueOf(0));
        C5085LLa lLa = e.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C3508cda c2 : list) {
            arrayList.add(Long.valueOf(c2.c()));
        }
        C7182qLa a2 = nla.a(lLa, (Collection<?>) arrayList);
        C7471uYa.a((Object) a2, "Query.from(Tables.Sounds…rns.map { it.numericId })");
        return (C6975nLa) a2;
    }

    /* access modifiers changed from: private */
    public C6975nLa g(List<C3508cda> list) {
        C6975nLa a2 = C6975nLa.a(g.c).a("*");
        String d2 = g.d.d();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (C3508cda c2 : list) {
            arrayList.add(Long.valueOf(c2.c()));
        }
        C7182qLa b2 = a2.b(d2, (Collection<?>) arrayList);
        C7471uYa.a((Object) b2, "Query.from(Tables.TrackV…rns.map { it.numericId })");
        return (C6975nLa) b2;
    }

    public APa<C4928GKa<C3509cea>> b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        APa<C4928GKa<C3509cea>> f = h(C6850lWa.a(cda)).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C6171hb<Object,Object>(this, cda));
        C7471uYa.a((Object) f, "changedTracks(listOf(urn…l.absent())\n            }");
        return f;
    }

    public C7531vPa<C3508cda> a(String str) {
        C7471uYa.b(str, "permalink");
        if (!Cxb.b(str, "/", false, 2, null)) {
            C7531vPa<C3508cda> f = this.d.a(b(str)).a((C7256rQa<? super T>) tb.a).h(vb.a).f();
            C7471uYa.a((Object) f, "propellerRx.query(buildP…          .firstElement()");
            return f;
        }
        throw new IllegalArgumentException("Permalink must not start with a '/' and must not be a url.");
    }

    public C6499gLa b(Iterable<Yda> iterable) {
        C7471uYa.b(iterable, "tracks");
        C6499gLa gla = (C6499gLa) this.e.a(iterable);
        C7471uYa.a((Object) gla, "writeResult");
        a(gla, iterable);
        return gla;
    }

    private C6975nLa b(String str) {
        C6975nLa a2 = C6975nLa.a(g.c).a(g.d);
        C5085LLa lLa = g.j;
        StringBuilder sb = new StringBuilder();
        sb.append("https://soundcloud.com/");
        sb.append(str);
        C6975nLa a3 = ((C6975nLa) a2.a(lLa, sb.toString())).a(1);
        C7471uYa.a((Object) a3, "Query.from(Tables.TrackV…                .limit(1)");
        return a3;
    }

    public APa<C4928GKa<C3493aea>> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        APa<C4928GKa<C3493aea>> f = h(C6850lWa.a(cda)).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C6165fb<Object,Object>(this, cda));
        C7471uYa.a((Object) f, "changedTracks(listOf(urn…l.absent())\n            }");
        return f;
    }

    /* access modifiers changed from: private */
    public List<C3509cea> a(C5631bLa bla) {
        List<C3509cea> b2 = bla.b(sb.a);
        C7471uYa.a((Object) b2, "toList { trackFromCursorReader(it) }");
        return b2;
    }

    public APa<List<C3508cda>> a(List<C3508cda> list) {
        C7471uYa.b(list, "requestedTracks");
        APa<List<C3508cda>> g = h(list).g(new _a(this, list));
        C7471uYa.a((Object) g, "changedTracks(requestedT…questedTracks).toList() }");
        return g;
    }

    public IPa<C6499gLa> a(Iterable<Yda> iterable) {
        C7471uYa.b(iterable, "tracks");
        IPa<C6499gLa> c2 = this.e.c(iterable).c((C6776kQa<? super T>) new Za<Object>(this, iterable));
        C7471uYa.a((Object) c2, "storeTracksCommand.toSin…acksChanged(it, tracks) }");
        return c2;
    }

    /* access modifiers changed from: private */
    public void a(C6499gLa gla, Iterable<Yda> iterable) {
        if (gla.b()) {
            C6713jVa a2 = c.a();
            ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
            for (Yda w : iterable) {
                arrayList.add(w.w());
            }
            a2.a(arrayList);
        }
    }
}
