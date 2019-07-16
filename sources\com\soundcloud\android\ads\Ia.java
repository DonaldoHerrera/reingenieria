package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.J;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/ads/AdTimerHelper;", "", "datetimeProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "forceAdTestingIdRepository", "Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;", "(Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;)V", "adTimer", "Lcom/soundcloud/android/ads/AdTimerHelper$AdTimer;", "startTimer", "Lio/reactivex/Single;", "", "scheduler", "Lio/reactivex/Scheduler;", "toString", "", "update", "", "newDuration", "withinAdTimer", "", "AdTimer", "base_release"}, mv = {1, 1, 15})
/* compiled from: AdTimerHelper.kt */
public class Ia {
    /* access modifiers changed from: private */
    public a a;
    private final C5694cGa b;
    private final J c;

    /* compiled from: AdTimerHelper.kt */
    private static final class a {
        private Long a;
        private final long b;
        private final C5694cGa c;

        public a(long j, C5694cGa cga) {
            C7471uYa.b(cga, "datetimeProvider");
            this.b = j;
            this.c = cga;
        }

        public final long a() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return C7179qIa.b(this.c.a() - l.longValue());
        }

        public final long b() {
            return this.b;
        }

        public final Long c() {
            return this.a;
        }

        public final boolean d() {
            return this.a != null;
        }

        public final boolean e() {
            return d() && a() < this.b;
        }

        public final void f() {
            this.a = Long.valueOf(this.c.a());
        }
    }

    public Ia(C5694cGa cga, J j) {
        C7471uYa.b(cga, "datetimeProvider");
        C7471uYa.b(j, "forceAdTestingIdRepository");
        this.b = cga;
        this.c = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[block: ");
        sb.append(a());
        StringBuilder sb2 = new StringBuilder(sb.toString());
        a aVar = this.a;
        if (aVar != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(" duration: ");
            sb3.append(aVar.b());
            sb2.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" started at: ");
            sb4.append(aVar.c());
            sb2.append(sb4.toString());
        }
        sb2.append("]");
        String sb5 = sb2.toString();
        C7471uYa.a((Object) sb5, "sb.toString()");
        return sb5;
    }

    public void a(long j) {
        if (!a()) {
            b a2 = SDb.a("ScAds");
            StringBuilder sb = new StringBuilder();
            sb.append("Creating new ad timer with duration ");
            sb.append(j);
            a2.a(sb.toString(), new Object[0]);
            this.a = new a(j, this.b);
        }
    }

    public boolean a() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.e();
        }
        return false;
    }

    public IPa<Long> a(HPa hPa) {
        C7471uYa.b(hPa, "scheduler");
        String str = "Single.never()";
        if (this.c.a()) {
            IPa<Long> f = IPa.f();
            C7471uYa.a((Object) f, str);
            return f;
        }
        a aVar = this.a;
        if (aVar == null || aVar.d()) {
            IPa<Long> f2 = IPa.f();
            C7471uYa.a((Object) f2, str);
            return f2;
        }
        b a2 = SDb.a("ScAds");
        StringBuilder sb = new StringBuilder();
        sb.append("Starting new timer with ");
        sb.append(aVar.b());
        sb.append(" sec");
        a2.a(sb.toString(), new Object[0]);
        IPa<Long> c2 = IPa.c(aVar.b(), TimeUnit.SECONDS, hPa).b((C6776kQa<? super VPa>) new Ka<Object>(aVar)).c((C6776kQa<? super T>) new Ja<Object>(this, hPa));
        C7471uYa.a((Object) c2, "Single.timer(cap.duratio…uccess { adTimer = null }");
        return c2;
    }
}
