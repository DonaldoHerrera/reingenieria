package defpackage;

import android.app.Application;
import android.content.Context;
import com.moat.analytics.mobile.scl.MoatAnalytics;
import com.moat.analytics.mobile.scl.MoatOptions;

/* renamed from: yI reason: default package and case insensitive filesystem */
/* compiled from: MoatWrapper.kt */
public final class C3371yI {
    public final void a(Context context) {
        C7471uYa.b(context, "context");
        MoatAnalytics instance = MoatAnalytics.getInstance();
        MoatOptions moatOptions = new MoatOptions();
        moatOptions.disableAdIdCollection = true;
        instance.start(moatOptions, (Application) context);
        instance.prepareNativeDisplayTracking(context.getString(k.moat_display_partner_id));
    }
}
