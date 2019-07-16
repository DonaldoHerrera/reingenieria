package com.soundcloud.android.stream;

import com.soundcloud.android.stream.C6109va.c;
import com.soundcloud.android.stream.C6109va.d;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.ia;
import com.soundcloud.android.sync.na;
import com.soundcloud.android.tracks.C6158da;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.upsell.a;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: StreamDataSource.kt */
public class Z {
    /* access modifiers changed from: private */
    public final lb a;
    /* access modifiers changed from: private */
    public final ca b;
    private final C6106u c;
    private final HPa d;
    /* access modifiers changed from: private */
    public final a e;
    private final Aca f;
    private final C5604aua g;

    public Z(lb lbVar, ca caVar, C6106u uVar, HPa hPa, a aVar, Aca aca, C5604aua aua) {
        C7471uYa.b(lbVar, "streamStorage");
        C7471uYa.b(caVar, "syncOperations");
        C7471uYa.b(uVar, "removeStalePromotedItemsCommand");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(aVar, "upsellOperations");
        C7471uYa.b(aca, "upsellHeaderFeature");
        C7471uYa.b(aua, "liveEntities");
        this.a = lbVar;
        this.b = caVar;
        this.c = uVar;
        this.d = hPa;
        this.e = aVar;
        this.f = aca;
        this.g = aua;
    }

    private int d(List<? extends C6109va> list) {
        int i = 0;
        for (C6109va vaVar : list) {
            if ((vaVar instanceof tb) && C6158da.b(((tb) vaVar).m())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public APa<Integer> e(List<C3919yda> list) {
        APa<Integer> d2 = this.b.c(na.SOUNDSTREAM).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new J<Object,Object>(this, list)).j().e(Integer.valueOf(0)).d();
        C7471uYa.a((Object) d2, "syncOperations.sync(Sync…0).distinctUntilChanged()");
        return d2;
    }

    /* access modifiers changed from: private */
    public boolean c(sb sbVar) {
        return (sbVar.b().isEmpty() ^ true) && this.f.a();
    }

    /* access modifiers changed from: private */
    public sb b(sb sbVar) {
        List b2 = sbVar.b();
        int d2 = d(b2);
        if (d2 < 0) {
            return sbVar;
        }
        int i = d2 + 1;
        return sb.a(sbVar, C7676xWa.c((Collection) C7676xWa.c((Collection) b2.subList(0, i), (Iterable) C6850lWa.a(c.d)), (Iterable) b2.subList(i, b2.size())), 0, 2, null);
    }

    /* access modifiers changed from: private */
    public IPa<Integer> c(List<C3919yda> list) {
        Long l;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            l = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((C3919yda) obj).d()) {
                break;
            }
        }
        C3919yda yda = (C3919yda) obj;
        if (yda != null) {
            Date date = yda.c;
            if (date != null) {
                l = Long.valueOf(date.getTime());
            }
        }
        if (l != null) {
            IPa<Integer> a2 = this.a.a(l.longValue());
            C7471uYa.a((Object) a2, "streamStorage.streamItemCountSince(fromTimestamp)");
            return a2;
        }
        IPa<Integer> a3 = IPa.a(Integer.valueOf(0));
        C7471uYa.a((Object) a3, "Single.just(0)");
        return a3;
    }

    public static /* synthetic */ APa a(Z z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z2 = false;
            }
            return z.a(z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialStreamItems");
    }

    public APa<List<C6109va>> b(List<C3919yda> list) {
        C7471uYa.b(list, "it");
        return a.a(this.g, list, new S(this), null, new T(this), false, 20, null);
    }

    public APa<sb> a(boolean z) {
        C5573aVa ava = C5573aVa.a;
        IPa c2 = this.c.c();
        C7471uYa.a((Object) c2, "removeStalePromotedItemsCommand.toSingle()");
        IPa d2 = this.b.d(na.SOUNDSTREAM);
        C7471uYa.a((Object) d2, "syncOperations.syncIfNev…ced(Syncable.SOUNDSTREAM)");
        IPa a2 = IPa.a((MPa<? extends T1>) c2, (MPa<? extends T2>) d2, (C6504gQa<? super T1, ? super T2, ? extends R>) new E<Object,Object,Object>());
        C7471uYa.a((Object) a2, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        APa<sb> k = a2.b(this.d).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new F<Object,Object>(this, z)).h(new G(this)).k(new I(this));
        C7471uYa.a((Object) k, "Singles.zip(\n           …          }\n            }");
        return k;
    }

    public APa<sb> b() {
        APa<sb> h = this.b.a(na.SOUNDSTREAM, "com.soundcloud.android.sync.action.HARD_REFRESH").a((C7118pQa<? super T, ? extends MPa<? extends R>>) new V<Object,Object>(this)).b(this.d).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new W<Object,Object>(this)).h(X.a).h(new Y(this));
        C7471uYa.a((Object) h, "syncOperations.failSafeS…          }\n            }");
        return h;
    }

    public APa<sb> a(ia iaVar, boolean z) {
        C7471uYa.b(iaVar, "syncResult");
        return this.a.a(30).r().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new O<Object,Object>(iaVar)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new Q<Object,Object>(this, z, iaVar));
    }

    /* access modifiers changed from: private */
    public sb a(sb sbVar) {
        return sb.a(sbVar, C7676xWa.c((Collection) C6850lWa.a(d.d), (Iterable) sbVar.b()), 0, 2, null);
    }

    public APa<sb> a(List<? extends C6109va> list) {
        C7471uYa.b(list, "streamItems");
        C6109va vaVar = (C6109va) C7676xWa.i((List) list);
        Date b2 = vaVar != null ? vaVar.b() : null;
        if (b2 != null) {
            return a(b2).b(this.d).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new L<Object,Object>(this));
        }
        return null;
    }

    public IPa<List<r>> a() {
        IPa<List<r>> b2 = this.a.a().b(this.d);
        C7471uYa.a((Object) b2, "streamStorage.playbackIt…().subscribeOn(scheduler)");
        return b2;
    }

    private IPa<List<C3919yda>> a(Date date) {
        IPa<List<C3919yda>> a2 = this.a.a(date.getTime(), 30).r().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new N<Object,Object>(this, date));
        C7471uYa.a((Object) a2, "streamStorage.timelineIt…          }\n            }");
        return a2;
    }

    /* access modifiers changed from: private */
    public C6185ma a(C6185ma maVar, C3919yda yda) {
        if (yda.f == null && yda.e == null) {
            return maVar;
        }
        C6185ma a2 = maVar.a(yda.f, yda.e);
        C7471uYa.a((Object) a2, "copyWith(streamEntity.pr…ntity.repostedProperties)");
        return a2;
    }

    /* access modifiers changed from: private */
    public C3863rda a(C3863rda rda, C3919yda yda) {
        if (yda.f == null && yda.e == null) {
            return rda;
        }
        C3863rda a2 = rda.a(yda.f, yda.e);
        C7471uYa.a((Object) a2, "copyWith(streamEntity.pr…ntity.repostedProperties)");
        return a2;
    }
}
