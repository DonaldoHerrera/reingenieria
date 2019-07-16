package com.soundcloud.android.comments;

import com.soundcloud.android.comments.Oa.b;
import com.soundcloud.android.utilities.android.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001=B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0012J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000fH\u0012J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000fH\u0012J\"\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u001e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000fH\u0016J\u001e\u0010+\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0,2\u0006\u0010-\u001a\u00020#H\u0012J\u001e\u0010.\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0,2\u0006\u0010-\u001a\u00020#H\u0012J&\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0,2\u0006\u00101\u001a\u000202H\u0012J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H\u0016J\u0010\u00106\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000fH\u0012J\u001e\u00107\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0,2\u0006\u00108\u001a\u00020\u000fH\u0012J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000fH\u0012J\u0018\u0010:\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<H\u0016R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR4\u0010\r\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010 \n*\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\u000e0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00120\u00120\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00120\u00120\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR(\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \n*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00170\u00170\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000RN\u0010\u0018\u001aB\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00100\u0010 \n* \u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000e0\u0019X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/soundcloud/android/comments/TrackCommentRepository;", "", "commentOperations", "Lcom/soundcloud/android/comments/TrackCommentOperations;", "reportedCommentStorage", "Lcom/soundcloud/android/comments/ReportedCommentStorage;", "(Lcom/soundcloud/android/comments/TrackCommentOperations;Lcom/soundcloud/android/comments/ReportedCommentStorage;)V", "addCommentSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/comments/TrackCommentRepository$AddCommentResult;", "kotlin.jvm.PlatformType", "getAddCommentSubject", "()Lio/reactivex/subjects/PublishSubject;", "cacheUpdatesSubject", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/comments/CommentUpdates;", "deleteCommentErrors", "", "getDeleteCommentErrors", "reportCommentErrors", "getReportCommentErrors", "reportedCacheUpdates", "", "updatesCache", "", "addComment", "", "newCommentParams", "Lcom/soundcloud/android/comments/NewCommentParams;", "trackUrn", "secretToken", "", "addCommentToCache", "comment", "Lcom/soundcloud/android/foundation/domain/comments/Comment;", "addDeletedCommentToCache", "commentUrn", "addReportedCommentToCache", "comments", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/comments/TrackCommentsResponse;", "deleteComment", "insertCommentWithCorrectPositionAndIndentation", "", "newComment", "insertLocalCommentIfNotInApiResponse", "moveNextCommentToCorrectPositionAfterDeletion", "deletedComment", "indexOfDeletedComment", "", "randomizedTimestamp", "", "timestamp", "removeDeletedCommentFromCache", "removeDeletedOrReportedCommentFromList", "commentToDelete", "removeReportedCommentFromCache", "reportComment", "reportAndDelete", "", "AddCommentResult", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackCommentRepository.kt */
public class mb {
    private final C6781kVa<List<C3508cda>> a;
    /* access modifiers changed from: private */
    public final Map<C3508cda, C2919x> b = Collections.synchronizedMap(new TreeMap());
    private final C6781kVa<Map<C3508cda, C2919x>> c;
    private final C6781kVa<a> d;
    private final C6781kVa<Throwable> e;
    private final C6781kVa<Throwable> f;
    private final gb g;
    private final C2878cb h;

    @EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/comments/TrackCommentRepository$AddCommentResult;", "", "()V", "Failure", "Success", "Lcom/soundcloud/android/comments/TrackCommentRepository$AddCommentResult$Success;", "Lcom/soundcloud/android/comments/TrackCommentRepository$AddCommentResult$Failure;", "base_release"}, mv = {1, 1, 15})
    /* compiled from: TrackCommentRepository.kt */
    public static abstract class a {

        /* renamed from: com.soundcloud.android.comments.mb$a$a reason: collision with other inner class name */
        /* compiled from: TrackCommentRepository.kt */
        public static final class C0062a extends a {
            private final Throwable a;
            private final Pa b;

            public C0062a(Throwable th, Pa pa) {
                C7471uYa.b(th, "error");
                C7471uYa.b(pa, "params");
                super(null);
                this.a = th;
                this.b = pa;
            }

            public final Throwable a() {
                return this.a;
            }
        }

        /* compiled from: TrackCommentRepository.kt */
        public static final class b extends a {
            private final C3791ida a;

            public b(C3791ida ida) {
                C7471uYa.b(ida, "comment");
                super(null);
                this.a = ida;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public mb(gb gbVar, C2878cb cbVar) {
        C7471uYa.b(gbVar, "commentOperations");
        C7471uYa.b(cbVar, "reportedCommentStorage");
        this.g = gbVar;
        this.h = cbVar;
        C6781kVa<List<C3508cda>> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<List<Urn>>()");
        this.a = s;
        C6781kVa<Map<C3508cda, C2919x>> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, "PublishSubject.create<Map<Urn, CommentUpdates>>()");
        this.c = s2;
        C6781kVa<a> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, "PublishSubject.create<AddCommentResult>()");
        this.d = s3;
        C6781kVa<Throwable> s4 = C6781kVa.s();
        String str = "PublishSubject.create<Throwable>()";
        C7471uYa.a((Object) s4, str);
        this.e = s4;
        C6781kVa<Throwable> s5 = C6781kVa.s();
        C7471uYa.a((Object) s5, str);
        this.f = s5;
    }

    /* access modifiers changed from: private */
    public void e(C3508cda cda) {
        this.h.b(cda);
        this.a.a(this.h.b());
    }

    /* access modifiers changed from: private */
    public void d(C3508cda cda) {
        C2919x xVar = (C2919x) this.b.get(cda);
        if (xVar != null) {
            Map<C3508cda, C2919x> map = this.b;
            C7471uYa.a((Object) map, "updatesCache");
            map.put(cda, C2919x.a(xVar, null, null, 1, null));
        }
        this.c.a(this.b);
    }

    public C6781kVa<Throwable> b() {
        return this.e;
    }

    public C6781kVa<Throwable> c() {
        return this.f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 != null) goto L_0x0029;
     */
    public void b(C3508cda cda) {
        C2919x xVar;
        Map<C3508cda, C2919x> map = this.b;
        C7471uYa.a((Object) map, "updatesCache");
        C2919x xVar2 = (C2919x) this.b.get(cda);
        if (xVar2 != null) {
            xVar = C2919x.a(xVar2, null, new b(cda), 1, null);
        }
        xVar = new C2919x(null, new b(cda), 1, null);
        map.put(cda, xVar);
        this.c.a(this.b);
    }

    /* access modifiers changed from: private */
    public void c(C3508cda cda) {
        this.h.a(cda);
        this.a.a(this.h.b());
    }

    public C6781kVa<a> a() {
        return this.d;
    }

    /* access modifiers changed from: private */
    public void b(List<C3791ida> list, C3791ida ida) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) ((C3791ida) obj).e(), (Object) ida.e())) {
                break;
            }
        }
        if (obj == null) {
            a(list, ida);
        }
    }

    public void a(Pa pa, C3508cda cda, String str) {
        C7471uYa.b(pa, "newCommentParams");
        C7471uYa.b(cda, "trackUrn");
        this.g.a(cda, pa.a(), a(pa.c()), pa.e(), str).c((C6776kQa<? super T>) new nb<Object>(this)).e(ob.a).g(new pb(pa)).d((C6776kQa<? super T>) new Bb<Object>(new qb(a())));
    }

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "commentUrn");
        this.g.a(cda).b((C6776kQa<? super VPa>) new tb<Object>(this, cda)).a((C6776kQa<? super Throwable>) new ub<Object>(this, cda)).a(vb.a, new Bb(new wb(b())));
    }

    public void a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "commentUrn");
        this.g.a(cda, z).b((C6776kQa<? super VPa>) new xb<Object>(this, cda)).a((C6776kQa<? super Throwable>) new yb<Object>(this, cda)).a(zb.a, new Bb(new Ab(c())));
    }

    public static /* synthetic */ APa a(mb mbVar, C3508cda cda, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            return mbVar.a(cda, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: comments");
    }

    public APa<Db> a(C3508cda cda, String str) {
        C7471uYa.b(cda, "trackUrn");
        _Ua _ua = _Ua.a;
        APa d2 = this.g.a(cda, str).j().d((C6776kQa<? super T>) new sb<Object>(this));
        C7471uYa.a((Object) d2, "commentOperations.forTra… { updatesCache.clear() }");
        APa e2 = this.c.e(this.b);
        C7471uYa.a((Object) e2, "cacheUpdatesSubject.startWith(updatesCache)");
        APa e3 = this.a.e(this.h.b());
        C7471uYa.a((Object) e3, "reportedCacheUpdates.sta…ge.getReportedComments())");
        APa<Db> d3 = APa.a((EPa<? extends T1>) d2, (EPa<? extends T2>) e2, (EPa<? extends T3>) e3, (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new rb<Object,Object,Object,Object>(this)).d();
        C7471uYa.a((Object) d3, "Observables.combineLates… }.distinctUntilChanged()");
        return d3;
    }

    /* access modifiers changed from: private */
    public void a(C3791ida ida) {
        Map<C3508cda, C2919x> map = this.b;
        C7471uYa.a((Object) map, "updatesCache");
        map.put(ida.e(), new C2919x(new com.soundcloud.android.comments.Oa.a(ida), null, 2, null));
        this.c.a(this.b);
    }

    private void a(C3791ida ida, List<C3791ida> list, int i) {
        int i2 = i - 1;
        if (!ida.f() && i > 0 && ((C3791ida) list.get(i2)).f()) {
            list.set(i2, C3791ida.a((C3791ida) list.get(i2), null, null, 0, null, null, null, false, 63, null));
        }
    }

    public long a(long j) {
        return j == 0 ? (long) c.a(new C6785kZa(1, C1325gg.INAPP_MESSAGE_DURATION_MIN_MILLIS)) : j;
    }

    /* access modifiers changed from: private */
    public void a(List<C3791ida> list, C3508cda cda) {
        ArrayList<C3791ida> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (C7471uYa.a((Object) ((C3791ida) next).e(), (Object) cda)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (C3791ida ida : arrayList) {
            int indexOf = list.indexOf(ida);
            list.remove(ida);
            a(ida, list, indexOf);
            arrayList2.add(RVa.a);
        }
    }

    private void a(List<C3791ida> list, C3791ida ida) {
        int i;
        List<C3791ida> list2 = list;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((C3791ida) it.next()).d() == ida.d()) {
                break;
            }
            i2++;
        }
        int a2 = C7265rZa.a(i2, 0);
        if (!(list2 instanceof Collection) || !list.isEmpty()) {
            i = 0;
            for (C3791ida d2 : list) {
                if (d2.d() == ida.d()) {
                    i++;
                    if (i < 0) {
                        C6782kWa.b();
                        throw null;
                    }
                }
            }
        } else {
            i = 0;
        }
        list2.add(a2, C3791ida.a(ida, null, null, 0, null, null, null, i > 0, 63, null));
    }
}
