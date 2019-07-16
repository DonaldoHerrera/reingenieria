package defpackage;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.LogLevel;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.properties.j;

/* renamed from: QM reason: default package and case insensitive filesystem */
/* compiled from: AdjustWrapper */
public class C2243QM {
    private final C3700b a;
    private final j b;

    C2243QM(C3700b bVar, j jVar, Context context) {
        this.a = bVar;
        this.b = jVar;
        Adjust.onCreate(a(context));
    }

    static /* synthetic */ boolean a(Uri uri) {
        return true;
    }

    private void c(AdjustConfig adjustConfig) {
        adjustConfig.setLogLevel(this.b.k() ? LogLevel.INFO : LogLevel.ERROR);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Adjust.onPause();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        Adjust.onResume();
    }

    private void b(AdjustConfig adjustConfig) {
        adjustConfig.setEventBufferingEnabled(Boolean.valueOf(true));
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        Adjust.trackEvent(new AdjustEvent(str));
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2, String str3) {
        AdjustEvent adjustEvent = new AdjustEvent(str);
        adjustEvent.setRevenue(Double.valueOf(str2).doubleValue(), str3);
        Adjust.trackEvent(adjustEvent);
    }

    private AdjustConfig a(Context context) {
        AdjustConfig adjustConfig = new AdjustConfig(context, "87l2rj9gqhlj", context.getString(p.adjust_environment));
        b(adjustConfig);
        c(adjustConfig);
        a(adjustConfig);
        adjustConfig.setOnDeeplinkResponseListener(C2186NM.a);
        return adjustConfig;
    }

    private void a(AdjustConfig adjustConfig) {
        adjustConfig.setOnAttributionChangedListener(new C2167MM(this));
    }

    /* access modifiers changed from: private */
    public void a(AdjustAttribution adjustAttribution) {
        this.a.a((J) C3446NZ.a(adjustAttribution.network, adjustAttribution.campaign, adjustAttribution.adgroup, adjustAttribution.creative));
    }
}
