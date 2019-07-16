package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.properties.j;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/soundcloud/android/alpha/AlphaReminderDialogController;", "Lcom/soundcloud/lightcycle/DefaultActivityLightCycle;", "Landroidx/appcompat/app/AppCompatActivity;", "alphaReminderPrefs", "Landroid/content/SharedPreferences;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "alphaDialogHelper", "Lcom/soundcloud/android/alpha/AlphaDialogHelper;", "applicationProperties", "Lcom/soundcloud/android/properties/ApplicationProperties;", "currentDateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "(Landroid/content/SharedPreferences;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/alpha/AlphaDialogHelper;Lcom/soundcloud/android/properties/ApplicationProperties;Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "daysBetweenReminders", "", "daysBetweenThanks", "disposable", "Lio/reactivex/disposables/Disposable;", "daysHaveElapsed", "", "delay", "pref", "", "onPause", "", "host", "onResume", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: rK reason: default package and case insensitive filesystem */
/* compiled from: AlphaReminderDialogController.kt */
public final class C3233rK extends DefaultActivityLightCycle<AppCompatActivity> {
    public static final a a = new a(null);
    private final long b = 7;
    private final long c = 30;
    private VPa d = C4881Eua.b();
    /* access modifiers changed from: private */
    public final SharedPreferences e;
    private final C2436_U f;
    private final C3194pK g;
    private final j h;
    /* access modifiers changed from: private */
    public final C5694cGa i;

    /* renamed from: rK$a */
    /* compiled from: AlphaReminderDialogController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3233rK(SharedPreferences sharedPreferences, C2436_U _u, C3194pK pKVar, j jVar, C5694cGa cga) {
        C7471uYa.b(sharedPreferences, "alphaReminderPrefs");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(pKVar, "alphaDialogHelper");
        C7471uYa.b(jVar, "applicationProperties");
        C7471uYa.b(cga, "currentDateProvider");
        this.e = sharedPreferences;
        this.f = _u;
        this.g = pKVar;
        this.h = jVar;
        this.i = cga;
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.d.dispose();
        super.onPause(appCompatActivity);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "host");
        super.onResume(appCompatActivity);
        if (!this.h.h() && this.f.m()) {
            if (C3313vK.b(appCompatActivity)) {
                if (a(this.c, "last_thanks")) {
                    VPa c2 = this.g.b(appCompatActivity).c((C6368eQa) new C3253sK(this));
                    C7471uYa.a((Object) c2, "alphaDialogHelper.showTh…vider.getCurrentTime())}}");
                    this.d = c2;
                }
            } else if (a(this.b, "last_reminder")) {
                VPa c3 = this.g.a((Activity) appCompatActivity).c((C6368eQa) new C3273tK(this));
                C7471uYa.a((Object) c3, "alphaDialogHelper.showRe…vider.getCurrentTime())}}");
                this.d = c3;
            }
        }
    }

    private final boolean a(long j, String str) {
        return this.i.a() > this.e.getLong(str, 0) + TimeUnit.DAYS.toMillis(j);
    }
}
