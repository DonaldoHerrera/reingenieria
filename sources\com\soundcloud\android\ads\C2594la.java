package com.soundcloud.android.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@EVa(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000  2\u00020\u0001:\u0002 !B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0012J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0017J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0012R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/soundcloud/android/ads/AdIdHelper;", "", "context", "Landroid/content/Context;", "advertisingIdClientWrapper", "Lcom/soundcloud/android/ads/AdvertisingIdClientWrapper;", "playServicesWrapper", "Lcom/soundcloud/android/utils/GooglePlayServicesWrapper;", "privacySettings", "Lcom/soundcloud/appconfig/PrivacySettings;", "scheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/Context;Lcom/soundcloud/android/ads/AdvertisingIdClientWrapper;Lcom/soundcloud/android/utils/GooglePlayServicesWrapper;Lcom/soundcloud/appconfig/PrivacySettings;Lio/reactivex/Scheduler;)V", "_adId", "", "adId", "Lcom/soundcloud/java/optional/Optional;", "getAdId", "()Lcom/soundcloud/java/optional/Optional;", "adIdTracking", "", "getAdIdTracking", "()Z", "setAdIdTracking", "(Z)V", "handleAdId", "", "adInfo", "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "initAsync", "initBlocking", "readAdId", "Companion", "MissingAdInfoIdException", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.ads.la reason: case insensitive filesystem */
/* compiled from: AdIdHelper.kt */
public class C2594la {
    /* access modifiers changed from: private */
    public static final String a = C2594la.class.getSimpleName();
    public static final a b = new a(null);
    private volatile String c;
    private volatile boolean d;
    private final Context e;
    private final C2595lb f;
    private final C7730yHa g;
    private final C7319sKa h;
    private final HPa i;

    /* renamed from: com.soundcloud.android.ads.la$a */
    /* compiled from: AdIdHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.ads.la$b */
    /* compiled from: AdIdHelper.kt */
    private static final class b extends Exception {
        public b(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    public C2594la(Context context, C2595lb lbVar, C7730yHa yha, C7319sKa ska, HPa hPa) {
        C7471uYa.b(context, "context");
        C7471uYa.b(lbVar, "advertisingIdClientWrapper");
        C7471uYa.b(yha, "playServicesWrapper");
        C7471uYa.b(ska, "privacySettings");
        C7471uYa.b(hPa, "scheduler");
        this.e = context;
        this.f = lbVar;
        this.g = yha;
        this.h = ska;
        this.i = hPa;
    }

    private Info f() {
        try {
            return this.f.a();
        } catch (C2603nb e2) {
            C7316sHa.j(e2.getCause());
            return null;
        }
    }

    public C4928GKa<String> b() {
        C4928GKa<String> b2 = C4928GKa.b(this.c);
        C7471uYa.a((Object) b2, "Optional.fromNullable(_adId)");
        return b2;
    }

    public boolean c() {
        return this.d;
    }

    public void d() {
        C6979nPa.b((C6368eQa) new C2598ma(this)).b(this.i).a(RPa.a()).c(C5130Mua.d.a(C2602na.a));
    }

    public void e() {
        if (this.h.a() && this.g.b(this.e)) {
            a(f());
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    private void a(Info info) {
        if (info == null) {
            this.c = null;
            a(false);
        } else if (info.getId() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got adInfo(");
            sb.append(info);
            sb.append(") with null adInfo.id");
            String sb2 = sb.toString();
            C7316sHa.a(sb2, (Throwable) new b(sb2));
            this.c = null;
            a(false);
        } else {
            this.c = info.getId();
            a(!info.isLimitAdTrackingEnabled());
        }
        defpackage.SDb.b a2 = SDb.a(a);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Loaded ADID: ");
        sb3.append(this.c);
        sb3.append("\nTracking:");
        sb3.append(c());
        a2.d(sb3.toString(), new Object[0]);
    }
}
