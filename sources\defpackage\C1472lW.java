package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001:B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0012J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0012H\u0012J\u0016\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120 0\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0012J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0012J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020#0'2\u0006\u0010(\u001a\u00020\u0012H\u0016J(\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0*0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00110\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0016\u0010,\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J0\u0010-\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\t0/H\u0012J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0012J\u001e\u00102\u001a\b\u0012\u0004\u0012\u0002030\b2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0016H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120'2\u0006\u00106\u001a\u00020\u001aH\u0016J\u0016\u00107\u001a\u0004\u0018\u000108*\u00020%2\u0006\u00109\u001a\u00020\u001aH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/soundcloud/android/data/user/UserStorage;", "", "propeller", "Lcom/soundcloud/propeller/rx/PropellerRx;", "storeUsersCommand", "Lcom/soundcloud/android/data/user/StoreUsersCommand;", "(Lcom/soundcloud/propeller/rx/PropellerRx;Lcom/soundcloud/android/data/user/StoreUsersCommand;)V", "asyncStoreUsers", "Lio/reactivex/Single;", "Lcom/soundcloud/propeller/WriteResult;", "users", "", "Lcom/soundcloud/android/foundation/domain/users/ApiUser;", "batchedUsers", "Lio/reactivex/Observable;", "Lcom/soundcloud/propeller/QueryResult;", "urns", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "buildContentValuesForFollowersCount", "Landroid/content/ContentValues;", "updatedFollowersCount", "", "buildPermalinkQuery", "Lcom/soundcloud/propeller/query/Query;", "identifier", "", "buildUserQuery", "userUrn", "buildUsersQuery", "userUrns", "changedUsers", "", "requestedUsers", "fromCursorReader", "Lcom/soundcloud/android/foundation/domain/users/User;", "cursorReader", "Lcom/soundcloud/propeller/CursorReader;", "loadUser", "Lio/reactivex/Maybe;", "urn", "loadUserMap", "", "loadUsers", "storeUsers", "storeUsersAndEmitUserChange", "storeFunc", "Lkotlin/Function1;", "toUserList", "queryResults", "updateFollowersCount", "Lcom/soundcloud/propeller/ChangeResult;", "followersCount", "urnForPermalink", "permalink", "dateOrNull", "Ljava/util/Date;", "column", "Companion", "user_release"}, mv = {1, 1, 15})
/* renamed from: lW reason: default package and case insensitive filesystem */
/* compiled from: UserStorage.kt */
public class C1472lW {
    /* access modifiers changed from: private */
    public static final C7744yVa a = BVa.a(C1441kW.a);
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public final C4898FLa c;
    /* access modifiers changed from: private */
    public final C0515cW d;

    /* renamed from: lW$a */
    /* compiled from: UserStorage.kt */
    public static final class a {
        static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(a.class), "userChangeSubject", "getUserChangeSubject()Lio/reactivex/subjects/BehaviorSubject;"))};

        private a() {
        }

        /* access modifiers changed from: private */
        public final C6713jVa<Iterable<C3508cda>> a() {
            C7744yVa a2 = C1472lW.a;
            a aVar = C1472lW.b;
            DZa dZa = a[0];
            return (C6713jVa) a2.getValue();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C1472lW(C4898FLa fLa, C0515cW cWVar) {
        C7471uYa.b(fLa, "propeller");
        C7471uYa.b(cWVar, "storeUsersCommand");
        this.c = fLa;
        this.d = cWVar;
    }

    private APa<C5631bLa> c(List<C3508cda> list) {
        APa<C5631bLa> c2 = APa.a((Iterable<? extends T>) C7676xWa.b((Iterable) list, 200)).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C1565oW<Object,Object>(this));
        C7471uYa.a((Object) c2, "Observable.fromIterable(…ry(buildUsersQuery(it)) }");
        return c2;
    }

    /* access modifiers changed from: private */
    public C6975nLa d(List<C3508cda> list) {
        C6975nLa a2 = C6975nLa.a(h.c);
        C5085LLa lLa = h.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3508cda c2 : list) {
            arrayList.add(Long.valueOf(c2.c()));
        }
        C7182qLa a3 = a2.a(lLa, (Collection<?>) arrayList);
        C7471uYa.a((Object) a3, "Query.from(Tables.Users.…rns.map { it.numericId })");
        return (C6975nLa) a3;
    }

    private APa<Set<C3508cda>> e(List<C3508cda> list) {
        APa<Set<C3508cda>> d2 = b.a().h(new C1596pW(list)).d();
        C7471uYa.a((Object) d2, "userChangeSubject\n      …  .distinctUntilChanged()");
        return d2;
    }

    /* access modifiers changed from: private */
    public List<C3784hea> f(List<? extends C5631bLa> list) {
        ArrayList arrayList = new ArrayList();
        for (C5631bLa it : list) {
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                C5326TKa tKa = (C5326TKa) it2.next();
                C7471uYa.a((Object) tKa, "cursorReader");
                arrayList.add(a(tKa));
            }
        }
        return arrayList;
    }

    public IPa<List<C3784hea>> b(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        IPa<List<C3784hea>> e = c(list).r().e(new C1775vW(this));
        C7471uYa.a((Object) e, "batchedUsers(urns).toLis…p { this.toUserList(it) }");
        return e;
    }

    public C6499gLa b(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "users");
        return a(iterable, (_Xa<? super Iterable<C3776gea>, ? extends C6499gLa>) new C1805wW<Object,Object>(this.d));
    }

    private C6975nLa b(String str) {
        C6975nLa a2 = ((C6975nLa) C6975nLa.a(h.c).a(h.d).a(h.e, str)).a(1);
        C7471uYa.a((Object) a2, "Query.from(Tables.Users.…er)\n            .limit(1)");
        return a2;
    }

    public C7531vPa<C3784hea> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C7531vPa<C3784hea> f = this.c.a(b(cda)).a((C7256rQa<? super T>) C1626qW.a).h(new C1685sW(this)).f();
        C7471uYa.a((Object) f, "propeller.query(buildUse…          .firstElement()");
        return f;
    }

    private C6975nLa b(C3508cda cda) {
        return d(C6850lWa.a(cda));
    }

    public APa<Map<C3508cda, C3784hea>> a(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        APa<Map<C3508cda, C3784hea>> h = e(list).g(new C1715tW(this, list)).h(C1745uW.a);
        C7471uYa.a((Object) h, "changedUsers(urns).flatM….associateBy { it.urn } }");
        return h;
    }

    public C7531vPa<C3508cda> a(String str) {
        C7471uYa.b(str, "permalink");
        if (!Cxb.b(str, "/", false, 2, null)) {
            C7531vPa<C3508cda> f = this.c.a(b(str)).a((C7256rQa<? super T>) C1835xW.a).h(C1895zW.a).f();
            C7471uYa.a((Object) f, "propeller.query(buildPer…          .firstElement()");
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Permalink must not start with a '/' and must not be a url. Found ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public IPa<C5266RKa> a(C3508cda cda, long j) {
        C7471uYa.b(cda, "userUrn");
        IPa<C5266RKa> g = this.c.a((C5116MLa) h.c, a(j), C6907mLa.a().a(h.d, (Object) Long.valueOf(cda.c()))).g();
        C7471uYa.a((Object) g, "propeller.update(Tables.…umericId)).firstOrError()");
        return g;
    }

    public IPa<C6499gLa> a(Iterable<C3776gea> iterable) {
        C7471uYa.b(iterable, "users");
        IPa<C6499gLa> c2 = IPa.c((Callable<? extends T>) new C1503mW<Object>(this, iterable)).c((C6776kQa<? super T>) new C1534nW<Object>(iterable));
        C7471uYa.a((Object) c2, "Single.fromCallable { st…t(users.map { it.urn }) }");
        return c2;
    }

    private C6499gLa a(Iterable<C3776gea> iterable, _Xa<? super Iterable<C3776gea>, ? extends C6499gLa> _xa) {
        C6499gLa gla = (C6499gLa) _xa.invoke(iterable);
        if (gla.b()) {
            C6713jVa a2 = b.a();
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
            for (C3776gea l : iterable) {
                arrayList.add(l.l());
            }
            a2.a(arrayList);
        }
        return gla;
    }

    private ContentValues a(long j) {
        ContentValues a2 = C5296SKa.b().a(h.k, j).a();
        C7471uYa.a((Object) a2, "ContentValuesBuilder\n   …Count)\n            .get()");
        return a2;
    }

    /* access modifiers changed from: private */
    public C3784hea a(C5326TKa tKa) {
        C5326TKa tKa2 = tKa;
        C3508cda f = C3508cda.f(tKa2.d(h.d.d()));
        C7471uYa.a((Object) f, "Urn.forUser(cursorReader…Tables.Users._ID.name()))");
        String e = tKa2.e(h.e.d());
        C7471uYa.a((Object) e, "cursorReader.getString(T…s.Users.PERMALINK.name())");
        String e2 = tKa2.e(h.f.d());
        C7471uYa.a((Object) e2, "cursorReader.getString(T…es.Users.USERNAME.name())");
        String e3 = tKa2.e(h.m.d());
        String e4 = tKa2.e(h.n.d());
        String d2 = h.r.d();
        C7471uYa.a((Object) d2, "Tables.Users.SIGNUP_DATE.name()");
        Date a2 = a(tKa2, d2);
        String e5 = tKa2.e(h.j.d());
        String e6 = tKa2.e(h.i.d());
        long d3 = tKa2.d(h.k.d());
        long d4 = tKa2.d(h.l.d());
        String e7 = tKa2.e(h.p.d());
        String e8 = tKa2.e(h.g.d());
        String e9 = tKa2.e(h.h.d());
        String e10 = tKa2.e(h.q.d());
        C3784hea hea = new C3784hea(f, e, e2, e3, e4, a2, e5, e6, d3, d4, e7, e8, e9, e10 != null ? new C3508cda(e10) : null, tKa2.a(h.s.d()));
        return hea;
    }

    private Date a(C5326TKa tKa, String str) {
        if (tKa.f(str)) {
            return new Date(tKa.d(str));
        }
        return null;
    }
}
