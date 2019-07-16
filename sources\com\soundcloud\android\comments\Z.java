package com.soundcloud.android.comments;

import com.soundcloud.android.comments.mb.a.C0062a;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.K;
import java.util.Collection;

@EVa(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u0000 H2&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001HBK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010!\u001a\u00020\u0002H\u0014J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0014J\b\u0010%\u001a\u00020\u0019H\u0016J\"\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020'0 2\u0006\u0010(\u001a\u00020\u0005H\u0014J\"\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020'0 2\u0006\u0010(\u001a\u00020\u0005H\u0002J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u001c\u00101\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u000103H\u0002JB\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020'0 2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060 2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\"\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020'0 2\u0006\u0010(\u001a\u00020\u0005H\u0014J\u0010\u0010>\u001a\u00020?2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010@\u001a\u00020?2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0010\u0010A\u001a\u00020?2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u001e\u0010B\u001a\u00020\u00192\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u001c\u0010F\u001a\u0004\u0018\u00010?*\b\u0012\u0004\u0012\u00020G0\u00182\u0006\u0010\u001e\u001a\u00020\u0006H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0015\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/soundcloud/android/comments/CommentsPresenter;", "Lcom/soundcloud/android/uniflow/PagedTransformingPresenter;", "Lcom/soundcloud/android/comments/CommentsDomainModel;", "Lcom/soundcloud/android/comments/CommentsPage;", "Lcom/soundcloud/android/view/collection/LegacyError;", "Lcom/soundcloud/android/comments/CommentsParams;", "Lcom/soundcloud/android/comments/CommentsView;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "trackCommentRepository", "Lcom/soundcloud/android/comments/TrackCommentRepository;", "commentsPageMapper", "Lcom/soundcloud/android/comments/CommentsPageMapper;", "commentsVisibilityProvider", "Lcom/soundcloud/android/comments/CommentsVisibilityProvider;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "scheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/comments/TrackCommentRepository;Lcom/soundcloud/android/comments/CommentsPageMapper;Lcom/soundcloud/android/comments/CommentsVisibilityProvider;Lcom/soundcloud/android/rx/observers/ObserverFactory;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "commentsStatusLoaded", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getEventBus", "()Lcom/soundcloud/rx/eventbus/EventBus;", "attachView", "view", "buildViewModel", "Lio/reactivex/Observable;", "domainModel", "combinePages", "firstPage", "nextPage", "detachView", "firstPageFunc", "Lcom/soundcloud/android/uniflow/AsyncLoader$PageResult;", "pageParams", "getFirstPage", "goToUserProfile", "commentAvatarParams", "Lcom/soundcloud/android/comments/CommentAvatarParams;", "handleAddCommentError", "it", "Lcom/soundcloud/android/comments/TrackCommentRepository$AddCommentResult$Failure;", "handleAddCommentSuccess", "handleCommentSelectionChange", "selectedCommentParams", "Lcom/soundcloud/android/comments/SelectedCommentParams;", "pageResult", "liveCommentsPage", "Lcom/soundcloud/android/comments/TrackCommentsResponse;", "timestamp", "", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "secretToken", "", "refreshFunc", "subscribeForAddCommentClick", "Lio/reactivex/disposables/Disposable;", "subscribeForAddCommentResult", "subscribeForDeleteCommentClick", "updateCommentInputFocus", "selectedComment", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/comments/CommentViewModel$CommentItem;", "subscribeForError", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: CommentsPresenter.kt */
public class Z extends C7037oEa<C, T, C6973nJa, Y, Y, Da> {
    public static final a k = new a(null);
    /* access modifiers changed from: private */
    public final C6781kVa<RVa> l;
    private final C5327TLa m;
    /* access modifiers changed from: private */
    public final C3700b n;
    /* access modifiers changed from: private */
    public final mb o;
    private final W p;
    private final Ea q;
    private final C5606ava r;
    private final HPa s;
    private final HPa t;

    /* compiled from: CommentsPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Z(C5327TLa tLa, C3700b bVar, mb mbVar, W w, Ea ea, C5606ava ava, HPa hPa, HPa hPa2) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(mbVar, "trackCommentRepository");
        C7471uYa.b(w, "commentsPageMapper");
        C7471uYa.b(ea, "commentsVisibilityProvider");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        super(hPa2);
        this.m = tLa;
        this.n = bVar;
        this.o = mbVar;
        this.p = w;
        this.q = ea;
        this.r = ava;
        this.s = hPa;
        this.t = hPa2;
        C6781kVa<RVa> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, "PublishSubject.create<Unit>()");
        this.l = s2;
    }

    private final VPa d(Da da) {
        GPa c = this.o.a().b(this.s).a(RPa.a()).c(this.r.b(new C2924za(this, da)));
        C7471uYa.a((Object) c, "trackCommentRepository.a…         }\n            })");
        return (VPa) c;
    }

    private final VPa e(Da da) {
        VPa f = da.N().f((C6776kQa<? super T>) new Aa<Object>(this));
        C7471uYa.a((Object) f, "view.commentActionSheetD…commentUrn)\n            }");
        return f;
    }

    public final C5327TLa f() {
        return this.m;
    }

    /* access modifiers changed from: private */
    public final void b(Da da) {
        da.ja();
        a(this, da, (eb) null, 2, (Object) null);
    }

    private final VPa c(Da da) {
        VPa f = da.ma().f((C6776kQa<? super T>) new C2922ya<Object>(this));
        C7471uYa.a((Object) f, "view.addComment\n        …ecretToken)\n            }");
        return f;
    }

    private final APa<d<C6973nJa, C>> c(Y y) {
        APa d = this.o.a(y.d(), y.b()).d((C6776kQa<? super T>) new C2914ua<Object>(this, y));
        C7471uYa.a((Object) d, "forTrack");
        return a(d, y.c(), y.d(), y.b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, C>> c(Y y) {
        C7471uYa.b(y, "pageParams");
        return c(y);
    }

    public void a(Da da) {
        C7471uYa.b(da, "view");
        super.a(da);
        this.q.c();
        UPa b = b();
        APa d = c().h(C2912ta.a).d();
        String str = "loader.map { it.asyncLoa…  .distinctUntilChanged()";
        C7471uYa.a((Object) d, str);
        APa d2 = c().h(C2874ba.a).d();
        C7471uYa.a((Object) d2, str);
        b.a(da.ha().f((C6776kQa<? super T>) new C2897la<Object>(da)), da.ba().f((C6776kQa<? super T>) new C2899ma<Object>(da)), da.fa().f((C6776kQa<? super T>) new C2901na<Object>(this, da)), da.L().f((C6776kQa<? super T>) new C2903oa<Object>(this, da)), da.V().f((C6776kQa<? super T>) new C2905pa<Object>(this, da)), e(da), da.na().f((C6776kQa<? super T>) new C2907qa<Object>(this)), da.T().f((C6776kQa<? super T>) e()), da.R().f((C6776kQa<? super T>) d()), da.ga().f((C6776kQa<? super T>) new C2908ra<Object>(da)), c(da), d(da), a(this.o.c(), da), a(this.o.b(), da), this.l.b(this.s).a(RPa.a()).f((C6776kQa<? super T>) new C2910sa<Object>(da)), Yl.a(d).f((C6776kQa<? super T>) new C2871aa<Object>(da)), Yl.a(d2).f((C6776kQa<? super T>) new C2877ca<Object>(da)), c().a((C7256rQa<? super T>) C2880da.a).h(C2883ea.a).f().c((C6776kQa<? super T>) new C2885fa<Object>(da)), da.d().g(new C2891ia(this)).h(C2893ja.a).f((C6776kQa<? super T>) new C2895ka<Object>(this)));
    }

    /* access modifiers changed from: private */
    public final void a(C0062a aVar, Da da) {
        if (aVar.a() instanceof ifa) {
            da.a(aVar.a());
        } else {
            C7316sHa.b(aVar.a(), getClass());
        }
    }

    static /* synthetic */ void a(Z z, Da da, eb ebVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                ebVar = null;
            }
            z.a(da, ebVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCommentSelectionChange");
    }

    /* access modifiers changed from: private */
    public final void a(Da da, eb ebVar) {
        C4928GKa gKa;
        boolean z = false;
        if (ebVar != null) {
            com.soundcloud.android.comments.C2921y.a a2 = ebVar.a();
            if (a2 != null && !a2.m()) {
                z = true;
            }
        }
        if (!z || ebVar == null) {
            gKa = C4928GKa.a();
        } else {
            da.a(ebVar.b());
            gKa = C4928GKa.c(ebVar.a());
        }
        C7471uYa.a((Object) gKa, "selectedCommentItem");
        a(gKa, da);
        this.p.a(gKa);
    }

    private final void a(C4928GKa<com.soundcloud.android.comments.C2921y.a> gKa, Da da) {
        if (gKa.c()) {
            da.a((com.soundcloud.android.comments.C2921y.a) gKa.b());
        } else {
            da.ka();
        }
    }

    public void a(Da da, C2892j jVar) {
        C7471uYa.b(da, "view");
        C7471uYa.b(jVar, "commentAvatarParams");
        C4621nja a2 = C4621nja.a(jVar.b(), K.a.a(jVar.a(), jVar.b()));
        C7471uYa.a((Object) a2, "NavigationTarget.forProf…entAvatarParams.userUrn))");
        da.a(a2);
    }

    public void a() {
        super.a();
        this.q.b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, C>> b(Y y) {
        C7471uYa.b(y, "pageParams");
        return c(y);
    }

    /* access modifiers changed from: private */
    public final APa<d<C6973nJa, C>> a(APa<Db> aPa, long j, C3508cda cda, String str) {
        C2918wa waVar = new C2918wa(this, j, cda, str);
        APa<d<C6973nJa, C>> i = aPa.k(waVar).i(C2920xa.a);
        C7471uYa.a((Object) i, "liveCommentsPage\n       …          }\n            }");
        return i;
    }

    /* access modifiers changed from: protected */
    public APa<T> a(C c) {
        C7471uYa.b(c, "domainModel");
        return this.p.a(c);
    }

    /* access modifiers changed from: protected */
    public C a(C c, C c2) {
        C7471uYa.b(c, "firstPage");
        C7471uYa.b(c2, "nextPage");
        C c3 = new C(C7676xWa.c((Collection) c.a(), (Iterable) c2.a()), c.d(), c.b(), c.g(), c.f(), c.e(), c.c());
        return c3;
    }

    private final VPa a(C6781kVa<Throwable> kva, Da da) {
        return kva.b(this.s).a(RPa.a()).f((C6776kQa<? super T>) new Ba<Object>(kva, da));
    }
}
