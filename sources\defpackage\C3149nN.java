package defpackage;

import com.soundcloud.android.SoundCloudApplication;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\u000bR$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/analytics/crashlytics/ApiMobileCrashReporterFacade;", "", "()V", "lazyApiClient", "Lio/reactivex/Single;", "Lcom/soundcloud/android/libs/api/ApiClientRx;", "getLazyApiClient", "()Lio/reactivex/Single;", "setLazyApiClient", "(Lio/reactivex/Single;)V", "inject", "", "report", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: nN reason: default package and case insensitive filesystem */
/* compiled from: ApiMobileCrashReporterFacade.kt */
public final class C3149nN {
    public static final a a = new a(null);
    public IPa<efa> b;

    /* renamed from: nN$a */
    /* compiled from: ApiMobileCrashReporterFacade.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final void a() {
            new C3149nN().c();
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    @NXa
    public static final void b() {
        a.a();
    }

    /* access modifiers changed from: private */
    public final void c() {
        SoundCloudApplication.f().a(this);
        IPa<efa> iPa = this.b;
        if (iPa != null) {
            new C3130mN(iPa, C3197pN.b).a();
        } else {
            C7471uYa.b("lazyApiClient");
            throw null;
        }
    }

    public final void a() {
        C3197pN.b.b();
    }
}
