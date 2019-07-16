package com.soundcloud.android.ads;

import android.content.Context;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.utilities.android.m;

@EVa(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/soundcloud/android/ads/DefaultKruxSegmentProvider;", "Lcom/soundcloud/android/ads/KruxSegmentProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "kruxSegments", "Lcom/soundcloud/java/optional/Optional;", "", "kotlin.jvm.PlatformType", "getSegments", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: KruxSegmentProvider.kt */
public final class Ab implements Wb {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public C4928GKa<String> b = C4928GKa.a();

    /* compiled from: KruxSegmentProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Ab(Context context) {
        C7471uYa.b(context, "context");
        try {
            m.b("KruxSegmentProvider must be created on the UI thread");
            com.krux.androidsdk.aggregator.a.a(context.getApplicationContext(), context.getString(p.krux_configuration_id), new C2650zb(this), false);
        } catch (Exception e) {
            C7316sHa.d(new Vb(e));
        }
    }

    public C4928GKa<String> a() {
        C4928GKa<String> gKa = this.b;
        C7471uYa.a((Object) gKa, "kruxSegments");
        return gKa;
    }
}
