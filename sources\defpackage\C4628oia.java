package defpackage;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.C0094b;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.properties.m.h;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

@EVa(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\u001a\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0007J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u001bH\u0002J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u00020\u0017H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u00061"}, d2 = {"Lcom/soundcloud/android/main/inappupdates/InAppUpdateController;", "Lcom/soundcloud/lightcycle/DefaultActivityLightCycle;", "Landroidx/appcompat/app/AppCompatActivity;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "inAppUpdatesSettings", "Lcom/soundcloud/android/main/inappupdates/InAppUpdatesSettings;", "applicationConfiguration", "Lcom/soundcloud/appconfig/ApplicationConfiguration;", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/soundcloud/android/view/snackbar/FeedbackController;Lcom/soundcloud/android/properties/AppFeatures;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/utils/DeviceHelper;Lcom/soundcloud/android/main/inappupdates/InAppUpdatesSettings;Lcom/soundcloud/appconfig/ApplicationConfiguration;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "installStateUpdatedListener", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "isUpdateAvailable", "", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)Z", "checkForUpdatesAndCompleteDownloadedUpdates", "", "activity", "Landroid/app/Activity;", "isOutdatedReleasesThresholdExceeded", "appUpdateInfo", "onActivityResult", "resultCode", "", "timestamp", "", "onCompleteUpdateSnackbarDismissed", "source", "Lcom/soundcloud/android/feedback/FeedbackDismissSource;", "onPause", "host", "onResume", "shouldPromptUserToUpdate", "showSnackbarToCompleteUpdateIfNecessary", "startUpdateFlow", "trackUpdateSkippedEvent", "updateWasNotRejectedRecently", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: oia reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdateController.kt */
public final class C4628oia extends DefaultActivityLightCycle<AppCompatActivity> {
    public static final a a = new a(null);
    private final C1713tA b = new C4654ria(this);
    /* access modifiers changed from: private */
    public final C1315gA c;
    private final C5052KJa d;
    private final com.soundcloud.android.properties.a e;
    /* access modifiers changed from: private */
    public final C3700b f;
    /* access modifiers changed from: private */
    public final C6699jHa g;
    private final C4726zia h;
    private final C7181qKa i;
    private final FirebaseRemoteConfig j;

    /* renamed from: oia$a */
    /* compiled from: InAppUpdateController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4628oia(C1315gA gAVar, C5052KJa kJa, com.soundcloud.android.properties.a aVar, C3700b bVar, C6699jHa jha, C4726zia zia, C7181qKa qka, FirebaseRemoteConfig firebaseRemoteConfig) {
        C7471uYa.b(gAVar, "appUpdateManager");
        C7471uYa.b(kJa, "feedbackController");
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(zia, "inAppUpdatesSettings");
        C7471uYa.b(qka, "applicationConfiguration");
        C7471uYa.b(firebaseRemoteConfig, "firebaseRemoteConfig");
        this.c = gAVar;
        this.d = kJa;
        this.e = aVar;
        this.f = bVar;
        this.g = jha;
        this.h = zia;
        this.i = qka;
        this.j = firebaseRemoteConfig;
    }

    /* access modifiers changed from: private */
    public final void x() {
        if (!this.h.b()) {
            C5052KJa kJa = this.d;
            Fca fca = new Fca(p.in_app_update_completed, 2, p.in_app_update_restart, new C4663sia(this), new C4672tia(this), null, 32, null);
            kJa.a(fca);
        }
    }

    private final boolean y() {
        return this.h.a() + C7041oIa.a(24) < System.currentTimeMillis();
    }

    public final void b(int i2) {
        a(this, i2, 0, 2, null);
    }

    /* access modifiers changed from: private */
    public final boolean c(C1284fA fAVar) {
        if (!b(fAVar) || !y() || !a(fAVar) || !fAVar.b(0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void d(C1284fA fAVar) {
        C4699wia wia;
        if (!b(fAVar)) {
            wia = C4699wia.UNAVAILABLE;
        } else if (!fAVar.b(0)) {
            wia = C4699wia.UPDATE_TYPE_NOT_ALLOWED;
        } else if (!a(fAVar)) {
            wia = C4699wia.THRESHOLD_NOT_EXCEEDED;
        } else if (!y()) {
            wia = C4699wia.UPDATE_REJECTED_RECENTLY;
        } else {
            throw new IllegalStateException("trackUpdateSkippedEvent called with a valid update");
        }
        b a2 = SDb.a("InAppUpdateController");
        StringBuilder sb = new StringBuilder();
        sb.append("Skipping app update. Reason: ");
        sb.append(wia.name());
        a2.d(sb.toString(), new Object[0]);
        this.f.a((C3702d) new C0094b(KWa.a(NVa.a("event", wia))));
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "host");
        super.onResume(appCompatActivity);
        if (this.e.a((defpackage.C3821mba.a) h.a)) {
            this.c.a(this.b);
            a((Activity) appCompatActivity);
        }
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "host");
        super.onPause(appCompatActivity);
        if (this.e.a((defpackage.C3821mba.a) h.a)) {
            this.c.b(this.b);
        }
    }

    private final boolean b(C1284fA fAVar) {
        return fAVar.c() == 2;
    }

    private final void a(Activity activity) {
        this.c.b().a((PB<? super TResult>) new C4636pia<Object>(this, activity));
        this.c.b().a((OB) new C4645qia(this));
    }

    /* access modifiers changed from: private */
    public final void a(C1284fA fAVar, Activity activity) {
        try {
            this.c.a(fAVar, 0, activity, 8007);
        } catch (SendIntentException e2) {
            this.f.a((C3702d) new C0094b(LWa.b(NVa.a("event", C4699wia.FAILED), NVa.a("exception", e2))));
        }
    }

    private final boolean a(C1284fA fAVar) {
        return ((long) (fAVar.a() - this.i.b())) >= this.j.getLong("android_in_app_updates_releases_threshold");
    }

    /* access modifiers changed from: private */
    public final void a(Hca hca) {
        if (hca == Hca.SWIPE) {
            this.h.a(true);
        }
    }

    public static /* synthetic */ void a(C4628oia oia, int i2, long j2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        oia.a(i2, j2);
    }

    public final void a(int i2, long j2) {
        String str = "event";
        if (i2 == -1) {
            this.f.a((C3702d) new C0094b(KWa.a(NVa.a(str, C4699wia.ACCEPTED))));
        } else if (i2 == 0) {
            this.h.a(j2);
            this.f.a((C3702d) new C0094b(KWa.a(NVa.a(str, C4699wia.REJECTED))));
        }
    }
}
