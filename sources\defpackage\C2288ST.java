package defpackage;

import com.soundcloud.android.accounts.C2526g;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011H\u0012J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0012J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/soundcloud/android/configuration/ConfigurationManager;", "", "configurationOperations", "Lcom/soundcloud/android/configuration/ConfigurationOperations;", "accountOperations", "Lcom/soundcloud/android/accounts/AccountOperations;", "deviceManagementStorage", "Lcom/soundcloud/android/configuration/DeviceManagementStorage;", "privacySettingsOperations", "Lcom/soundcloud/android/analytics/PrivacySettingsOperations;", "(Lcom/soundcloud/android/configuration/ConfigurationOperations;Lcom/soundcloud/android/accounts/AccountOperations;Lcom/soundcloud/android/configuration/DeviceManagementStorage;Lcom/soundcloud/android/analytics/PrivacySettingsOperations;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "blockingForceConfigurationUpdate", "", "clearDeviceConflict", "configurationUpdate", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/configuration/Configuration;", "kotlin.jvm.PlatformType", "forceConfigurationUpdate", "handleNewConfiguration", "configuration", "requestConfigurationUpdate", "shouldDisplayDeviceConflict", "", "Companion", "ConfigurationObserver", "base_release"}, mv = {1, 1, 15})
/* renamed from: ST reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationManager.kt */
public class C2288ST {
    public static final a a = new a(null);
    private VPa b = C4881Eua.b();
    private final C2325UT c;
    private final C2526g d;
    private final C2965dU e;
    private final C3129mM f;

    /* renamed from: ST$a */
    /* compiled from: ConfigurationManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: ST$b */
    /* compiled from: ConfigurationManager.kt */
    private final class b extends C5037Jua<C2212OT> {
        public b() {
        }

        public void a(C2212OT ot) {
            C7471uYa.b(ot, "configuration");
            SDb.a("Configuration").a("Received new configuration", new Object[0]);
            C2288ST.this.a(ot);
        }
    }

    public C2288ST(C2325UT ut, C2526g gVar, C2965dU dUVar, C3129mM mMVar) {
        C7471uYa.b(ut, "configurationOperations");
        C7471uYa.b(gVar, "accountOperations");
        C7471uYa.b(dUVar, "deviceManagementStorage");
        C7471uYa.b(mMVar, "privacySettingsOperations");
        this.c = ut;
        this.d = gVar;
        this.e = dUVar;
        this.f = mMVar;
    }

    private APa<C2212OT> f() {
        APa<C2212OT> a2 = this.f.d().a((EPa<T>) this.c.d());
        C7471uYa.a((Object) a2, "privacySettingsOperation…rationOperations.fetch())");
        return a2;
    }

    public void b() {
        this.e.a();
    }

    public void c() {
        this.b.dispose();
        GPa c2 = f().c(new b());
        C7471uYa.a((Object) c2, "configurationUpdate().su…(ConfigurationObserver())");
        this.b = (VPa) c2;
    }

    public void d() {
        SDb.a("Configuration").a("Requesting configuration fetch", new Object[0]);
        this.b.dispose();
        GPa c2 = this.f.d().a((EPa<T>) this.c.e()).c(new b());
        C7471uYa.a((Object) c2, "privacySettingsOperation…(ConfigurationObserver())");
        this.b = (VPa) c2;
    }

    public boolean e() {
        return this.e.b();
    }

    public void a() {
        SDb.a("Configuration").a("Forcing configuration fetch", new Object[0]);
        C2212OT ot = (C2212OT) f().a();
        C7471uYa.a((Object) ot, "it");
        a(ot);
    }

    /* access modifiers changed from: private */
    public void a(C2212OT ot) {
        if (ot.b().b()) {
            SDb.a("Configuration").a("Unauthorized device, logging out", new Object[0]);
            this.e.c();
            this.d.k().g();
            return;
        }
        this.c.a(ot);
    }
}
