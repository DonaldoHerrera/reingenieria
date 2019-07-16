package com.soundcloud.android.fcm;

@EVa(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0012J\b\u0010\u001c\u001a\u00020\u001bH\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/soundcloud/android/fcm/FcmRegistrationController;", "", "fcmStorage", "Lcom/soundcloud/android/foundation/fcm/FcmStorage;", "apiClient", "Lcom/soundcloud/android/libs/api/ApiClient;", "instanceId", "Lcom/soundcloud/android/fcm/InstanceIdWrapper;", "appboyWrapperProvider", "Ljavax/inject/Provider;", "Lcom/soundcloud/android/appboy/AppboyWrapper;", "sessionProvider", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "applicationProperties", "Lcom/soundcloud/appconfig/ApplicationConfiguration;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/foundation/fcm/FcmStorage;Lcom/soundcloud/android/libs/api/ApiClient;Lcom/soundcloud/android/fcm/InstanceIdWrapper;Ljavax/inject/Provider;Lcom/soundcloud/android/foundation/accounts/SessionProvider;Lcom/soundcloud/appconfig/ApplicationConfiguration;Lcom/soundcloud/android/rx/observers/ObserverFactory;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "getDisposable", "()Lio/reactivex/disposables/Disposable;", "setDisposable", "(Lio/reactivex/disposables/Disposable;)V", "performTokenRegistration", "", "registerIfNeeded", "registerTokenWithApi", "Lcom/soundcloud/android/libs/api/ApiResponse;", "token", "", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* compiled from: FcmRegistrationController.kt */
public class r {
    private static final String a = r.class.getSimpleName();
    public static final a b = new a(null);
    private VPa c = C4881Eua.b();
    /* access modifiers changed from: private */
    public final C3856qea d;
    private final dfa e;
    private final w f;
    private final C7054oVa<C1956BQ> g;
    private final Ica h;
    private final C7181qKa i;
    private final C5606ava j;
    private final HPa k;

    /* compiled from: FcmRegistrationController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public r(C3856qea qea, dfa dfa, w wVar, C7054oVa<C1956BQ> ova, Ica ica, C7181qKa qka, C5606ava ava, HPa hPa) {
        C7471uYa.b(qea, "fcmStorage");
        C7471uYa.b(dfa, "apiClient");
        C7471uYa.b(wVar, "instanceId");
        C7471uYa.b(ova, "appboyWrapperProvider");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(qka, "applicationProperties");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "scheduler");
        this.d = qea;
        this.e = dfa;
        this.f = wVar;
        this.g = ova;
        this.h = ica;
        this.i = qka;
        this.j = ava;
        this.k = hPa;
    }

    /* access modifiers changed from: private */
    public void b() {
        String a2 = this.d.a();
        if (a2 == null) {
            a2 = this.f.a();
        }
        if (a2 != null) {
            SDb.a(a).a("Push Registration Token: %s", a2);
            ((C1956BQ) this.g.get()).c(a2);
            if (!this.i.j() || a(a2).g()) {
                this.d.a(a2);
            }
        }
    }

    public void a(VPa vPa) {
        C7471uYa.b(vPa, "<set-?>");
        this.c = vPa;
    }

    public void a() {
        C7531vPa a2 = this.h.a().b(this.k).a((C7256rQa<? super T>) new s<Object>(this));
        RUa a3 = this.j.a((_Xa<? super T, RVa>) new t<Object,RVa>(this));
        a2.c(a3);
        C7471uYa.a((Object) a3, "sessionProvider.isUserLo…ormTokenRegistration() })");
        a((VPa) a3);
    }

    private jfa a(String str) {
        jfa a2 = this.e.a(hfa.c(C2226PO.GCM_REGISTER.a()).c().a((Object) KWa.a(NVa.a("token", str))).b());
        C7471uYa.a((Object) a2, "apiClient.fetchResponse(request)");
        return a2;
    }
}
