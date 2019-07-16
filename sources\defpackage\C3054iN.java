package defpackage;

import android.content.Context;
import com.comscore.Analytics;
import com.comscore.PublisherConfiguration.Builder;
import com.comscore.UsagePropertiesAutoUpdateMode;
import com.soundcloud.android.ia.p;

/* renamed from: iN reason: default package and case insensitive filesystem */
/* compiled from: ComScoreAnalyticsWrapper.kt */
public class C3054iN {
    private final Context a;

    public C3054iN(Context context) {
        C7471uYa.b(context, "context");
        this.a = context;
    }

    public void a() {
        Analytics.flushOfflineCache();
    }

    public void b() {
        Analytics.notifyEnterForeground();
    }

    public void c() {
        Analytics.notifyExitForeground();
    }

    public void d() {
        Analytics.notifyUxActive();
    }

    public void e() {
        Analytics.notifyUxInactive();
    }

    public void f() {
        Analytics.getConfiguration().addClient(((Builder) ((Builder) new Builder().publisherId(this.a.getString(p.comscore_c2)).publisherSecret(this.a.getString(p.comscore_secret)).usagePropertiesAutoUpdateMode(UsagePropertiesAutoUpdateMode.FOREGROUND_AND_BACKGROUND)).secureTransmission(true)).build());
        Analytics.start(this.a.getApplicationContext());
    }
}
