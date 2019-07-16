package defpackage;

import com.soundcloud.android.foundation.ads.C3686m;
import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.utilities.android.k;
import com.soundcloud.android.utilities.android.t;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/ads/fetcher/VideoAdsFetcher;", "", "apiClientRx", "Lcom/soundcloud/android/libs/api/ApiClientRx;", "scheduler", "Lio/reactivex/Scheduler;", "webViewHelper", "Lcom/soundcloud/android/utilities/android/WebViewHelper;", "forceAdTestingIdRepository", "Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;", "threadChecker", "Lcom/soundcloud/android/utilities/android/ThreadChecker;", "(Lcom/soundcloud/android/libs/api/ApiClientRx;Lio/reactivex/Scheduler;Lcom/soundcloud/android/utilities/android/WebViewHelper;Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;Lcom/soundcloud/android/utilities/android/ThreadChecker;)V", "buildApiRequest", "Lcom/soundcloud/android/libs/api/ApiRequest;", "requestData", "Lcom/soundcloud/android/ads/fetcher/VideoAdsRequestData;", "videoAds", "Lio/reactivex/Single;", "Lcom/soundcloud/android/foundation/ads/ApiAdsForTrack;", "Companion", "ads-fetcher_release"}, mv = {1, 1, 15})
/* renamed from: xJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsFetcher.kt */
public class C3352xJ {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final efa b;
    private final HPa c;
    private final t d;
    private final J e;
    private final k f;

    /* renamed from: xJ$a */
    /* compiled from: VideoAdsFetcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3352xJ(efa efa, HPa hPa, t tVar, J j, k kVar) {
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(tVar, "webViewHelper");
        C7471uYa.b(j, "forceAdTestingIdRepository");
        C7471uYa.b(kVar, "threadChecker");
        this.b = efa;
        this.c = hPa;
        this.d = tVar;
        this.e = j;
        this.f = kVar;
    }

    /* access modifiers changed from: private */
    public hfa b(C2221PJ pj) {
        this.f.a("This should not happen on the UI Thread.");
        b a2 = hfa.b("/ads/queue_start").c().a("correlator", pj.d()).a("cs_connection_type", pj.a().a()).a("cs_device_type", pj.c().a()).a("cs_orientation", pj.b().a()).a("requires_frequency_cap_duration", Boolean.valueOf(true));
        String a3 = this.d.a();
        if (a3 != null) {
            a2.b("Webview-User-Agent", a3);
        }
        if (this.e.d()) {
            a2.a("creativeid", this.e.b());
            a2.a("lineid", this.e.e());
        }
        hfa b2 = a2.b();
        C7471uYa.a((Object) b2, "request.build()");
        return b2;
    }

    public IPa<C3686m> a(C2221PJ pj) {
        C7471uYa.b(pj, "requestData");
        IPa<C3686m> b2 = IPa.c((Callable<? extends T>) new C3372yJ<Object>(this, pj)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C3392zJ<Object,Object>(this)).b(this.c);
        C7471uYa.a((Object) b2, "Single.fromCallable {\n  …  .subscribeOn(scheduler)");
        return b2;
    }
}
