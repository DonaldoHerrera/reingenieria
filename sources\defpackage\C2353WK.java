package defpackage;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.A;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@EVa(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003&'(B!\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ.\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J$\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001e\u001a\u00060\u001fj\u0002` 2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0003J\b\u0010$\u001a\u00020\u001cH\u0002J\u0006\u0010%\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/soundcloud/android/analytics/AnalyticsEngine;", "", "analyticsEngineInputs", "Lcom/soundcloud/android/analytics/AnalyticsEngine$AnalyticsEngineInputs;", "scheduler", "Lio/reactivex/Scheduler;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/analytics/AnalyticsEngine$AnalyticsEngineInputs;Lio/reactivex/Scheduler;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "workerScheduler", "mainScheduler", "(Lcom/soundcloud/android/analytics/AnalyticsEngine$AnalyticsEngineInputs;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "analyticsProviders", "", "Lcom/soundcloud/android/analytics/AnalyticsProvider;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getErrorReporter", "()Lcom/soundcloud/android/error/reporting/ErrorReporter;", "flushAction", "Ljava/lang/Runnable;", "pendingFlush", "Ljava/util/concurrent/atomic/AtomicBoolean;", "handleEvent", "Lio/reactivex/functions/Consumer;", "T", "handler", "Lkotlin/Function2;", "", "handleProviderError", "t", "Ljava/lang/Exception;", "Lkotlin/Exception;", "provider", "methodName", "", "scheduleFlush", "subscribeEventQueues", "AnalyticsEngineInputs", "Companion", "EventSubscriber", "analytics-base_release"}, mv = {1, 1, 15})
/* renamed from: WK reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsEngine.kt */
public final class C2353WK {
    public static final b a = new b(null);
    /* access modifiers changed from: private */
    public final AtomicBoolean b;
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c;
    /* access modifiers changed from: private */
    public Collection<? extends C3254sL> d;
    private final Runnable e;
    private final a f;
    private final HPa g;
    private final HPa h;
    private final C3469VY i;

    /* renamed from: WK$a */
    /* compiled from: AnalyticsEngine.kt */
    public interface a {
        APa<A> a();

        APa<z> b();

        APa<C3699a> c();

        APa<J> d();

        APa<C3707i> e();

        APa<List<C3254sL>> f();
    }

    /* renamed from: WK$b */
    /* compiled from: AnalyticsEngine.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: WK$c */
    /* compiled from: AnalyticsEngine.kt */
    private abstract class c<EventT> implements C6776kQa<EventT> {
        public c() {
        }

        /* access modifiers changed from: protected */
        public abstract void a(C3254sL sLVar, EventT eventt);

        public void accept(EventT eventt) {
            for (C3254sL sLVar : C2353WK.this.d) {
                try {
                    a(sLVar, eventt);
                } catch (Exception e) {
                    C2353WK wk = C2353WK.this;
                    String simpleName = getClass().getSimpleName();
                    C7471uYa.a((Object) simpleName, "javaClass.simpleName");
                    wk.a(e, sLVar, simpleName);
                }
            }
            C2353WK.this.b();
        }
    }

    public C2353WK(a aVar, HPa hPa, HPa hPa2, C3469VY vy) {
        C7471uYa.b(aVar, "analyticsEngineInputs");
        C7471uYa.b(hPa, "workerScheduler");
        C7471uYa.b(hPa2, "mainScheduler");
        C7471uYa.b(vy, "errorReporter");
        this.f = aVar;
        this.g = hPa;
        this.h = hPa2;
        this.i = vy;
        this.b = new AtomicBoolean(true);
        this.c = new UPa();
        this.d = C6918mWa.a();
        this.e = new C2371XK(this);
    }

    /* access modifiers changed from: private */
    public final void b() {
        if (this.b.getAndSet(false)) {
            SDb.a("Scheduling flush in 60 secs", new Object[0]);
            C7471uYa.a((Object) this.g.a().a(this.e, 60, TimeUnit.SECONDS), "workerScheduler.createWo…ECONDS, TimeUnit.SECONDS)");
            return;
        }
        SDb.a("Ignoring flush event; already scheduled", new Object[0]);
    }

    public final void a() {
        SDb.a("Subscribing to events", new Object[0]);
        UPa uPa = this.c;
        VPa f2 = this.f.f().f((C6776kQa<? super T>) new C2408ZK<Object>(this));
        C7471uYa.a((Object) f2, "analyticsEngineInputs.pr…viders = it\n            }");
        XUa.a(uPa, f2);
        VPa f3 = this.f.d().a(this.h).f(a((C6308dYa<? super C3254sL, ? super T, RVa>) C2427_K.a));
        C7471uYa.a((Object) f3, "analyticsEngineInputs.tr…eTrackingEvent(event) } )");
        XUa.a(uPa, f3);
        VPa f4 = this.f.a().a(this.h).f(a((C6308dYa<? super C3254sL, ? super T, RVa>) C2446aL.a));
        C7471uYa.a((Object) f4, "analyticsEngineInputs.pl…rformanceEvent(event) } )");
        XUa.a(uPa, f4);
        VPa f5 = this.f.b().a(this.h).f(a((C6308dYa<? super C3254sL, ? super T, RVa>) C2465bL.a));
        C7471uYa.a((Object) f5, "analyticsEngineInputs.pl…backErrorEvent(event) } )");
        XUa.a(uPa, f5);
        VPa f6 = this.f.c().a(this.h).f(a((C6308dYa<? super C3254sL, ? super T, RVa>) C2484cL.a));
        C7471uYa.a((Object) f6, "analyticsEngineInputs.ac…LifeCycleEvent(event) } )");
        XUa.a(uPa, f6);
        VPa f7 = this.f.e().a(this.h).f(a((C6308dYa<? super C3254sL, ? super T, RVa>) C2957dL.a));
        C7471uYa.a((Object) f7, "analyticsEngineInputs.cu…erChangedEvent(event) } )");
        XUa.a(uPa, f7);
    }

    public C2353WK(a aVar, HPa hPa, C3469VY vy) {
        C7471uYa.b(aVar, "analyticsEngineInputs");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(vy, "errorReporter");
        this(aVar, hPa, hPa, vy);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"sc.SilentExceptionUsage"})
    public final void a(Exception exc, C3254sL sLVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("exception while processing ");
        sb.append(str);
        sb.append(" for provider ");
        sb.append(sLVar.getClass());
        sb.append(", with error = ");
        sb.append(exc);
        SDb.b(sb.toString(), new Object[0]);
        defpackage.C3469VY.a.a(this.i, exc, null, 2, null);
    }

    private final <T> C6776kQa<T> a(C6308dYa<? super C3254sL, ? super T, RVa> dya) {
        return new C2389YK(this, dya);
    }
}
